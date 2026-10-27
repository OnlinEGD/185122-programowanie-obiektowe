package lab03;

public class StaticCalculator
{
    static int numberOfOperations = 0;

    public static int getNumberOfOperations() {
        return numberOfOperations;
    }

    static float add(float a, float b)
    {
        numberOfOperations++;
        return a+b;
    }

    static int add(int a, int b)
    {
        numberOfOperations++;
        return a+b;
    }

    static int add(int a, int b, int c)
    {
        numberOfOperations++;
        return a+b+c;
    }

    static float subtract(float a, float b)
    {
        numberOfOperations++;
        return a-b;
    }
    static float multiply(float a, float b)
    {
        numberOfOperations++;
        return a*b;
    }


}
