package DP.State;

public abstract class State {
    protected Phone phone;
    public State(Phone phone){
        this.phone=phone;
    }
    public State(){};

    public abstract String OnHome();
    public abstract String OnOff();
}
