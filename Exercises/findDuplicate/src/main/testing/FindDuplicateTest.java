import org.junit.Assert;

public class FindDuplicateTest {
    @org.junit.Test
    public void findDuplicateTestPositive() throws Exception {
        Assert.assertEquals(findFirstDuplicateCharacter.findDuplicate("abcabc"), 3);
    }

    @org.junit.Test
    public void findDuplicateTestNegative() throws Exception {
        Assert.assertEquals(findFirstDuplicateCharacter.findDuplicate("abcde"), -1);
    }
}
