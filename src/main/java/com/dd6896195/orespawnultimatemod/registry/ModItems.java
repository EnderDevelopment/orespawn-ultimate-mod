package com.dd6896195.orespawnultimatemod.registry;

import com.dd6896195.orespawnultimatemod.OreSpawnUltimateMod;
import com.dd6896195.orespawnultimatemod.items.CustomSwordItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = 
        DeferredRegister.create(ForgeRegistries.ITEMS, OreSpawnUltimateMod.MOD_ID);
    
    public static final RegistryObject<Item> CUSTOM_SWORD = ITEMS.register(
        "custom_sword", 
        CustomSwordItem::new
    );
    
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}