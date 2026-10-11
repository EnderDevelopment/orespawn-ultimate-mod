package com.dd6896195.orespawnultimatemod.dimensions;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;

public class CustomDimension {
    public static final ResourceKey<Level> CUSTOM_DIMENSION = ResourceKey.create(Registry.DIMENSION_REGISTRY, 
        new ResourceLocation("orespawnultimatemod:custom_dimension"));
    
    public static final ResourceKey<DimensionType> CUSTOM_DIMENSION_TYPE = 
        ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY, 
        new ResourceLocation("orespawnultimatemod:custom_dimension_type"));
}