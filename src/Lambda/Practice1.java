package Lambda;

interface Operation{
	
	int checkNumber(int x,int y);
}

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		 Operation c=(x,y)->{
			 return (x>y)?x:y;
		 };
		System.out.println( c.checkNumber(10, 20));
	}

}
