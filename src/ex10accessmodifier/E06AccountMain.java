package ex10accessmodifier;

public class E06AccountMain
{

	public static void main(String[] args)
	{

		//DAO객체 생성
		AccountDAO cap = new AccountDAO();
		
		//데이터 초기화를 통해 DTO객체 생성
		cap.init("홍길동", "93524346745", 100000);
		
		//통장정보출력
		cap.printAccount();
		
		//출금처리
		cap.withdraw(100000);
		cap.withdraw(3000);
		
		//입금처리
		cap.deposit(100000);
		
		//통장정보출력
		cap.printAccount();
		
	}

}
