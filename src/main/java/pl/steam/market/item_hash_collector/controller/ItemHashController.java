package pl.steam.market.item_hash_collector.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.steam.market.item_hash_collector.service.ItemHashService;

//TODO Add more descriptive name

@RestController
public class ItemHashController {

    private final ItemHashService service;

    @Autowired
    public ItemHashController(ItemHashService service) {
        this.service = service;
    }

    @PostMapping("/activate")
    void activateCollector() {
        service.runCollection();
    }

}
