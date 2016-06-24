package by.epamlab.beans;

public class Phone {
	private boolean isDefault;
	private String phoneNumber;
	private String phoneType;
	private String sequence;
	private String 	SyncStatus;
	
	public Phone() {
	}

	public Phone(boolean isDefault, String phoneNumber, String phoneType, String sequence, String syncStatus) {
		this.isDefault = isDefault;
		this.phoneNumber = phoneNumber;
		this.phoneType = phoneType;
		this.sequence = sequence;
		SyncStatus = syncStatus;
	}
	public Phone(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public boolean isDefault() {
		return isDefault;
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
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