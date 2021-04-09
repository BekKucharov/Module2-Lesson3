package uz.pdp.springdatarestlesson2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.springdatarestlesson2.entity.UserBasket;
import uz.pdp.springdatarestlesson2.projection.UserBasketProjection;

@RepositoryRestResource(path = "userBasket", excerptProjection = UserBasketProjection.class)
public interface UserBasketRepository extends JpaRepository<UserBasket, Integer> {
}
