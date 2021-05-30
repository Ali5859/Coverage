package usermanagement.service;
import org.junit.Test;
import usermanagement.entity.Person;

import javax.persistence.criteria.CriteriaBuilder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class UserTest {
    @Test
    public void user_test() {
        User u = new User();
        User u2 = new User();
        u.setFirstName("f");
        Integer x = 1001;
        u.setUserId(x);
        u.setLastName("l");
        u.setCompanyName("c");

        assertEquals(x,u.getUserId());
        assertEquals("c",u.getCompanyName());
        assertEquals("l",u.getLastName());
        assertEquals("f",u.getFirstName());
        assertEquals(false,u.equals(u2));
        assertEquals(31+x.hashCode(),u.hashCode());

    }
}
