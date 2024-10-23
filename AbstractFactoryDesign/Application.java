public class Application {
    private ButtonUI button;
    private Checkbox checkbox;

    public Application(GuiFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();

    }

    public void renderUi() {
        button.render();
        checkbox.toggle();

    }
}
