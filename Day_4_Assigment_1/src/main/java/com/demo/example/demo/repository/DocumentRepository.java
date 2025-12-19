package com.demo.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.example.demo.bean.Document;

public interface DocumentRepository extends JpaRepository<Document, Long> {
	

}
