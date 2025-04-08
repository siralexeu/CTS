package ro.ase.acs.servicelocater;

import java.util.HashMap;
import java.util.Map;

public class ServiceLocator {
    private Map<String, Object> dependencies = new HashMap<>();

    public void register(String contract, Object implementation) {
        dependencies.put(contract, implementation);
    }

    public Object resolve (String contract) {
        return dependencies.get(contract);
    }

}
