public class SwapVariable {
    public SwapVariables() {
    }
 
    public static void main(String[] var0) {
       int var1 = 5;
       int var2 = 10;
       System.out.println("Original values:");
       System.out.println("a = " + var1);
       System.out.println("b = " + var2);
       var1 += var2;
       var2 = var1 - var2;
       var1 -= var2;
       System.out.println("Swapped values:");
       System.out.println("a = " + var1);
       System.out.println("b = " + var2);
    }
 }
 


        