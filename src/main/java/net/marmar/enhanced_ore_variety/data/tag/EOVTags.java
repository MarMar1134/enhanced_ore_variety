package net.marmar.enhanced_ore_variety.data.tag;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class EOVTags {
    public static class Items {
        public static final TagKey<Item> QUARTZ_ORES = itemTag("quartz_ores");

        private static TagKey<Item> itemTag(String pName){
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", pName));
        }
    }

    public static class Blocks {
        //Enhanced Playthrough tags
        public static final TagKey<Block> NEEDS_BRONZE_TOOL = epTag("needs_bronze_tool");
        public static final TagKey<Block> NEEDS_STEEL_TOOL = epTag("needs_steel_tool");

        private static TagKey<Block> epTag(String pName){
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath("enhanced_playthrough", pName));
        }
    }
}
