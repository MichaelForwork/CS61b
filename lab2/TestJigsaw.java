import org.junit.Test;
import static org.junit.Assert.*;

public class TestJigsaw {

	/**
	 * this unit is finished.
	 */
	@Test
	public void testJigsaw(){
		String actual = Jigsaw.jigsaw();
		String expect = new String("a-b c-d");
		assertEquals(expect,actual);
	}
}


/**
 * the first
 */
