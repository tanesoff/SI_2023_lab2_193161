import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    List<User> userList = List.of(
            new User("leftz", "111222333", "filip@gmail.com"),
            new User("__MUX__", "123456mux", "mux@gmail.com"),
            new User("Ayato", "kennen420", "dejan@gmail.com")
    );
    @Test
    void UserNull(){
        assertThrows(RuntimeException.class, () -> SILab2.function(null, userList));
    }

    @Test
    void UsernameNull(){
        assertFalse(SILab2.function(new User(null, "Devito", "filip@gmail.com"), userList));
    }

    @Test
    void SameUsernamePassWithSpecialChar(){
        assertFalse(SILab2.function(new User("Ayato", "!DevitoRelja", "filip@gmail.com"), userList));
    }

    @Test
    void SameUsername(){
        assertFalse(SILab2.function(new User("Ayato", "DevitoRelja", "filip@gmail.com"), userList));
    }

    @Test
    void EmailWithNoAT(){
        assertFalse(SILab2.function(new User("Ayato", "DevitoRelja", "filipgmail.com"), userList));
    }

    @Test
    void PassWithSpace(){
        assertFalse(SILab2.function(new User("Ayato", "Devito Relja", "filipgmail.com"), userList));
    }


    @Test
    void muilipleConditionTXX(){
        RuntimeException exception;
        exception = assertThrows(RuntimeException.class, ()->SILab2.function(null, userList));
        assertTrue(exception.getMessage().contains("Mandatory information missing!"));
    }

    @Test
    void muilipleConditionFTX(){
        RuntimeException exception;
        exception = assertThrows(RuntimeException.class, ()->SILab2.function(new User("Jovan", null, "jovan@gmail.com"), userList));
        assertTrue(exception.getMessage().contains("Mandatory information missing!"));
    }

    @Test
    void muilipleConditionFFT(){
        RuntimeException exception;
        exception = assertThrows(RuntimeException.class, ()->SILab2.function(new User("Jovan", "PabloPablo123", null), userList));
        assertTrue(exception.getMessage().contains("Mandatory information missing!"));
    }

    @Test
    void muilipleConditionFFF(){
        RuntimeException exception;
        exception = assertThrows(RuntimeException.class, ()->SILab2.function(new User("Jovan", "PabloPablo123", "jovan@gmail.com"), userList));
        assertTrue(exception.getMessage().contains("Mandatory information missing!"));
    }
}
// throw new RuntimeException("Mandatory information missing!");