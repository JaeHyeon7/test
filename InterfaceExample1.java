
public class InterfaceExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeparateVolume obj1 = new SeparateVolume("863��774��","����","��������");
		AppCDInfo obj2 = new AppCDInfo("2005-7001","Redhat Fedora");
		//obj1.checkOut("�迵��","20060315");
		//obj2.checkOut("�����","20060317");
		printCheckout(obj1, "�迵��", "20060315");
		printCheckout(obj2, "�����", "20060317");
		//obj1.checkIn();
		//obj2.checkIn();
		printCheckin(obj1);
		printCheckin(obj2);
	}
	static void printCheckout(Lendable obj,String irum, String checkOutdate)
	{
		obj.checkOut(irum, checkOutdate);
	}
	static void printCheckin(Lendable obj) {
		obj.checkIn();
	}
}
