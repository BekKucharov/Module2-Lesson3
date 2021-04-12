package uz.pdp.springdatarestlesson2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.springdatarestlesson2.entity.User;
import uz.pdp.springdatarestlesson2.projection.UserProjection;

@RepositoryRestResource(path = "user", collectionResourceRel = "list", excerptProjection = UserProjection.class)
public interface UserRepository extends JpaRepository<User, Integer> {
}
