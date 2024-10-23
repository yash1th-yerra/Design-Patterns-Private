
public class WindowsFactory implements GuiFactory {

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }

    @Override
    public ButtonUI createButton() {
        return new WindowsButton();
    }

}
