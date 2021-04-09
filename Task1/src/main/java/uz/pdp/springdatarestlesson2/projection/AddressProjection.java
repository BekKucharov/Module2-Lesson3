package uz.pdp.springdatarestlesson2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springdatarestlesson2.entity.Address;
import uz.pdp.springdatarestlesson2.entity.District;

@Projection(name = "addressProjection", types = Address.class)
public interface AddressProjection {
    Integer getId();

    String getStreet();
    String getHomeNumber();

    District getDistrict();
}
