package net.vibatron.createbotr.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.vibatron.createbotr.CreateBotr;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateBotr.MOD_ID);

    public static final DeferredItem<Item> ROSE_GOLD = ITEMS.register("rose_gold",
            () -> new  Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
