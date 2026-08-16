package net.vibatron.createbotr.fluid;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.fluids.FluidType;
import org.joml.Vector3f;

public class BaseFluidType extends FluidType {
    private final ResourceLocation stillTexture;
    private final ResourceLocation flowingTexture;
    private final ResourceLocation overlayTexture;
    private final int tintColor;
    private final Vector3f fogColor;

    public BaseFluidType(final ResourceLocation stillTexture, final ResourceLocation flowingTexture, final ResourceLocation overlayTexture,
                         final int tintColor, final Vector3f fogColor, final Properties properties, ResourceLocation stillTexture1, ResourceLocation flowingTexture1, ResourceLocation overlayTexture1, int tintColor1, Vector3f fogColor1) {

        super(properties);
        this.stillTexture = stillTexture1;
        this.flowingTexture = flowingTexture1;
        this.overlayTexture = overlayTexture1;
        this.tintColor = tintColor1;
        this.fogColor = fogColor1;
    }
}
