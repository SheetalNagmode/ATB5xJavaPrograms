package src.basics_05_23Dec;

public class Lab082 {
    public static void main(String[] args) {

        // for( A ;B ; C)
        // A -> Initialization -> JVM What variable, where you are starting point
        // B - Condition -> When you want this to stop. -> true, false
        // C ->  Increment / Decrement

        // Print the Odd number in between the 1 to 50
        // If Else
        for (int i = 1; i <= 50 ; i++) {
            if(i%2==1){
                System.out.println(i+ " is Odd!");
            }

        }
        System.out.println("____ End of Program ____");

        // For reverse:
        for (int i = 50; i > 0 ; i--) {
            if(i%2==1){
                System.out.println(i+ " is Odd!");
            }

        }

        // for Even number use negation (!)
        for (int i = 50; i > 0 ; i--) {
            if(!(i%2==1)){     // !(i%2==1) OR (i%2==0) Both print the Even number. Both can be used
                System.out.println(i+ " is Even!");
            }

        }

        // for reverse:
        for (int i = 0; i <= 50 ; i++) {  // use ++i or i++ Both give the same result
            if(i%2==0){
                System.out.println(i+ " is Even!");
            }

        }
    }
}
