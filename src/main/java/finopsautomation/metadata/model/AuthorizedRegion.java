package finopsautomation.metadata.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Authorized Region for a provider
 */
public class AuthorizedRegion {
	/**
	 * Native region identifier
	 */
	private String regionID;
	/**
	 * Region Provider Type 
	 */
	private ProviderTypeEnum providerType;
	/**
	 * Human friendly region name
	 */
	private String regionName;
	
	public AuthorizedRegion() {
	}
	
	@Override
	public String toString() {
	   return ToStringBuilder.reflectionToString(this,ToStringStyle.SHORT_PREFIX_STYLE);
	}

	public String getRegionID() {
		return regionID;
	}

	public void setRegionID(String regionID) {
		this.regionID = regionID;
	}

	public ProviderTypeEnum getProviderType() {
		return providerType;
	}

	public void setProviderType(ProviderTypeEnum providerType) {
		this.providerType = providerType;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
}
