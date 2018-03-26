
public class MyInteger {
	int value; 
	
	MyInteger(int newvalue){
		value = newvalue; 
	}
	
	int getvalue() {
		return value;
	}
	
	boolean isEven() {
		if((value % 2) ==0){
			return true;}
		else { 
			return false; }
	}
		boolean isOdd() {
			if((value % 2) !=0){
				return true;}
			else { 
				return false; }
	}
		boolean isPrime() {
			for(int i=2; i<value; i++) {
				if (value%i==0)
					return false;
			}
			return true; 
		}
		
	static boolean isEven(int num) {
		if((num % 2) ==0){
			return true;
		} else {
			return false;
		}
		
	}
	
	static boolean isOdd(int num) {
		if((num % 2) !=0){
			return true;
			} else {
				return false; 
			}
	}

	static boolean isPrime(int num) {
		for(int i=2; i<num; i++) {
			if (num%i==0) {
				return false;
			} 
		}
		return false;
	}
	
	boolean equals(int num) {
		if(num == value) { 
		return true; }
	 else 	{
		 return false;
	 		}	
	 }

	
	boolean isEven(MyInteger myInt) {
		if(myInt.value == this.value) { 
			return true; 
		} else {
			return false; 
		}
	}

	static int parseInt(char[] charArr) {
		int value = Integer.parseInt(new String(charArr)); 
	return value; 
	} 
	
	static int parseInt(String myStr) {
		int result = Integer.parseInt(myStr);
	return result; 
	} 
	
}
