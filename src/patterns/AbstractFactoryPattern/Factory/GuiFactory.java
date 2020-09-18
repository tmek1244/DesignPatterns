package patterns.AbstractFactoryPattern.Factory;

import patterns.AbstractFactoryPattern.Button.Button;
import patterns.AbstractFactoryPattern.TextField.TextField;

public interface GuiFactory {
    Button createButton();
    TextField createTextField();
}
