package businessCalulator;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class BusinessCalculatorAppLauncherApplication {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(BusinessCalculatorAppLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessCalculationService.class).findMax());

            System.out.println(context.getBean(MySQLDataService.class));
            System.out.println(context.getBean(MySQLDataService.class));
            System.out.println(context.getBean(MySQLDataService.class));

            System.out.println(context.getBean(MongoDBDataService.class));
            System.out.println(context.getBean(MongoDBDataService.class));
            System.out.println(context.getBean(MongoDBDataService.class));

        }
    }
}
