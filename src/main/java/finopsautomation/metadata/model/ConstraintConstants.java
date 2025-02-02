package finopsautomation.metadata.model;

public class ConstraintConstants {
	/**
	 * AWS Account ID Pattern (twelve digits) 
	 */
	public static final String AWS_ACCOUNT_ID_PATTERN = "\\d{12}";
	/**
	 * Azure Account ID Pattern 
	 * 
	 * Example: 1bc3aca-5016-4db0-a6bc-1111fccdf72b
	 */
	public static final String AZURE_ACCOUNT_ID_PATTERN = "\\[a-z0-9]{6}-[a-z0-9]{4}-[a-z0-9]{4}-[a-z0-9]{4}-[a-z0-9]{12}";
	/**
	 * GCP Account ID Pattern (three pairs of 6 alphanumeric)
	 * 
	 * Example: 010101-F0FFF0-10XX01
	 */
	public static final String GCP_ACCOUNT_ID_PATTERN = "\\[A-Z0-9]{6}-[A-Z0-9]{6}-[A-Z0-9]{6}";
	/**
	 * OCI Account ID Pattern (eight digits) 
	 */
	// TODO: Need to verify this
	public static final String OCI_ACCOUNT_ID_PATTERN = "\\d{8}";
	/**
	 * IBM Account ID Pattern (32 digit alphanumeric)
	 * 
	 * Example: a1b2c3d4e5f61234567890fedcba4321
	 */
	public static final String IBM_ACCOUNT_ID_PATTERN = "\\[a-z0-9]{32}";
	
	// -----------------------------------------------------------------------------
	
	/**
	 * AWS Account Name Pattern  
	 */
	public static final String AWS_ACCOUNT_NAME_PATTERN = "\\[a-z0-9\\-]+";
	/**
	 * Azure Account Name Pattern 
	 */
	public static final String AZURE_ACCOUNT_NAME_PATTERN = "[a-zA-Z0-9]{50}";
	/**
	 * GCP Account Name Pattern 
	 */
	public static final String GCP_ACCOUNT_NAME_PATTERN = "";
	/**
	 * OCI Account Name Pattern 
	 */
	public static final String OCI_ACCOUNT_NAME_PATTERN = "";
	/**
	 * IBM Account Name Pattern
	 */
	public static final String IBM_ACCOUNT_NAME_PATTERN = "";
}
