package net.marmar.enhanced_ore_variety.data.model;

import net.marmar.enhanced_ore_variety.EnhancedOreVariety;
import net.marmar.enhanced_ore_variety.block.EOVBlocks;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.data.PackOutput;

public class EOVBlockModelProvider extends ModelProvider {
    public EOVBlockModelProvider(PackOutput output) {
        super(output, EnhancedOreVariety.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        //super.registerModels(blockModels, itemModels);

        //Diorite variants
        blockModels.createTrivialCube(EOVBlocks.DIORITE_COAL_ORE.get());
        blockModels.createTrivialCube(EOVBlocks.DIORITE_COPPER_ORE.get());
        blockModels.createTrivialCube(EOVBlocks.DIORITE_IRON_ORE.get());
        blockModels.createTrivialCube(EOVBlocks.DIORITE_GOLD_ORE.get());
        blockModels.createTrivialCube(EOVBlocks.DIORITE_LAPIS_ORE.get());
        blockModels.createTrivialCube(EOVBlocks.DIORITE_REDSTONE_ORE.get());
        blockModels.createTrivialCube(EOVBlocks.DIORITE_EMERALD_ORE.get());
        blockModels.createTrivialCube(EOVBlocks.DIORITE_DIAMOND_ORE.get());

        //Andesite variants
        blockModels.createTrivialCube(EOVBlocks.ANDESITE_COAL_ORE.get());
        blockModels.createTrivialCube(EOVBlocks.ANDESITE_COPPER_ORE.get());
        blockModels.createTrivialCube(EOVBlocks.ANDESITE_IRON_ORE.get());
        blockModels.createTrivialCube(EOVBlocks.ANDESITE_GOLD_ORE.get());
        blockModels.createTrivialCube(EOVBlocks.ANDESITE_LAPIS_ORE.get());
        blockModels.createTrivialCube(EOVBlocks.ANDESITE_REDSTONE_ORE.get());
        blockModels.createTrivialCube(EOVBlocks.ANDESITE_EMERALD_ORE.get());
        blockModels.createTrivialCube(EOVBlocks.ANDESITE_DIAMOND_ORE.get());

        //Granite variants
        blockModels.createTrivialCube(EOVBlocks.GRANITE_COAL_ORE.get());
        blockModels.createTrivialCube(EOVBlocks.GRANITE_COPPER_ORE.get());
        blockModels.createTrivialCube(EOVBlocks.GRANITE_IRON_ORE.get());
        blockModels.createTrivialCube(EOVBlocks.GRANITE_GOLD_ORE.get());
        blockModels.createTrivialCube(EOVBlocks.GRANITE_LAPIS_ORE.get());
        blockModels.createTrivialCube(EOVBlocks.GRANITE_REDSTONE_ORE.get());
        blockModels.createTrivialCube(EOVBlocks.GRANITE_EMERALD_ORE.get());
        blockModels.createTrivialCube(EOVBlocks.GRANITE_DIAMOND_ORE.get());

        //Tuff variants
        blockModels.createTrivialCube(EOVBlocks.TUFF_COAL_ORE.get());
        blockModels.createTrivialCube(EOVBlocks.TUFF_COPPER_ORE.get());
        blockModels.createTrivialCube(EOVBlocks.TUFF_IRON_ORE.get());
        blockModels.createTrivialCube(EOVBlocks.TUFF_GOLD_ORE.get());
        blockModels.createTrivialCube(EOVBlocks.TUFF_LAPIS_ORE.get());
        blockModels.createTrivialCube(EOVBlocks.TUFF_REDSTONE_ORE.get());
        blockModels.createTrivialCube(EOVBlocks.TUFF_EMERALD_ORE.get());
        blockModels.createTrivialCube(EOVBlocks.TUFF_DIAMOND_ORE.get());

        //Blackstone variants
        blockModels.createTrivialCube(EOVBlocks.BLACKSTONE_COAL_ORE.get());
        blockModels.createTrivialCube(EOVBlocks.BLACKSTONE_COPPER_ORE.get());
        blockModels.createTrivialCube(EOVBlocks.BLACKSTONE_IRON_ORE.get());
        blockModels.createTrivialCube(EOVBlocks.BLACKSTONE_GOLD_ORE.get());
        blockModels.createTrivialCube(EOVBlocks.BLACKSTONE_LAPIS_ORE.get());
        blockModels.createTrivialCube(EOVBlocks.BLACKSTONE_REDSTONE_ORE.get());
        blockModels.createTrivialCube(EOVBlocks.BLACKSTONE_EMERALD_ORE.get());
        blockModels.createTrivialCube(EOVBlocks.BLACKSTONE_DIAMOND_ORE.get());
        blockModels.createTrivialCube(EOVBlocks.BLACKSTONE_QUARTZ_ORE.get());
    }
}
