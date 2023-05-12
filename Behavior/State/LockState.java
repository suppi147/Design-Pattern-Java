package DP.State;

public class LockState extends State {
    public LockState(Phone phone){
        super(phone);
    }

    @Override
    public String OnHome() {
        phone.SetState(new HomeState(phone));
        return phone.Unlock();
    }

    @Override
    public String OnOff() {
        phone.SetState(new OffState(phone));
        return phone.Lock();
    }
}
