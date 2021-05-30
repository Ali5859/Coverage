package usermanagement.exception;
import org.junit.Test;
import usermanagement.entity.Person;
import static org.junit.Assert.assertEquals;

public class UserNotFoundExceptionTest {
    @Test
    public void test_not_found() {
        UserNotFoundException u = new UserNotFoundException("not found", 1001);
        Integer x = 1001;
        assertEquals(x,u.getUserId());

    }
}
