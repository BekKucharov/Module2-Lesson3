package uz.pdp.springdatarestlesson2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.springdatarestlesson2.entity.Article;
import uz.pdp.springdatarestlesson2.projection.ArticleProjection;

@RepositoryRestResource(path = "article", excerptProjection = ArticleProjection.class)
public interface ArticleRepository extends JpaRepository<Article, Integer> {
}
