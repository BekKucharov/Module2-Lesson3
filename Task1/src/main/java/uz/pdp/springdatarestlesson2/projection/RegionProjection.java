package uz.pdp.springdatarestlesson2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springdatarestlesson2.entity.Region;

@Projection(name = "regionProjection", types = Region.class)
public interface RegionProjection {
    Integer getId();
    String getName();
}
