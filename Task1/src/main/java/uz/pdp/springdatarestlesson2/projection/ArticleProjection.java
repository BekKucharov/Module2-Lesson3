package uz.pdp.springdatarestlesson2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springdatarestlesson2.entity.Article;
import uz.pdp.springdatarestlesson2.entity.Attachment;

@Projection(name = "articleProjection", types = Article.class)
public interface ArticleProjection {
    Integer getId();

    String getTitle();
    String getDescription();
    String getUrlLink();
    Attachment getAttachment();
}
