package uz.pdp.springdatarestlesson2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.springdatarestlesson2.entity.Supplier;
import uz.pdp.springdatarestlesson2.projection.SupplierProjection;

@RepositoryRestResource(path = "supplier", collectionResourceRel = "list", excerptProjection = SupplierProjection.class)
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {
}
