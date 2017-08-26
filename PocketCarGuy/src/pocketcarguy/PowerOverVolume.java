
package pocketcarguy;


public class PowerOverVolume {
    
    public static float HPPerLitre(float Power, float Litre)
    {
    if (Power == 0 || Litre == 0) return 0;
    
    else return Power/Litre;
    }
    
    
    
    
}
