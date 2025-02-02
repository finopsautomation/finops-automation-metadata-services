package finopsautomation.metadata.model.portfolio;

import java.time.LocalDate;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import finopsautomation.metadata.model.account.ContactDetails;
import jakarta.validation.constraints.NotEmpty;

public class PortfolioDefinition {
	/**
	 * Internal Identifier for the portfolio
	 */
	@NotEmpty
	private String portfolioID;
	/**
	 * Public name of the portfolio
	 */
	@NotEmpty
	private String portfolioName;
	/**
	 * Ad-hoc notes for the portfolio 
	 */
	private String portfolioNotes;
	/**
	 * When was the portfolio authorized for use?
	 */
	private LocalDate startDate;
	/**
	 * When was the portfolio no longer authorized for use?
	 */
	private LocalDate endDate;
	/**
	 * Business contact details 
	 */
	private ContactDetails businessContact = new ContactDetails();
	/**
	 * Technical contact details
	 */
	private ContactDetails technicalContact = new ContactDetails();
	
	public PortfolioDefinition() {
	}
	
	public PortfolioDefinition(String portfolioID) {
		this.portfolioID = portfolioID;
	}

	public PortfolioDefinition(String portfolioID, String portfolioName) {
		this.portfolioID = portfolioID;
		this.portfolioName = portfolioName;
	}

	@Override
	public String toString() {
	   return ToStringBuilder.reflectionToString(this,ToStringStyle.SHORT_PREFIX_STYLE);
	}

	public String getPortfolioID() {
		return portfolioID;
	}

	public void setPortfolioID(String portfolioID) {
		this.portfolioID = portfolioID;
	}

	public String getPortfolioName() {
		return portfolioName;
	}

	public void setPortfolioName(String portfolioName) {
		this.portfolioName = portfolioName;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getPortfolioNotes() {
		return portfolioNotes;
	}

	public void setPortfolioNotes(String portfolioNotes) {
		this.portfolioNotes = portfolioNotes;
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
