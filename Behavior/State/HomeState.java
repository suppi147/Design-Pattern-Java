package DP.State;

public class HomeState extends State {
    public HomeState(Phone phone){
        super(phone);
    }
    public HomeState(){
        
    };

    @Override
    public String OnHome() {
        return phone.Home();
    }

    @Override
    public String OnOff() {
        phone.SetState(new OffState(phone));
        return phone.Lock();
    }
}
