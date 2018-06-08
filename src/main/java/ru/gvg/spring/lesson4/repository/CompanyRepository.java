package ru.gvg.spring.lesson4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gvg.spring.lesson4.entity.Company;

/**
 * Created by GVG on 08.06.2018.
 */
@Repository
public interface CompanyRepository extends JpaRepository<Company, String> {

}
