package uz.pdp.springdatarestlesson2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springdatarestlesson2.entity.Attachment;
import uz.pdp.springdatarestlesson2.entity.MyTeam;

@Projection(name = "myTeamProjection", types = MyTeam.class)
public interface MyTeamProjection {
    Integer getId();
    String getName();
    String getOccupation();
    Attachment getAttachment();
}
