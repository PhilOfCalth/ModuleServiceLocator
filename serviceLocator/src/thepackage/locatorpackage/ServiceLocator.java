package thepackage.locatorpackage;

import thepackage.interfacepackage.ServiceProviderInterface;

import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

public class ServiceLocator {
    public static List<ServiceProviderInterface> getServiceProviders(){
        ServiceLoader<ServiceProviderInterface> loader = ServiceLoader.load(ServiceProviderInterface.class);
        return loader.stream()
                .map(ServiceLoader.Provider::get)
                .collect(Collectors.toList());
    }
    public static ServiceProviderInterface getNextServiceProvider(){
        ServiceLoader<ServiceProviderInterface> loader = ServiceLoader.load(ServiceProviderInterface.class);
        return loader.stream()
                .map(ServiceLoader.Provider::get)
                .findFirst()
                .get();
    }
}
