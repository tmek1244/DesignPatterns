package patterns.AbstractFactoryPattern.Factory;

import patterns.AbstractFactoryPattern.Button.Button;
import patterns.AbstractFactoryPattern.Button.WindowsButton;
import patterns.AbstractFactoryPattern.TextField.TextField;
import patterns.AbstractFactoryPattern.TextField.WindowsTextField;

public class WindowsGuiFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextField createTextField() {
        return new WindowsTextField();
    }
}
