package via.doc1.devopsdemo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.ArrayList;

import via.doc1.devopsdemo.model.Task;
import via.doc1.devopsdemo.model.TeamMember;

public class TeamMemberTest {

    @Test
    void constructor_setsAllFieldsCorrectly() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("1", "Code", "Write unit tests"));

        TeamMember member = new TeamMember("10", "Marat", "marat@email.com", tasks);

        assertEquals("10", member.getId());
        assertEquals("Marat", member.getName());
        assertEquals("marat@email.com", member.getEmail());
        assertEquals(1, member.getTasks().size());
    }

    @Test
    void settersAndGetters_workCorrectly() {
        TeamMember member = new TeamMember("10", "", "", null);

        member.setName("Patrik");
        member.setEmail("patrik@email.com");
        member.setId("42");

        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("2", "Cook", "Make dinner"));
        member.setTasks(tasks);

        assertEquals("Patrik", member.getName());
        assertEquals("patrik@email.com", member.getEmail());
        assertEquals("42", member.getId());
        assertEquals(1, member.getTasks().size());
    }

    @Test
    void toString_containsAllFields() {
        TeamMember member = new TeamMember("7", "Tomas", "tomas@mail.com", new ArrayList<>());

        String result = member.toString();

        assertTrue(result.contains("Tomas"));
        assertTrue(result.contains("tomas@mail.com"));
        assertTrue(result.contains("7"));
    }
}
