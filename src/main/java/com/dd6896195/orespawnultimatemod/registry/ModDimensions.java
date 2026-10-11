package com.dd6896195.orespawnultimatemod.registry;

import com.dd6896195.orespawnultimatemod.OreSpawnUltimateMod;
import com.dd6896195.orespawnultimatemod.dimensions.CustomDimension;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModDimensions {
    public static final DeferredRegister<Level> DIMENSIONS = 
        DeferredRegister.create(Registry.LEVEL_REGISTRY, OreSpawnUltimateMod.MOD_ID);
    
    public static final ResourceKey<Level> CUSTOM_DIMENSION = CustomDimension.CUSTOM_DIMENSION;
    
    public static void register(IEventBus eventBus) {
        DIMENSIONS.register(eventBus);
    }
}