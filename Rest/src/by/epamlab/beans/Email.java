package by.epamlab.beans;
public class Email {
	private boolean isDefault;
	private String emailAddress;
	private String emailType;
	private String sequence;
	private String SyncStatus;
	public Email() {

	}
	public Email(boolean isDefault, String emailAddress, String emailType, String sequence, String syncStatus) {
		this.isDefault = isDefault;
		this.emailAddress = emailAddress;
		this.emailType = emailType;
		this.sequence = sequence;
		SyncStatus = syncStatus;
	}
	public Email(String emailAdress){
		this.emailAddress = emailAdress;
	}
	public boolean isDefault() {
		return isDefault;
	}
	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getEmailType() {
		return emailType;
	}
	public void setEmailType(String emailType) {
		this.emailType = emailType;
	}
	public String getSequence() {
		return sequence;
	}
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
	public String getSyncStatus() {
		return SyncStatus;
	}
	public void setSyncStatus(String syncStatus) {
		SyncStatus = syncStatus;
	}

}