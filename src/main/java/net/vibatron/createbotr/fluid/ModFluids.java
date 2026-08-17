package net.vibatron.createbotr.fluid;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.vibatron.createbotr.CreateBotr;
import net.vibatron.createbotr.item.ModItems;
import org.joml.Vector3f;
import net.minecraft.resources.ResourceLocation;

public class ModFluids {

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(
                    NeoForgeRegistries.FLUID_TYPES,
                    CreateBotr.MOD_ID
            );

    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(
                    BuiltInRegistries.FLUID,
                    CreateBotr.MOD_ID
            );


    public static final DeferredHolder<FluidType, BaseFluidType> MOLTEN_ROSE_GOLD_TYPE =
            FLUID_TYPES.register("molten_rose_gold", () ->
                    new BaseFluidType(
                            ResourceLocation.fromNamespaceAndPath(
                                    CreateBotr.MOD_ID,
                                    "block/molten_rose_gold_still"
                            ),
                            ResourceLocation.fromNamespaceAndPath(
                                    CreateBotr.MOD_ID,
                                    "block/molten_rose_gold_flow"
                            ),
                            ResourceLocation.fromNamespaceAndPath(
                                    CreateBotr.MOD_ID,
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


    public static final DeferredHolder<Fluid, FlowingFluid> MOLTEN_ROSE_GOLD =
            FLUIDS.register(
                    "molten_rose_gold",
                    MoltenRoseGoldFluid.Source::new
            );


    public static final DeferredHolder<Fluid, FlowingFluid> MOLTEN_ROSE_GOLD_FLOWING =
            FLUIDS.register(
                    "molten_rose_gold_flowing",
                    MoltenRoseGoldFluid.Flowing::new
            );


    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
        FLUIDS.register(eventBus);
    }
}