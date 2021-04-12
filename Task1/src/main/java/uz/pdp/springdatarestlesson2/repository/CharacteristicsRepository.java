package uz.pdp.springdatarestlesson2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.springdatarestlesson2.entity.Characteristics;
import uz.pdp.springdatarestlesson2.projection.CharacteristicsProjection;

@RepositoryRestResource(path = "characteristics", collectionResourceRel = "list", excerptProjection = CharacteristicsProjection.class)
public interface CharacteristicsRepository extends JpaRepository<Characteristics, Integer> {
}
