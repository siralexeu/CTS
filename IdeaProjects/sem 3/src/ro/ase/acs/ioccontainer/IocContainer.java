package ro.ase.acs.ioccontainer;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class IocContainer {
    private Map<Class,Class> iocContainer = new HashMap<>();

    public void register(Class contract, Class implementation){
        iocContainer.put(contract, implementation);
    }

    public<T> T resolve(Class contract){
        Class implementation = iocContainer.get(contract);
        T dependency = null;
        try {
            dependency = (T) implementation.getDeclaredConstructor().newInstance();
            return dependency;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }
}
