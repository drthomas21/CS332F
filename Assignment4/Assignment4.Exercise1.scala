abstract class Nat {
	def isZero: Boolean;
	def predecessor: Nat;
	def successor: Nat;
	def +(that: Nat): Nat;
	def -(that: Nat): Nat;
	def toString: String;
	def num: Int;
}

class Succ(n: Nat) extends Nat {
	var number: Int = n.num + 1;
	def num: Int = number;
	override def toString: String = "Succ("+n.toString()+")";
	def -(that: Nat): Nat = {
		var value: Int = num - that.num;
		if(value < 0) {
			throw new IllegalStateException("Non Natural Number");
		}
		var Instance:Succ = new Succ(this);
		Instance.setNumber(value);
		return Instance;
	}
	def +(that: Nat): Nat = {
		var value:Int = num + that.num;
		var Instance:Succ = new Succ(this);
		Instance.setNumber(value);
		return Instance;
	}
	def successor:Nat = return new Succ(this);
	def predecessor: Nat = {
		if(!isZero) {
			var value:Int = num - 1;
			var Instance:Succ = new Succ(this);
			Instance.setNumber(value);
			return Instance;
		} 
		throw new IllegalStateException("Non Natural Number");
		return null;
	}
	def isZero: Boolean = num == 0;
	def setNumber(value: Int) = {number = value};
}

object Zero extends Nat {
        def isZero:Boolean = num == 0;
        def predecessor: Nat = {
                if(!isZero) {
                        var value: Int = num;
                        var Instance:Succ = new Succ(this);
                        Instance.setNumber(value);
                        return Instance;
                }
		throw new IllegalStateException("Non Natural Number");
                return null;
        }
        def successor: Nat = new Succ(this);
        def +(that: Nat): Nat = {
                var value: Int = num + that.num;
                var Instance:Succ = new Succ(this);
                Instance.setNumber(value);
                return Instance;
        }
        def -(that: Nat): Nat = {
                var value: Int = num-that.num;
                var Instance:Succ = new Succ(this);
                Instance.setNumber(value);
                return Instance;
        }
        override def toString: String = "Zero";
        def num:Int = 0;
}
