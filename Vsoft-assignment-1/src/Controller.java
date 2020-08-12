
public class Controller {

	StringBuilder s= new StringBuilder();

	public void setImage(String str) {
		
		// TODO Auto-generated method stub
		//String reverse= str.reverse();
		Model m = new Model();
		 s=m.reverse(str);
		 //System.out.println("hello"+s);
		 View v= new View();
		
		v.publish(s);
		
		
		
		
		
		
	}
	/**public StringBuilder returnString() {
		return s;
	}**/

}
