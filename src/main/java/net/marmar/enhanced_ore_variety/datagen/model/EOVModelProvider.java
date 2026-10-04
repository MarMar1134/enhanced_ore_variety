package net.marmar.enhanced_ore_variety.datagen.model;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.marmar.enhanced_ore_variety.block.EOVBlocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class EOVModelProvider extends FabricModelProvider {
    public EOVModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //Diorite
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.DIORITE_COAL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.DIORITE_COPPER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.DIORITE_IRON_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.DIORITE_GOLD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.DIORITE_LAPIS_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.DIORITE_REDSTONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.DIORITE_EMERALD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.DIORITE_DIAMOND_ORE);
        
        //Andesite
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.ANDESITE_COAL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.ANDESITE_COPPER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.ANDESITE_IRON_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.ANDESITE_GOLD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.ANDESITE_LAPIS_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.ANDESITE_REDSTONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.ANDESITE_EMERALD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.ANDESITE_DIAMOND_ORE);
        
        //Granite
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.GRANITE_COAL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.GRANITE_COPPER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.GRANITE_IRON_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.GRANITE_GOLD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.GRANITE_LAPIS_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.GRANITE_REDSTONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.GRANITE_EMERALD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.GRANITE_DIAMOND_ORE);
        
        //Tuff
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.TUFF_COAL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.TUFF_COPPER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.TUFF_IRON_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.TUFF_GOLD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.TUFF_LAPIS_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.TUFF_REDSTONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.TUFF_EMERALD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.TUFF_DIAMOND_ORE);
        
        //Blackstone
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.BLACKSTONE_COAL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.BLACKSTONE_COPPER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.BLACKSTONE_IRON_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.BLACKSTONE_GOLD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.BLACKSTONE_LAPIS_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.BLACKSTONE_REDSTONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.BLACKSTONE_EMERALD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EOVBlocks.BLACKSTONE_DIAMOND_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
