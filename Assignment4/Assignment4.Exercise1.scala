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
	def num: Int = n.num + 1;
	def toString: String = num + "";
	def -(that: Nat): Nat = {
		var value: Int = num - that.num;
		var Instance:Nat = new Succ(this);
		Instance.num = value;
		return Instance;
	}
	def +(that: Nat): Nat = {
		var value:Int = num + that.num;
		var Instance:Nat = new Succ(this);
		Instance.num = value;
		return Instance;
	}
	def successor:Nat = return new Succ(this);
	def predecessor: Nat = {
		if(!n.isZero) {
			var value:Int = n.num;
			var Instance:Nat = new Succ(this);
			Instance.num = value;
			return Instance;
		} 
		return null;
	}
	def isZero: Boolean = num == 0
}

object Zero extends Nat {
        def isZero:Boolean = num == 0;
        def predecessor: Nat = {
                if(!isZero) {
                        var value: Int = num;
                        var Instance:Nat = new Succ(this);
                        Instance.num = value;
                        return Instance;
                }
                return null;
        }
        def successor: Nat = new Succ(this);
        def +(that: Nat): Nat = {
                var value: Int = num + that.num;
                var Instance:Nat = new Succ(this);
                Instance.num = value;
                return Instance;
        }
        def -(that: Nat): Nat = {
                var value: Int = num-that.num;
                var Instance:Nat = new Succ(this);
                Instance.num = value;
                return Instance;
        }
        def toString: String = num + "";
        def num:Int = 0;
}
