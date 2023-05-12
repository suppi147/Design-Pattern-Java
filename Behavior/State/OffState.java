package DP.State;

public class OffState extends State {
    public OffState(Phone phone){
        super(phone);
    }

    @Override
    public String OnHome() {
        phone.SetState(new LockState(phone));
        return phone.TurnOn();
    }

    @Override
    public String OnOff() {
        phone.SetState(new LockState(phone));
        return phone.TurnOn();
    }
}
