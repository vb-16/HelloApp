public class HelloApp {

    public static void main(String[] args) {

        String VAISH = (args.length > 0) ? String.join(" ", args) : "World";

        System.out.println("Hello, " + VAISH + "!");
    }
}