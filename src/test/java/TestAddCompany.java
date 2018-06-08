import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;
import ru.gvg.spring.lesson4.AppConfigLesson4;
import ru.gvg.spring.lesson4.entity.Company;
import ru.gvg.spring.lesson4.service.CompanyServiceImpl;

/**
 * Created by GVG on 08.06.2018.
 */
public class TestAddCompany {
    final ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigLesson4.class);
    CompanyServiceImpl companyServiceImpl = context.getBean(CompanyServiceImpl.class);

    @Test
    public void addCompany(){
        Company company = new Company("Company2", "Company 2", "Address 2");
        companyServiceImpl.add(company);
    }

}
