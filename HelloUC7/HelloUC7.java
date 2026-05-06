package HelloUC7;

public class HelloUC7 {
     public static void main(String[] args) {
        String result = "Hello ";

        for (int i = 0; i < args.length; i++) {
            result = result + args[i] + " ";
        }

        System.out.println(result.trim());
    }
}
