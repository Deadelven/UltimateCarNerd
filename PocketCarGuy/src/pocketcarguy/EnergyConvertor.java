
package pocketcarguy;


import pocketcarguy.GlobalVariables;
        
//Kw/hp
//ftlb/nm
//HP at x rpm via torque
public class EnergyConvertor {
    
    public static float ConvertKWToHP(float KW)
    {
    if(KW == 0f) return 0;
    
    return KW * GlobalVariables.KWToHPMultiplier;
    
    }
    
    
    
    
    
    
    
    
    
}
