import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		User user = new User();
		System.out.println("Hello there are your Skills");
		System.out.println(user.skills);
		System.out.println("Inpyte id of Skill you want upgrade");
		Scanner scan = new Scanner(System.in);
		int SkillId=scan.nextInt();
		user.buyUpgrade(SkillId);
		System.out.println(user.skills);
		System.out.println(user);
		scan.close();
	}

}
