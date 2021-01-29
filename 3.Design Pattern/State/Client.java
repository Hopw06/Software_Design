package State;

import State.State.ApprovedState;
import State.State.NewState;
import State.State.SubmittedState;

public class Client {
    public static void main(String[] args) {
        DocumentContext documentContext = new DocumentContext();

        documentContext.setState(new NewState());
        documentContext.applyState();

        documentContext.setState(new SubmittedState());
        documentContext.applyState();

        documentContext.setState(new ApprovedState());
        documentContext.applyState();
    }
}
