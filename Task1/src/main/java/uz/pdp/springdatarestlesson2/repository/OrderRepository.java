package uz.pdp.springdatarestlesson2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.springdatarestlesson2.entity.Order;
import uz.pdp.springdatarestlesson2.projection.OrderProjection;

@RepositoryRestResource(path = "order", collectionResourceRel = "list", excerptProjection = OrderProjection.class)
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
