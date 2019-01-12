package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        //load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from Spring Container
        CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);

        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        //print the literal values
        System.out.println(theCoach.getEmail()+", "+theCoach.getTeam());

        //close the context
        context.close();
    }
}
