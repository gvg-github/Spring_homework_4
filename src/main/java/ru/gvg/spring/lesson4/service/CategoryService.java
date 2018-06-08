package ru.gvg.spring.lesson4.service;

import ru.gvg.spring.lesson4.entity.Category;

import java.util.List;

/**
 * Created by GVG on 08.06.2018.
 */
public interface CategoryService {

    List<Category> getAll();

    Category findById(String categoryId);

    void add(Category category);
}
