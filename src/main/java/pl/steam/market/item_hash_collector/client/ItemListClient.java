package pl.steam.market.item_hash_collector.client;

import org.springframework.stereotype.Component;
import pl.steam.market.item_hash_collector.client.model.ItemListSteamMarket;
import pl.steam.market.item_hash_collector.client.model.ItemDetailsSteamMarket;



@Component
public class ItemListClient {

    private static final String LIST_OF_ITEMS_URL = "";
    private static final String ITEM_DETAILS_URL = "";

    public ItemListSteamMarket listSteamMarketItems(int numberOfPage) {



        return new ItemListSteamMarket();
    }

    public ItemDetailsSteamMarket getItemDetails() {

        return new ItemDetailsSteamMarket();
    }
}
