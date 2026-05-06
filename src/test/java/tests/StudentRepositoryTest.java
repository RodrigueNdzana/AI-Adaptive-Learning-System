package tests;

import com.aiadaptive.domain.Student;
import com.aiadaptive.repositories.StudentRepository;
import com.aiadaptive.repositories.inMemory.InMemoryStudentRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentRepositoryTest {

    @Test
    void testSaveAndFind() {
        StudentRepository repo = new InMemoryStudentRepository();

        Student student = new Student("1", "John");
        repo.save(student);

        assertTrue(repo.findById("1").isPresent());
    }

    @Test
    void testDelete() {
        StudentRepository repo = new InMemoryStudentRepository();

        repo.save(new Student("1", "John"));
        repo.delete("1");

        assertFalse(repo.findById("1").isPresent());
    }
}