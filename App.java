import java.util.Scanner;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class App{
    public static void main(String[] args) throws IOException, URISyntaxException {
        Scanner scan = new Scanner(System.in);
        boolean valid = false;
        int choice = 0;
        String input;
        System.out.println("Welcome to Big Data Processing Application");
        do{
            do{
                System.out.println("Please type the number that corresponds to which application you would like to run:");
                System.out.println("1. Apache Hadoop");
                System.out.println("2. Apache Spark");
                System.out.println("3. Jupyter Notebook");
                System.out.println("4. SonarQube and SonarScanner");
                System.out.println("5. Exit Application");
                System.out.print("Type the number here >");
                input = scan.nextLine();
                choice = onlyDigits(input);
                if(choice >= 1 && choice <= 5){
                    valid = true;
                }else{
                    System.out.println("Please try again. Enter a number between 1 and 5.");
                }
            }while(!valid);
            if(choice == 1){
                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                    Desktop.getDesktop().browse(new URI("http://35.231.11.231:9870/"));
                }else{
                    System.out.println("Desktop Not Supported");
                }
            }else if(choice == 2){
                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                    Desktop.getDesktop().browse(new URI("http://34.75.18.223:8080/"));
                }else{
                    System.out.println("Desktop Not Supported");
                }
            }else if(choice == 3){
                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                    Desktop.getDesktop().browse(new URI("http://35.231.65.152:8888/"));
                }else{
                    System.out.println("Desktop Not Supported");
                }
            }else if(choice == 4){
                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                    Desktop.getDesktop().browse(new URI("http://35.227.64.220:9000/"));
                }else{
                    System.out.println("Desktop Not Supported");
                }
            }else if(choice == 5){
                break;
            }
        }while(true);
        
        scan.close();
    }

    public static int onlyDigits(String input){
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) < '0' || input.charAt(i) > '9') {
                return 0;
            }
        }
        return Integer.parseInt(input);
    }
}