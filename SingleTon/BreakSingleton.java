
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakSingleton {

    public static void main(String[] args) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        // exampleSerialization();
        exampleReflection();
    }
    
    private static void exampleSerialization() throws ClassNotFoundException, IOException{

        LazySingleton lazySingleton = LazySingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.obj"));
        oos.writeObject(lazySingleton);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.obj"));
        LazySingleton deserializedLazySingleton=(LazySingleton)ois.readObject();
        ois.close();

        System.out.println(lazySingleton.hashCode());
        System.out.println(deserializedLazySingleton.hashCode());


    }

    private static void exampleReflection() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
        Constructor[] constructors = LazySingleton.class.getDeclaredConstructors();
        
        Constructor constructor = constructors[0];

        constructor.setAccessible(true);
        
        LazySingleton lazyInstance = (LazySingleton)constructor.newInstance();  // reflected instance
        LazySingleton instance = LazySingleton.getInstance();   // singleton instance using lazy
        System.out.println(lazyInstance.hashCode());
        System.out.println(instance.hashCode());


        // to fix this either go for Enum Instance 
        // or throw an exception from constructor so that when it uses construtor it will get exception if instance is already there
    

        
    }

}
