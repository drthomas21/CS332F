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

def exists(s: Set, p: Int => Boolean): Boolean = {
  s.exists(p);
}

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

def map(s: Set, f: Int => Int): Set = s.map(f);
