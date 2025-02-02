package finopsautomation.metadata.model.account;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ContactDetails {
	private String contactName;
	private String contactEmailAddress;

	public ContactDetails() {
	}

	public ContactDetails(String contactName, String contactEmailAddress) {
		this.contactName = contactName;
		this.contactEmailAddress = contactEmailAddress;
	}

	@Override
	public String toString() {
	   return ToStringBuilder.reflectionToString(this,ToStringStyle.SHORT_PREFIX_STYLE);
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactEmailAddress() {
		return contactEmailAddress;
	}

	public void setContactEmailAddress(String contactEmailAddress) {
		this.contactEmailAddress = contactEmailAddress;
	}
}
