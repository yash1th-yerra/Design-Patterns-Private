public class User {
    public static void main(String[] args) {
        OperatingSystem os = OperatingSystemFactory.getInstance("WINDOWS", (float) 1.0);
        OperatingSystem os2 = OperatingSystemFactory.getInstance("java", (float) 1.0);
        System.out.println(os);
        System.out.println(os2);

    }
}
