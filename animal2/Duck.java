package com.sp.project0623.animal2;

public class Duck extends Bird{
						//Duck is a Bird
	String name="�� ����";
	public void fly(){
		System.out.println("������ ���ư��ϴ�");
	}

	public static void main(String[] args){
		//1)���� ������ �����, ���� ���� �ڷ������� �����ǰ�
		//���� ���� �ڷ����̶��, ����ȯ�� �����ؾ� �Ѵ�.
		/*
		byte b=5;
		short s=3;
		byte k=(byte)s;
		*/

		Duck d=new Duck();
		System.out.println(d);

		//��Ӱ��迡�� �θ�� �ڽ��� ���ÿ� �ν��Ͻ��� ������ ����
		//�θ�,�ڽ��� �ν��Ͻ��� �ڽ��� �ν��Ͻ��� ����ȭ�Ǿ�����.
		//���� ����ȭ�� �ν��Ͻ� ������ �θ��� �ν��Ͻ��� �����Ϸ���
		//up casting �����ڸ� ����ϰ�, �ٽ� �ڽ����� ����������
		//down casting�� ����Ѵ�.
		Bird b1=(Bird)d;
		System.out.println(b1.name);

		Duck d1=(Duck)b1;
		System.out.println(d1.name);

		//����ȭ�� �ν��Ͻ������� ������ �޼��尡 �������̵� �Ǿ� �ִٸ�
		//sun������ �ڽ��� �޼��带 ���׷��̵� �����Ͽ� �ڽ��� �޼��带 ȣ���Ͽ� �ش�.
		b1.fly();//�ڽ��� �޼��带 ȣ���ϰ� �ȴ�.

		//��Ģ: �ش� ��ü�ڷ����� ���� ���� ��
		//���� : ��, �������̵��� �޼��尡 ���� ��� �ڽ��� �޼��带 �켱��


		//Bird b=new Bird();

		//b=d;//���� �ڷ������� ������ ����Ű�� �����Ƿ�, �ڵ� ����ȯ�̴�.
		//d=(Duck)b;//down casting
		
		//System.out.println(d.name);
		//Duck c=(Duck)b;
		//System.out.println(c.name);
		//Bird k=(Bird)c;//up casting
		//System.out.println(k.name);
	}
}
