package ru.gvg.spring.lesson4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.gvg.spring.lesson4.service.AdServiceImpl;
import ru.gvg.spring.lesson4.service.CategoryServiceImpl;
import ru.gvg.spring.lesson4.service.CompanyServiceImpl;

/**
 * Created by Valeriy on 02.06.2018.
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigLesson4.class);
        CompanyServiceImpl companyServiceImpl = context.getBean(CompanyServiceImpl.class);
        CategoryServiceImpl categoryServiceImpl = context.getBean(CategoryServiceImpl.class);
        AdServiceImpl adServiceImpl = context.getBean(AdServiceImpl.class);

    }
}
