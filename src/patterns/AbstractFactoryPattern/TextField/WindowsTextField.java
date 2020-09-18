package patterns.AbstractFactoryPattern.TextField;

public class WindowsTextField implements TextField{
    private String text = "Windows: ";

    @Override
    public void setTextField(String text) {
        this.text = "Windows: " + text;
    }

    @Override
    public String getTextField() {
        return this.text;
    }
}
