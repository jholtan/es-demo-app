package no.toll.esdemoapp;

import no.toll.esdemoapp.todo.Todo;
import no.toll.esdemoapp.todo.TodoController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class EsDemoAppApplicationTests {

	@Autowired
	private TodoController controller;

	@Test
	void contextLoads() {
	}

	@Test
	void getTodos() {
		List<Todo> allTodos = controller.getAllTodos();
		assertNotNull(allTodos);
	}

	@Test
	void createTodo() {
		Todo todo = new Todo();
		String id = UUID.randomUUID().toString();
		todo.setId(id);
		todo.setTitle("Test item");
		todo.setDone(false);

		controller.createNewBook(todo);

		Todo readTodo = controller.getTodoById(id);
		assertEquals(todo.getTitle(), readTodo.getTitle());
	}
}
