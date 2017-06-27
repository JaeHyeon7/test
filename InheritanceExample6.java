
class InheritanceExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmailSender obj1 = new EmailSender("생일을 축하합니다",
				"고객센터", "yoyo@dukeehop.com","10%쿠폰 발행");
		SMSSender obj2 = new SMSSender("생일을 축하합니다",
				"고객센터", "02-000-0000","10%쿠폰 발행");
		obj1.sendMessage("hatman@yeye.com");
		obj1.sendMessage("stickman@haha.com");
		obj2.sendMessage("010-000-0000");
	}

}
