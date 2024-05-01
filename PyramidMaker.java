import java.util.*;
public class PyramidMaker {
    
    public static void main (String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        int height;
        boolean validHeight = false, validChoice = false;
        int choice;

        while(!validChoice) {
            validHeight = false;
            try {
                do {
                    System.out.println("\nThe Pyramid Maker\n");
                    System.out.println("1. Pyramid Maker w/ gap\n2. Normal Pyramid Maker\n3. Stop the Program\n");
                    System.out.print("Choose a number: ");
                    choice = userInput.nextInt();

                }while(choice > 3 || choice < 1);

                switch (choice) {
                    case 1:

                    while(!validHeight) {
                        try {
                            
                            do {
                                System.out.println("\nPyramid Maker w/ gap :D\n");
                                System.out.print("Enter height (1-8): ");
                                height = userInput.nextInt();
                                
                                if (height > 8 || height < 1) {
                                    System.out.println("Invalid height.");
                                }
                                
                                
                            }while(height > 8 || height < 1);
                            
                            validHeight = true;
                            getHeightOfPyramid(height);
                            
                        }catch(InputMismatchException err) {
                            System.out.println("Invalid height.");
                            userInput.nextLine();
                        }
                    }
                    
                        break;
                    case 2:

                    while(!validHeight) {
                        try {
                            
                            do {
                                System.out.println("\nNormal Pyramid Maker\n");
                                System.out.print("Enter height (1-8): ");
                                height = userInput.nextInt();
                                
                                if (height > 8 || height < 1) {
                                    System.out.println("Invalid height.");
                                }
                                
                                
                            }while(height > 8 || height < 1);
                            
                            validHeight = true;
                            getHeightOfPyramid2(height);
                            
                        }catch(InputMismatchException err) {
                            System.out.println("Invalid height.");
                            userInput.nextLine();
                        }
                    }

                        break;
                    
                    case 3:
                        System.out.println("Program stopped.");
                        validChoice = true;
                        break;
                    
                    default:

                    System.out.println("Invalid choice.");
                        break;
                }
            }
            catch(InputMismatchException err) {

                System.out.println("Invalid choice.");
                userInput.nextLine();
            }
        }
        
        
        
        
     
         
    }
    public static void getHeightOfPyramid(int height) {
        
    int rows = height;
    int gapWidth = 2;
    
    System.out.println("\nYour pyramid:\n");
     
     for(int i = 0; i < rows; i++) {
         
         for(int j = 0; j < rows - i; j++) {
             System.out.print(" ");
         }
         
         for(int j = 0; j <= i; j++) {
             System.out.print("#");
         }
         
         for(int j = 0; j < gapWidth; j++) {
             System.out.print(" ");
         } 
         
         for(int j = 0; j <= i; j++) {
             System.out.print("#");
         }
         
         System.out.println();
     }
        
    }  
    public static void getHeightOfPyramid2(int height){

        int rows = height, blocks = 0;

        System.out.println("\nYour Pyramid:\n");

        for (int i = 1; i <= rows; i++, blocks = 0) {
            for(int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            while(blocks != 2 * i - 1) {
                System.out.print("# ");
                blocks++;
            }
            System.out.println();
        }

    }  
    
}