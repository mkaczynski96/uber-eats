package com.ubereats.repositories;

import com.ubereats.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Category findByName(String name);
}
