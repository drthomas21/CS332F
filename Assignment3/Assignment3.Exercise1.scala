class Rational(inclNum: Int = 1,inclDen: Int = 1) {
	var num: Int = inclNum;
	var den: Int = inclDen;

	var defNum: Int = 1;
	var defDen: Int = 1;

	var inc: Int = 1;

	def setNumerator(i: Int) = num = i;
	def setDenominator(i: Int) = den = i;
	def getNumerator(): Int = num;
	def getDenominator(): Int = den;
	def incNumerator() = num += inc;
	def incDenominator() = den += inc;

	def getNumber(): Double = {
		var dNum: Double = num;
		var dDen: Double = den;
		return dNum/dDen
	};
	def / (r: Rational): Rational = {
		var ret: Rational = new Rational();
		ret.setNumerator(num * r.getDenominator());
		ret.setDenominator(den * r.getNumerator());
		return ret;
	};
	def sumA (f: Rational => Rational)(b: Rational): Rational = {
		var a: Rational = new Rational(1,1);
		def sumf(f: Rational => Rational)(a: Rational, b: Rational): Rational = {
			if(a.getNumerator() == a.getDenominator()) {
	                        a.incDenominator();
	                        a.setNumerator(1);
	                        return sumf(f)(a,b);
	                } else if(a.getNumber() <= b.getNumber()) {
	                        var fraction: Rational = new Rational(a.getNumerator(),b.getNumerator());
	                        a.incNumerator();
	                        var c: Rational = f(fraction);
	                        var d: Rational = sumf(f)(a,b);
	
	                        return new Rational((c.getNumerator() * d.getDenominator() + d.getNumerator() * c.getDenominator()),(c.getDenominator() * d.getDenominator()));
	                } else {
	                        return new Rational(0,1);
	                }

		};

		return sumf(f)(a,b);
	};
	def sumB (f: Rational => Rational)(a: Rational,b: Rational):Rational = {
		def sumf(f: Rational => Rational)(a: Rational, b: Rational): Rational = {
			if(a.getNumerator() == a.getDenominator()) {
				var dNum: Double = a.getNumerator() -1;
				var dDen: Double = a.getDenominator();
				var before: Double  = dNum/dDen;
                                a.incDenominator();
				while(a.getNumber() < before) {
					a.incNumerator();
				}
                                return sumf(f)(a,b);
                        } else if(a.getNumber() <= b.getNumber()) {
                                var fraction: Rational = new Rational(a.getNumerator(),b.getNumerator());
                                a.incNumerator();
                                var c: Rational = f(fraction);
                                var d: Rational = sumf(f)(a,b);

                                return new Rational((c.getNumerator() * d.getDenominator() + d.getNumerator() * c.getDenominator()),(c.getDenominator() * d.getDenominator()));
                        } else {
                                return new Rational(0,1);
                        }
		};
		if(a.getNumerator() == a.getDenominator()) {
			a.incDenominator();
			a.setNumerator(1);
			return sumf(f)(a,b);
		} else if(a.getNumber() <= b.getNumber()) {
			var fraction: Rational = new Rational(a.getNumerator(),b.getNumerator());
			a.incNumerator();
			var c: Rational = f(fraction);
			var d: Rational = sumf(f)(a,b);

			return new Rational((c.getNumerator() * d.getDenominator() + d.getNumerator() * c.getDenominator()),(c.getDenominator() * d.getDenominator()));
		} else {
			return new Rational(0,1);
		}

		return sumf(f)(a,b);
	};
}

