package uz.pdp.springdatarestlesson2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springdatarestlesson2.entity.Comments;
import uz.pdp.springdatarestlesson2.entity.Product;
import uz.pdp.springdatarestlesson2.entity.User;

@Projection(name = "commentsProjection", types = Comments.class)
public interface CommentProjection {
    Integer getId();
    String getBody();
    User getUser();
    Product getProduct();
    Integer getNumberStars();
}
