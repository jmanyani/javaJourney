/*Problem Statement: Analyzing the Distribution of Even and Odd Numbers in Test Cases
Objective:
Write a Java program that reads multiple test cases, where each test case contains a varying number of integer values. The program should analyze each test case to determine and print the count of even and odd numbers.

Requirements:

Input:

The number of test cases (rows).
For each test case, the number of values (columns).
The integer values for each test case.
Processing:

Store the input values in a 2D array where each row represents a test case and each column represents the values of that test case.
For each test case, calculate the number of even and odd numbers.
Output:

Print the values of each test case.
Print the count of even numbers for each test case.
Print the count of odd numbers for each test case.
 */
import java.util.Scanner;

class Tester{
    public static void main(String[] args){
        int rowCount,columnCount;
        Scanner obj=new Scanner(System.in);
        System.out.println("Input the number of Test Cases/RowCount : ");
        rowCount=obj.nextInt();
        int[][] myMatrix=new int[rowCount][];
        System.out.println("Input the Number of Values/Columns for each testCase/Row ");
        for(int i=0;i<myMatrix.length;i++){
        System.out.println("Input Number of values for Test Case : "+i);
        columnCount=obj.nextInt();
        myMatrix[i]=new int[columnCount];
        System.out.println("Input all the Values for the Test Case : "+ i);
            for(int j=0;j<myMatrix[i].length;j++){
                myMatrix[i][j]=obj.nextInt();
            }
      }
      System.out.println("Testing the Input matrix : ");
        for(int i=0;i< myMatrix.length;i++){
            int OddCount=0,evenCount=0;
            for(int j=0;j<myMatrix[i].length;j++){
                if(myMatrix[i][j]%2==0)
                {evenCount++;}
                else{OddCount++;}
                System.out.print(myMatrix[i][j]+" ");
            }
            System.out.println("");
            System.out.println("Number of Even Numbers in testCase : "+i+" are : "+evenCount);

            System.out.println("Number of Odd Numbers in testCase : "+i+" are : "+OddCount);
            System.out.println("");
        }
    }
}
