package org.fasttrackit;

import org.fasttrackit.persistance.TaskRepository;
import org.fasttrackit.transfer.UpdateTaskRequest;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException, SQLException {

        TaskRepository taskRepository = new TaskRepository();

        UpdateTaskRequest request = new UpdateTaskRequest();
        request.setDone(true);

        taskRepository.updateTask(2, request);
        taskRepository.deleteTask(3);
    }
}
