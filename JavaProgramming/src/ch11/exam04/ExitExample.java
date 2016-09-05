package ch11.exam04;

public class ExitExample {
	public static void main(String[] args) {
		
		System.setSecurityManager(new SecurityManager(){    //system.exit()�� �����ϴ� �ڵ�
			@Override
			public void checkExit(int status) {    //exit(i) i ���� �Ű����� ������ ����
				if(status != 5){
					throw new SecurityException(); //���������� �����Ű�� ���� �Ϻη� ���ܸ� ����
				}
				System.out.println("�� �׳�~");
			}
		});
		
		
		for(int i=0;i<10;i++){
			System.out.println(i);
				try{
					System.exit(i); // ���α׷��� �����ض�
				//break; // 
				//return; //for���� ����������
				} catch(SecurityException e){}
			}
		}
}