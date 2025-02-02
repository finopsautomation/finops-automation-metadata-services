package finopsautomation.metadata.model.portfolio;

/**
 * Portfolio aggregate which combines attributes
 * 
 * @see PortfolioDefinition
 */
public class Portfolio {
	private PortfolioDefinition portfolio;
	
	public Portfolio(PortfolioDefinition portfolio) {
		this.portfolio = portfolio;
	}
	
	public String getPortfolioID() {
		return portfolio.getPortfolioID();
	}
	
	public String getPortfolioName() {
		return portfolio.getPortfolioName();
	}

	public String getPortfolioNotes() {
		return portfolio.getPortfolioNotes();
	}

	/**
	 * @return Business Contact Name
	 */
	public String getBusinessContactName() {
		return portfolio.getBusinessContactName();
	}
	
	/**
	 * @return Business Contact Email Address
	 */
	public String getBusinessContactEmailAddress() {
		return portfolio.getBusinessContactEmailAddress();
	}
	
	/**
	 * @return Technical Contact Name
	 */
	public String getTechnicalContactName() {
		return portfolio.getTechnicalContactName();
	}
	
	/**
	 * @return Technical Contact Email Address
	 */
	public String getTechnicalContactEmailAddress() {
		return portfolio.getTechnicalContactEmailAddress();
	}
}
