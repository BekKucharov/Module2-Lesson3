package uz.pdp.springdatarestlesson2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.springdatarestlesson2.entity.OutputProduct;
import uz.pdp.springdatarestlesson2.projection.OutputProductProjection;

@RepositoryRestResource(path = "outputProduct", collectionResourceRel = "list", excerptProjection = OutputProductProjection.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct,Integer> {
}
