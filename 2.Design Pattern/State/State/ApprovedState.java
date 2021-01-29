package State.State;

public class ApprovedState implements State{
    @Override
    public void handleRequest() {
        System.out.println("File approved.");
    }
}
