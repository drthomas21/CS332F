type Set = Int => Boolean;
def singletonSet(elem: Int): Set = Set(elem);

def contains(s: Set, elem: Int): Boolean = s(elem);

def union(s: Set, t: Set): Set = i => s(i) || t(i);
def intersect(s: Set, t: Set): Set = i => s(i) && t(i);
def diff(s: Set, t: Set): Set = i => s(i) && !t(i);

def filter(s: Set, p: Int => Boolean): Set = {
  var x: Set = p;
  return intersect(s,x);
}

def forall(s: Set, p: Int => Boolean): Boolean = {
	def iter(a: Int): Boolean = {
		if(s(a) && p(a)) {
			return true;
		} else if((s(a) && !p(a)) || a >= 1000) {
			return false;
		} else {
			return iter(a+1);
		}
	}

	return iter(-1000);
}

def exists(s: Set, p: Int => Boolean): Boolean = {
	def iter(a: Int): Boolean = {
		if(s(a) && p(a)) {
			return true;
		} else if( a >= 1000) {
			return false;
		} else {
			return iter(a+1);
		}
	}

	return iter(-1000);
}

def map(s: Set, f: Int => Int): Set = Set(f,s);

