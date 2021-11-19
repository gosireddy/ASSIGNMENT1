import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception {
	
		Insert i=new Insert();
		Update u=new Update();
		Delete d=new Delete();
		Fetch f=new Fetch();
		Pfetch pf =new Pfetch();
		int choice;
		Scanner s=new Scanner(System.in);
		System.out.println("1. Insert");
		System.out.println("2. Update");
		System.out.println("3. Delete");
		System.out.println("4. Fetch");
		System.out.println("5. Pfetch");
		
		choice =s.nextInt();
		
		switch(choice)
		{
		case 1:i.Insert();
		case 2:u.Update();
		case 3:d.Delete();
		case 4:f.Fetch();
		case 5:pf.Pfetch();
		default:System.out.println("invalid selection");
		}
		
	}

}
