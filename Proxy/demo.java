package DP.Proxy;

public class demo {
    public static void main(String[] args){
        LocalDNSserver VNPTDNSserver=new LocalDNSserver();
        System.out.println(VNPTDNSserver.DomainResolution("hi.org"));
        System.out.println(VNPTDNSserver.DomainResolution("hi.org"));
        System.out.println(VNPTDNSserver.DomainResolution("hi.org"));
        System.out.println(VNPTDNSserver.DomainResolution("hwi.com"));
        System.out.println(VNPTDNSserver.DomainResolution("hwi.com"));

    }
}
