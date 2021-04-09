package uz.pdp.springdatarestlesson2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.springdatarestlesson2.projection.CharacteristicsProjection;

import java.util.stream.Collector;
@RepositoryRestResource(path = "characteristics", excerptProjection = CharacteristicsProjection.class)
public interface CharacteristicsRepository extends JpaRepository<Collector.Characteristics, Integer> {
}
