def pascal(c: Int, r: Int, row: List[Int] = List(1)) : Int = {
	if(scala.math.pow(2,r) == row.sum) {
		return row.apply(c);
	} else {
		var nextRow = List(1);
		for( i <- 1 until row.length) {
			nextRow = nextRow ::: List(row.apply(i-1) + row.apply(i));
		}
		nextRow = nextRow ::: List(1);
		return pascal(c,r,nextRow);
	}
}
