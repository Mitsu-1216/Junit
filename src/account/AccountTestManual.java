package account;

class AccountTestManual {
	
	static int errorcnt = 0;
	
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
			errorcnt++;
		}
		
		if(30000 != a.balance) {
			System.out.println("テストは失敗しました");
			System.out.println("残高エラー");
			errorcnt++;
		}
		
		if(errorcnt == 0){
			System.out.println("異常なし");
			System.out.println("テストは成功しました！");
		}	
	}
}
