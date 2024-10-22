
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FixSingleton {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        exampleSerialization();
    }


    public static void exampleSerialization() throws FileNotFoundException, IOException, ClassNotFoundException{
        SerializableSingleton serializableSingleton = SerializableSingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Object.obj"));
        oos.writeObject(serializableSingleton);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Object.obj"));
        SerializableSingleton instance = (SerializableSingleton)ois.readObject();
        ois.close();
        System.out.println(serializableSingleton.hashCode());
        System.out.println(instance.hashCode());
        
    }
    
}
