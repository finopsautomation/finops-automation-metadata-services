package finopsautomation.metadata.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Service;

import finopsautomation.metadata.model.ProviderTypeEnum;
import finopsautomation.metadata.model.account.Account;
import finopsautomation.metadata.model.account.AccountDefinition;
import finopsautomation.metadata.model.portfolio.Portfolio;
import finopsautomation.metadata.model.portfolio.PortfolioDefinition;
import finopsautomation.metadata.services.model.GrantRevokePortfolioAccessRequest;
import finopsautomation.metadata.services.model.GrantRevokePortfolioAccessResponse;
import finopsautomation.metadata.services.model.QueryAccountRequest;
import finopsautomation.metadata.services.model.QueryPortfolioRequest;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.ValidationException;

@Service
public class MetadataManagementService {
	private static final Logger logger = LoggerFactory.getLogger(MetadataManagementService.class);
	private Set<ProviderTypeEnum> supportedProviders = new TreeSet<ProviderTypeEnum>();
			
	@Autowired
	private ListCrudRepository<AccountDefinition, String> accountRepository;
	@Autowired
	private ListCrudRepository<PortfolioDefinition, String> portfolioRepository;
	
	public MetadataManagementService() {
		supportedProviders.add(ProviderTypeEnum.AWS);
		supportedProviders.add(ProviderTypeEnum.AZURE);
		supportedProviders.add(ProviderTypeEnum.GCP);
		//supportedProviders.add(ProviderTypeEnum.IBM);
		//supportedProviders.add(ProviderTypeEnum.OCI);
	}
	
	/**
	 * Find Account by ID
	 * 
	 * @param accountID Identifier
	 * 
	 * @return Account or empty
	 */
	public Optional<Account> findAccountById(String accountID) {
		Optional<Account> result = Optional.empty();
		
		Optional<AccountDefinition> lookup = accountRepository.findById(accountID);
		
		if (lookup.isPresent())
		{
			result = Optional.of(new Account(lookup.get()));
		}
		
		return result;
	}

	/**
	 * @return List of all Accounts
	 */
	public List<Account> findAllAccounts() {
		List<Account> result = new ArrayList<Account>();
		
		List<AccountDefinition> accounts = accountRepository.findAll();
		
		for(AccountDefinition account : accounts) {
			result.add(new Account(account));
		}
	
		return result;
	}
	
	/**
	 * Filter list of accounts based on criteria specified
	 * 
	 * @param request Filter parameters
	 * 
	 * @return List of accounts
	 */
	public List<Account> findAccounts(QueryAccountRequest request) {
		List<Account> result = new ArrayList<Account>();
		
		List<AccountDefinition> accounts = accountRepository.findAll();
		
		for(AccountDefinition account : accounts) {
			Account temp = new Account(account);
			
			if (request.matches(temp)) {
				result.add(temp);
			}
		}
		
		return result;
	}
	
	public Optional<AccountDefinition> createAccountDefinition(AccountDefinition definition) {
		Optional<AccountDefinition> result = Optional.empty();
		
		try {
			logger.debug("Saving Account: " + definition);;

			validateAccountDefinition(definition);
			
			accountRepository.save(definition);
				
			result = Optional.of(definition);
		} catch (ValidationException ex) {
			throw ex;
		} catch (Exception ex) {
			logger.error(ex.getMessage());
		}

		logger.debug(definition.toString());
		
		return result;
	}
	
	// ------------------------------------------------------------------------------------------------------
	
	/**
	 * @return List of all portfolios
	 */
	public List<Portfolio> findAllPortfolios() {
		List<Portfolio> result = new ArrayList<Portfolio>();
		
		List<PortfolioDefinition> portfolios = portfolioRepository.findAll();
		
		for(PortfolioDefinition portfolio : portfolios) {
			result.add(new Portfolio(portfolio));
		}
	
		return result;
	}

	/**
	 * Find Portfolio by ID
	 * 
	 * @param portfolioID Identifier
	 * 
	 * @return Portfolio or empty
	 */
	public Optional<Portfolio> findPortfolioById(String portfolioID) {
		Optional<Portfolio> result = Optional.empty();
		
		Optional<PortfolioDefinition> lookup = portfolioRepository.findById(portfolioID);
		
		if (lookup.isPresent())
		{
			result = Optional.of(new Portfolio(lookup.get()));
		}
		
		return result;
	}

	/**
	 * Filter list of portfolios based on criteria specified
	 * 
	 * @param request Filter parameters
	 * 
	 * @return List of accounts
	 */
	public List<Portfolio> findPortfolios(QueryPortfolioRequest request) {
		List<Portfolio> result = new ArrayList<Portfolio>();
		
		List<PortfolioDefinition> portfolios = portfolioRepository.findAll();
		
		for(PortfolioDefinition portfolio : portfolios) {
			Portfolio temp = new Portfolio(portfolio);
			
			if (request.matches(temp)) {
				result.add(temp);
			}
		}
		
		return result;
	}
	
	public Optional<PortfolioDefinition> createPortfolioDefinition(PortfolioDefinition definition) {
		Optional<PortfolioDefinition> result = Optional.empty();
		
		try {
			logger.debug("Saving Portfolio: " + definition);;
			
			portfolioRepository.save(definition);
			
			result = Optional.of(definition);
		} catch (Exception ex) {
			logger.error(ex.getMessage());
		}
		
		logger.debug(definition.toString());
		
		return result;
	}
	
	public GrantRevokePortfolioAccessResponse grantPortfolioAccount(GrantRevokePortfolioAccessRequest request) {
		GrantRevokePortfolioAccessResponse result = new GrantRevokePortfolioAccessResponse();
		
		Optional<Portfolio> portfolio = findPortfolioById(request.getPortfolioID());
		
		if (portfolio.isPresent()) {
//			Optional<Account> account = findAccountById(request.getAccountID());
			
//			if (account.isPresent()) {
//				
//			}
		}
		
		return result;
	}
	
	public GrantRevokePortfolioAccessResponse revokePortfolioAccount(GrantRevokePortfolioAccessRequest request) {
		GrantRevokePortfolioAccessResponse result = new GrantRevokePortfolioAccessResponse();
		
		Optional<Portfolio> portfolio = findPortfolioById(request.getPortfolioID());
		
		if (portfolio.isPresent()) {
//			Optional<Account> account = findAccountById(request.getAccountID());
			
//			if (account.isPresent()) {
//				
//			}
		}
		
		return result;
	}

	// ------------------------------------------------------------------------------------------------------

	/**
	 * Validate the AccountDefinition and throw a ConstraintViolationException if any errors found
	 *  
	 * @param definition Account to examine (required)
	 * 
	 * @throws ConstraintViolationException
	 */
	private void validateAccountDefinition(AccountDefinition definition) {
		if (!supportedProviders.contains(definition.getProviderType())) {
			throw new ConstraintViolationException("Provider " + definition.getProviderType() + " is not supported at this time.", null);
		}
	}
}
