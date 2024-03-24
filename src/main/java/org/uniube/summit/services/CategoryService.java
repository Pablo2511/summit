package org.uniube.summit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.uniube.summit.domain.Category;
import org.uniube.summit.repositories.CategoryRepository;
import org.yaml.snakeyaml.util.EnumUtils;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    @Transactional(readOnly = true)
    public List<Category>findAll(){
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public Category get(Long id){
        return repository.get(id);
    }

    @Transactional
    public Category create(Category category){
        if (category.getId() != null) {
            throw new IllegalArgumentException("Identificador deve ser nulo para operação de cadastro!");
        }
        return repository.save(category);
    }
}