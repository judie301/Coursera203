## Adding a new file to the child branch
package pkg2d.array;
import java.util.Scanner;

public class Array {
   int ca = 0;
    int examScore = 0;
    
      public static void main(String args[]){
           Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the row length of the array:");
        int row = sc.nextInt();
        System.out.println("Enter the column length of the array:");
        int column = sc.nextInt();
        int a[][] = new int[row][column];
        System.out.println("Enter" + row*column + "Elements to store array:\n");
        for (int i = 0; i<row; i++)
        {
            for(int j = 0; j < column; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Elements in the array are:\n");
        for(int i = 0; i<row; i++)
        {
            for(int j = 0; j < column; j++)
            {
                System.out.println("Row["+i+"]: Column ["+j+"]:"+a[i][j]);
            }
       System.out.println("Enter caScore");

      int  ca = sc.nextInt();
      for(int c = 0; ca>30;){
          System.out.println("invalid caScore");
      }
                   System.out.println("Enter examScore");
                   int examScore = sc.nextInt();
          String grade = "()";
          
          if(grade == "A"){
              System.out.println("Student scored between 90 to 100");
          }
              else if(grade == "B"){
                   System.out.println("Student scored between 70 to 89");
              }
              else if(grade == "c"){
                  System.out.println("Student scored between 60 to 79");
              }
              else if(grade == "D"){
                  System.out.println("Student scored between 50 to 69");
              }
              else if(grade == "E"){
                  System.out.println("Student scored between 40 to 59");
              }
              else if(grade == "F"){
                  System.out.println("Student scored between 30 to 49");
              }
              else{
                  System.out.println("Invalid grade");    
              }
                   
               }
}
                      
}

    

