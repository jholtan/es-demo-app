package no.toll.esdemoapp;

import no.toll.esdemoapp.todo.Todo;
import no.toll.esdemoapp.todo.TodoController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import java.util.List;

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

	}
}
