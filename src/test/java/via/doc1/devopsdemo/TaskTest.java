package via.doc1.devopsdemo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import via.doc1.devopsdemo.model.Task;

public class TaskTest {

    @Test
    void constructor_setsAllFieldsCorrectly() {
        Task task = new Task("1", "Laundry", "Do the laundry");

        assertEquals("1", task.getId());
        assertEquals("Laundry", task.getName());
        assertEquals("Do the laundry", task.getDescription());
    }

    @Test
    void settersAndGetters_workAsExpected() {
        Task task = new Task();
        task.setId("42");
        task.setName("Shopping");
        task.setDescription("Buy groceries");

        assertEquals("42", task.getId());
        assertEquals("Shopping", task.getName());
        assertEquals("Buy groceries", task.getDescription());
    }

    @Test
    void toString_returnsExpectedString() {
        Task task = new Task("5", "Homework", "Finish math");
        String expected = "Task{id='5', name='Homework', description='Finish math'}";
        assertEquals(expected, task.toString());
    }

    @Test
    void equals_returnsTrueForSameId() {
        Task task1 = new Task("1", "A", "desc");
        Task task2 = new Task("1", "B", "something else");
        assertEquals(task1, task2);
    }

    @Test
    void equals_returnsFalseForDifferentId() {
        Task task1 = new Task("1", "A", "desc");
        Task task2 = new Task("2", "A", "desc");
        assertNotEquals(task1, task2);
    }

    @Test
    void hashCode_sameForSameId() {
        Task task1 = new Task("100", "A", "desc");
        Task task2 = new Task("100", "B", "another");
        assertEquals(task1.hashCode(), task2.hashCode());
    }
}
