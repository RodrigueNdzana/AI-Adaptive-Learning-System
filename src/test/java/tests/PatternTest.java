package tests;

import com.aiadaptive.patterns.singleton.DatabaseConnection;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PatternTest {

    @Test
    void testSingleton() {
        DatabaseConnection a = DatabaseConnection.getInstance();
        DatabaseConnection b = DatabaseConnection.getInstance();
        assertSame(a, b);
    }
}