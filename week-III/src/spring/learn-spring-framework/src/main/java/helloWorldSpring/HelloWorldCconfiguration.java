package helloWorldSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address){ };
record Address (String city, String strech){ };
@Configuration
public class HelloWorldCconfiguration {
    @Bean
    public String name() {
        return "Joel";
    }
    @Bean
    public int age() {
        return 26;
    }

    @Bean(name = "personCustomer")
    @Primary
    public Person person() {
        return new Person("Louise", 23, new Address("Pettrolina", "Dezessete"));
    }

    @Bean
    public Person person2() {
        return new Person(name(), age(), address());
    }
    @Bean
    public Person person3(String name, int age, Address address2) {
        return new Person(name, age, address2);
    }

    @Bean
    @Primary
    public Address address() {
        return new Address("Petrolina", "Nove");
    }
    @Bean
    public Address address2() {
        return new Address("Juazeiro", "Principal");
    }

}
