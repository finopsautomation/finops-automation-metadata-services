package finopsautomation.metadata.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Authorized Service for a provider
 */
public class AuthorizedService {
	/**
	 * Native service identifier
	 */
	private String serviceID;
	/**
	 * Region Provider Type 
	 */
	private ProviderTypeEnum providerType;
	/**
	 * Human friendly Service name
	 */	
	private String serviceName;
	/**
	 * Normalized name
	 */
	private String normalizedServiceName;
	
	public AuthorizedService() {
	}
	
	@Override
	public String toString() {
	   return ToStringBuilder.reflectionToString(this,ToStringStyle.SHORT_PREFIX_STYLE);
	}

	public String getServiceID() {
		return serviceID;
	}

	public void setServiceID(String serviceID) {
		this.serviceID = serviceID;
	}

	public ProviderTypeEnum getProviderType() {
		return providerType;
	}

	public void setProviderType(ProviderTypeEnum providerType) {
		this.providerType = providerType;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getNormalizedServiceName() {
		return normalizedServiceName;
	}

	public void setNormalizedServiceName(String normalizedServiceName) {
		this.normalizedServiceName = normalizedServiceName;
	}
}
