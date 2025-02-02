package finopsautomation.metadata.model.account;

import java.time.LocalDate;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import finopsautomation.metadata.model.ProviderTypeEnum;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

/**
 * Account definition with primary attributes
 */
public class AccountDefinition {
	/**
	 * Native provider account identifier 
	 */
	@NotEmpty
	private String accountID;
	/**
	 * Identifier of billing account
	 */
	@NotEmpty
	private String billingAccountID;
	/**
	 * Name account
	 */
	@NotEmpty
	private String accountName;
	/**
	 * Human friendly name assigned to account
	 */
	private String friendlyAccountName;
	/**
	 * Provider of account
	 */
	@NotNull
	private ProviderTypeEnum providerType;
	/**
	 * Optional linked account identifier
	 */
	private String linkedAccountID;
	/**
	 * When was the account created or provisioned?
	 */
	private LocalDate provisionDate;
	/**
	 * When was the account disabled?
	 */
	private LocalDate decommissionDate;
	/**
	 * Ad-hoc notes for the account 
	 */
	private String accountNotes;
	/**
	 * Business contact details 
	 */
	private ContactDetails businessContact = new ContactDetails();
	/**
	 * Technical contact details
	 */
	private ContactDetails technicalContact = new ContactDetails();
	
	public AccountDefinition() {
	}
	
	public AccountDefinition(String accountID) {
		this.accountID = accountID;
	}
	
	@Override
	public String toString() {
	   return ToStringBuilder.reflectionToString(this,ToStringStyle.SHORT_PREFIX_STYLE);
	}

	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	public String getBillingAccountID() {
		return billingAccountID;
	}

	public void setBillingAccountID(String billingAccountID) {
		this.billingAccountID = billingAccountID;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getFriendlyAccountName() {
		return friendlyAccountName;
	}

	public void setFriendlyAccountName(String friendlyAccountName) {
		this.friendlyAccountName = friendlyAccountName;
	}

	public ProviderTypeEnum getProviderType() {
		return providerType;
	}

	public void setProviderType(ProviderTypeEnum providerType) {
		this.providerType = providerType;
	}

	public String getLinkedAccountID() {
		return linkedAccountID;
	}

	public void setLinkedAccountID(String linkedAccountID) {
		this.linkedAccountID = linkedAccountID;
	}

	public LocalDate getProvisionDate() {
		return provisionDate;
	}

	public void setProvisionDate(LocalDate provisionDate) {
		this.provisionDate = provisionDate;
	}

	public LocalDate getDecommissionDate() {
		return decommissionDate;
	}

	public void setDecommissionDate(LocalDate decommissionDate) {
		this.decommissionDate = decommissionDate;
	}
	
	public String getAccountNotes() {
		return accountNotes;
	}

	public void setAccountNotes(String accountNotes) {
		this.accountNotes = accountNotes;
	}

	public String getTechnicalContactName() {
		return technicalContact.getContactName();
	}

	public void setTechnicalContactName(String technicalContactName) {
		technicalContact.setContactName(technicalContactName);
	}

	public String getTechnicalContactEmailAddress() {
		return technicalContact.getContactEmailAddress();
	}

	public void setTechnicalContactEmailAddress(String technicalContactEmailAddress) {
		technicalContact.setContactEmailAddress(technicalContactEmailAddress);
	}

	public String getBusinessContactName() {
		return businessContact.getContactName();
	}
	
	public void setBusinessContactName(String businessContactName) {
		businessContact.setContactName(businessContactName);
	}

	public String getBusinessContactEmailAddress() {
		return businessContact.getContactEmailAddress();
	}

	public void setBusinessContactEmailAddress(String businessContactEmailAddress) {
		businessContact.setContactEmailAddress(businessContactEmailAddress);
	}
}
