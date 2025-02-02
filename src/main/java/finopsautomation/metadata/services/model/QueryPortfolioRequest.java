package finopsautomation.metadata.services.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import finopsautomation.metadata.model.portfolio.Portfolio;

public class QueryPortfolioRequest {
	private String portfolioNameFilter;
	
	public QueryPortfolioRequest() {
	}
	
	@Override
	public String toString() {
	   return ToStringBuilder.reflectionToString(this,ToStringStyle.SHORT_PREFIX_STYLE);
	}
	
	public String getPortfolioNameFilter() {
		return portfolioNameFilter;
	}

	public void setPortfolioNameFilter(String portfolioNameFilter) {
		this.portfolioNameFilter = portfolioNameFilter;
	}
	
	/**
	 * Determine if request matches an Portfolio
	 * 
	 * @param portfolio Portfolio (required)
	 * 
	 * @return true if matches, false otherwise
	 */
	public boolean matches(Portfolio portfolio) {
		boolean matches = true;

		// Verify name matches
		if ((matches == true) && (portfolioNameFilter != null) && (!portfolioNameFilter.equalsIgnoreCase(portfolio.getPortfolioName()))) { 
			matches = false;
		}
		
		return matches;
	}
}
