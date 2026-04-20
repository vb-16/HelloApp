public class HelloApp {
    public static void main(String[] args) {

        String message;

        if (args.length == 0) {
            message = "Hello, World!";
        } else {
            StringBuilder names = new StringBuilder();

            for (String name : args) {
                if (names.length() > 0) {
                    names.append(", ");
                }
                names.append(name);
            }

            message = "Hello, " + names.toString() + "!";
        }

        System.out.println(message);
    }
}