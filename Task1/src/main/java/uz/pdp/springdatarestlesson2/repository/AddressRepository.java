package uz.pdp.springdatarestlesson2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.springdatarestlesson2.entity.Address;
import uz.pdp.springdatarestlesson2.projection.AddressProjection;

@RepositoryRestResource(path = "address", collectionResourceRel = "list", excerptProjection = AddressProjection.class)
public interface AddressRepository extends JpaRepository<Address, Integer> {
}
