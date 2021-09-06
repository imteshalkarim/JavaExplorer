/* A program in JAVA that emulates a textual mathematical calculator.
Here in, you can perform 4 basic arithmetic operations - addition, subtraction, multiplication and division.
Also, you can further operate on the initial result as long as you desire. */

import java.util.*;
public class basic_arithemtic_calculator {
    static Scanner sc=new Scanner(System.in);
    static double result;
    public static void show__choose_options()//Method to display options and accept an input for the same
    {
    System.out.println("Here is a list of things you can do with this calculator.");
    System.out.println("Press 1 for Addition");
    System.out.println("2 - Subtraction");
    System.out.println("3 - Multiplication");
    System.out.println("4 - Division");
    System.out.println("Enter your choice of operation.");
    int ch=sc.nextInt();
    if(ch==1)
        adder();
        else if(ch==2)
        subtracter();
        else if(ch==3)
        multiplier();
        else if(ch==4)
        divider();
        else{
        System.out.println("Please select a valid option number.");
        show__choose_options();}
    }
    public static void adder()// Method for addition
    {
        System.out.println("Enter the number of operands");
        int addinp=sc.nextInt();
        if(addinp<2)
        System.out.println("You have selected less than 2 operands."+"\n"+"The other default operator will be 0");
        int add[]=new int[addinp]; //Array is used to enable user to add as many numbers as required
        for(int x=0;x<addinp;x++)
        {
            System.out.println("Enter a number");
            add[x]=sc.nextInt();
        }
        for(int y=0;y<addinp;y++)
        {
            result=result+add[y];
        }
        System.out.println("Sum= "+result);
    }
    public static void subtracter() //Method for subtraction
    {
        System.out.println("Enter the first operand to subtract");
        int first=sc.nextInt();
        System.out.println("Enter the second operand to subtract");
        int second=sc.nextInt();
        result=first-second;
        System.out.println("Difference= "+result);
    }
    public static void multiplier() //Method for multiplication
    {
        System.out.println("Enter the number of operands");
        int multinp=sc.nextInt();
        if(multinp<2)
        System.out.println("You have selected less than 2 operands."+"\n"+"The other default operator will be 0");
        int mul[]=new int[multinp];
        for(int x=0;x<multinp;x++)
        {
            System.out.println("Enter a number");
            mul[x]=sc.nextInt();
        }
        result=1;
        for(int y=0;y<multinp;y++)
        {
            result=result*mul[y];
        }
        System.out.println("Product "+result);
    }
    public static void divider() //Method for division
    {
        System.out.println("Enter the dividend");
        double first=sc.nextInt();
        System.out.println("Enter the divisor");
        double second=sc.nextInt();
        double result=first/second;
        double rem=first%second;
        System.out.println("Quotient= "+result);
        System.out.println("Remainder= "+rem);
    }
public static void repitter() //Method to enable further operation on initial result
{
System.out.println("Press 1 for Addition");
System.out.println("2 - Subtraction");
System.out.println("3 - Multiplication");
System.out.println("4 - Division");
System.out.println("Choose your mode of operation.");
int ch=sc.nextInt();
if(ch==1)
{
            System.out.println("Enter a number");
            int x=sc.nextInt();
            result=result+x;
            System.out.println("Answer= "+result);
}
else if(ch==2)
{
        System.out.println("Enter a number");
        int second=sc.nextInt();
        result=result-second;
        System.out.println("Answer= "+result);
}
else if(ch==3)
{
            System.out.println("Enter a number");
            int m=sc.nextInt();
            result=result*m;
            System.out.println("Answer "+result);
}
else if(ch==4)
{
        System.out.println("Enter the divisor");
        double sec=sc.nextInt();
        double d=result/sec;
        double rem=result%sec;
        System.out.println("Quotient= "+d);
        System.out.println("Remainder= "+rem);
}
else{
System.out.println("Invalid input.");
repitter();
}
}
    public static void main(String[] args)
    {
        show__choose_options();
        while(true) //Repeats as long as user does not chooses to exit
        {
        System.out.println("Would you like to contine further operations on the result?"+"\n"+"If yes, then press 1 else press 0");
        int cont=sc.nextInt();
        if(cont==0)
        System.exit(0);
        else if(cont==1)
        repitter();
        else
        System.out.println("Invalid input. PRESS 0 TO EXIT OR 1 TO CONTINUE");
        }
    }
}
