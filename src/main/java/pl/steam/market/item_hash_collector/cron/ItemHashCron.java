package pl.steam.market.item_hash_collector.cron;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//TODO Add more descriptive name

@Component
@EnableScheduling
public class ItemHashCron {


    @Scheduled(cron = "0 22 * * *")
    void scheduled() {

    }
}
