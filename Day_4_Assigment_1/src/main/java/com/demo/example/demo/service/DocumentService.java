package com.demo.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.demo.example.demo.bean.Document;
import com.demo.example.demo.repository.DocumentRepository;

import org.springframework.util.StringUtils;


import java.io.IOException;
import java.util.List;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@Service
public class DocumentService {

	@Autowired
    private DocumentRepository documentRepository;

    public Document saveDocument(MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        Document document = new Document();
        document.setName(fileName);
        document.setType(file.getContentType());
        document.setUrl("/documents/" + fileName);

        return documentRepository.save(document);
    }

    public List<Document> getDocuments(Pageable pageable) {
        return documentRepository.findAll(pageable).getContent();
    }

    public void deleteDocument(Long id) {
        documentRepository.deleteById(id);
    }
}