package kadai1;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.jupiter.api.Test;

public class kadai1Test {

//	@Test
//	void test() {
//		fail("まだ実装されていません");
//	}
//	
	  @Test
	  public void ともに自然数() {
	    
	    int result = kadai1.lintAdd(3, 5);
	    
	    assertThat(result, is(8));
	    
	  
	}

}




