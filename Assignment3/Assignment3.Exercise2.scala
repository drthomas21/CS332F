abstract class RatSet {
	def incl(x: Rational): RatSet;
	def contains(x: Rational): Boolean;
}

class RationalSet extends RatSet {
	var list: List[Rational] = List();
	def incl(x: Rational):RatSet = {
		var a: List[Rational] = List(x);
		list = list.union(a);
		return this;
	};
	def contains(x: Rational): Boolean = list.contains(x);
}
