package uz.pdp.springdatarestlesson2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springdatarestlesson2.entity.Address;
import uz.pdp.springdatarestlesson2.entity.User;

@Projection(name = "userProjection", types = User.class)
public interface UserProjection {
    Integer getId();
    String getFullName();
    String getEmail();
    String getPassword();
    Address getAddress();
}
