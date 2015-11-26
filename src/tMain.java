import java.util.Scanner;

public class tMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Please Input your sentence(s)");
		String sentence = sc.next(); 	
		
		Rule1 Rule1 = new Rule1();
        if (Rule1.check(sentence)) 
        {
        	System.out.println(Rule1.message());
        }
        if (Rule2.check(sentence))
        {
        	System.out.println(Rule2.message());
        }
	}
}