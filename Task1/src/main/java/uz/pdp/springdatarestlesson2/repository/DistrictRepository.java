package uz.pdp.springdatarestlesson2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.springdatarestlesson2.entity.District;
import uz.pdp.springdatarestlesson2.projection.DistrictProjection;

@RepositoryRestResource(path = "district", excerptProjection = DistrictProjection.class)
public interface DistrictRepository extends JpaRepository<District, Integer> {
}
