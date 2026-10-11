package com.dd6896195.orespawnultimatemod.registry;

import com.dd6896195.orespawnultimatemod.OreSpawnUltimateMod;
import com.dd6896195.orespawnultimatemod.entities.CustomEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = 
        DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, OreSpawnUltimateMod.MOD_ID);
    
    public static final RegistryObject<EntityType<CustomEntity>> CUSTOM_ENTITY = ENTITIES.register(
        "custom_entity", 
        () -> EntityType.Builder.of(CustomEntity::new, MobCategory.CREATURE)
            .sized(0.6f, 1.8f)
            .build("custom_entity")
    );
    
    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }
}