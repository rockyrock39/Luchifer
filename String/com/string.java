package String.com;

public class string {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="A book in JAVA";
		String s2= new String("I like it");
		char arr[]= {'a','b','c','d','e','f','g','h','i','j','k'};
		String s3= new String(arr);
		
		System.out.println(s3);
		
		String p=s2.substring(0, 6);
		System.out.println(p);
		
		String q=s3.substring(0,9);
		System.out.println(p+q);
		String m=s3.toUpperCase();
		System.out.println(m);
		
	    s3.getChars(3, 7, arr, 0);
	    
	    System.out.println(arr);
		
	}

}
