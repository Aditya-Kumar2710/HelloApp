package HelloUC4;

public class HelloUC4 {


    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello World");
        } 
        
        else {
            for (int i = 0; i < args.length; i++) {
                System.out.println("Hello " + args[i]);
            }
        }

    }
}

