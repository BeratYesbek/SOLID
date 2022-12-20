package openClosed.chapter4;

public class FrenchGreetingProvider extends GreetingProvider {
    @Override
    public void greeting(String message) {
        System.out.println("\033[0;34m" + message);

    }
}
