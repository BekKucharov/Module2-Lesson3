package uz.pdp.springdatarestlesson2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.springdatarestlesson2.entity.Attachment;
import uz.pdp.springdatarestlesson2.entity.AttachmentContent;

import java.util.Optional;

public interface AttachmentContentRepository extends JpaRepository<AttachmentContent,Integer> {
    Optional<AttachmentContent> findByAttachment_Id(Integer attachment_id);
}
