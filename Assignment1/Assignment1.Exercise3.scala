def countChange(money: Int, coins: List[Int]): Int = {
	var intOptions = 0;
	var detail = "";
	var count = 0;

	if(money != 0 && !coins.isEmpty) {
		coins.distinct;
		coins.sorted;
		for(coin <- coins) { 
			while(count+coin <= money) {
				count = count  + coin;
			}

			if(count == money) {
				intOptions = intOptions + 1;
			}
			
			count = 0;
		}

		var list = coins;
		//TODO: Need to improve this loop
		while(!list.isEmpty) {
			var intHead = list.head;
			var arrTail = list.tail;

			for(coin <- arrTail) {
				while(count+coin <= money) {
					count = count + coin;
				}
			}

			if(!arrTail.isEmpty && count < money) { 
				while(count + intHead <= money) {
					count = count + intHead;
				}
			}       
                                                
			if(count == money) {
				intOptions = intOptions + 1;
			}

			list = arrTail;
			count = 0;
		}
	}

	return intOptions;
}
