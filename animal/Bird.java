//���� �����Ѵ�
package com.sp.project0623.animal;

public class Bird{
	
	String name="�׳� ��";
	int wingCount=2;
	private boolean hasFeather=true;

	public Bird(boolean hasFeather){
		System.out.println("���� �ʱ�ȭ�� ���� ������ ȣ��");
		this.hasFeather=hasFeather;
	}

	public void fly(){
		System.out.println(name+"�� �޴��ŷ���");
	}
}
