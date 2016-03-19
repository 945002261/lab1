package lab;

public class triangle {
	
	private static int result=0;
	public void TypeOfTriangle(int a,int b,int c) {
        if(a + b > c && a + c >b && b+ c > a && a>=0 && b >= 0 && c >=0){
        	if(a == b || b == c || a == c){
        		if(a == b && a == c)
        			result = 1;//Equilateral
        		else
        			result = 2;//Isosceles
        	}
            else
            	result = 3;//Scalene
        }
        else
        result = 4; //notTriangle
	}
	
	public int getResult(){
		return result;
    }
		  
}
