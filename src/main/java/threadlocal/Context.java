package threadlocal;

public class Context {
    private String transactionId = null;
    //getter and setter
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

}
