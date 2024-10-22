
public class WindowsFactory implements GuiFactory{

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
    
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    
}
