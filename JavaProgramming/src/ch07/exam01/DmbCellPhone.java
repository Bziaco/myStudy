package ch07.exam01;

public class DmbCellPhone extends CellPhone{
	int channel;
	
	public DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		super.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb(){
		System.out.println("ä��" + channel + "�� DMB ��� ������ �����մϴ�");
	}
	void changeChannelDmb(int channel){
		System.out.println("ä��" + channel + "������ �ٲߴϴ�.");
	}
	void turnOffDmb(){
		System.out.println("DMB ��� ������ ����ϴ�.");
	}


}