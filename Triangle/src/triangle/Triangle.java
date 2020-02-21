/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;

/**
 *
 * @author Anik
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //No
        Triangleclass t1=new Triangleclass(1, 2, 3);
        t1.show();
        t1.testTriangle();
        //two
        Triangleclass t2=new Triangleclass(1, 1, 3);
        t2.show();
        t2.testTriangle();
        //Equal
        Triangleclass t3=new Triangleclass(1, 1, 1);
        t3.show();
        t3.testTriangle();
     
    }
  

    
  
}

   class Triangleclass{
	private int x;
	private int y;
	private int z;

        public Triangleclass(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
	
	public void show()
	{
		System.out.println("Side 1:"+this.x);
		System.out.println("Side 2:"+this.y);
		System.out.println("Side 3:"+this.z);
	}
        
        public void testTriangle(){
            if (x==y && y==z) {
                System.out.println("the Triangle is equilateral ");
                
            }
            else if(x==y || y==z ||x==z){
                System.out.println("the Triangle is isosceles ");
            }
            else{
                System.out.println("the Triangle is scalene "); 
            }
        }
	
        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getZ() {
            return z;
        }

        public void setZ(int z) {
            this.z = z;
        }
    }
