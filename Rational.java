package cs141hw2;

public class Rational {
	int p, q;
	public Rational(int numerator, int denominator) {
		p = numerator;
		q = denominator;
	}
	
	public Rational() {
		p = 0;
		q = 1;
	}

	public Rational(int numerator) {
		p = numerator;
		q = 1;
	}
	
	public Rational(Rational fraction) {
		p = fraction.p;
		q = fraction.q;
	}
	
	public String toString() {
		return p + " / " + q;
		}
	
	//overloading
	public boolean equals(Rational x) {
		int p1,p2,q1,q2;
		p1 = p; //r1
		q1 = q;
		p2 = x.p; //r2
		q2 = x.q;
		
		if((q1 * p2) == (q2 * p1)) {
			return true;
		}
		else
			return false;
	}
	public Rational add(Rational otherFraction) {
		int numeratorSum = this.p + otherFraction.p;
		int denominatorSum = this.q + otherFraction.q;
	Rational fraction = new Rational(numeratorSum, denominatorSum); 
	    return fraction;
	}

	public void print(int number) {
		double output = p/q;
		output = output - (output %)(Math.pow(0.1, number)));
		System.out.println(output);
		
	}
}
