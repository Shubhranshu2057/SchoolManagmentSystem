package Entity;

public class AccountsEntity {
    private String First;
    private String Last;
    private String Username;
    private String password;
    private int Code;
    private String type;
    private String status;
    private int fees;
    private boolean paidfees;
    private int attempts;

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public String getFirst() {
        return First;
    }

    public void setFirst(String first) {
        First = first;
    }

    public String getLast() {
        return Last;
    }

    public void setLast(String last) {
        Last = last;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public boolean isPaidfees() {
        return paidfees;
    }

    public void setPaidfees(boolean paidfees) {
        this.paidfees = paidfees;
    }

    public AccountsEntity(String first, String last, String username, String password, int code, String type, String status, int fees, boolean paidfees,int attempts) {
        First = first;
        Last = last;
        Username = username;
        this.password = password;
        this.Code = code;
        this.type = type;
        this.status = status;
        this.fees = fees;
        this.paidfees = paidfees;
        this.attempts=attempts;
    }
}
