package net.marmar.enhanced_ore_variety.util;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.marmar.enhanced_ore_variety.EnhancedOreVariety;
import net.marmar.enhanced_ore_variety.block.EOVBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class EOVItemGroups {

    public static final ItemGroup ENHANCED_ORES = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(EnhancedOreVariety.MOD_ID, "enhanced_ores"),
            FabricItemGroup.builder().displayName(Text.translatable("tab." + EnhancedOreVariety.MOD_ID + "enhanced_ores"))
                    .icon(() -> new ItemStack(EOVBlocks.GRANITE_DIAMOND_ORE)).entries(((context, output) -> {
                        //Diorite
                        output.add(EOVBlocks.DIORITE_COAL_ORE);
                        output.add(EOVBlocks.DIORITE_COPPER_ORE);
                        output.add(EOVBlocks.DIORITE_IRON_ORE);
                        output.add(EOVBlocks.DIORITE_GOLD_ORE);
                        output.add(EOVBlocks.DIORITE_LAPIS_ORE);
                        output.add(EOVBlocks.DIORITE_REDSTONE_ORE);
                        output.add(EOVBlocks.DIORITE_EMERALD_ORE);
                        output.add(EOVBlocks.DIORITE_DIAMOND_ORE);
                        
                        //Andesite
                        output.add(EOVBlocks.ANDESITE_COAL_ORE);
                        output.add(EOVBlocks.ANDESITE_COPPER_ORE);
                        output.add(EOVBlocks.ANDESITE_IRON_ORE);
                        output.add(EOVBlocks.ANDESITE_GOLD_ORE);
                        output.add(EOVBlocks.ANDESITE_LAPIS_ORE);
                        output.add(EOVBlocks.ANDESITE_REDSTONE_ORE);
                        output.add(EOVBlocks.ANDESITE_EMERALD_ORE);
                        output.add(EOVBlocks.ANDESITE_DIAMOND_ORE);
                        
                        //Granite
                        output.add(EOVBlocks.GRANITE_COAL_ORE);
                        output.add(EOVBlocks.GRANITE_COPPER_ORE);
                        output.add(EOVBlocks.GRANITE_IRON_ORE);
                        output.add(EOVBlocks.GRANITE_GOLD_ORE);
                        output.add(EOVBlocks.GRANITE_LAPIS_ORE);
                        output.add(EOVBlocks.GRANITE_REDSTONE_ORE);
                        output.add(EOVBlocks.GRANITE_EMERALD_ORE);
                        output.add(EOVBlocks.GRANITE_DIAMOND_ORE);
                        
                        //Tuff
                        output.add(EOVBlocks.TUFF_COAL_ORE);
                        output.add(EOVBlocks.TUFF_COPPER_ORE);
                        output.add(EOVBlocks.TUFF_IRON_ORE);
                        output.add(EOVBlocks.TUFF_GOLD_ORE);
                        output.add(EOVBlocks.TUFF_LAPIS_ORE);
                        output.add(EOVBlocks.TUFF_REDSTONE_ORE);
                        output.add(EOVBlocks.TUFF_EMERALD_ORE);
                        output.add(EOVBlocks.TUFF_DIAMOND_ORE);
                        
                        //Blackstone
                        output.add(EOVBlocks.BLACKSTONE_COAL_ORE);
                        output.add(EOVBlocks.BLACKSTONE_COPPER_ORE);
                        output.add(EOVBlocks.BLACKSTONE_IRON_ORE);
                        output.add(EOVBlocks.BLACKSTONE_GOLD_ORE);
                        output.add(EOVBlocks.BLACKSTONE_LAPIS_ORE);
                        output.add(EOVBlocks.BLACKSTONE_REDSTONE_ORE);
                        output.add(EOVBlocks.BLACKSTONE_EMERALD_ORE);
                        output.add(EOVBlocks.BLACKSTONE_DIAMOND_ORE);
                    }))
                    .build());

    public static void registerItemGroups() {
        EnhancedOreVariety.LOGGER.info("Registering Item Groups for " + EnhancedOreVariety.MOD_ID);
    }
}
