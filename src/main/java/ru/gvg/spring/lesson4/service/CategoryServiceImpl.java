package ru.gvg.spring.lesson4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import ru.gvg.spring.lesson4.entity.Category;
import ru.gvg.spring.lesson4.repository.CategoryRepository;

import java.util.List;

/**
 * Created by GVG on 08.06.2018.
 */
public class CategoryServiceImpl {
    @Autowired
    private CategoryRepository repository;

    @Transactional
    public List<Category> getAll(){
        return repository.findAll();
    }

    @Transactional
    public Category findById(String id){
        return repository.findOne(id);
    }

    @Transactional
    public void add(Category category){
        repository.save(category);
    }
}
