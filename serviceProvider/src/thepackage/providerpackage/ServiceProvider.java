package thepackage.providerpackage;

import thepackage.interfacepackage.ServiceProviderInterface;

public class ServiceProvider implements ServiceProviderInterface {

    @Override
    public String getName() {
        return "Concrete Service Provider";
    }
}