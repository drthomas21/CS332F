def reverseFun[T](xs: List[T]): List[T] = xs.foldLeft(List[T]())((r,c) => c::r);

def mapFun[T,U](xs: List[T], f: T => U):List[U] = xs.foldLeft(List[U]())((r,c) => r:::List(f(c)));

def lengthFun[T](xs: List[T]):Int = xs.foldLeft(0)((sum,_) => sum + 1);

def sumFun(xs: List[Int]):Int = {
	var sum: Int = 0;

	for(i <- xs) {
		if(i > 0) {
			sum = sum + i;
		}
	}

	return sum;
}

def freqFun(xs: List[Char], xyz: Array[Char]): Array[Int] = {
	if(xyz.size != 3) {
		throw new IllegalStateException("2nd argument is expected to have an array with size 3");
	}

	var ret: Array[Int] = new Array[Int](3);
	for(i <- 0 until xyz.size){
		for(j <- xs) {
			if(xyz(i) == j) {
				ret(i) = ret(i) + 1;
			}
		}
	}
	return ret;
};

def revFun[T](xs: List[T], n: Int):List[T] = {
	var count:Int = 0;
	return xs.foldLeft(List[T]())((r,c) => 
		if(count <= n) {
			count = count + 1;
			return c::r;
		} else {
			return r:::List(c);
		}
	);
}
