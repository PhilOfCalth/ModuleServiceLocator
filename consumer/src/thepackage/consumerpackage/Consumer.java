package thepackage.consumerpackage;

import thepackage.interfacepackage.ServiceProviderInterface;
import thepackage.locatorpackage.ServiceLocator;

public class Consumer {
    public static void main(String[] args){
        ServiceProviderInterface sp = ServiceLocator.getNextServiceProvider();
        System.out.println("I was passed: "+sp.getName());
    }
}
