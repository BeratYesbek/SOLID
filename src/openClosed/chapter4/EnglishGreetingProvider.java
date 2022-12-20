package openClosed.chapter4;

public class EnglishGreetingProvider extends GreetingProvider{
    @Override
    public void greeting(String message) {
        System.out.println("\033[0;35m" + message);
    }
}
