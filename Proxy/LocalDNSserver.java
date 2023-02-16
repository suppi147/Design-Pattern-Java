package DP.Proxy;

import java.util.ArrayList;
import java.util.HashMap;

public class LocalDNSserver implements DNSservice{
    protected HashMap<String,String> pool=new HashMap<String,String>();
    protected RootDNSserver root=new RootDNSserver();
    protected String IP;
    @Override
    public String DomainResolution(String domain) {
        
        if(pool.isEmpty() || !(pool.containsKey(domain))){
            System.out.println("!!!Not cached so we look it up");
            IP=root.DomainResolution(domain);
            pool.put(domain, IP);
        }
        else {
            System.out.println("---Cached---");
            IP=pool.get(domain);
        }
        
        return IP;
    }
}
