import java.util.Scanner;

public class StoryProgramTest {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is the season of the year? ");
        String season = input.next();
        
        System.out.print("What is the adjective of the season? ");
        String adj = input.next();
        
        System.out.print("How many cups of coffe do you drink? ");
        int cups = input.nextInt();
        
        input.close();
        
        System.out.printf("On a %s %s day, I drink a minimum of %d cups of coffee.%n", adj, season, cups);
    }
    
}
