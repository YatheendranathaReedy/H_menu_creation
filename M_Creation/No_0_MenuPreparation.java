package M_Creation;
import java.util.Scanner;

import M_Creation.*;
public class No_0_MenuPreparation {

	public static void main(String[] args) {
		System.out.println("To create menu card 			press 1");
		System.out.println("To insert items in menu card 		press 2");
		System.out.println("To update items cost in menu card 	press 3");
		System.out.println("To display menu card 			press 4");
		System.out.println("To delete items in menu card 		press 5");
		System.out.println();
		System.out.print("Enter your option ; 	");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		String ope="yes";
		No_1_menutable  mt=new No_1_menutable();
		No_2_InsertItems ii=new No_2_InsertItems();
		No_3_UpdateItem up=new No_3_UpdateItem();
		No_4_DisplayItem md=new No_4_DisplayItem();
		No_5_DeleteItem deit=new No_5_DeleteItem();
		
		if (number==1) {
			mt.TableCreate();
		}
		
		while(ope=="yes") {
			System.out.println("Enter operation number");
			number=s.nextInt();
			
			switch(number) {
			case(2):
				ii.Insert();
				break;
			case(3):
				up.upit();
				break;
			case(4):
				md.di();
				break;
			case(5):
				deit.delit();
				break;
			default:
				System.out.println("Entered option is out of bounds \n try again");
				System.out.println("Entered no.must be in 1 - 5");
			}
			
			System.out.println("if you want to try again type yes  to exit please type exit");
			ope=s.next();
		}
	}
}
