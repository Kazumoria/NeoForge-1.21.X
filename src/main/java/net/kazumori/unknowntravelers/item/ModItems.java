package net.kazumori.unknowntravelers.item;

import net.kazumori.unknowntravelers.unknowntravelers;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems
{
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(unknowntravelers.MOD_ID);

    public static final DeferredItem<Item> GEARWINGS = ITEMS.register("gearwings",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
