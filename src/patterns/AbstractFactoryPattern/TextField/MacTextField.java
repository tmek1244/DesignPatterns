package patterns.AbstractFactoryPattern.TextField;

public class MacTextField implements TextField{
    private String text = "Mac: ";

    @Override
    public void setTextField(String text) {
        this.text = "Mac: " + text;
    }

    @Override
    public String getTextField() {
        return this.text;
    }
}