
package pocketcarguy;


public class PowerToWeightCalculator {
 
//also works for HP per ton.    
public static float KWPerTon(float KW, float KG)
{
    if(KW == 0||KG == 0)return 0;
    else
    {
        return KW/(KG * 1000);
    }
}
    
    
}
