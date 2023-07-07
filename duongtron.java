
import java.lang.Math;
import java.util.Scanner;
public class duongtron {
	 public static void main(String[] args) {
	    	Scanner sc= new Scanner(System.in);// Viet k co dau cach va chu y khi viet thuong viet hoa
			/** System.out.println("Nhap vao so thu nhat");
			int n1 = sc.nextInt();
			System.out.println("\n Nhap vao so thu hai");
			int n2 = sc.nextInt();
			System.out.println("\n Tong cua hai so la:" + (n1+n2));
			
			
			System.out.println("\n nhap vao so thu nhat");
			String s1 = sc.next();
			String s2 = sc.next();
			int i1 = Integer.parseInt(s1);
			double db = 3.2;
			System.out.println(db);
			int i2 =(int) db ;
			*/
			
// Nhap vao 1 so tu ban phim va in ra man hinh la so chan hay so le
			// phep chia lay phan nguyen so1/so2
			// phep chia lay phan du so1%so2
	    /**	System.out.println("Nhap vao so1:");
	    	int so1 = sc.nextInt();
			if (so1%2 == 0) {
					System.out.println("so1 la so chan");
					}
			else {
				System.out.println("so1 la so le");}
	   */
			
// Cho duong tron tam O(10;20)  ban kinh r=10
//viet chuong trinh nhap vap tu ban phim 1 diem A(x1;y1)
// xem diem A nam tren , trong hay ngoai duong tron
	    	//x1-x2?r1:r2 toan tu ngoi ba // viet ngan gon cua if
			int [] o= {10,20};
			int r=10;
			int x0=20;
			int y0=30;
			int x1=10;
			int y1=20;
			
			double d= Math.sqrt((x1-x0)*(x1-x0) + (y1-y0)*(y1-y0)); // gtri phai duoc khoi tao
	    	
	    	if (d == r ) 
	    		System.out.println("A nam tren O");
	    		else 
	    			if(d>r)
	    		    System.out.println("a nam ngoai O");
	    		    else 
	    		    	System.out.println("a nam trong O");
 
		}
	 
}

