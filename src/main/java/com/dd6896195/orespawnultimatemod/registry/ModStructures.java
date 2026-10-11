package com.dd6896195.orespawnultimatemod.registry;

import com.dd6896195.orespawnultimatemod.OreSpawnUltimateMod;
import com.dd6896195.orespawnultimatemod.structures.CustomStructure;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModStructures {
    public static final DeferredRegister<Structure> STRUCTURES = 
        DeferredRegister.create(ForgeRegistries.STRUCTURES, OreSpawnUltimateMod.MOD_ID);
    
    public static final RegistryObject<Structure> CUSTOM_STRUCTURE = STRUCTURES.register(
        "custom_structure", 
        () -> new CustomStructure(
            Structure.StructureSettings.DEFAULTS
        )
    );
    
    public static void register(IEventBus eventBus) {
        STRUCTURES.register(eventBus);
    }
}