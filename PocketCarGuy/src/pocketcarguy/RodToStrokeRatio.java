
package pocketcarguy;


public class RodToStrokeRatio {
    
    public static float BoreToStrokeRatio (float Bore, float Stroke)
    {
    if(Bore == 0 || Stroke == 0) return 0;
    
    else return Bore/Stroke;
    
    }
    
    
    
}
