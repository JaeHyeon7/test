
public class InheritanceExample8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmailSender obj1 = new EmailSender("생일을 축하합니다",
				"고객센터", "admin@dukheeshop.co.kr","10%쿠폰 발행");
		SMSSender obj2 = new SMSSender("생일을 축하합니다",
				"고객센터", "02-000-0000","10%쿠폰 발행");
		send(obj1, "hataman@yeye.com");
		send(obj1, "stickman@haha.com");
		send(obj2, "010-000-0000");
	}
	static void send(MessageSender obj, String recipient)
	{
		obj.sendMessage(recipient);
	}
}
