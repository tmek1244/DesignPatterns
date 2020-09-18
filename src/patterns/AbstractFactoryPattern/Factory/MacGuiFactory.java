package patterns.AbstractFactoryPattern.Factory;

import patterns.AbstractFactoryPattern.Button.Button;
import patterns.AbstractFactoryPattern.Button.MacButton;
import patterns.AbstractFactoryPattern.TextField.MacTextField;
import patterns.AbstractFactoryPattern.TextField.TextField;

public class MacGuiFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextField createTextField() {
        return new MacTextField();
    }
}
