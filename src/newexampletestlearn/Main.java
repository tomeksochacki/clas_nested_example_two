package newexampletestlearn;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(1000);
        System.out.println(bankAccount.getAccountBalance());
        bankAccount.start(5);
        System.out.println(bankAccount.getAccountBalance());
    }
}

class BankAccount{

    BankAccount(double accountBalance){
        this.accountBalance = accountBalance;
    }

    private double accountBalance;

    public double getAccountBalance() {
        return this.accountBalance;
    }

    void start(double interestRate){
        class Interest{

            Interest(double interestRate){
                this.interestRate = interestRate;
                this.changeAccountBalance(interestRate);
            }
            private double interestRate;

            void changeAccountBalance(double interestRate){
                double interest = (accountBalance*interestRate) / 100;
                accountBalance+=interest;
            }

        }
        Interest interest = new Interest(interestRate);
    }


}
