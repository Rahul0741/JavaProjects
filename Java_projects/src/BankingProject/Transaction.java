package BankingProject;

public class Transaction {

	private int transactionID;
	private int accountID;
	private String type;
	private double amount;
	private int timestamp;
	
	public Transaction(int accountID, String type, double amount) {
		super();
		this.accountID = accountID;
		this.type = type;
		this.amount = amount;
	}

	public int getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(int timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "Transaction [transactionID=" + transactionID + ", accountID=" + accountID + ", type=" + type
				+ ", amount=" + amount + ", timestamp=" + timestamp + "]";
	}
	
	
	
}
