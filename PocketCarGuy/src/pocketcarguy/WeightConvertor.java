
package pocketcarguy;


public class WeightConvertor {
    //Convert input KG to LB
    public static float KGToLbConvertor ( float KG)
    {
    if(KG == 0)return 0;
    else
    return KG * GlobalVariables.KGToLBMultiplier;
    }
    
    //Convert input LB to KG
    public static float LBToKGConvertor ( float LB)
    {
    if(LB == 0)return 0;
    else
    return LB * GlobalVariables.LBToKGMultiplier;
         
    }
          

}
