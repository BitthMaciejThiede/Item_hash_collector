package pl.steam.market.item_hash_collector.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.steam.market.item_hash_collector.client.model.ItemListSteamMarket;
import pl.steam.market.item_hash_collector.client.model.ItemDetailsSteamMarket;



@Component
public class ItemListClient {

    private static final String LIST_OF_ITEMS_URL = "";
    private static final String ITEM_DETAILS_URL = "";

    private final RestTemplate restTemplate;

    @Autowired
    public ItemListClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ItemListSteamMarket listSteamMarketItems(int numberOfPage) {
        //restTemplate.getForObject()


        return new ItemListSteamMarket();
    }

    public ItemDetailsSteamMarket getItemDetails() {

        return new ItemDetailsSteamMarket();
    }
}
