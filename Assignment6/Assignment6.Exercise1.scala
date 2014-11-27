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

def freqFun(xyz: (Char,Char,Char), xs: List[Char]): (Int,Int,Int) = {
	var xyzList: List[Char] = List(xyz._1,xyz._2,xyz._3);

	var ret: Array[Int] = new Array[Int](3);
	xs.foldLeft(List[Char]())((r,c) => {
		if(xyzList.contains(c)) {
			var i: Int = xyzList.indexOf(c);
			ret(i) = ret(i) + 1;
		}
		r:::List(c);
	});

	return (ret(0),ret(1),ret(2));
};

def revFun[T](xs: List[T], n: Int):List[T] = {
	var count:Int = 0;
	return xs.foldLeft(List[T]())((r,c) => {
		if(count < n) {
			count = count + 1;
			c::r;
		} else {
			r:::List(c);
		}
	});
}
