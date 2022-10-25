package com.gvfs.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gvfs.course.entities.Category;
import com.gvfs.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
