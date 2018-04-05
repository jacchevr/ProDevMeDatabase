package edu.cnm.deepdive.database.repositories;

import edu.cnm.deepdive.database.models.Document;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "documents", path = "documents")
public interface DocumentRepository extends PagingAndSortingRepository<Document, Long> {


  public List<Document> findAllByUserModelEmailOrderByCreatedDesc(@Param("email") String email);

  public Document findFirstByUserModelEmailOrderByCreatedDesc(@Param("email") String email);
}
