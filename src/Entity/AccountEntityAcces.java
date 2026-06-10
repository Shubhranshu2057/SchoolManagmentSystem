package Entity;

public class AccountEntityAcces extends AccountsEntity {
    public AccountEntityAcces(String first, String last, String username, String password, int code, String type, String status, int fees, boolean paidfees,int attempts) {
        super(first, last, username, password, code, type, status, fees, paidfees,attempts);
        this.setFirst(first);
        this.setLast(last);
        this.setUsername(username);
        this.setPassword(password);
        this.setCode(code);
        this.setPaidfees(paidfees);
        this.setStatus(status);
        this.setFees(fees);
        this.setType(type);
        this.setAttempts(attempts);
    }
}
