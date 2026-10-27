public class Counter
{
    int value = 0;

    public void increaseOther(Counter other)
    {
        other.value += 1;
    }
}
