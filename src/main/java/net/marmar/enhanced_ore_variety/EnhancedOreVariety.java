package net.marmar.enhanced_ore_variety;

import net.fabricmc.api.ModInitializer;
import net.marmar.enhanced_ore_variety.block.EOVBlocks;
import net.marmar.enhanced_ore_variety.util.EOVItemGroups;
import net.marmar.enhanced_ore_variety.worldgen.EOVBiomeModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnhancedOreVariety implements ModInitializer {
    public static final String MOD_ID = "enhanced_ore_variety";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        EOVBlocks.registerModBlocks();
        EOVItemGroups.registerItemGroups();

        EOVBiomeModifiers.InitializeBiomeModifications();
    }
}
