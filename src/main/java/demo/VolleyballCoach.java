package demo;

public class VolleyballCoach implements Coach {

    private FortuneService fortuneService;

    public VolleyballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "play until score of 25 points";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    //init method
    public void doMyStartupStuff(){
        System.out.println("Volleyball Coach: inside method doMyStartupStuff()");
    }

    //destroy method
    public void doMyCleanupStuff(){
        System.out.println("Volleyball Coach: inside method doMyCleanupStuff()");
    }
}
