package printStatement;

public class printstat {

    public static void main(String[] args) {

        //to print everything in same line without taking cursor into new line (print)
        System.out.print("Hi how are you ");
        System.out.print("My name is shreyas");

        //to print content in new line by taking cursor into next line(println)
        System.out.println();
        System.out.println("Hi how are you");
        System.out.println("My name is shreyas");

        //to do formatting (replacing text at specified place using "%") (printf)
        System.out.printf("Hi my age is %d ",24);
        System.out.printf("My name is %s","Shreyas");

        //list of replacements
        // %d --> Int
        // %s --> string
        // %b --> boolean
        // %c --> char
        // %e --> scientific notation
        // %f --> floating point
        // %tc --> complete date and time
        // %n --> new line
        // %% --> character % itself

        //err in sysout is used to print error message in red
        System.out.println();
        System.err.println("this is a error message");
    }
}
