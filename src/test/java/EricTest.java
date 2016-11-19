import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aze on 2016.11.19..
 */
public class EricTest {
    @Test
    public void testable() throws Exception {
        Solution solution = new Solution();
        assertEquals(7, solution.testable(5));
    }
}