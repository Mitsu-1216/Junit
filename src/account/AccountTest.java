package account;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {

	@Test
	public void instantiate() {
		Account a =  new Account("minato",30000); 
		assertEquals("minato",a.owner);
		assertEquals(30000,a.balance);	
		
	}

}
