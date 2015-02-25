package MainPackage;

public class MyInteger {

	private int value;

	public MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public boolean isEven() {
		if ((this.value % 2) == 0)
			return true;
		else
			return false;
	}

	public boolean isOdd() {
		if ((this.value % 2) == 0)
			return false;
		else
			return true;
	}

	public boolean isPrime() {
		for (int i = 2; i <= (this.value / 2); i++) {
			if (this.value % i == 0 & this.value != i)
				return false;
		}
		return true;
	}

	public static boolean isEven(int a) {
		if ((a % 2) == 0)
			return true;
		else
			return false;
	}

	public static boolean isOdd(int a) {
		if ((a % 2) == 0)
			return false;
		else
			return true;
	}

	public static boolean isPrime(int a) {
		for (int i = 2; i <= (a / 2); i++) {
			if (a % i == 0 & a != i)
				return false;
		}
		return true;
	}

	public static boolean isEven(MyInteger val) {
		if ((val.value % 2) == 0)
			return true;
		else
			return false;
	}

	public static boolean isOdd(MyInteger val) {
		if ((val.value % 2) == 0)
			return false;
		else
			return true;
	}

	public static boolean isPrime(MyInteger val) {
		for (int i = 2; i <= (val.value / 2); i++) {
			if (val.value % i == 0 & val.value != i)
				return false;
		}
		return true;
	}

	public boolean equals(int a) {
		if (a == value) {
			return true;
		} else {
			return false;
		}
	}

	public boolean equals(MyInteger val) {
		if (getValue() == value) {
			return true;
		} else {
			return false;
		}

	}

	public static int parseInt() {
		char[] newValue = { '1', '2', '3', '4', '5' };
		return Integer.parseInt(String.valueOf(newValue));
	}

	public static int parseInt(String a) {
		return Integer.parseInt("a");
	}
}
