package Emma;

/**
 * Created by rodrique on 3/16/2018.
 */
public class HisenseTv extends LCD
{
    private int tvWidth;

    private int tvHeight;

    public void setWidth(int tvWidth)
    {
        this.tvWidth = tvWidth;

        this.tvHeight = tvWidth;
    }

    public void setHeight(int tvHeight)
    {
        this.tvHeight = tvHeight;

        this.tvWidth = tvHeight;
    }
}
