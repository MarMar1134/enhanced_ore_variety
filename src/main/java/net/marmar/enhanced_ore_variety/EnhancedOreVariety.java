package net.marmar.enhanced_ore_variety;

import net.marmar.enhanced_ore_variety.block.EOVBlocks;
import net.marmar.enhanced_ore_variety.data.AddToVanillaTabs;
import net.marmar.enhanced_ore_variety.data.DataGenerators;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(EnhancedOreVariety.MOD_ID)
@SuppressWarnings("deprecated")
public class EnhancedOreVariety {
    public static final String MOD_ID = "enhanced_ore_variety";

    public EnhancedOreVariety() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        EOVBlocks.register(modEventBus);
    }
}
