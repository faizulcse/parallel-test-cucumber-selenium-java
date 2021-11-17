public class Main {

    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> System.out.println("Running Shutdown Hook")));
        System.out.println("Start program");
    }
}
