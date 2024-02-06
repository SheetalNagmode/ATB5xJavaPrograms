package src.oops_13_21Jan;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
// import java.util.*; This is bad practice. This will slow your program(Automation)

public class Lab183 {
    public static void main(String[] args) {

        List<String> courseList = new ArrayList<>(); // parent reference
        // diamond operator means what kind of data type you can store
        // you can also write ArrayList<String> courseList = new ArrayList<>();
        courseList.add("ATB");
        courseList.add("MTB");
        courseList.add("PyATB");
        courseList.add("LAPIB");
        courseList.add("SDET Blueprint");

        List numList = new ArrayList();
        // List<int, float> this is not allowed, since they are primitive data type.
        // Only wrapper class are allowed
        numList.add(150);
        numList.add(100);
        numList.add(100);
        numList.add(399);

        courseList.addAll(numList);  // this is adding objects
        // Don't mention the wrapper class in the above List<Integer> otherwise this will throw an error
        // if there is no mention of specific data type in the diamond operator
        // than by default they are all objects
        System.out.println(courseList);


        Iterator iterator = courseList.iterator(); // it moves from left to right
        while(iterator.hasNext()){
//            courseList.add("GEN AI");
            System.out.println(iterator.next());
        }



    }
}
