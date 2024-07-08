package assignment;

public class VotingEligibility2 {
	
	public static boolean eligible(int age)
	{
		if(age<=18)
		{
			return true;
		}
		else {
			return false;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VotingEligibility2.eligible(23);
		VotingEligibility2.eligible(0);
	}

}
