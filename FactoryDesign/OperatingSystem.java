public abstract class OperatingSystem {
    private float version;

    public OperatingSystem(float version) {
        this.version = version;
    }

    public float getVersion() {
        return version;
    }

    public void setVersion(float version) {
        this.version = version;
    }
    
    public abstract void changeDir(String dir);
    public abstract void removeDir(String dir);

    @Override
    public String toString() {
        return "OperatingSystem [version=" + version + ", hashCode()=" + hashCode() + "]";
    }


    


}
