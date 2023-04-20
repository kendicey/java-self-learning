import java.security.SecureRandom;

public class RollDieTest {

    public static void main(String[] args) {
        
        SecureRandom rand = new SecureRandom();
        int sum = 0;
        
        for (int i = 0; i < 5; i++){
            int roll = rand.nextInt(6) + 1;
            sum += roll;
            if (sum == 20){
                System.out.printf("Roll #%d. You've rolled a %d. You're now on space %d. Congrats, you win!%n", (i+1),roll, sum);
                break;
            } else if (sum < 20){
                System.out.printf("Roll #%d. You've rolled a %d. You are now on space %d and have %d more to go.%n", (i+1),roll, sum, (20 - sum));                
            } else {
                System.out.printf("Roll #%d. You've rolled a %d. You are now on space %d which exceeds 20. You lose.%n", (i+1),roll, sum); 
                break;
            }
        }
    }
    
}
