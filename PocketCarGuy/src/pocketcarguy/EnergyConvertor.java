
package pocketcarguy;


import pocketcarguy.GlobalVariables;
        
//Kw/hp
//ftlb/nm
//HP at x rpm via torque
public class EnergyConvertor {
    
    public static float ConvertKWToHP(float KW)
    {
    if(KW == 0f) return 0;
    else
    return KW * GlobalVariables.KWToHPMultiplier;
    }
    
    public static float ConvertHPToKW(float HP)
    {
    if(HP == 0) return 0;
    else
    return HP * GlobalVariables.HPToKWMultiplier; 
    }
    
    
    
    
    
    
    
    
    
}
