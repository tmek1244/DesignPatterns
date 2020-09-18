package patterns.AbstractFactoryPattern;


import patterns.AbstractFactoryPattern.Button.Button;
import patterns.AbstractFactoryPattern.Factory.GuiFactory;
import patterns.AbstractFactoryPattern.Factory.LinuxGuiFactory;
import patterns.AbstractFactoryPattern.Factory.MacGuiFactory;
import patterns.AbstractFactoryPattern.Factory.WindowsGuiFactory;
import patterns.AbstractFactoryPattern.TextField.TextField;

public class Gui {
    private static final String system = System.getProperty("os.name").toLowerCase();

    public static void main(String[] args) throws Exception {
        GuiFactory factory;
        if(system.contains("linux"))
            factory = new LinuxGuiFactory();
        else if(system.contains("windows"))
            factory = new WindowsGuiFactory();
        else if(system.contains("mac"))
            factory = new MacGuiFactory();
        else throw new Exception("UnknownSystem");


        Button button = factory.createButton();
        TextField textField = factory.createTextField();

        button.press();
        textField.setTextField("some message");
        System.out.println(textField.getTextField());
    }
}
