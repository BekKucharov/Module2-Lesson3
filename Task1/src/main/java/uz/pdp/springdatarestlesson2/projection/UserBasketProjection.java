package uz.pdp.springdatarestlesson2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springdatarestlesson2.entity.OutputProduct;
import uz.pdp.springdatarestlesson2.entity.User;
import uz.pdp.springdatarestlesson2.entity.UserBasket;

@Projection(name = "userBasketProjection", types = UserBasket.class)
public interface UserBasketProjection {
    Integer getId();
    float getAllSum();
    OutputProduct getOutputProduct();
    User getUser();
}
