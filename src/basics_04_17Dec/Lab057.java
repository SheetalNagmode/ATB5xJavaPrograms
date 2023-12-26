package src.basics_04_17Dec;

import java.util.Scanner;

public class Lab057 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System. in);
        System.out.println("Enter the browser Name chrome, firefox, edge, opera");

        String user_input = sc. nextLine();
        String browser = user_input.toLowerCase();
        // or String browser = sc.nextLine();
        // switch (browser.toLowerCase())
        switch (browser){
            case "chrome":
                System.out.println("execute the Chrome Code");
                break;
            case "firefox":
                System.out.println("execute the FireFox Code");
                break;
            case "Edge":
                System.out.println("execute the Edge Code");
                break;
            default:
                System.out.println("I have no idea which browser is this");



        }


    }
}
