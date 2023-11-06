package DoiTuong.Tuan4.Lab8;

public final class XPoly {
	private static double cong=0;
	private static double max=0;
	private static double min=0;
    public static final double sum(double ...x) {
    	for(double a:x) {
    		cong+=a;
    	}
	    return cong;
   }
    public static final double min(double ...x) {
    	double min=100000000;
    	for(int i=0;i<x.length-1;i++) {
    		if(x[i]<min) {
    			min=x[i];
    	}
     }
    	return min;
   }
    public static final double max(double ...x) {
    	double max=0;
    	for(int i=0;i<x.length;i++) {
    		if(x[i]>max) {
    			max=x[i];
    		}
    	}
    	return max;
   }
   public static final String toUpperChar(String s) {
	   return null;
   }
}
