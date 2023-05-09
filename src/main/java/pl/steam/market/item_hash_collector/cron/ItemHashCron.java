package pl.steam.market.item_hash_collector.cron;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import pl.steam.market.item_hash_collector.service.ItemHashService;

//TODO Add more descriptive name
@Component
@EnableScheduling
public class ItemHashCron {

    private final ItemHashService service;

    @Autowired
    public ItemHashCron(ItemHashService service) {
        this.service = service;
    }

    @Scheduled(cron = "0 22 * * *")
    void scheduled() {
        service.runCollection();
    }
}
