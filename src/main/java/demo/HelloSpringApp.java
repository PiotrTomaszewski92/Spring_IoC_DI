package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {

        //load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from Spring Container
        Coach theCoach = context.getBean("myCoach",Coach.class);

        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        //call methods for fortunes
        System.out.println(theCoach.getDailyFortune());

        //close the context
        context.close();

    }
}
