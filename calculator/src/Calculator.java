public class Calculator {
    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sumOfNaturals(int n) {
	int sum = 0;
	for (int i = 1; i <= n; i++) {
		sum += i;
	}
	return sum;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int mod(int a, int b) {
        return a%b;
    }
}
