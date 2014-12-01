type Word = String;
type Sentence = List[Word];
type Occurrences = List[(Char,Int)];

def wordOccurrences(w: Word): Occurrences = {
	def loop(list: List[Char]): Map[Char,Int] =  {
		if(list.isEmpty) {
                        var relationships: Map[Char,Int] = Map();
                        return relationships;
                }

		var relationships: Map[Char,Int] = loop(list.tail);

		if(relationships.contains(list.head)){
			var value: Int = relationships(list.head) + 1;
			relationships += (list.head -> value);
		} else {
			relationships += (list.head -> 1);
		}

		return relationships;
	};

	var relationships: Map[Char,Int] = loop(w.toList);
	var occurrences: List[(Char,Int)] = List();

	relationships.keys.foreach( key => {
		var item: (Char,Int) = (key,relationships(key));
		occurrences = occurrences ::: List(item);
	});

	return occurrences;
};

def sentenceOccurrences(s: Sentence): Occurrences = {
	var w: Word = "";
	for(word <- s) {
		w = w.concat(word);
	}

	return wordOccurrences(w);
}
