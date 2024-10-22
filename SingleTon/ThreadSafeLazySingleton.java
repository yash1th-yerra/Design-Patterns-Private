public class ThreadSafeLazySingleton {

    private static ThreadSafeLazySingleton instance =null;

    private ThreadSafeLazySingleton(){

    }

    public static ThreadSafeLazySingleton getInstance(){
        if(instance==null){
            synchronized(ThreadSafeLazySingleton.class) {
                if(instance==null){
                    instance = new ThreadSafeLazySingleton();
                }
                
            }
        }
        return instance;
    }


}
