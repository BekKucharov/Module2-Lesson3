package uz.pdp.springdatarestlesson2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springdatarestlesson2.entity.Characteristics;
import uz.pdp.springdatarestlesson2.entity.Product;

@Projection(name = "characteristicsProjection", types = Characteristics.class)
public interface CharacteristicsProjection {
    Integer getId();
    String getName();
    Integer getSize();
    Product getProduct();
}
