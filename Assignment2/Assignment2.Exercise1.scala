type Set = Int => Boolean;
def singletonSet(elem: Int): Set = Set(elem);
def contains(s: Set, elem: Int): Boolean = s(elem);
def union(s: Set, t: Set): Set = Set(x,y);
def intersect(s: Set, t: Set): Set = s.intersect(t);
def diff(s: Set, t: Set): Set = s.diff(t);
def filter(s: Set, p: Int => Boolean): Set = s.filter(p);
def exists(s: Set, p: Int => Boolean): Boolean = s.exists(p);
def map(s: Set, f: Int => Int): Set = s.map(f);
def forall(s: Set, p: Int => Boolean): Boolean = {
	def iter(a: Int): Boolean = {
		if(a < value) {
		  return false;
		} else if() {
		  
		} else {
			iter(a+1);
		}
	}

	iter();
}
