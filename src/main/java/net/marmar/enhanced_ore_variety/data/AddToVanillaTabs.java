package net.marmar.enhanced_ore_variety.data;

import net.marmar.enhanced_ore_variety.block.EOVBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

public class AddToVanillaTabs {
    public static void addItemsAndBlocks(BuildCreativeModeTabContentsEvent event){
        if (event.getTabKey().equals(CreativeModeTabs.NATURAL_BLOCKS)){
            //Coal
            event.getEntries().putAfter(Items.COAL_ORE.getDefaultInstance(), EOVBlocks.GRANITE_COAL_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(EOVBlocks.GRANITE_COAL_ORE.get().asItem().getDefaultInstance(), EOVBlocks.DIORITE_COAL_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(EOVBlocks.DIORITE_COAL_ORE.get().asItem().getDefaultInstance(), EOVBlocks.ANDESITE_COAL_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.DEEPSLATE_COAL_ORE.getDefaultInstance(), EOVBlocks.TUFF_COAL_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            //Copper
            event.getEntries().putAfter(Items.COPPER_ORE.getDefaultInstance(), EOVBlocks.GRANITE_COPPER_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(EOVBlocks.GRANITE_COPPER_ORE.get().asItem().getDefaultInstance(), EOVBlocks.DIORITE_COPPER_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(EOVBlocks.DIORITE_COPPER_ORE.get().asItem().getDefaultInstance(), EOVBlocks.ANDESITE_COPPER_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.DEEPSLATE_COPPER_ORE.getDefaultInstance(), EOVBlocks.TUFF_COPPER_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            //Iron
            event.getEntries().putAfter(Items.IRON_ORE.getDefaultInstance(), EOVBlocks.GRANITE_IRON_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(EOVBlocks.GRANITE_IRON_ORE.get().asItem().getDefaultInstance(), EOVBlocks.DIORITE_IRON_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(EOVBlocks.DIORITE_IRON_ORE.get().asItem().getDefaultInstance(), EOVBlocks.ANDESITE_IRON_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.DEEPSLATE_IRON_ORE.getDefaultInstance(), EOVBlocks.TUFF_IRON_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            //Gold
            event.getEntries().putAfter(Items.GOLD_ORE.getDefaultInstance(), EOVBlocks.GRANITE_GOLD_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(EOVBlocks.GRANITE_GOLD_ORE.get().asItem().getDefaultInstance(), EOVBlocks.DIORITE_GOLD_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(EOVBlocks.DIORITE_GOLD_ORE.get().asItem().getDefaultInstance(), EOVBlocks.ANDESITE_GOLD_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.DEEPSLATE_GOLD_ORE.getDefaultInstance(), EOVBlocks.TUFF_GOLD_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            //Lapis
            event.getEntries().putAfter(Items.LAPIS_ORE.getDefaultInstance(), EOVBlocks.GRANITE_LAPIS_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(EOVBlocks.GRANITE_LAPIS_ORE.get().asItem().getDefaultInstance(), EOVBlocks.DIORITE_LAPIS_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(EOVBlocks.DIORITE_LAPIS_ORE.get().asItem().getDefaultInstance(), EOVBlocks.ANDESITE_LAPIS_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.DEEPSLATE_LAPIS_ORE.getDefaultInstance(), EOVBlocks.TUFF_LAPIS_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            //Redstone
            event.getEntries().putAfter(Items.REDSTONE_ORE.getDefaultInstance(), EOVBlocks.GRANITE_REDSTONE_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(EOVBlocks.GRANITE_REDSTONE_ORE.get().asItem().getDefaultInstance(), EOVBlocks.DIORITE_REDSTONE_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(EOVBlocks.DIORITE_REDSTONE_ORE.get().asItem().getDefaultInstance(), EOVBlocks.ANDESITE_REDSTONE_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.DEEPSLATE_REDSTONE_ORE.getDefaultInstance(), EOVBlocks.TUFF_REDSTONE_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            //Emerald
            event.getEntries().putAfter(Items.EMERALD_ORE.getDefaultInstance(), EOVBlocks.GRANITE_EMERALD_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(EOVBlocks.GRANITE_EMERALD_ORE.get().asItem().getDefaultInstance(), EOVBlocks.DIORITE_EMERALD_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(EOVBlocks.DIORITE_EMERALD_ORE.get().asItem().getDefaultInstance(), EOVBlocks.ANDESITE_EMERALD_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.DEEPSLATE_EMERALD_ORE.getDefaultInstance(), EOVBlocks.TUFF_EMERALD_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            //Diamond
            event.getEntries().putAfter(Items.DIAMOND_ORE.getDefaultInstance(), EOVBlocks.GRANITE_DIAMOND_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(EOVBlocks.GRANITE_DIAMOND_ORE.get().asItem().getDefaultInstance(), EOVBlocks.DIORITE_DIAMOND_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(EOVBlocks.DIORITE_DIAMOND_ORE.get().asItem().getDefaultInstance(), EOVBlocks.ANDESITE_DIAMOND_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.DEEPSLATE_DIAMOND_ORE.getDefaultInstance(), EOVBlocks.TUFF_DIAMOND_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }
}
