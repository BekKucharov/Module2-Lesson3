package uz.pdp.springdatarestlesson2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springdatarestlesson2.entity.Category;

@Projection(name = "categoryProjection", types = Category.class)
public interface CategoryProjection {
    Integer getId();
    String getNameUz();
    String getNameRu();
    String getNameEng();
    Category getCategory();
}
