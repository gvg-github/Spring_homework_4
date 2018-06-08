package ru.gvg.spring.lesson4.service;

import ru.gvg.spring.lesson4.entity.Ad;
import ru.gvg.spring.lesson4.entity.Category;
import ru.gvg.spring.lesson4.entity.Company;

import java.util.List;

/**
 * Created by GVG on 08.06.2018.
 */
public interface AdService {

    List<Ad> getAll();

    List<Ad> getAllFromCategory(Category category);

    List<Ad> getAllFromCompany(Company company);

    Ad findById(String adId);

    void add(Ad ad);

}
