import java.util.Scanner;

public class wordCounter{
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		int ctr = 0, wordCounter = 0, j = 0;
		System.out.print("Enter the sentence >>: ");
		String sent = in.nextLine().toLowerCase();
		System.out.print("Enter the word to look for >>: ");
		String searchWord = in.next().toLowerCase();
		
		for(int i = 0; i < sent.length(); i++){
			if(j == searchWord.length()){
				j=0;
			}
			if(sent.charAt(i) == searchWord.charAt(j)){
				j++;
				if(j == searchWord.length()){
					wordCounter++;
				}
			}else{
				j=0;
			}
		}
		System.out.print("There are " + wordCounter + " word(s) of " + searchWord + "\n");
	}
}