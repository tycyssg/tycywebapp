package nastycraft.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;


import nastycraft.dao.TaskRepository;
import nastycraft.model.Task;

@Service
@Transactional
public class TaskService {
	
		private final TaskRepository taskRepository;

		public TaskService(TaskRepository taskRepository) {
			this.taskRepository = taskRepository;
		}
		
		public List<Task> findAll(){
			List<Task> tasks = new ArrayList<>();
			for(Task task : taskRepository.findAll()) {
				tasks.add(task);
			}
			
			return tasks;
		}
		
		public void save(Task task) {
			taskRepository.save(task);
		}
		
		public void delete(int id) {
			taskRepository.delete(id);
		}
		
		
		
		
		
}
