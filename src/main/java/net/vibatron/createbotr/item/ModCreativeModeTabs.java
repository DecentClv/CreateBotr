package net.vibatron.createbotr.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.vibatron.createbotr.CreateBotr;
import net.vibatron.createbotr.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB_DEFERRED_REGISTER =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateBotr.MOD_ID);

    public static final Supplier<CreativeModeTab> CREATE_BOTR_TAB = CREATIVE_MODE_TAB_DEFERRED_REGISTER.register("create_botr_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ROSE_GOLD.get()))
                    .title(Component.translatable("creativetab.createbotr.create_botr_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ROSE_GOLD);
                        output.accept(ModBlocks.ROSE_GOLD_BLOCK);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB_DEFERRED_REGISTER.register(eventBus);
    }

}
