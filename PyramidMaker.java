import java.util.*;
public class PyramidMaker {
    
    public static void main (String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        int height;
        boolean validHeight = false;
        
        while(!validHeight) {
            try {
                
                do {
                    System.out.println("\nPyramid Maker\n");
                    System.out.print("Enter height (1-8): ");
                    height = userInput.nextInt();
                    
                    if (height > 8 || height < 1) {
                        System.out.println("Invalid height.");
                    }
                    
                    
                }while(height > 8 || height < 1);
                
                validHeight = true;
                get_height(height);
                
            }catch(InputMismatchException err) {
                System.out.println("Invalid height.");
                userInput.nextLine();
            }
        }
     
         
    }
    public static void get_height(int height) {
        
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
    
}