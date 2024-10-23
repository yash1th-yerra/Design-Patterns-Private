public class Label implements UIComponent {
    private String text;

    public Label(String text) {
        this.text = text;
    }

    @Override
    public void render() {
        System.out.println("Rendering Label: " + text);
    }

}
