package edu.cnm.deepdive.database.repositories;

import edu.cnm.deepdive.database.models.Document;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "documents", path = "documents")
public interface DocumentRepository extends PagingAndSortingRepository<Document, Long> {


  public Document findAllByUserModel_EmailOrderByCreatedDesc(String s);

  public Document findFirstByUserModel_EmailOrderByCreatedDesc(String s);
}
