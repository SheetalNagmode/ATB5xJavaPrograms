package src.basics_05_23Dec;

public class Lab084 {
    public static void main(String[] args) {

        // Is this a valid syntax:

        //    int a = 10;
        //    if (a == 10) {
        //        break;    // "if" condition doesn't have a break
        //     }


    // it is valid only if it is within a loop
 //   int a = 10;
 //   for(int i = 0;i<= ;i++){
 //       if (a == 10) {
 //           break;
 //       }

        for (int i = 0; i < 10; i++) {  // pay attention to condition and update
            System.out.println(i);
            break;   // Break should happen after a condition. The syntax till break is valid
      //      System.out.println("** INSIDE LOOP");
        }
        // break is used to pull out from the loop

    }
}