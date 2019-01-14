package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLiveCycleDemoApp {
    public static void main(String[] args) {
        //load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLiveCycle-applicationContext");

        //retreive bean from Spring container
        Coach theCoach1 = context.getBean("myCoach",Coach.class);
        Coach theCoach2 = context.getBean("myCoach",Coach.class);

        //check if they are the same bean
        boolean result = (theCoach1 == theCoach2);
        System.out.println("Pointing to the same object: "+result);
        System.out.println("Memory location first coach: "+theCoach1+", memory location second coach: "+theCoach2);

        context.close();
        BeanLiveCycleDemoApp

    }
}
