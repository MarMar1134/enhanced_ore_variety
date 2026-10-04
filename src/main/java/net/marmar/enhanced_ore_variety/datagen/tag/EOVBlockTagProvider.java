package net.marmar.enhanced_ore_variety.datagen.tag;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.marmar.enhanced_ore_variety.block.EOVBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class EOVBlockTagProvider extends FabricTagProvider.BlockTagProvider{
    public EOVBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                //Diorite
                .add(EOVBlocks.DIORITE_COAL_ORE)
                .add(EOVBlocks.DIORITE_COPPER_ORE)
                .add(EOVBlocks.DIORITE_IRON_ORE)
                .add(EOVBlocks.DIORITE_GOLD_ORE)
                .add(EOVBlocks.DIORITE_LAPIS_ORE)
                .add(EOVBlocks.DIORITE_REDSTONE_ORE)
                .add(EOVBlocks.DIORITE_EMERALD_ORE)
                .add(EOVBlocks.DIORITE_DIAMOND_ORE)
                //Andesite
                .add(EOVBlocks.ANDESITE_COAL_ORE)
                .add(EOVBlocks.ANDESITE_COPPER_ORE)
                .add(EOVBlocks.ANDESITE_IRON_ORE)
                .add(EOVBlocks.ANDESITE_GOLD_ORE)
                .add(EOVBlocks.ANDESITE_LAPIS_ORE)
                .add(EOVBlocks.ANDESITE_REDSTONE_ORE)
                .add(EOVBlocks.ANDESITE_EMERALD_ORE)
                .add(EOVBlocks.ANDESITE_DIAMOND_ORE)
                //Granite
                .add(EOVBlocks.GRANITE_COAL_ORE)
                .add(EOVBlocks.GRANITE_COPPER_ORE)
                .add(EOVBlocks.GRANITE_IRON_ORE)
                .add(EOVBlocks.GRANITE_GOLD_ORE)
                .add(EOVBlocks.GRANITE_LAPIS_ORE)
                .add(EOVBlocks.GRANITE_REDSTONE_ORE)
                .add(EOVBlocks.GRANITE_EMERALD_ORE)
                .add(EOVBlocks.GRANITE_DIAMOND_ORE)
                //Tuff
                .add(EOVBlocks.TUFF_COAL_ORE)
                .add(EOVBlocks.TUFF_COPPER_ORE)
                .add(EOVBlocks.TUFF_IRON_ORE)
                .add(EOVBlocks.TUFF_GOLD_ORE)
                .add(EOVBlocks.TUFF_LAPIS_ORE)
                .add(EOVBlocks.TUFF_REDSTONE_ORE)
                .add(EOVBlocks.TUFF_EMERALD_ORE)
                .add(EOVBlocks.TUFF_DIAMOND_ORE)
                //Blackstone
                .add(EOVBlocks.BLACKSTONE_COAL_ORE)
                .add(EOVBlocks.BLACKSTONE_COPPER_ORE)
                .add(EOVBlocks.BLACKSTONE_IRON_ORE)
                .add(EOVBlocks.BLACKSTONE_GOLD_ORE)
                .add(EOVBlocks.BLACKSTONE_LAPIS_ORE)
                .add(EOVBlocks.BLACKSTONE_REDSTONE_ORE)
                .add(EOVBlocks.BLACKSTONE_EMERALD_ORE)
                .add(EOVBlocks.BLACKSTONE_DIAMOND_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                //Copper ores
                .add(EOVBlocks.DIORITE_COPPER_ORE)
                .add(EOVBlocks.ANDESITE_COPPER_ORE)
                .add(EOVBlocks.GRANITE_COPPER_ORE)
                .add(EOVBlocks.TUFF_COPPER_ORE)
                .add(EOVBlocks.BLACKSTONE_COPPER_ORE)
                //Iron ores
                .add(EOVBlocks.DIORITE_IRON_ORE)
                .add(EOVBlocks.ANDESITE_IRON_ORE)
                .add(EOVBlocks.GRANITE_IRON_ORE)
                .add(EOVBlocks.TUFF_IRON_ORE)
                .add(EOVBlocks.BLACKSTONE_IRON_ORE)
                //Lapis ores
                .add(EOVBlocks.DIORITE_LAPIS_ORE)
                .add(EOVBlocks.ANDESITE_LAPIS_ORE)
                .add(EOVBlocks.GRANITE_LAPIS_ORE)
                .add(EOVBlocks.TUFF_LAPIS_ORE)
                .add(EOVBlocks.BLACKSTONE_LAPIS_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                //Gold ores (excluding blackstone)
                .add(EOVBlocks.DIORITE_GOLD_ORE)
                .add(EOVBlocks.ANDESITE_GOLD_ORE)
                .add(EOVBlocks.GRANITE_GOLD_ORE)
                .add(EOVBlocks.TUFF_GOLD_ORE)
                //Redstone ores
                .add(EOVBlocks.DIORITE_REDSTONE_ORE)
                .add(EOVBlocks.ANDESITE_REDSTONE_ORE)
                .add(EOVBlocks.GRANITE_REDSTONE_ORE)
                .add(EOVBlocks.TUFF_REDSTONE_ORE)
                .add(EOVBlocks.BLACKSTONE_REDSTONE_ORE)
                //Emerald ores
                .add(EOVBlocks.DIORITE_EMERALD_ORE)
                .add(EOVBlocks.ANDESITE_EMERALD_ORE)
                .add(EOVBlocks.GRANITE_EMERALD_ORE)
                .add(EOVBlocks.TUFF_EMERALD_ORE)
                .add(EOVBlocks.BLACKSTONE_EMERALD_ORE)
                //Diamond ores
                .add(EOVBlocks.DIORITE_DIAMOND_ORE)
                .add(EOVBlocks.ANDESITE_DIAMOND_ORE)
                .add(EOVBlocks.GRANITE_DIAMOND_ORE)
                .add(EOVBlocks.TUFF_DIAMOND_ORE)
                .add(EOVBlocks.BLACKSTONE_DIAMOND_ORE);
    }
}
