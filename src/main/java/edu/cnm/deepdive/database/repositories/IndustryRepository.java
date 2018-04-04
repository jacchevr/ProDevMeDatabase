package edu.cnm.deepdive.database.repositories;

import edu.cnm.deepdive.database.models.Industry;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "industry", path = "industry")
public interface IndustryRepository extends PagingAndSortingRepository<Industry, Long> {

}
