import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;
import java.util.Collections;
import java.util.Set;

public class DuplicateWordsInStringTest {    
   
    @Test
    public void testWithEmptyString(){        
        Set<String> output = DuplicateWordsInString.duplicateWords("");
        assertEquals(Collections.emptySet(), output);
    }
    
    @Test
    public void testWithNullString(){
        Set<String> output = DuplicateWordsInString.duplicateWords(null);
        assertEquals(Collections.emptySet(), output);
    }
    
    @Test
    public void testWithDuplicateString(){
        Set<String> output = DuplicateWordsInString.duplicateWords("one one one two two");
        assertTrue(output.contains("one"));
        assertTrue(output.contains("two"));
        assertTrue(output.size() == 2);
    }
    
    @Test
    public void testWithOutDuplicates(){
        Set<String> output = DuplicateWordsInString.duplicateWords("one two three");
        assertEquals(Collections.emptySet(), output);
    }
    
    @Test
    public void testWithMultipleSpaceBetweenWord(){
        Set<String> output = DuplicateWordsInString.duplicateWords(" one   two    three ");
        assertEquals(Collections.emptySet(), output);
    }
    
    
}



