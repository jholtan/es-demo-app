package no.toll.esdemoapp.todo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/todo")
public class TodoController {
  @ResponseStatus(HttpStatus.OK)
  @GetMapping
  public List<Todo> getAllTodos() {
    Todo todo = new Todo();
    todo.setId(UUID.randomUUID().toString());
    todo.setTitle("An item");
    todo.setDone(false);
    return List.of(todo);
  }
}
