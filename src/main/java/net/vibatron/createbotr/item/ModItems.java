package net.vibatron.createbotr.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.vibatron.createbotr.CreateBotr;
import net.vibatron.createbotr.item.custom.LogicCircuitItem;

import java.awt.*;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateBotr.MOD_ID);

    public static final DeferredItem<Item> ROSE_GOLD = ITEMS.register("rose_gold",
            () -> new  Item(new Item.Properties()));

    public static final DeferredItem<Item> LOGIC_CIRCUIT = ITEMS.register("logic_circuit",
            () -> new LogicCircuitItem(new Item.Properties()));

    public static final DeferredItem<Item> PACK_ICON = ITEMS.register("createbotr_pack_icon",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MOLTEN_ROSE_GOLD_BUCKET = ITEMS.register("molten_rose_gold_bucket",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
