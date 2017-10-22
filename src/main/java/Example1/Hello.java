package Example1;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello h = new Hello();
		String r = h.Content("God Damn It !");
		System.out.println(r);
	}
	
	public String Content(String n){
		String c = "Hello "+n;
		return c;
	}
}
