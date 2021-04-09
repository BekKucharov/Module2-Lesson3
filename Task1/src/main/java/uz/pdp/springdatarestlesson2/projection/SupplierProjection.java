package uz.pdp.springdatarestlesson2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springdatarestlesson2.entity.Supplier;

@Projection(name = "supplierProjection", types = Supplier.class)
public interface SupplierProjection {
    Integer getId();
    String getFullName();
    String getEmail();
    String getPhoneNumber();
    String getMessageBody();
}
