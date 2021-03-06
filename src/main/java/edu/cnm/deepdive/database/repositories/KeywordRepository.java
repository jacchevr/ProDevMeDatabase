package edu.cnm.deepdive.database.repositories;

import edu.cnm.deepdive.database.models.Keyword;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "keywords", path = "keywords")
public interface KeywordRepository extends PagingAndSortingRepository<Keyword, Long> {

}
