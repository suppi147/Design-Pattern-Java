package DP.State;

public class Phone {
    public State state;

    public Phone(){
        state=new LockState(this);
    }

    public void SetState(State state){
        this.state=state;
    }

    public String Lock(){
        return"Locking phone and Turn off the screen";
    }

    public String Home(){
        return "Going to home-screen";
    }

    public String Unlock(){
        return "Unlocking the phone to home";
    }

    public String TurnOn(){
        return "Turning phone on, but still locked");
    }
}
