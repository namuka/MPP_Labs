package prob3;

public class Account {
	private String ownerName;
	private int balance;
	private int accId;
	public Account(String owner, int b, int aId) {
		this.ownerName = owner;
		this.balance = b;
		this.accId = aId;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("<");
		sb.append("Account owner: ");
		sb.append(ownerName);
		sb.append(" Account ID: ");
		sb.append(accId);
		sb.append(" balance: ");
		sb.append("" + balance+">");
		return sb.toString();
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null) return false;
		if(obj.getClass()!=this.getClass()) return false;
		Account e = (Account) obj;
		return this.ownerName.equals(e.ownerName) && this.balance==e.balance && this.accId==e.accId;
	}
}
