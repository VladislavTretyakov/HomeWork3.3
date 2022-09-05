public class CreditPaymentService {
    public double calculate(int sum, int months, double annualP ) {
        double monthlyInterest = annualP / 12 / 100;
        double a =1 + monthlyInterest;
        double coefficient = monthlyInterest * Math.pow(a, months) / (Math.pow(a, months) - 1);
        double payment = sum * coefficient;
        double paymentEnd = Math.floor(payment);
        return paymentEnd;
    }
}
//m*(1+m).n : ((1+m).n-1)
//m = процентная ставка в месяц
// n= количество платижей
