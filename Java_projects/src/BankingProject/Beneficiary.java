package BankingProject;

public class Beneficiary {

	private int beneficiaryID;
	private int customerID;
	private String name;
	private String accountNumber;
	private String bankdetails;
	
	public Beneficiary(int beneficiaryID, int customerID, String name, String accountNumber, String bankdetails) {
		super();
		this.beneficiaryID = beneficiaryID;
		this.customerID = customerID;
		this.name = name;
		this.accountNumber = accountNumber;
		this.bankdetails = bankdetails;
	}

	public int getBeneficiaryID() {
		return beneficiaryID;
	}

	public void setBeneficiaryID(int beneficiaryID) {
		this.beneficiaryID = beneficiaryID;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBankdetails() {
		return bankdetails;
	}

	public void setBankdetails(String bankdetails) {
		this.bankdetails = bankdetails;
	}

	@Override
	public String toString() {
		return "Beneficiaries [beneficiaryID=" + beneficiaryID + ", customerID=" + customerID + ", name=" + name
				+ ", accountNumber=" + accountNumber + ", bankdetails=" + bankdetails + "]";
	}
	
	
}

