public class Main {

    public static void main(String[] args) {
        UIComponent button1 = new Button("Submit");
        UIComponent button2 = new Button("Cancel");
        UIComponent label = new Label("Name:");

        Panel formPanel = new Panel();
        formPanel.addComponent(label);
        formPanel.addComponent(button1);
        formPanel.addComponent(button2);

        Panel mainPanel = new Panel();
        mainPanel.addComponent(formPanel);

        mainPanel.render();

    }

}
