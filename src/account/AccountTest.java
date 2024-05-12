package account;

class AccountTest {
	
	public static void main(String[] args) {		
		testInstantiate();
//		testTransfer();
	}

	private static void testInstantiate() {
		System.out.println("テストを開始します");
		Account a =  new Account("minato",30000); 	
	
	
		if(!"minato".equals(a.owner)) {
			System.out.println("テストは失敗しました");
			System.out.println("名義人エラー");
		}
		
		if(30000 != a.balance) {
			System.out.println("テストは失敗しました");
			System.out.println("残高エラー");
		}
	
	}
}
