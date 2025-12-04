package net.marmar.enhanced_ore_variety.data.model;

import net.marmar.enhanced_ore_variety.EnhancedOreVariety;
import net.marmar.enhanced_ore_variety.block.EOVBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class EOVBlockstateProvider extends BlockStateProvider {
    public EOVBlockstateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, EnhancedOreVariety.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //Diorite variants
        blockWithItem(EOVBlocks.DIORITE_COAL_ORE);
        blockWithItem(EOVBlocks.DIORITE_COPPER_ORE);
        blockWithItem(EOVBlocks.DIORITE_IRON_ORE);
        blockWithItem(EOVBlocks.DIORITE_GOLD_ORE);
        blockWithItem(EOVBlocks.DIORITE_LAPIS_ORE);
        blockWithItem(EOVBlocks.DIORITE_REDSTONE_ORE);
        blockWithItem(EOVBlocks.DIORITE_EMERALD_ORE);
        blockWithItem(EOVBlocks.DIORITE_DIAMOND_ORE);

        //Andesite variants
        blockWithItem(EOVBlocks.ANDESITE_COAL_ORE);
        blockWithItem(EOVBlocks.ANDESITE_COPPER_ORE);
        blockWithItem(EOVBlocks.ANDESITE_IRON_ORE);
        blockWithItem(EOVBlocks.ANDESITE_GOLD_ORE);
        blockWithItem(EOVBlocks.ANDESITE_LAPIS_ORE);
        blockWithItem(EOVBlocks.ANDESITE_REDSTONE_ORE);
        blockWithItem(EOVBlocks.ANDESITE_EMERALD_ORE);
        blockWithItem(EOVBlocks.ANDESITE_DIAMOND_ORE);

        //Granite variants
        blockWithItem(EOVBlocks.GRANITE_COAL_ORE);
        blockWithItem(EOVBlocks.GRANITE_COPPER_ORE);
        blockWithItem(EOVBlocks.GRANITE_IRON_ORE);
        blockWithItem(EOVBlocks.GRANITE_GOLD_ORE);
        blockWithItem(EOVBlocks.GRANITE_LAPIS_ORE);
        blockWithItem(EOVBlocks.GRANITE_REDSTONE_ORE);
        blockWithItem(EOVBlocks.GRANITE_EMERALD_ORE);
        blockWithItem(EOVBlocks.GRANITE_DIAMOND_ORE);

        //Tuff variants
        blockWithItem(EOVBlocks.TUFF_COAL_ORE);
        blockWithItem(EOVBlocks.TUFF_COPPER_ORE);
        blockWithItem(EOVBlocks.TUFF_IRON_ORE);
        blockWithItem(EOVBlocks.TUFF_GOLD_ORE);
        blockWithItem(EOVBlocks.TUFF_LAPIS_ORE);
        blockWithItem(EOVBlocks.TUFF_REDSTONE_ORE);
        blockWithItem(EOVBlocks.TUFF_EMERALD_ORE);
        blockWithItem(EOVBlocks.TUFF_DIAMOND_ORE);

        //Blackstone variants
        blockWithItem(EOVBlocks.BLACKSTONE_COAL_ORE);
        blockWithItem(EOVBlocks.BLACKSTONE_COPPER_ORE);
        blockWithItem(EOVBlocks.BLACKSTONE_IRON_ORE);
        blockWithItem(EOVBlocks.BLACKSTONE_GOLD_ORE);
        blockWithItem(EOVBlocks.BLACKSTONE_LAPIS_ORE);
        blockWithItem(EOVBlocks.BLACKSTONE_REDSTONE_ORE);
        blockWithItem(EOVBlocks.BLACKSTONE_EMERALD_ORE);
        blockWithItem(EOVBlocks.BLACKSTONE_DIAMOND_ORE);
        blockWithItem(EOVBlocks.BLACKSTONE_QUARTZ_ORE);
    }

    private void blockWithItem(DeferredBlock<Block> pBlock){
        simpleBlockWithItem(pBlock.get(), cubeAll(pBlock.get()));
    }
}
