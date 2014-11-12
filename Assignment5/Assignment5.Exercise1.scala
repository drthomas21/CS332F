def split(p:Int,xs:List[Int]): List[Int] = {
	var below:List[Int] = List[Int]();
	var above:List[Int] = List[Int]();

	for(i <- xs) {
		if(i <= p) {
			below = below ::: List(i);	
		} else {
			above = above ::: List(i);
		}
	}
	return below ::: above;
}
