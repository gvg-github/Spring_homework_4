import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;
import ru.gvg.spring.lesson4.AppConfigLesson4;

import javax.sql.DataSource;

/**
 * Created by Valeriy on 02.06.2018.
 */
public class TestDataSourse {

    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigLesson4.class);

    @Test
    public void getDataSourse(){
        DataSource ds = (DataSource) context.getBean("dataSource");

    }
}
