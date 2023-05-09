package pl.steam.market.item_hash_collector.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.steam.market.item_hash_collector.client.ItemSteamMarketClient;
import pl.steam.market.item_hash_collector.client.model.ItemListSteamMarket;

//TODO Add more descriptive name

@Service
public class ItemHashService {

    private final ItemSteamMarketClient client;

    @Autowired
    public ItemHashService(ItemSteamMarketClient client) {
        this.client = client;
    }

    public void runCollection() {
        boolean isActive = true;

        ItemListSteamMarket list = client.listSteamMarketItems(0);

        //while(isActive){

        //}
    }
}
