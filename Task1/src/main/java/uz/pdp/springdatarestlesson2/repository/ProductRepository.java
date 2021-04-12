package uz.pdp.springdatarestlesson2.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.springdatarestlesson2.entity.Category;
import uz.pdp.springdatarestlesson2.entity.Product;
import uz.pdp.springdatarestlesson2.projection.ProductProjection;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "product", excerptProjection = ProductProjection.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {

    @RestResource(path = "byPrice")
    public Page<Product> findAllByPriceBetween(float price, float price2, Pageable pageable);
//    public Page<Product> findAllByPriceBetween(@Param("lowPrice") Double lowPrice,@Param("maxPrice") Double maxPrice,Pageable pageable);

    @RestResource(path = "byName")
    public Page<Product> findAllByName(@Param("name") String name, Pageable pageable);

    @RestResource(path = "byCategory")
    public Page<Product> findAllByCategory(@Param("category") Category category, Pageable pageable);

    @RestResource(path = "byModel")
    public Page<Product> findAllByModel(@Param("model") String model, Pageable pageable);

    @RestResource(path = "byDescription")
    public Page<Product> findAllByDescription(@Param("description") String description, Pageable pageable);

    @RestResource(path = "byActive")
    public Page<Product> findAllByActive(@Param("active") Boolean active, Pageable pageable);

}
