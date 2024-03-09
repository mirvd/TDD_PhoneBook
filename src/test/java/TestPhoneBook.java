import org.junit.Test;
import ru.netology.PhoneBook;

import static org.junit.Assert.assertEquals;

public class TestPhoneBook {
    @Test
    public void testAddition(){
        PhoneBook phoneBook = new PhoneBook();
        int contactCount = phoneBook.add("Roman", "77015785214");
        assertEquals(1, contactCount);
    }
    @Test
    public void testFindNumber(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Roman", "123");
        phoneBook.add("Ivan", "098");
        phoneBook.add("Nina", "456");
        String result = phoneBook.findByNumber("098");
        assertEquals("Ivan ", result);
    }
    @Test
    public void testFindName(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Roman", "123");
        phoneBook.add("Ivan", "098");
        phoneBook.add("Nina", "456");
        String result = phoneBook.findByName("Nina");
        assertEquals(" 456", result);
    }
}
