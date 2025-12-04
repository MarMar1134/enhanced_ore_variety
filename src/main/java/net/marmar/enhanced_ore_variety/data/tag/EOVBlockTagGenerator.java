package net.marmar.enhanced_ore_variety.data.tag;

import net.marmar.enhanced_ore_variety.EnhancedOreVariety;
import net.marmar.enhanced_ore_variety.block.EOVBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class EOVBlockTagGenerator extends BlockTagsProvider {
    public EOVBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, EnhancedOreVariety.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.COAL_ORES).add(
                EOVBlocks.DIORITE_COAL_ORE.get(),
                EOVBlocks.ANDESITE_COAL_ORE.get(),
                EOVBlocks.GRANITE_COAL_ORE.get(),
                EOVBlocks.TUFF_COAL_ORE.get(),
                EOVBlocks.BLACKSTONE_COAL_ORE.get()
        );

        this.tag(BlockTags.COPPER_ORES).add(
                EOVBlocks.DIORITE_COPPER_ORE.get(),
                EOVBlocks.ANDESITE_COPPER_ORE.get(),
                EOVBlocks.GRANITE_COPPER_ORE.get(),
                EOVBlocks.TUFF_COPPER_ORE.get(),
                EOVBlocks.BLACKSTONE_COPPER_ORE.get()
        );

        this.tag(BlockTags.IRON_ORES).add(
                EOVBlocks.DIORITE_IRON_ORE.get(),
                EOVBlocks.ANDESITE_IRON_ORE.get(),
                EOVBlocks.GRANITE_IRON_ORE.get(),
                EOVBlocks.TUFF_IRON_ORE.get(),
                EOVBlocks.BLACKSTONE_IRON_ORE.get()
        );

        this.tag(BlockTags.GOLD_ORES).add(
                EOVBlocks.DIORITE_GOLD_ORE.get(),
                EOVBlocks.ANDESITE_GOLD_ORE.get(),
                EOVBlocks.GRANITE_GOLD_ORE.get(),
                EOVBlocks.TUFF_GOLD_ORE.get(),
                EOVBlocks.BLACKSTONE_GOLD_ORE.get()
        );

        this.tag(BlockTags.LAPIS_ORES).add(
                EOVBlocks.DIORITE_LAPIS_ORE.get(),
                EOVBlocks.ANDESITE_LAPIS_ORE.get(),
                EOVBlocks.GRANITE_LAPIS_ORE.get(),
                EOVBlocks.TUFF_LAPIS_ORE.get(),
                EOVBlocks.BLACKSTONE_LAPIS_ORE.get()
        );

        this.tag(BlockTags.REDSTONE_ORES).add(
                EOVBlocks.DIORITE_REDSTONE_ORE.get(),
                EOVBlocks.ANDESITE_REDSTONE_ORE.get(),
                EOVBlocks.GRANITE_REDSTONE_ORE.get(),
                EOVBlocks.TUFF_REDSTONE_ORE.get(),
                EOVBlocks.BLACKSTONE_REDSTONE_ORE.get()
        );

        this.tag(BlockTags.EMERALD_ORES).add(
                EOVBlocks.DIORITE_EMERALD_ORE.get(),
                EOVBlocks.ANDESITE_EMERALD_ORE.get(),
                EOVBlocks.GRANITE_EMERALD_ORE.get(),
                EOVBlocks.TUFF_EMERALD_ORE.get(),
                EOVBlocks.BLACKSTONE_EMERALD_ORE.get()
        );

        this.tag(BlockTags.DIAMOND_ORES).add(
                EOVBlocks.DIORITE_DIAMOND_ORE.get(),
                EOVBlocks.ANDESITE_DIAMOND_ORE.get(),
                EOVBlocks.GRANITE_DIAMOND_ORE.get(),
                EOVBlocks.TUFF_DIAMOND_ORE.get(),
                EOVBlocks.BLACKSTONE_DIAMOND_ORE.get()
        );

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                EOVBlocks.DIORITE_COAL_ORE.get(),
                EOVBlocks.DIORITE_COPPER_ORE.get(),
                EOVBlocks.DIORITE_IRON_ORE.get(),
                EOVBlocks.DIORITE_GOLD_ORE.get(),
                EOVBlocks.DIORITE_LAPIS_ORE.get(),
                EOVBlocks.DIORITE_REDSTONE_ORE.get(),
                EOVBlocks.DIORITE_EMERALD_ORE.get(),
                EOVBlocks.DIORITE_DIAMOND_ORE.get(),

                EOVBlocks.ANDESITE_COAL_ORE.get(),
                EOVBlocks.ANDESITE_COPPER_ORE.get(),
                EOVBlocks.ANDESITE_IRON_ORE.get(),
                EOVBlocks.ANDESITE_GOLD_ORE.get(),
                EOVBlocks.ANDESITE_LAPIS_ORE.get(),
                EOVBlocks.ANDESITE_REDSTONE_ORE.get(),
                EOVBlocks.ANDESITE_EMERALD_ORE.get(),
                EOVBlocks.ANDESITE_DIAMOND_ORE.get(),

                EOVBlocks.GRANITE_COAL_ORE.get(),
                EOVBlocks.GRANITE_COPPER_ORE.get(),
                EOVBlocks.GRANITE_IRON_ORE.get(),
                EOVBlocks.GRANITE_GOLD_ORE.get(),
                EOVBlocks.GRANITE_LAPIS_ORE.get(),
                EOVBlocks.GRANITE_REDSTONE_ORE.get(),
                EOVBlocks.GRANITE_EMERALD_ORE.get(),
                EOVBlocks.GRANITE_DIAMOND_ORE.get(),

                EOVBlocks.TUFF_COAL_ORE.get(),
                EOVBlocks.TUFF_COPPER_ORE.get(),
                EOVBlocks.TUFF_IRON_ORE.get(),
                EOVBlocks.TUFF_GOLD_ORE.get(),
                EOVBlocks.TUFF_LAPIS_ORE.get(),
                EOVBlocks.TUFF_REDSTONE_ORE.get(),
                EOVBlocks.TUFF_EMERALD_ORE.get(),
                EOVBlocks.TUFF_DIAMOND_ORE.get(),

                EOVBlocks.BLACKSTONE_COAL_ORE.get(),
                EOVBlocks.BLACKSTONE_COPPER_ORE.get(),
                EOVBlocks.BLACKSTONE_IRON_ORE.get(),
                EOVBlocks.BLACKSTONE_GOLD_ORE.get(),
                EOVBlocks.BLACKSTONE_LAPIS_ORE.get(),
                EOVBlocks.BLACKSTONE_REDSTONE_ORE.get(),
                EOVBlocks.BLACKSTONE_EMERALD_ORE.get(),
                EOVBlocks.BLACKSTONE_DIAMOND_ORE.get(),
                EOVBlocks.BLACKSTONE_QUARTZ_ORE.get()
        );

        this.tag(Tags.Blocks.NEEDS_WOOD_TOOL).add(
                EOVBlocks.DIORITE_COAL_ORE.get(),
                EOVBlocks.ANDESITE_COAL_ORE.get(),
                EOVBlocks.GRANITE_COAL_ORE.get(),
                EOVBlocks.TUFF_COAL_ORE.get(),
                EOVBlocks.BLACKSTONE_COAL_ORE.get(),

                EOVBlocks.BLACKSTONE_QUARTZ_ORE.get()
        );

        this.tag(BlockTags.NEEDS_STONE_TOOL).add(
                EOVBlocks.DIORITE_COPPER_ORE.get(),
                EOVBlocks.ANDESITE_COPPER_ORE.get(),
                EOVBlocks.GRANITE_COPPER_ORE.get(),
                EOVBlocks.TUFF_COPPER_ORE.get(),
                EOVBlocks.BLACKSTONE_COPPER_ORE.get(),

                EOVBlocks.DIORITE_IRON_ORE.get(),
                EOVBlocks.ANDESITE_IRON_ORE.get(),
                EOVBlocks.GRANITE_IRON_ORE.get(),
                EOVBlocks.TUFF_IRON_ORE.get(),
                EOVBlocks.BLACKSTONE_IRON_ORE.get(),

                EOVBlocks.DIORITE_LAPIS_ORE.get(),
                EOVBlocks.ANDESITE_LAPIS_ORE.get(),
                EOVBlocks.GRANITE_LAPIS_ORE.get(),
                EOVBlocks.TUFF_LAPIS_ORE.get(),
                EOVBlocks.BLACKSTONE_LAPIS_ORE.get()
        );

        this.tag(BlockTags.NEEDS_IRON_TOOL).add(
                EOVBlocks.DIORITE_GOLD_ORE.get(),
                EOVBlocks.ANDESITE_GOLD_ORE.get(),
                EOVBlocks.GRANITE_GOLD_ORE.get(),
                EOVBlocks.TUFF_GOLD_ORE.get(),
                EOVBlocks.BLACKSTONE_GOLD_ORE.get(),

                EOVBlocks.DIORITE_REDSTONE_ORE.get(),
                EOVBlocks.ANDESITE_REDSTONE_ORE.get(),
                EOVBlocks.GRANITE_REDSTONE_ORE.get(),
                EOVBlocks.TUFF_REDSTONE_ORE.get(),
                EOVBlocks.BLACKSTONE_REDSTONE_ORE.get(),

                EOVBlocks.DIORITE_EMERALD_ORE.get(),
                EOVBlocks.ANDESITE_EMERALD_ORE.get(),
                EOVBlocks.GRANITE_EMERALD_ORE.get(),
                EOVBlocks.TUFF_EMERALD_ORE.get(),
                EOVBlocks.BLACKSTONE_EMERALD_ORE.get(),

                EOVBlocks.DIORITE_DIAMOND_ORE.get(),
                EOVBlocks.ANDESITE_DIAMOND_ORE.get(),
                EOVBlocks.GRANITE_DIAMOND_ORE.get(),
                EOVBlocks.TUFF_DIAMOND_ORE.get(),
                EOVBlocks.BLACKSTONE_DIAMOND_ORE.get()
        );
    }
}
