import java.util.*;
public class Exercise13{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String op = "";
        do{
            System.out.println("What operation would you do?");
            System.out.println("a. Sum");
            System.out.println("b. division");
            System.out.println("c. Exit");
            op = s.nextLine();
            double n1,n2;
            if(op.equals("a")){
                System.out.print("Enter the first number: ");
                n1=s.nextInt();
                System.out.print("Enter the second number: ");
                n2=s.nextInt();
                System.out.println("Result of the sum: "+(n1+n2));
            }else if(op.equals("b")){
                System.out.print("Enter the first number: ");
                n1=s.nextInt();
                System.out.print("Enter the second number: ");
                n2=s.nextInt();
                while(n2==0){
                    System.out.println("cannot be divided by zero...Try again");
                    System.out.print("Enter the second number: ");
                    n2=s.nextInt();
                    s.nextLine();
                }
                System.out.println("Result of the division: "+(n1/n2));
            }else if(op.equals("c")){
                System.out.print("Bye...");
            }
            else{
                System.out.println("Option invalid :c ");
            }
 
        }while(!op.equals("c"));
    }
}