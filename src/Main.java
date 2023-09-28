import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParametrosInvalidosException {
        boolean calc = true;
        while (calc == true) {
            Scanner terminal = new Scanner(System.in);
            System.out.println("Enter the first parameter");
            String parameterOne = terminal.next();
            System.out.println("Enter the second parameter");
            String parameterTwo = terminal.next();

            if (validateNumber(parameterOne) && validateNumber(parameterTwo)){
                int p1 = Integer.parseInt(parameterOne);
                int p2 = Integer.parseInt(parameterTwo);
                if (p1 < p2){
                    counting(p1, p2);
                    System.out.println("_____________________");
                    System.out.println("***End of program***");
                    calc = false;
                } else {
                    System.out.println("First number must smaller than second number.");
                }


            }
        }
    }
    static void counting(int parameterOne, int parameterTwo ) throws ParametrosInvalidosException {
        int count = parameterTwo - parameterOne;
        int initial = 1;
        //realizar o for para imprimir os números com base na variável contagem
        while (initial <= count){
            System.out.println("Printing number " + initial);
            initial++;
        }
    }

    static boolean validateNumber(String num)  {
        if (num != null && num.matches("[0-9]*")){
            return true;
        } else {
             System.out.println("Enter a valid number! Don't use dot or comma.");
             return false;
        }
    }
}