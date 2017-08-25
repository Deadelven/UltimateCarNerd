
package pocketcarguy;


public class VolumeCalculator {
public static double CalculateCylinderVolume(float bore, float stroke)
{
if(bore == 0 || stroke == 0)return 0;
else
{
    //Calculate radius
    double Radius = (bore / 2);
    //Calculate volums from radius x height(stroke)
    //Returns in CC
    return ((Math.PI * Math.pow(Radius, 2) * stroke)/1000);
}    
}


public static double CalculateEngineVolume(float bore, float stroke, int NumberOfCyls)
{
if(bore == 0 || stroke == 0 || NumberOfCyls == 0)return 0;
else
{
    //Calculate radius
    double Radius = (bore / 2);
    //Calculate volums from radius x height(stroke)
    //Returns in CC
    double Volume = ((Math.PI * Math.pow(Radius, 2) * stroke)/1000);
    return Volume * NumberOfCyls;
    
    
}    
}


public static float CalculateCubeVolume(float L, float W, float H)
{
//Hard coding multiply by 0 error
if(L==0||W==0||H==0)return 0;
else
{
//Returns whatever input measurement is in M3
return L*W*H; 
}
}






    
}
