import java.util.ArrayList;
import java.util.List;

public class Panel implements UIComponent {

    private List<UIComponent> components = new ArrayList<>();

    public void addComponent(UIComponent component) {
        components.add(component);
    }

    public void removeComponent(UIComponent component) {
        components.remove(component);
    }

    @Override
    public void render() {
        System.out.println("rendering panel....");

        for (UIComponent component : components) {
            component.render();
        }
    }

}
