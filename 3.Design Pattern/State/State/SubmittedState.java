package State.State;

public class SubmittedState implements State{
    @Override
    public void handleRequest() {
        System.out.println("File submitted.");
    }
}
