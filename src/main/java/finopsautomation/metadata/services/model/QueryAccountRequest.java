package finopsautomation.metadata.services.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import finopsautomation.metadata.model.ProviderTypeEnum;
import finopsautomation.metadata.model.account.Account;

/**
 * Used by MetadataManagementService to retrieve Accounts
 */
public class QueryAccountRequest {
	private String accountNameFilter;
	private String friendlyAccountNameFilter;
	private ProviderTypeEnum providerTypeFilter;
	private String billingAccountIDFilter;
	private String linkedAccountIDFilter;
//	private String regionIDFilter;
//	private String serviceIDFilter;
	
	@Override
	public String toString() {
	   return ToStringBuilder.reflectionToString(this,ToStringStyle.SHORT_PREFIX_STYLE);
	}
	
	public String getAccountNameFilter() {
		return accountNameFilter;
	}

	public void setAccountNameFilter(String accountNameFilter) {
		this.accountNameFilter = accountNameFilter;
	}

	public String getFriendlyAccountNameFilter() {
		return friendlyAccountNameFilter;
	}

	public void setFriendlyAccountNameFilter(String friendlyAccountNameFilter) {
		this.friendlyAccountNameFilter = friendlyAccountNameFilter;
	}


	public ProviderTypeEnum getProviderTypeFilter() {
		return providerTypeFilter;
	}

	public void setProviderTypeFilter(ProviderTypeEnum providerTypeFilter) {
		this.providerTypeFilter = providerTypeFilter;
	}

	public String getBillingAccountIDFilter() {
		return billingAccountIDFilter;
	}

	public void setBillingAccountIDFilter(String billingAccountIDFilter) {
		this.billingAccountIDFilter = billingAccountIDFilter;
	}

	public String getLinkedAccountIDFilter() {
		return linkedAccountIDFilter;
	}

	public void setLinkedAccountIDFilter(String linkedAccountIDFilter) {
		this.linkedAccountIDFilter = linkedAccountIDFilter;
	}
	
//	public String getRegionIDFilter() {
//		return regionIDFilter;
//	}
//
//	public void setRegionIDFilter(String regionIDFilter) {
//		this.regionIDFilter = regionIDFilter;
//	}
//
//	public String getServiceIDFilter() {
//		return serviceIDFilter;
//	}
//
//	public void setServiceIDFilter(String serviceIDFilter) {
//		this.serviceIDFilter = serviceIDFilter;
//	}

	/**
	 * Determine if request matches an Account
	 * 
	 * @param account Account (required)
	 * 
	 * @return true if matches, false otherwise
	 */
	public boolean matches(Account account) {
		boolean matches = true;

		// Verify provider type matches
		if ((matches == true) && (providerTypeFilter != null) && (providerTypeFilter != account.getProviderType())) {
			matches = false;
		}

		// Verify account name matches
		if ((matches == true) && (accountNameFilter != null) && (!accountNameFilter.equalsIgnoreCase(account.getAccountName()))) { 
			matches = false;
		}

		// Verify friendly account name matches
		if ((matches == true) && (friendlyAccountNameFilter != null) && (!friendlyAccountNameFilter.equalsIgnoreCase(account.getFriendlyAccountName()))) { 
			matches = false;
		}

		// Verify billing account ID matches
		if ((matches == true) && (billingAccountIDFilter != null) && (!billingAccountIDFilter.equalsIgnoreCase(account.getBillingAccountID()))) { 
			matches = false;
		}
		
		// Verify linked account ID matches
		if ((matches == true) && (linkedAccountIDFilter != null) && (!linkedAccountIDFilter.equalsIgnoreCase(account.getLinkedAccountID()))) {
			matches = false;
		}

//		// Verify region in use
//		if ((matches == true) && (regionIDFilter != null) && (!account.getAuthorizedRegions().contains(regionIDFilter))) {
//			matches = false;
//		}
//
//		// Verify service in use
//		if ((matches == true) && (serviceIDFilter != null) && (!account.getAuthorizedServices().contains(serviceIDFilter))) {
//			matches = false;
//		}
		
		return matches;
	}
}
