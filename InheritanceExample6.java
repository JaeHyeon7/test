
class InheritanceExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmailSender obj1 = new EmailSender("������ �����մϴ�",
				"������", "yoyo@dukeehop.com","10%���� ����");
		SMSSender obj2 = new SMSSender("������ �����մϴ�",
				"������", "02-000-0000","10%���� ����");
		obj1.sendMessage("hatman@yeye.com");
		obj1.sendMessage("stickman@haha.com");
		obj2.sendMessage("010-000-0000");
	}

}
