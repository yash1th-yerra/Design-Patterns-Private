public class LinuxOperatingSystem extends OperatingSystem{

    public LinuxOperatingSystem(float version) {
        super(version);
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public void changeDir(String dir) {
        System.out.println("Changed");
    }
    
    @Override
    public void removeDir(String dir) {
        System.out.println("Removed");
    }

    

    


    
}
