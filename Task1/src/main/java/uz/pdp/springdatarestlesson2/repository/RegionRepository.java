package uz.pdp.springdatarestlesson2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.springdatarestlesson2.entity.Region;
import uz.pdp.springdatarestlesson2.projection.RegionProjection;

@RepositoryRestResource(path = "region", excerptProjection = RegionProjection.class)
public interface RegionRepository extends JpaRepository<Region, Integer> {
}
