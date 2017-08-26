
package pocketcarguy;

public class WheelsAndGearing {
    
    public static float CalculateWheelPerimiter(float Width, float Rim, float Profile)
    {
    
    if(Width == 0 || Rim == 0 || Profile == 0) return 0;
    
    
    //Now to Calculate the Diamater
    float TireHeight = ( Width * (Profile / 100));
    //Convert Rim Size into MM
    float RimSizeMM = (Rim * 25.4f);
    float TireDiamater = RimSizeMM + (2*TireHeight);
    float TireCircumfrenceMM = (float) (TireDiamater * Math.PI);
    
    return TireCircumfrenceMM;
    }
    
    
    public static float CalculateWheelPerimiterDifference(float Width, float Rim, float Profile,float Width2, float Rim2, float Profile2)
    {
    if(Width == 0 || Rim == 0 || Profile == 0 || Width2 == 0 || Rim2 == 0 || Profile2 == 0) return 0;
       
    //Now to Calculate the Diamater
    float TireHeight = ( Width * (Profile / 100));
    //Convert Rim Size into MM
    float RimSizeMM = (Rim * 25.4f);
    float TireDiamater = RimSizeMM + (2*TireHeight);
    float TireCircumfrenceMM = (float) (TireDiamater * Math.PI);
    
    //Now to Calculate the Diamater
    float TireHeight2 = ( Width * (Profile / 100));
    //Convert Rim Size into MM
    float RimSizeMM2 = (Rim * 25.4f);
    float TireDiamater2 = RimSizeMM + (2*TireHeight);
    float TireCircumfrenceMM2 = (float) (TireDiamater * Math.PI);
    
    return TireCircumfrenceMM / TireCircumfrenceMM2;
    
    }
    
    
}
