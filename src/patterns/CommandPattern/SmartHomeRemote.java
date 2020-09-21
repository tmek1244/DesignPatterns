package patterns.CommandPattern;

public class SmartHomeRemote {
    private final Command button1;
    private final Command button2;
    private final Command button3;
    private final Command button4;

    public SmartHomeRemote(Command button1, Command button2, Command button3, Command button4)
    {
        this.button1 = button1;
        this.button2 = button2;
        this.button3 = button3;
        this.button4 = button4;
    }

    public void useButton1()
    {
        this.button1.execute();
    }

    public void useButton2()
    {
        this.button2.execute();
    }

    public void useButton3()
    {
        this.button3.execute();
    }

    public void useButton4()
    {
        this.button4.execute();
    }
}
