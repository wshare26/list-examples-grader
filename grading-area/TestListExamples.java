import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import java.util.List;

class IsMoon implements StringChecker {
  public boolean checkString(String s) {
    return s.equalsIgnoreCase("moon");
  }
}

public class TestListExamples {
  @Test(timeout = 500)
  public void testMergeRightEnd() {
    List<String> left = Arrays.asList("a", "b", "c");
    List<String> right = Arrays.asList("a", "d");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("a", "a", "b", "c", "d");
    assertEquals(expected, merged);
  }

  
  @Test 
  public void testMerge() {
    List<String> list1 = Arrays.asList("a","b","c");
    List<String> list2 = Arrays.asList("d","e");
    List<String> expectedOutputList = Arrays.asList("a","b", "c", "d", "e");
    List<String> actualOutputList = ListExamples.merge(list1,list2);
    assertEquals(expectedOutputList, actualOutputList);
  }

  @Test 
  public void testFilter(){
    List<String> list1 = Arrays.asList("a","b","c", "d", "e");
    List<String> list2 = Arrays.asList("c","d","e");
    List<String> actualoutputlist = ListExamples.filter(list1, s -> s.compareTo("b") > 0);
    assertEquals(list2, actualoutputlist);


  }

}
