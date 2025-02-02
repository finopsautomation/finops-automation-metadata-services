package finopsautomation.metadata.repository;

import java.util.Collections;
import java.util.List;

import org.springframework.data.repository.ListCrudRepository;

import finopsautomation.metadata.model.account.AccountDefinition;

public abstract class BaseAccountMetadataRepository implements ListCrudRepository<AccountDefinition, String> {
	@Override
	public <S extends AccountDefinition> S save(S entity) {
		return null;
	}
	
	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(AccountDefinition entity) {
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteAllById(Iterable<? extends String> ids) {
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteAll(Iterable<? extends AccountDefinition> entities) {
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
	}

	@Override
	public <S extends AccountDefinition> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return Collections.emptyList();
	}
	
	@Override
	public List<AccountDefinition> findAllById(Iterable<String> ids) {
		return Collections.emptyList();
	}
}
