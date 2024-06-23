import java.io.IOException;

public class Lox {
    public static void main(String[] args) throws IOException {
        if (args.length > 1) {
            System.out.println("Usage: jlox [script]");
            System.exit(64);
        } else if (args.length == 1) {
            System.out.println("runFile(args[0]);");
        } else {
            System.out.println("runPrompt();");
        }
    }
}