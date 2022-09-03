import java.util.Scanner;

public class conditional {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(age);
        if (age >= 18) {
            System.out.println("This is an adult");
        }

        
         else{
        System.out.println("This is not an adult");
        
        }
    }
}
