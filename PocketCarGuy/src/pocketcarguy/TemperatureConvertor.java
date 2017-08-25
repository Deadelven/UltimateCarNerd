
package pocketcarguy;

public class TemperatureConvertor {
  
    
    //Convert Farenheight to celcius
    public static float ConvertToCelcius(float F)
    {
        if(F == 0)
        {return -17.78f;}
        else
        {        
            return ((( F - GlobalVariables.CToFAddition) * 5) / 9 );
        }
    }
    
    public static float ConvertToFarenheight(float C)
    {
        if(C == 0)
        {return GlobalVariables.CToFAddition;}
        else
        {        
            return (C * GlobalVariables.CToFMultiplier) + GlobalVariables.CToFAddition;
        }
    }
    
    
    
    
    
    
    
    
    
}
