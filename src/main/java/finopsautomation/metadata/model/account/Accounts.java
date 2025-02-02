package finopsautomation.metadata.model.account;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Accounts implements Iterable<Account> {
	private List<Account> accounts = new ArrayList<Account>();

	public List<Account> getAccounts() {
		return accounts;
	}
	
	public boolean isEmpty() {
		return accounts.isEmpty();
	}
	
	public int size() {
		return accounts.size();
	}

	public Account get(int index) {
		return accounts.get(index);
	}
	
	@Override
	public Iterator<Account> iterator() {
		return accounts.iterator();
	}
	
	public void add(Account acct) {
		accounts.add(acct);
	}
	
	@Override
	public String toString() {
		return "Accounts[accounts=" + accounts + "]";
	}	
}
