import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aze on 2016.11.19..
 */
public class AzeTest {
    @Test
    public void testable() throws Exception {
        Solution solution = new Solution();
        assertEquals(6, solution.testable(5));
    }

}