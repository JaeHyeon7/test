
public class InheritanceExample8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmailSender obj1 = new EmailSender("������ �����մϴ�",
				"������", "admin@dukheeshop.co.kr","10%���� ����");
		SMSSender obj2 = new SMSSender("������ �����մϴ�",
				"������", "02-000-0000","10%���� ����");
		send(obj1, "hataman@yeye.com");
		send(obj1, "stickman@haha.com");
		send(obj2, "010-000-0000");
	}
	static void send(MessageSender obj, String recipient)
	{
		obj.sendMessage(recipient);
	}
}
