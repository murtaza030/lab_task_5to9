import java.util.Scanner;
public class Main

public static void main(String[] args){
 

        int choice;
        Scanner scanner = new Scanner(System.in);

        while(true) {
 
            //Manu of Restaurant
            System.out.println("Press 1 for Biryani");
            System.out.println("Press 2 for chicken karhayi");
            System.out.println("Press 3 for cofta");
            System.out.println("Press 4 for chichen peace");
            System.out.println("Press 5 to exit\n \n ");
 
            
            System.out.println("Make your choice");
            choice = scanner.nextInt();
 
            switch (choice) {
 
              case 1:
                    System.out.println("Biryani price is 200 Rupees ");
                    
                    break;
                //Second case for finding the difference
                case 2:
                    System.out.println("Chicken karhayi And chicken roll price is 350 Rupees.");
                    break;
 
                case 3:
                    System.out.println("cofta price is 240 Rupees;");
                      break;
               case 4:
                    System.out.println("chicken peace price is 260 Rupees ");
                    break;
 
               
                case 5:
                    System.exit(0);
 
                default:
                    System.out.println("Invalid choice!!! Please make a valid dishes. \\n\\n");
            }
        }
    }
}