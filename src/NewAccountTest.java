import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StudentTest {
    private NewAccount account;

    @BeforeEach
    public void init(){
        balance = 1000;
    }
    @Test
    public void testStudentConstructor_CheckTotalScore(){
        Assertions.assertEquals(0, student.getTotalScore());
    }

    @Test
    public void testNewQuiz() {
        student.addQuiz(110);
        student.addQuiz(100);
        Assertions.assertEquals(210, student.getTotalScore());
        Assertions.assertEquals(105, student.getAverageScore());
    }
    @Test
    public void testStudentConstructor_CheckAverageScore(){
        student.addQuiz(100);
        Assertions.assertEquals(100.0, student.getAverageScore());
    }
    @Test
    public void testStudentConstructor_CheckName(){
        Assertions.assertEquals("Alex", student.getName());
    }
}

