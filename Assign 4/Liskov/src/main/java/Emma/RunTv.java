package Emma;

/**
 * Created by rodrique on 3/16/2018.
 */
public class RunTv
{
    private static LCD getNewLCD()
    {
        return new LCD();
    }

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        LCD r = RunTv.getNewLCD();

        r.setHeight(5);

        r.setWidth(10);

        System.out.println(r.getArea());
    }
}
