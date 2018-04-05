package edu.cnm.deepdive.database.repositories;

import edu.cnm.deepdive.database.models.UserModel;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends PagingAndSortingRepository<UserModel, Long> {

  public UserModel findFirstByEmailIgnoreCase(String s);
}
