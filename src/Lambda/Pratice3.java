package Lambda;
@FunctionalInterface
interface Bettween{
	boolean checkBet(int x ,int y,int ch);
}
public class Pratice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Bettween b=(x,y,ch)->{
    	  if(ch>x && ch<y) {
    		  return true;
    	  }
    	  else return false;
      };
      
      System.out.println(b.checkBet(10, 50, 20));
	}

}
