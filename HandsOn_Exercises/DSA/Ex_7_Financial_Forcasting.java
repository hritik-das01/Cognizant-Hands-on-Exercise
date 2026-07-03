package HandsOn_Exercises.DSA;

public class Ex_7_Financial_Forcasting {

    static double futureValue(double amount, double rate, int yrs) {

        if (yrs == 0) {
            return amount;
        }

        return futureValue(amount * (1 + rate), rate, yrs - 1);
    }
    public static void main(String[] args) {

        double amount = 1000;
        double rate = 0.10;   // 10%
        int yrs = 3;

        double result = futureValue(amount, rate, yrs);

        System.out.println("Future Value = " + result);
    }

    }