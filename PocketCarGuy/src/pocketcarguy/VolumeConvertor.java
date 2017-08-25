
package pocketcarguy;

import pocketcarguy.GlobalVariables;

public class VolumeConvertor {
    //CC
    //CI
    //litre
    //oz
    //galon
    //m3
    //Ft3
    //ml
    
    //Convert all into cc then into final value
    
    
    public static float ConvertLitersToGallons(float L){
        if( L == 0)return 0;
        
        else return L * GlobalVariables.LToGMultiplier;
    }
    
    public static float ConvertGallonsToLitres(float G)
    {
        if(G == 0) return 0;
        
        else return G * GlobalVariables.GToLMultiplier;
    }
    
}
