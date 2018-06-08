package ru.gvg.spring.lesson4.service;

import ru.gvg.spring.lesson4.entity.Company;

import java.util.List;

/**
 * Created by GVG on 08.06.2018.
 */
public interface CompanyService {

    List<Company> getAll();

    Company findById(String companyId);

    void add(Company company);
}
