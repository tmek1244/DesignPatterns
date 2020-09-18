package patterns.AbstractFactoryPattern.Factory;

import patterns.AbstractFactoryPattern.Button.Button;
import patterns.AbstractFactoryPattern.Button.LinuxButton;
import patterns.AbstractFactoryPattern.TextField.LinuxTextField;
import patterns.AbstractFactoryPattern.TextField.TextField;

public class LinuxGuiFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public TextField createTextField() {
        return new LinuxTextField();
    }
}
