package patterns.CommandPattern;

public class TurnOnLightCommand implements Command{
    private final Light light;

    public TurnOnLightCommand(Light light)
    {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOnLight();
    }

    @Override
    public void unExecute() {
        light.turnOffLight();
    }
}
