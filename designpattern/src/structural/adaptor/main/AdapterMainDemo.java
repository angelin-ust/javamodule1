package structural.adaptor.main;

import structural.adaptor.phone.impl.Android;
import structural.adaptor.phone.impl.Iphone;
import structural.adaptor.phoneifaces.LightningPhone;
import structural.adaptor.phoneifaces.MicroUsbPhone;
import structural.adaptor.wrap.LightningToMicroUsbAdapter;

public class AdapterMainDemo {

	public static void rechargeMicroUsbPhone(MicroUsbPhone phone) {
		phone.useMicroUsb();
		phone.recharge();
	}

	public static void rechargeLightningPhone(LightningPhone phone) {
		phone.useLightning();
		phone.recharge();
	}

	public static void main(String[] args) {
		Android android = new Android();
		Iphone iPhone = new Iphone();
		
		boolean result = android instanceof MicroUsbPhone;
		System.out.println(result);
		

		System.out.println("Recharging android with MicroUsb");
		rechargeMicroUsbPhone(android);

		System.out.println("Recharging iPhone with Lightning");
		rechargeLightningPhone(iPhone);

				
		System.out.println("Recharging iPhone with MicroUsb");
	    rechargeMicroUsbPhone(new LightningToMicroUsbAdapter(iPhone));// call goes to  line#11
	}
}
