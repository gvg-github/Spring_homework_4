package ru.gvg.spring.lesson4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import ru.gvg.spring.lesson4.entity.Ad;
import ru.gvg.spring.lesson4.entity.Category;
import ru.gvg.spring.lesson4.entity.Company;
import ru.gvg.spring.lesson4.repository.AdRepository;

import java.util.List;

/**
 * Created by GVG on 08.06.2018.
 */
public class AdServiceImpl {
    @Autowired
    private AdRepository repository;

    @Transactional
    public List<Ad> getAll(){
        return repository.findAll();
    }

    @Transactional
    public Ad findById(String id){
        return repository.findOne(id);
    }

    @Transactional
    public void add(Ad ad){
        repository.save(ad);
    }

    @Transactional
    public void delete(Ad ad){
        repository.delete(ad);
    }

    @Transactional
    public void refresh(Ad ad){
        Ad adFromBD = repository.findOne(ad.getId());
        if (adFromBD != null){
            repository.save(ad);
        }
    }

    @Transactional
    public Company getCompanyFromAd(Ad ad){
        return ad.getCompany();
    }

    @Transactional
    public Category getCategoryFromAd(Ad ad){
        return ad.getCategory();
    }

}
