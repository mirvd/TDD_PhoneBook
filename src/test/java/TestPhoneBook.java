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
}
