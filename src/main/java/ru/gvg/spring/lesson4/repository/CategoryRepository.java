package ru.gvg.spring.lesson4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gvg.spring.lesson4.entity.Category;

/**
 * Created by GVG on 08.06.2018.
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {

}
