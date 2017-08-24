
package pocketcarguy;

public class TemperatureConvertor {
    float CelciusInput;
    float FarenheightInput;
    
    float CelciusOutput;
    float FarenheightOutput;
    
    
    //Convert Farenheight to celcius
    public float ConvertToCelcius(float F)
    {
        if(F == 0)
        {CelciusOutput = -17.78f;}
        else
        {        
            CelciusOutput = ((( F - GlobalVariables.CToFAddition) * 5) / 9 );
        }
        return CelciusOutput;
    }
    
    public float ConvertToFarenheight(float C)
    {
        if(C == 0)
        {FarenheightOutput = GlobalVariables.CToFAddition;}
        else
        {        
        FarenheightOutput = (C * GlobalVariables.CToFMultiplier) + GlobalVariables.CToFAddition;
        }
        return FarenheightOutput;
    }
    
    
    
    
    
    
    
    
    
}
