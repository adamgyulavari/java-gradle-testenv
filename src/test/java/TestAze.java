import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by aze on 2016.11.19..
 */
public class AzeTest {
    WordToolbox wordToolbox;

    @BeforeClass
    public static void onceExecutedBeforeAll() {
        System.out.println("@BeforeClass: onceExecutedBeforeAll");
    }

    @Before
    public void executedBeforeEach() {
        wordToolbox = new WordToolbox("Muppets");
        System.out.println("@Before: executedBeforeEach");
    }
    @AfterClass
    public static void onceExecutedAfterAll() {
        System.out.println("@AfterClass: onceAfterAll");
    }
    @After
    public void executedAfterEach() {
        wordToolbox = null;
        System.out.println("@After: executedAfterEach");
    }

    @Test
    public void testCountLetter() throws Exception {
        WordToolbox solution = new WordToolbox("Tarzans toenails");
        assertEquals(3, solution.countHowMany('a'));
    }

    @Test
    public void testAnangramm() throws Exception {
        WordToolbox solution = new WordToolbox("float");
        assertTrue(solution.isAnAnagram("tloaf"));
        assertFalse(solution.isAnAnagram("asdsa"));
    }

}