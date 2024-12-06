package com.example.CRUDApp.repo;

import com.example.CRUDApp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo  extends JpaRepository<Book, Long> {

}