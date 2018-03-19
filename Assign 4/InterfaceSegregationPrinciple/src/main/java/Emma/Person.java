package Emma;

/**
 * Created by rodrique on 3/16/2018.
 */
public class Person implements Walkable,Talkable
{Walkable walker;
    public void setWalker(Walkable walker)
    {
        this.walker = walker;
    }
    public void walks()
    {
        System.out.println("Can walk");
    }

    public void talk()
    {
        System.out.println("Can talk");
    }
}
