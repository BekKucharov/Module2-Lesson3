package uz.pdp.springdatarestlesson2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springdatarestlesson2.entity.OutputProduct;
import uz.pdp.springdatarestlesson2.entity.Product;

import java.util.Set;

@Projection(name = "outputProductProjection", types = OutputProduct.class)
public interface OutputProductProjection {
    Integer getId();
    Integer getAmount();
    Set<Product> getProduct();
}
