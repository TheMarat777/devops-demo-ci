package via.doc1.devopsdemo.service;

import org.junit.jupiter.api.Test;
import via.doc1.devopsdemo.model.Task;
import via.doc1.devopsdemo.model.TeamMember;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TeamServiceTest {

    TeamService service = new TeamService();

    @Test
    void getTeamMember_shouldReturnCorrectMember() {
        TeamMember member = service.getTeamMember("Member1");
        assertNotNull(member);
        assertEquals("Chase", member.getName());
    }

    @Test
    void getTeamMember_shouldReturnNull_whenNotFound() {
        TeamMember member = service.getTeamMember("WrongId");
        assertNull(member);
    }

    @Test
    void getTasks_shouldReturnTasksForValidMember() {
        List<Task> tasks = service.getTasks("Member2");
        assertNotNull(tasks);
        assertEquals(3, tasks.size());
    }

    @Test
    void getTasks_shouldReturnNull_whenMemberNotFound() {
        List<Task> tasks = service.getTasks("NotExist");
        assertNull(tasks);
    }

    @Test
    void getTask_shouldReturnCorrectTask() {
        Task task = service.getTask("Member1", "Task1");
        assertNotNull(task);
        assertEquals("IoT Pipeline", task.getName());
    }

    @Test
    void getTask_shouldReturnNull_whenTaskNotFound() {
        Task task = service.getTask("Member1", "WrongTask");
        assertNull(task);
    }

    @Test
    void getTask_shouldReturnNull_whenMemberNotFound() {
        Task task = service.getTask("NoMember", "Task1");
        assertNull(task);
    }
}
