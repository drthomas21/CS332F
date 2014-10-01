def balance(chars: List[Char]) : Boolean = {
	var intCount = 0;
	var isBalance = false;
	chars.foreach{ e =>
		if(intCount >= 0 && e == '(') {
			intCount = intCount + 1;
		} else if(intCount > 0 && e == ')') {
			intCount = intCount - 1;
		} else if(e == ')' || e == '(') {
			intCount = -1;
		}
	}
	if(intCount == 0) {
		isBalance = true;
	}
	return isBalance;
}
