
public class OperatingSystemFactory {
    public static OperatingSystem getInstance(String type,float version){
        switch(type){
            case "WINDOWS":
            return new WindowsOperatingSystem(version);
            case "LINUX":
            return new LinuxOperatingSystem(version);
            default:
            throw new IllegalArgumentException("Os Not Supported");

        }
    }
    
}
