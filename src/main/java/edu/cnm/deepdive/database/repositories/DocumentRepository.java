package edu.cnm.deepdive.database.repositories;

import edu.cnm.deepdive.database.models.Document;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "document", path = "document")
public interface DocumentRepository extends PagingAndSortingRepository<Document, Long> {

}
