import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
interface Command {
    String name();
    boolean run(Scanner scan);
}

class   Fibo implements Command {
    public String name() {
        Scanner scanner = new Scanner( System.in );
        System.out.print( "Enter a command: " );
        String command = scanner.nextLine();

        return command;
    }
    public boolean run(Scanner s){

        if(s.equals(name()))
            return true;
        else
            return false;



    }
    public  int fibonacci(int n) {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
class Quit implements Command {
    public String name() {
        Scanner scanner = new Scanner( System.in );
        System.out.print( "Enter a command: " );
        String command = scanner.nextLine();

        return command;
    }
    public boolean run(Scanner s){

        if(s.equals(name()))
            return true;
        else
            return false;



    }


}


public class Launcher {

    public static void main(String[] args) {

        Command cmd =new Fibo();
        System.out.println("Welcome user");

       /* ArrayList list=new  ArrayList<>();
        list.add("fibo");
        System.out.print( list );*/


       try ( Scanne scanne = new Scanner( System.in ) ) {

            while( true ) {
                System.out.print( "Enter a variable: " );
                String var = scanner.nextLine();

                if ( var.equals( "quit" ) ) {
                    continue;
                }


                else if(var.equals( "fibo" )){

                    System.out.print( "enter a number : " );
                    int n = scanner.nextInt();
                    System.out.println("hh");
                }

                else {
                    System.out.println("Unknown command");

                }
            }


        }
    }
}
