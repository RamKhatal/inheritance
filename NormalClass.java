package pkg1;

public class NormalClass {

	public static void main(String[] args) 
	{
		System.out.println("SBI");
		SBI s=new SBI();
		s.CreditScore();
		s.intrestRate();
		s.homeLoneIntrest();
		s.personalLone();
		System.out.println("===============================");

		System.out.println("HDFC");
		HDFC h=new HDFC();
		h.CreditScore();
		h.intrestRate();
		h.homeLoneIntrest();
		System.out.println("===============================");

		System.out.println("IDBI");
		IDBI i=new IDBI();
		i.CreditScore();
		i.intrestRate();
		i.homeLoneIntrest();
		System.out.println("===============================");
		

	}

}
