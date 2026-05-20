package net.marmar.enhanced_ore_variety.data.tag;

import net.minecraft.resources.Identifier;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class EOVTags {
    public static class Items {
        public static final TagKey<Item> QUARTZ_ORES = itemTag("quartz_ores");

        private static TagKey<Item> itemTag(String pName){
            return ItemTags.create(Identifier.fromNamespaceAndPath("neoforge", pName));
        }
    }
}
