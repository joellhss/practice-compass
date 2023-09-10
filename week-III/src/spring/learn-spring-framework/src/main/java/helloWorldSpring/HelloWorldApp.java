package helloWorldSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldApp {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(HelloWorldCconfiguration.class)) {
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("personCustomer"));
            System.out.println(context.getBean("person2"));
            System.out.println(context.getBean("person3"));
            System.out.println(context.getBean("address"));
            System.out.println(context.getBean(Address.class));
            System.out.println(context.getBean(Person.class));
        }
    }
}
