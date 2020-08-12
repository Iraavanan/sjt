
public class Model {
	StringBuilder sb1=new StringBuilder();
	
	public StringBuilder reverse(String r) {
	StringBuilder sb = new StringBuilder();
	sb.append(r);
	
	sb1.append(r);
	sb.reverse();
	sb1.append("|").append(sb);
	//System.out.println("hello i am in Model"+sb1);
	return sb1;
	
	}
	
	
	
}
