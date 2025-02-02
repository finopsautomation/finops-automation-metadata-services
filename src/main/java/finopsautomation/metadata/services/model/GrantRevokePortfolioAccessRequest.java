package finopsautomation.metadata.services.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GrantRevokePortfolioAccessRequest {
	private String portfolioID;
	private String accountID;
	
	@Override
	public String toString() {
	   return ToStringBuilder.reflectionToString(this,ToStringStyle.SHORT_PREFIX_STYLE);
	}

	public GrantRevokePortfolioAccessRequest(String portfolioID, String accountID) {
		this.portfolioID = portfolioID;
		this.accountID = accountID;
	}
	
	public String getPortfolioID() {
		return portfolioID;
	}
	public String getAccountID() {
		return accountID;
	}
}
