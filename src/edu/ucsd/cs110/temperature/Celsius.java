package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        Temperature ans = new Celsius(this.getValue());
        return ans;
    }

    @Override
    public Temperature toFahrenheit() {
        Temperature ans = new Celsius(this.getValue()*9/5+32);
        return ans;
    }

    public String toString()
    {
        // TODO: Complete this method
        float temF = this.getValue();
        return Float.toString(temF)+" C";
    }
}