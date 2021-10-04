import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean valid = false;
        int choice = 0;
        String input;
        System.out.println("Welcome to Big Data Processing Application");
        do{
            System.out.println("Please type the number that corresponds to which application you would like to run:");
            System.out.println("1. Apache Hadoop");
            System.out.println("2. Apache Spark");
            System.out.println("3. Jupyter Notebook");
            System.out.println("4. SonarQube and SonarScanner");
            System.out.print("Type the number here >");
            input = scan.nextLine();
            choice = onlyDigits(input);
            if(choice >= 1 && choice <= 4){
                valid = true;
            }else{
                System.out.println("Please try again. Enter a number between 1 and 4.");
            }
        }while(!valid);
        if(choice == 1){
            
        }else if(choice == 2){

        }else if(choice == 3){
            
        }else if(choice == 4){
            
        }
        
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