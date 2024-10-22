public class Main {
    public static void main(String[] args) {
        String os = "Windows";
        GuiFactory factory;

        if (os.equals("Windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacFactory();
        }


        Application app = new Application(factory);
        app.renderUi();
    }
    
}
