package patterns.AbstractFactoryPattern.TextField;

public class LinuxTextField implements TextField{
    private String text = "Linux: ";

    @Override
    public void setTextField(String text) {
        this.text = "Linux: " + text;
    }

    @Override
    public String getTextField() {
        return this.text;
    }
}
