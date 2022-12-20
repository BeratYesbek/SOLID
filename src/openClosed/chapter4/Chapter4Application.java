package openClosed.chapter4;

public class Chapter4Application {
    public static void main(String[] args) {

        GreetingProvider greetingProvider = new EnglishGreetingProvider();
        greetingProvider.greeting("Hello World");

        GreetingProvider greetingProvider1 = new TurkishGreetingProvider();
        greetingProvider1.greeting("Merhaba Dünya");

        GreetingProvider greetingProvider2 = new FrenchGreetingProvider();
        greetingProvider2.greeting("Bonjour!");

    }
}
