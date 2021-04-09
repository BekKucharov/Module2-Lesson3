package uz.pdp.springdatarestlesson2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springdatarestlesson2.entity.District;
import uz.pdp.springdatarestlesson2.entity.Region;

@Projection(name = "districtProjection", types = District.class)
public interface DistrictProjection {
    Integer getId();
    String getName();
    Region getRegion();
}
