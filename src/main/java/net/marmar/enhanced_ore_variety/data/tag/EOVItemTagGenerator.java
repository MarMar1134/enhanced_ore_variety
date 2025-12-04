package net.marmar.enhanced_ore_variety.data.tag;

import net.marmar.enhanced_ore_variety.EnhancedOreVariety;
import net.marmar.enhanced_ore_variety.block.EOVBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class EOVItemTagGenerator extends ItemTagsProvider {
    public EOVItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> lookupProviderBlocks, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, lookupProvider, lookupProviderBlocks, EnhancedOreVariety.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ItemTags.COAL_ORES).add(
                EOVBlocks.DIORITE_COAL_ORE.get().asItem(),
                EOVBlocks.ANDESITE_COAL_ORE.get().asItem(),
                EOVBlocks.GRANITE_COAL_ORE.get().asItem(),
                EOVBlocks.TUFF_COAL_ORE.get().asItem(),
                EOVBlocks.BLACKSTONE_COAL_ORE.get().asItem()
        );

        this.tag(ItemTags.COPPER_ORES).add(
                EOVBlocks.DIORITE_COPPER_ORE.get().asItem(),
                EOVBlocks.ANDESITE_COPPER_ORE.get().asItem(),
                EOVBlocks.GRANITE_COPPER_ORE.get().asItem(),
                EOVBlocks.TUFF_COPPER_ORE.get().asItem(),
                EOVBlocks.BLACKSTONE_COPPER_ORE.get().asItem()
        );

        this.tag(ItemTags.IRON_ORES).add(
                EOVBlocks.DIORITE_IRON_ORE.get().asItem(),
                EOVBlocks.ANDESITE_IRON_ORE.get().asItem(),
                EOVBlocks.GRANITE_IRON_ORE.get().asItem(),
                EOVBlocks.TUFF_IRON_ORE.get().asItem(),
                EOVBlocks.BLACKSTONE_IRON_ORE.get().asItem()
        );

        this.tag(ItemTags.GOLD_ORES).add(
                EOVBlocks.DIORITE_GOLD_ORE.get().asItem(),
                EOVBlocks.ANDESITE_GOLD_ORE.get().asItem(),
                EOVBlocks.GRANITE_GOLD_ORE.get().asItem(),
                EOVBlocks.TUFF_GOLD_ORE.get().asItem(),
                EOVBlocks.BLACKSTONE_GOLD_ORE.get().asItem()
        );

        this.tag(EOVTags.Items.QUARTZ_ORES).add(
                Items.NETHER_QUARTZ_ORE,
                EOVBlocks.BLACKSTONE_QUARTZ_ORE.get().asItem()
        );

        this.tag(ItemTags.LAPIS_ORES).add(
                EOVBlocks.DIORITE_LAPIS_ORE.get().asItem(),
                EOVBlocks.ANDESITE_LAPIS_ORE.get().asItem(),
                EOVBlocks.GRANITE_LAPIS_ORE.get().asItem(),
                EOVBlocks.TUFF_LAPIS_ORE.get().asItem(),
                EOVBlocks.BLACKSTONE_LAPIS_ORE.get().asItem()
        );

        this.tag(ItemTags.REDSTONE_ORES).add(
                EOVBlocks.DIORITE_REDSTONE_ORE.get().asItem(),
                EOVBlocks.ANDESITE_REDSTONE_ORE.get().asItem(),
                EOVBlocks.GRANITE_REDSTONE_ORE.get().asItem(),
                EOVBlocks.TUFF_REDSTONE_ORE.get().asItem(),
                EOVBlocks.BLACKSTONE_REDSTONE_ORE.get().asItem()
        );

        this.tag(ItemTags.EMERALD_ORES).add(
                EOVBlocks.DIORITE_EMERALD_ORE.get().asItem(),
                EOVBlocks.ANDESITE_EMERALD_ORE.get().asItem(),
                EOVBlocks.GRANITE_EMERALD_ORE.get().asItem(),
                EOVBlocks.TUFF_EMERALD_ORE.get().asItem(),
                EOVBlocks.BLACKSTONE_EMERALD_ORE.get().asItem()
        );

        this.tag(ItemTags.DIAMOND_ORES).add(
                EOVBlocks.DIORITE_DIAMOND_ORE.get().asItem(),
                EOVBlocks.ANDESITE_DIAMOND_ORE.get().asItem(),
                EOVBlocks.GRANITE_DIAMOND_ORE.get().asItem(),
                EOVBlocks.TUFF_DIAMOND_ORE.get().asItem(),
                EOVBlocks.BLACKSTONE_DIAMOND_ORE.get().asItem()
        );
    }
}
