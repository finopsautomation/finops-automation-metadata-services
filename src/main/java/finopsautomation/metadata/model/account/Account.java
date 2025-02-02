package finopsautomation.metadata.model.account;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

import finopsautomation.metadata.model.ProviderTypeEnum;

/**
 * Account aggregate which combines attributes
 * 
 * @see AccountDefinition
 */
public class Account {
	private AccountDefinition account;
	private Set<String> regions = new TreeSet<String>();
	private Set<String> services = new TreeSet<String>();

	public Account(AccountDefinition account) {
		this.account = account;
	}
	
	@Override
	public String toString() {
	   return account.toString();
	}

	/**
	 * @return The native account identifier
	 */
	public String getAccountID() {
		return account.getAccountID();
	}
	
	/**
	 * @return Account name
	 */
	public String getAccountName() {
		return account.getAccountName();
	}
	
	/**
	 * @return Identifier of billing account
	 */
	public String getBillingAccountID() {
		return account.getBillingAccountID();
	}
	
	/**
	 * @return Friendly account name
	 */
	public String getFriendlyAccountName() {
		return account.getFriendlyAccountName();
	}
	
	/**
	 * @return Optional linked account identifier
	 */
	public String getLinkedAccountID() {
		return account.getLinkedAccountID();
	}

	/**
	 * @return Provider of account
	 */
	public ProviderTypeEnum getProviderType() {
		return account.getProviderType();
	}

	/**
	 * @return
	 */
	public LocalDate getProvisionDate() {
		return account.getProvisionDate();
	}
	
	/**
	 * @return
	 */
	public LocalDate getDecommissionDate() {
		return account.getDecommissionDate();
	}
	
	/**
	 * @return Business Contact Name
	 */
	public String getBusinessContactName() {
		return account.getBusinessContactName();
	}
	
	/**
	 * @return Business Contact Email Address
	 */
	public String getBusinessContactEmailAddress() {
		return account.getBusinessContactEmailAddress();
	}
	
	/**
	 * @return Technical Contact Name
	 */
	public String getTechnicalContactName() {
		return account.getTechnicalContactName();
	}
	
	/**
	 * @return Technical Contact Email Address
	 */
	public String getTechnicalContactEmailAddress() {
		return account.getTechnicalContactEmailAddress();
	}
	
	/**
	 * @return Set of active authorized regions
	 */
	public Set<String> getAuthorizedRegions() {
		return regions;
	}
	
	/**
	 * @return Set of active authorized services
	 */
	public Set<String> getAuthorizedServices() {
		return services;
	}
	
	public void addRegion(String regionID) {
		regions.add(regionID);
	}
	
	public void addService(String serviceID) {
		services.add(serviceID);
	}
}
