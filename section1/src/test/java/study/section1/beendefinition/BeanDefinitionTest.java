package study.section1.beendefinition;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.section1.AppConfig;

public class BeanDefinitionTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("빈 설정 메타정보 확인")
    void findApplication() {
        String[] beenDefinitionNames = ac.getBeanDefinitionNames();

        for (String beenDefinitionName : beenDefinitionNames) {
            BeanDefinition beenDefinition = ac.getBeanDefinition(beenDefinitionName);

            if (beenDefinition.getRole() == BeanDefinition.ROLE_APPLICATION) {
                System.out.println("beenDefinitionName = " + beenDefinitionName + " beanDefinition = " + beenDefinition);
            }
        }
    }

}
