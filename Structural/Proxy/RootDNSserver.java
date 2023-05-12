package DP.Proxy;

public class RootDNSserver implements DNSservice{
    protected String IP;
    public RootDNSserver(){
        IP="0.0.0.0";
    }
    @Override
    public String DomainResolution(String domain) {

        if(domain.equals("hi.org")){
            IP= "2.1.2.2";
        }
        else if(domain.equals("hwi.com")){
            IP= "192.122.21.222";
        }
        else{
            IP= "0.0.0.0";
        }
        return IP;
    }
}
