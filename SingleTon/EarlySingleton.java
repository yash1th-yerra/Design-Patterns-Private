public class EarlySingleton{
    private static final EarlySingleton instance = new EarlySingleton();

    private EarlySingleton(){

    }

    public static EarlySingleton getInstance(){
        return instance;
    }


}