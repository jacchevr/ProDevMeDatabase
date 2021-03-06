package edu.cnm.deepdive.database.repositories;


import edu.cnm.deepdive.database.models.Profession;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "professions", path = "professions")
public interface ProfessionRepository extends PagingAndSortingRepository<Profession, Long> {

}
