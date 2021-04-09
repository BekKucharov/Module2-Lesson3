package uz.pdp.springdatarestlesson2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.springdatarestlesson2.entity.MyTeam;
import uz.pdp.springdatarestlesson2.projection.MyTeamProjection;

@RepositoryRestResource(path = "myTeam", excerptProjection = MyTeamProjection.class)
public interface MyTeamRepository extends JpaRepository<MyTeam, Integer> {
}
