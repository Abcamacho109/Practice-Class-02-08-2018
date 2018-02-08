import java.util.Scanner;

public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Card cardType1 = new Card(1, "Spades"); // 1st Type
Card cardType2 = new Card(1, "Clover"); // 2nd Type
Card cardType3 = new Card(1, "Lucky"); // 3rd Type
Card cardType4 = new Card(1, "Diamond"); // 4th Type
Card cardType5 = new Card(1, "Heart"); // 5th Type
Card cardType6 = new Card(1, "Ace"); // 6th Type 
Card cardType7 = new Card(1, "Jack"); // 7th Type
Card cardType8 = new Card(1, "Queen"); // 8th Type
Card cardType9 = new Card(1, "King"); // 9th Type
Scanner scanner = new Scanner (System.in);

System.out.println(cardType1.number+cardType1.suit);
System.out.println(cardType2.number+cardType2.suit);
System.out.println(cardType3.number+cardType3.suit);
System.out.println(cardType4.number+cardType4.suit);
System.out.println(cardType5.number+cardType5.suit);
System.out.println(cardType6.number+cardType6.suit);
System.out.println(cardType7.number+cardType7.suit);
System.out.println(cardType8.number+cardType8.suit);
System.out.println(cardType9.number+cardType9.suit);
System.out.println("What card do you want to draw first");
String suit = scanner.nextLine();
if(suit.equals("Diamond")){
System.out.println("you win");
}else{
	System.out.println("You lose");
}
		




	}

}
