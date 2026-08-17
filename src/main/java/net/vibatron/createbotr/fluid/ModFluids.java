package net.vibatron.createbotr.fluid;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import org.joml.Vector3f;
import net.minecraft.resources.ResourceLocation;

public class ModFluids {

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(
                    NeoForgeRegistries.FLUID_TYPES,
                    "createbotr"
            );

    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(
                    BuiltInRegistries.FLUID,
                    "createbotr"
            );

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(
                    BuiltInRegistries.ITEM,
                    "createbotr"
            );


    public static final DeferredHolder<FluidType, BaseFluidType> MOLTEN_ROSE_GOLD_TYPE =
            FLUID_TYPES.register("molten_rose_gold", () ->
                    new BaseFluidType(
                            ResourceLocation.fromNamespaceAndPath(
                                    "createbotr",
                                    "block/molten_rose_gold_still"
                            ),

                            ResourceLocation.fromNamespaceAndPath(
                                    "createbotr",
                                    "block/molten_rose_gold_flow"
                            ),

                            ResourceLocation.fromNamespaceAndPath(
                                    "createbotr",
                                    "block/molten_rose_gold_overlay"
                            ),

                            0xFFFFFFFF,

                            new Vector3f(
                                    1.0F,
                                    0.35F,
                                    0.15F
                            ),

                            FluidType.Properties.create()
                                    .density(3000)
                                    .viscosity(6000)
                                    .temperature(1300)
                                    .lightLevel(15)
                    )
            );

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
        FLUIDS.register(eventBus);
        ITEMS.register(eventBus);
    }
}