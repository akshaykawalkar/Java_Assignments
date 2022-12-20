import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        System.out.println("What do you want to do ? select following options " +
                " Add : +, Sub : - , Mul : * ,Div : /");
        Scanner scanner=new Scanner(System.in);
        String sign= scanner.nextLine();
        System.out.println("Enter 1st number");
        int number1= scanner.nextInt();
        System.out.println("Enter 2st number");
        int number2= scanner.nextInt();


        switch ( sign){
            case "+":
                System.out.println(number1+number2);
                break;
            case "-":
                System.out.println(number1-number2);
                break;
            case "*":
                System.out.println(number1*number2);
                break;
            case "/" :
                System.out.println(number1/number2);
                break;
            default:
                System.out.println("Please select valid input");

        }

    }
}
