import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number  =(int)(Math.random()*100);
        int Num;
        do {
            System.out.println("Enter The Number U want to Guess: ");
            Num = sc.nextInt();
            if (number == Num) {
                System.out.println("Whooo!!, Congratulations U Guess the Right Number.");
                break;
            }
            else if (number > Num) {
                System.out.println("The Entered Number is Bigger than this.");
            }
            else
                System.out.println("The number is Less Than this");
        }while (Num>0);

        System.out.println("The number is " +number);
    }
}
