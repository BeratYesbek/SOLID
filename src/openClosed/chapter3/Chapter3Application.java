package openClosed.chapter3;

public class Chapter3Application {
    public static void main(String[] args) {
        GreetingProvider greetingProvider = new GreetingProvider();
        greetingProvider.greeting("Hello World",CountryCode.FR);
    }
}
