package com.dd6896195.orespawnultimatemod.registry;

import com.dd6896195.orespawnultimatemod.OreSpawnUltimateMod;
import com.dd6896195.orespawnultimatemod.spells.CustomSpell;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

public class ModSpells {
    public static final DeferredRegister<CustomSpell> SPELLS = 
        DeferredRegister.create((IForgeRegistry<CustomSpell>) null, OreSpawnUltimateMod.MOD_ID);
    
    public static final RegistryObject<CustomSpell> CUSTOM_SPELL = SPELLS.register(
        "custom_spell", 
        CustomSpell::new
    );
    
    public static void register(IEventBus eventBus) {
        SPELLS.register(eventBus);
    }
}