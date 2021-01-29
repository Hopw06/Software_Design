package State.State;

public class NewState implements State{
    @Override
    public void handleRequest() {
        System.out.println("File created.");
    }
}
