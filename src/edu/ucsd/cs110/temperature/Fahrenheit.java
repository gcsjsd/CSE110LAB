package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        Temperature ans = new Fahrenheit(((this.getValue() - 32) / 9) * 5);
        return ans;
    }

    @Override
    public Temperature toFahrenheit() {
        Temperature ans = new Fahrenheit(this.getValue());
        return ans;
    }

    public String toString()
    {
        // TODO: Complete this method
        float tem = this.getValue();
        return Float.toString(tem)+" F";
    }
}
