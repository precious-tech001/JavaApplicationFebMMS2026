import java.util.scanner;

public class SwitchCase {
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter FullName: ");
		String name = input.nextLine();
		
		System.out.print("Enter age: ");
		int age = inputnextint();
		
		System.out.print("Enter score: ");
		int score = input.nextint();
		
		switch(Score/10){
			case 0:
			case 1:
			case 2:
			case 3:
				System.out.println("Name: " + name);
				System.out.println("Age: " + age);
				System.out.println("Score: " + score);
				System.out.println("Grade: F");
			break;
			case 4:
				System.out.println("Name: " + name);
				System.out.println("Age: " + age);
				System.out.println("Score: " + score);
				System.out.println("Grade: D");
			break;
			case 5:
				System.out.println("Name: " + name);
				System.out.println("Age: " + age);
				System.out.println("Score: " + score);
				System.out.println("Grade: C");
			break;
			case 6:
				System.out.println("Name: " + name);
				System.out.println("Age: " + age);
				System.out.println("Score: " + score);
				System.out.println("Grade: B");
			break;
			case 7:
			case 8:
			case 9:
			case 10:
				System.out.println("Name: " + name);
				System.out.println("Age: " + age);
				System.out.println("Score: " + score);
				System.out.println("Grade: A");
			break;
			default:
				System.out.println("Invalid input" );
			else{
				System.out.println("Score must be >= 0 or <= 100" );
			}
		}
	}
}	