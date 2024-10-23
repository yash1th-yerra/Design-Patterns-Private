public class MacFactory implements GuiFactory {

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }

    @Override
    public ButtonUI createButton() {
        return new MacButton();
    }

}
