mport java.util.Scanner;
public class Launcher {

    private static int fibonacci(int n) {
        if(n == 0)
        return 0;
    else if(n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        System.out.println("Welcome user");
        try ( Scanner scanner = new Scanner( System.in ) ) {

            while( true ) {
                System.out.print( "Enter a variable: " );
                String var = scanner.nextLine();

                if ( var.equals( "quit" ) ) {
                    continue;
                }


                else if(var.equals( "fibo" )){

                    System.out.print( "enter a number : " );
                    int n = scanner.nextInt();
                    System.out.println(fibonacci(n));
                }

                else {
                    System.out.println("Unknown command");

                }
            }


        }
    }
}
