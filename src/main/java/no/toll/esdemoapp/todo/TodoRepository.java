package no.toll.esdemoapp.todo;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TodoRepository extends ElasticsearchRepository<Todo, String> {
}
