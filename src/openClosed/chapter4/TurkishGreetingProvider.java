package openClosed.chapter4;

public class TurkishGreetingProvider extends GreetingProvider{

    @Override
    public void greeting(String message) {
        System.out.println("\033[0;31m" + message);
    }
}
