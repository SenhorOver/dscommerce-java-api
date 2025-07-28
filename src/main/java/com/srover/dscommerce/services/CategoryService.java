package com.srover.dscommerce.services;

import com.srover.dscommerce.dto.CategoryDTO;
import com.srover.dscommerce.entities.Category;
import com.srover.dscommerce.entities.User;
import com.srover.dscommerce.repositories.CategoryRepository;
import com.srover.dscommerce.services.exceptions.ForbiddenException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll() {
        List<Category> result = repository.findAll();
        return result.stream().map(CategoryDTO::new).toList();
    }
}
