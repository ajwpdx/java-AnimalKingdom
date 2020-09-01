package animalkingdom;

public class Bird extends Animal
{
    public Bird(String name, int yearDiscovered)
    {
        super(name, yearDiscovered);
    }

    @Override
    public String move()
    {
        return "fly";
    }

    @Override
    public String breathe()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "eggs";
    }
    
}