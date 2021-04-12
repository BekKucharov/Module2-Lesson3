package uz.pdp.springdatarestlesson2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.pdp.springdatarestlesson2.entity.Attachment;
import uz.pdp.springdatarestlesson2.entity.AttachmentContent;
import uz.pdp.springdatarestlesson2.repository.AttachmentContentRepository;
import uz.pdp.springdatarestlesson2.repository.AttachmentRepository;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Iterator;
import java.util.Optional;

@Service
public class AttachmentService {
    @Autowired
    AttachmentRepository attachmentRepository;
    @Autowired
    AttachmentContentRepository attachmentContentRepository;

    public void getById(Integer id, HttpServletResponse response) throws IOException {
        Optional<Attachment> attachmentId = attachmentRepository.findById(id);
        if (attachmentId.isPresent()){
            Attachment attachment = attachmentId.get();
            Optional<AttachmentContent> attachmentContentId = attachmentContentRepository.findByAttachment_Id(attachment.getId());
            if (attachmentContentId.isPresent()){
                AttachmentContent attachmentContent = attachmentContentId.get();

                response.setHeader("Content-Disposition", "attachment; filename=\""+attachment.getName()+"\"");
                response.setContentType(attachment.getContentType());
                FileCopyUtils.copy(attachmentContent.getBytes(), response.getOutputStream());
            }
        }
    }

    public Attachment add(MultipartHttpServletRequest request) throws IOException {
        Iterator<String> fileNames = request.getFileNames();
        while (fileNames.hasNext()){
            MultipartFile file = request.getFile(fileNames.next());
            if (file != null){
                Attachment attachment = new Attachment();
                attachment.setName(file.getOriginalFilename());
                attachment.setSize(file.getSize());
                attachment.setContentType(file.getContentType());
                Attachment savedAttachment = attachmentRepository.save(attachment);

                AttachmentContent attachmentContent = new AttachmentContent();
                attachmentContent.setAttachment(savedAttachment);
                attachmentContent.setBytes(file.getBytes());
                attachmentContentRepository.save(attachmentContent);
                return savedAttachment;
            }
        }
        return new Attachment();
    }
}
