
package pocketcarguy;


public class FuelEconomyCalculator {
    //Also works for Galons per 100 miles
    public static float LP100KM(float Fuel, float Distance)
    {
    if(Fuel == 0 || Distance == 0)
        return 0;
    
    else
    {
    return (Fuel/Distance)*100;
    }
    }
    
    public static float MPG(float Fuel, float Distance)
    {
    if(Fuel == 0||Distance == 0)
        return 0;
    
    else
    {
    return (Distance/Fuel);
    }
        
    }
    
    
}
