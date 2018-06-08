package ru.gvg.spring.lesson4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.gvg.spring.lesson4.entity.Company;
import ru.gvg.spring.lesson4.repository.CompanyRepository;

import java.util.List;

/**
 * Created by GVG on 08.06.2018.
 */
@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository repository;

    @Transactional
    public List<Company> getAll(){
        return repository.findAll();
    }

    @Transactional
    public Company findById(String id){
        return repository.findOne(id);
    }

    @Transactional
    public void add(Company company){
        repository.save(company);
    }
}
