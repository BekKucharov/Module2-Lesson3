package uz.pdp.springdatarestlesson2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.springdatarestlesson2.entity.Comments;
import uz.pdp.springdatarestlesson2.projection.CommentProjection;

@RepositoryRestResource(path = "comments", collectionResourceRel = "list", excerptProjection = CommentProjection.class)
public interface CommentRepository extends JpaRepository<Comments, Integer> {
}
