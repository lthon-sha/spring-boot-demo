package demo.spring_boot_demo.services;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class QuerierService {
    @Scheduled(fixedRate = 3000) // 每3秒执行一次
    public void scheduledTask() {
        System.out.println("This message is printed every 3 seconds");
    }
}