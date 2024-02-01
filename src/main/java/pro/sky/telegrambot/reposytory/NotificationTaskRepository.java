package pro.sky.telegrambot.reposytory;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.telegrambot.entity.NotificationTask;

import java.time.LocalDateTime;
import java.util.List;

public interface NotificationTaskRepository extends JpaRepository<NotificationTask,Long> {
    List<NotificationTask> findAllByExecDate(LocalDateTime localDateTime);
}
