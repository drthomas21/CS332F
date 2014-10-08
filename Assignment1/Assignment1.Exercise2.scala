def balance(chars: List[Char], count: Int = 0) : Boolean = {
	var intCount = count;

	if(chars.isEmpty && intCount == 0) {
		return true;
	} else if(chars.isEmpty && intCount != 0) {
		return false;
	} else {
		var charHead = chars.head;
		if(intCount >= 0 && charHead == '(') {
         	       intCount = intCount + 1;
                	return balance(chars.tail,intCount);
	        } else if (intCount > 0 && charHead == ')') {
        	        intCount = intCount - 1;
	                return balance(chars.tail,intCount);
	        } else if(charHead == ')' || charHead == '(') {
	                intCount = -1;
	                return false;
	        }

		return balance(chars.tail,intCount);
	}
}
