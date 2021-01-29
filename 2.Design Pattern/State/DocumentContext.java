package State;

import State.State.State;

public class DocumentContext {
    private State mState;

    public void setState(State state) {
        this.mState = state;
    }

    public void applyState() {
        this.mState.handleRequest();
    }
}
