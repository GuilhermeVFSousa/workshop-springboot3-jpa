package com.gvfs.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gvfs.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {


}
