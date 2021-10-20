import java.util.Random;
import java.util.Scanner;


public class sprGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count;
		int userchoice;
		int computercount = 0;
		int usercount = 0;
		int tiedcount = 0;
		System.out.println("Enter your name");
		String username = sc.nextLine();
		System.out.println("How many times you want to play....");
		count = sc.nextInt();
		for (int i = 0; i < count; i++) {
			System.out.println("Enter your choice\n1.Scissor\n2.Paper\n3.Rock");
			userchoice = sc.nextInt();
			if (userchoice == 1) {
				System.out.println(username + " your choice is Scissor");
			} else if (userchoice == 2) {
				System.out.println(username + " your choice is Paper");
			} else if (userchoice == 3) {
				System.out.println(username + " your choice is Rock");
			} else {
				System.out.println("Wrong input......");
			}
			Random ref = new Random();
			int computerchoice = ref.nextInt(3);
			if (computerchoice == 0) {
				System.out.println("Computer choose Scissor");
			} else if (computerchoice == 1) {
				System.out.println("Computer choose Paper");
			} else {
				System.out.println("Computer choose Rock ");
			}

			if (userchoice == 1 && computerchoice == 1 || userchoice == 2
					&& computerchoice == 2 || userchoice == 3
					&& computerchoice == 0) {
				System.out.println(username + "  you are a winner!!!!....");
				usercount++;
			} else if (userchoice == 1 && computerchoice == 2
					|| userchoice == 2 && computerchoice == 0
					|| userchoice == 3 && computerchoice == 1) {
				System.out.println("Computer wins!!!!!!!!");
				computercount++;
			} else {
				System.out.println("Game is tie");
				tiedcount++;
			}
		}
		System.out.println();
		System.out.println("***FINAL RESULT***");
		if(usercount>computercount){
			System.out.println(username + "  you are a winner!!!!.... "+usercount+" times");
		}
		else if(usercount<computercount){
			System.out.println("Computer wins!!!!!!!! "+computercount+" times");
		}else{
			System.out.println("Game is tie"+tiedcount+" times");
		}
		sc.close();
	}



}
