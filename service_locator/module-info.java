module service_locator{
    requires service_provider;
    uses thepackage.interfacepackage.ServiceProviderInterface;
    exports thepackage.locatorpackage;
}