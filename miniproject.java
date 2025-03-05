import java.util.*;
public class miniproject {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Random rand = new Random();

        int attempts = 0; 
        final int maxattempts = 4;

        int myNumber = rand.nextInt(101);
        int userGuess;


        do{ attempts++;
            if(attempts>maxattempts){
                System.out.println("You have reached the maximum attempts");
                break;
            }
            else{
                System.out.println("You have "+(maxattempts-attempts)+" attempts left");
            }

            System.out.println("Enter the number between 0 to 100");
            System.out.println("Enter Your Number Please ::");
            userGuess = sc.nextInt();
        

            if(userGuess==myNumber){
                System.out.println("You are awosome!!!");
                break;
            }
            else if (userGuess>myNumber) {
                System.out.println("Its too large. ");
                
            }else{
                System.out.println("Its to short.");
            }
        }while(userGuess>=0);
        System.out.print("My number is::");
        System.out.println(myNumber);
    }
    
}


