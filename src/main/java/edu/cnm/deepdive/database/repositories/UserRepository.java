package edu.cnm.deepdive.database.repositories;

import edu.cnm.deepdive.database.models.Document;
import edu.cnm.deepdive.database.models.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

}
