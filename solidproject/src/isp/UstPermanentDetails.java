package isp;

public class UstPermanentDetails implements BasicDetails, PfDetails {

	@Override
	public void updateProfile() {
		System.out.println("Updated Basic Details");

	}
	
	
	

	@Override
	public void updateBasicDetails() {
		System.out.println("Update Pf Details");

	}

}
