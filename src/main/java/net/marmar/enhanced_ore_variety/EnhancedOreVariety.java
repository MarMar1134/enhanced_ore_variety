package net.marmar.enhanced_ore_variety;

import net.marmar.enhanced_ore_variety.block.EOVBlocks;
import net.marmar.enhanced_ore_variety.data.EOVTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@Mod(EnhancedOreVariety.MOD_ID)
public class EnhancedOreVariety {
    public static final String MOD_ID = "enhanced_ore_variety";

    public EnhancedOreVariety(IEventBus modEventBus) {
        EOVBlocks.register(modEventBus);
        EOVTabs.register(modEventBus);
    }
}
