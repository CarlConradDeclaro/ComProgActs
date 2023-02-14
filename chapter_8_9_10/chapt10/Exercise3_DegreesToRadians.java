class Exercise3_DegreesToRadians {

    public static void main(String[] args) {
    
    
       
         int degrees = 30;
        double rad = degrees * Math.PI/180;
        
    
    double sinx = Math.sin(rad);
    double cosx = Math.cos(rad);
    double sum = sinx*sinx + cosx*cosx;

    
    System.out.println("sine: " + sinx + "\ncosine: " + cosx + "\nsum of squares: " + sum );
    
    
    
     
     }
}