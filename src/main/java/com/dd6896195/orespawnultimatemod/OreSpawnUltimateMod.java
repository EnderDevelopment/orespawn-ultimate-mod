package com.dd6896195.orespawnultimatemod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod("orespawnultimatemod")
public class OreSpawnUltimateMod {
    public static final String MOD_ID = "orespawnultimatemod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public OreSpawnUltimateMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register deferred registers
        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModEntities.register(modEventBus);
        ModDimensions.register(modEventBus);
        ModStructures.register(modEventBus);
        ModSpells.register(modEventBus);

        // Register event handlers
        MinecraftForge.EVENT_BUS.register(this);

        LOGGER.info("OreSpawnUltimateMod has been initialized!");
    }
}