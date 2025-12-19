import javax.naming.InsufficientResourcesException;

class GaribException extends Exception {
    public GaribException(String message) {
        super(message);
    }
}

class User_CheckedException {
    double balance = 5000;

    void withdraw(double amount) throws GaribException{
        if (amount > balance) {
            throw new GaribException("Low balance in account");
        }
balance -= amount;
System.out.println("Withdrawal Successful.                    ");
    }
    
}
