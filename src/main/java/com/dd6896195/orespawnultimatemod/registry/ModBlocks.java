package com.dd6896195.orespawnultimatemod.registry;

import com.dd6896195.orespawnultimatemod.OreSpawnUltimateMod;
import com.dd6896195.orespawnultimatemod.blocks.CustomBlock;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = 
        DeferredRegister.create(ForgeRegistries.BLOCKS, OreSpawnUltimateMod.MOD_ID);
    
    public static final RegistryObject<Block> CUSTOM_BLOCK = BLOCKS.register(
        "custom_block", 
        CustomBlock::new
    );
    
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}