package Emma;

/**
 * Created by rodrique on 3/16/2018.
 */
public class LCD
{
    private int lcdWidth;

    private int lcdHeight;

    public void setWidth(int lcdWidth)
    {
        this.lcdWidth = lcdWidth;
    }

    public void setHeight(int lcdHeight)
    {
        this.lcdHeight = lcdHeight;
    }

    public int getWidth()
    {
        return lcdWidth;
    }

    public int getHeight()
    {
        return lcdHeight;
    }

    public int getArea()
    {
        return lcdWidth * lcdHeight;
    }
}
