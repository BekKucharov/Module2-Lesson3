package uz.pdp.springdatarestlesson2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springdatarestlesson2.entity.Order;
import uz.pdp.springdatarestlesson2.entity.UserBasket;

@Projection(name = "orderProjection", types = Order.class)
public interface OrderProjection {
    Integer getId();
    String getDate();
    String getDetails();
    UserBasket getUserBasket();
}
