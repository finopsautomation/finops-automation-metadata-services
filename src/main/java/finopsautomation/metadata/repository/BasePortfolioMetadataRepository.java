package finopsautomation.metadata.repository;

import java.util.Collections;
import java.util.List;

import org.springframework.data.repository.ListCrudRepository;

import finopsautomation.metadata.model.portfolio.PortfolioDefinition;

public abstract class BasePortfolioMetadataRepository implements ListCrudRepository<PortfolioDefinition, String> {
	@Override
	public <S extends PortfolioDefinition> S save(S entity) {
		return null;
	}
	
	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(PortfolioDefinition entity) {
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteAllById(Iterable<? extends String> ids) {
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteAll(Iterable<? extends PortfolioDefinition> entities) {
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
	}

	@Override
	public <S extends PortfolioDefinition> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return Collections.emptyList();
	}
	
	@Override
	public List<PortfolioDefinition> findAllById(Iterable<String> ids) {
		return Collections.emptyList();
	}
}
