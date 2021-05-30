package usermanagement.service;

import org.junit.Test;
import usermanagement.entity.Person;
import static org.junit.Assert.assertEquals;

public class TransformServiceTest {
    @Test
    public void test_transform_service_constructor(){
        TransformService testClass = new TransformService();
        Person p = new Person();
        p.setPersonId(1001);
        p.setCompanyName("c");
        p.setlName("n");
        p.setfName("f");
        p.setmName("m");
        User u = new User();
        u.setUserId(1001);
        u.setCompanyName("c");
        u.setLastName("n");
        u.setFirstName("f");
        assertEquals(u.getCompanyName(),testClass.toUserDomain(p).getCompanyName());
        assertEquals(u.getUserId(),testClass.toUserDomain(p).getUserId());
        assertEquals(u.getFirstName(),testClass.toUserDomain(p).getFirstName());
        assertEquals(u.getLastName(),testClass.toUserDomain(p).getLastName());

        assertEquals(p.getCompanyName(),testClass.toUserEntity(u).getCompanyName());
        assertEquals(p.getfName(),testClass.toUserEntity(u).getfName());
        assertEquals(p.getlName(),testClass.toUserEntity(u).getlName());
        assertEquals(p.getPersonId(),testClass.toUserEntity(u).getPersonId());
    }

}
