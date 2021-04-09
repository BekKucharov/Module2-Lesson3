package uz.pdp.springdatarestlesson2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springdatarestlesson2.entity.Attachment;
import uz.pdp.springdatarestlesson2.entity.Category;
import uz.pdp.springdatarestlesson2.entity.Product;

@Projection(name = "productProjection", types = Product.class)
public interface ProductProjection {
    Integer getId();
    String getName();
    String getModel();
    String getDescription();
    float getPrice();
    Attachment getAttachment();
    Category getCategory();
}
