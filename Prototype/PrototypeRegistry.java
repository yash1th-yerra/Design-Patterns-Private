
import java.util.Map;

public class PrototypeRegistry {

    private Map<String,Prototype> prototypes = new java.util.HashMap<>();
    public void addPrototype(String key,Prototype prototype){
        prototypes.put(key,prototype);
    }

    public Prototype getPrototype(String key){
        return prototypes.get(key).clone();
    }
    
}
