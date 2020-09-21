package Test;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestJigsaw {

	@Test
	public void testJigsaw(){
		String actual = Jigsaw.jigsaw();
		String expect = new String("a-b c-d");
		assertEquals(expect,actual);
	}
}
