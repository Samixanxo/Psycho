package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Task;
import service.TaskService;

@RestController
@RequestMapping("/api")
public class TaskController {

	
	@Autowired
	TaskService taskService;
	
	@GetMapping(value ="tasks/{idUser}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Task>retrieveTasks(@PathVariable("idUser") Integer idUser)
	{
		return taskService.retrieveTasks(idUser);
	}
}
