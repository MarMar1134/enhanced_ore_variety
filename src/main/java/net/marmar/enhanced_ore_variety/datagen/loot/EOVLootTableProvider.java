package net.marmar.enhanced_ore_variety.datagen.loot;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.marmar.enhanced_ore_variety.block.EOVBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class EOVLootTableProvider extends FabricBlockLootTableProvider {
    public EOVLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        //Diorite
        addDrop(EOVBlocks.DIORITE_COAL_ORE, createCoalOreDrops(EOVBlocks.DIORITE_COAL_ORE));
        addDrop(EOVBlocks.DIORITE_COPPER_ORE, createCopperOreDrops(EOVBlocks.DIORITE_COPPER_ORE));
        addDrop(EOVBlocks.DIORITE_IRON_ORE, createIronOreDrops(EOVBlocks.DIORITE_IRON_ORE));
        addDrop(EOVBlocks.DIORITE_GOLD_ORE, createGoldOreDrops(EOVBlocks.DIORITE_GOLD_ORE));
        addDrop(EOVBlocks.DIORITE_LAPIS_ORE, createLapisOreDrops(EOVBlocks.DIORITE_LAPIS_ORE));
        addDrop(EOVBlocks.DIORITE_REDSTONE_ORE, createRedstoneOreDrops(EOVBlocks.DIORITE_REDSTONE_ORE));
        addDrop(EOVBlocks.DIORITE_EMERALD_ORE, createEmeraldOreDrops(EOVBlocks.DIORITE_EMERALD_ORE));
        addDrop(EOVBlocks.DIORITE_DIAMOND_ORE, createDiamondOreDrops(EOVBlocks.DIORITE_DIAMOND_ORE));

        //Andesite
        addDrop(EOVBlocks.ANDESITE_COAL_ORE, createCoalOreDrops(EOVBlocks.ANDESITE_COAL_ORE));
        addDrop(EOVBlocks.ANDESITE_COPPER_ORE, createCopperOreDrops(EOVBlocks.ANDESITE_COPPER_ORE));
        addDrop(EOVBlocks.ANDESITE_IRON_ORE, createIronOreDrops(EOVBlocks.ANDESITE_IRON_ORE));
        addDrop(EOVBlocks.ANDESITE_GOLD_ORE, createGoldOreDrops(EOVBlocks.ANDESITE_GOLD_ORE));
        addDrop(EOVBlocks.ANDESITE_LAPIS_ORE, createLapisOreDrops(EOVBlocks.ANDESITE_LAPIS_ORE));
        addDrop(EOVBlocks.ANDESITE_REDSTONE_ORE, createRedstoneOreDrops(EOVBlocks.ANDESITE_REDSTONE_ORE));
        addDrop(EOVBlocks.ANDESITE_EMERALD_ORE, createEmeraldOreDrops(EOVBlocks.ANDESITE_EMERALD_ORE));
        addDrop(EOVBlocks.ANDESITE_DIAMOND_ORE, createDiamondOreDrops(EOVBlocks.ANDESITE_DIAMOND_ORE));

        //Granite
        addDrop(EOVBlocks.GRANITE_COAL_ORE, createCoalOreDrops(EOVBlocks.GRANITE_COAL_ORE));
        addDrop(EOVBlocks.GRANITE_COPPER_ORE, createCopperOreDrops(EOVBlocks.GRANITE_COPPER_ORE));
        addDrop(EOVBlocks.GRANITE_IRON_ORE, createIronOreDrops(EOVBlocks.GRANITE_IRON_ORE));
        addDrop(EOVBlocks.GRANITE_GOLD_ORE, createGoldOreDrops(EOVBlocks.GRANITE_GOLD_ORE));
        addDrop(EOVBlocks.GRANITE_LAPIS_ORE, createLapisOreDrops(EOVBlocks.GRANITE_LAPIS_ORE));
        addDrop(EOVBlocks.GRANITE_REDSTONE_ORE, createRedstoneOreDrops(EOVBlocks.GRANITE_REDSTONE_ORE));
        addDrop(EOVBlocks.GRANITE_EMERALD_ORE, createEmeraldOreDrops(EOVBlocks.GRANITE_EMERALD_ORE));
        addDrop(EOVBlocks.GRANITE_DIAMOND_ORE, createDiamondOreDrops(EOVBlocks.GRANITE_DIAMOND_ORE));

        //Tuff
        addDrop(EOVBlocks.TUFF_COAL_ORE, createCoalOreDrops(EOVBlocks.TUFF_COAL_ORE));
        addDrop(EOVBlocks.TUFF_COPPER_ORE, createCopperOreDrops(EOVBlocks.TUFF_COPPER_ORE));
        addDrop(EOVBlocks.TUFF_IRON_ORE, createIronOreDrops(EOVBlocks.TUFF_IRON_ORE));
        addDrop(EOVBlocks.TUFF_GOLD_ORE, createGoldOreDrops(EOVBlocks.TUFF_GOLD_ORE));
        addDrop(EOVBlocks.TUFF_LAPIS_ORE, createLapisOreDrops(EOVBlocks.TUFF_LAPIS_ORE));
        addDrop(EOVBlocks.TUFF_REDSTONE_ORE, createRedstoneOreDrops(EOVBlocks.TUFF_REDSTONE_ORE));
        addDrop(EOVBlocks.TUFF_EMERALD_ORE, createEmeraldOreDrops(EOVBlocks.TUFF_EMERALD_ORE));
        addDrop(EOVBlocks.TUFF_DIAMOND_ORE, createDiamondOreDrops(EOVBlocks.TUFF_DIAMOND_ORE));

        //Blackstone
        addDrop(EOVBlocks.BLACKSTONE_COAL_ORE, createCoalOreDrops(EOVBlocks.BLACKSTONE_COAL_ORE));
        addDrop(EOVBlocks.BLACKSTONE_COPPER_ORE, createCopperOreDrops(EOVBlocks.BLACKSTONE_COPPER_ORE));
        addDrop(EOVBlocks.BLACKSTONE_IRON_ORE, createIronOreDrops(EOVBlocks.BLACKSTONE_IRON_ORE));
        addDrop(EOVBlocks.BLACKSTONE_GOLD_ORE, createNetherGoldOreDrops(EOVBlocks.BLACKSTONE_GOLD_ORE));
        addDrop(EOVBlocks.BLACKSTONE_LAPIS_ORE, createLapisOreDrops(EOVBlocks.BLACKSTONE_LAPIS_ORE));
        addDrop(EOVBlocks.BLACKSTONE_REDSTONE_ORE, createRedstoneOreDrops(EOVBlocks.BLACKSTONE_REDSTONE_ORE));
        addDrop(EOVBlocks.BLACKSTONE_EMERALD_ORE, createEmeraldOreDrops(EOVBlocks.BLACKSTONE_EMERALD_ORE));
        addDrop(EOVBlocks.BLACKSTONE_DIAMOND_ORE, createDiamondOreDrops(EOVBlocks.BLACKSTONE_DIAMOND_ORE));
    }

    private LootTable.Builder createCoalOreDrops(Block pBlock) {
        return createOreDrop(pBlock, Items.COAL, 1, 1);
    }

    private LootTable.Builder createCopperOreDrops(Block pBlock) {
        return createOreDrop(pBlock, Items.RAW_COPPER, 2, 5);
    }

    private LootTable.Builder createIronOreDrops(Block pBlock) {
        return createOreDrop(pBlock, Items.RAW_IRON, 1, 1);
    }

    private LootTable.Builder createGoldOreDrops(Block pBlock) {
        return createOreDrop(pBlock, Items.RAW_GOLD, 1, 1);
    }

    private LootTable.Builder createNetherGoldOreDrops(Block pBlock){
        return createOreDrop(pBlock, Items.GOLD_NUGGET, 2, 6);
    }

    private LootTable.Builder createLapisOreDrops(Block pBlock){
        return createOreDrop(pBlock, Items.LAPIS_LAZULI, 4, 9);
    }

    private LootTable.Builder createRedstoneOreDrops(Block pBlock){
        return createOreDrop(pBlock, Items.REDSTONE, 4, 5);
    }

    private LootTable.Builder createEmeraldOreDrops(Block pBlock) {
        return createOreDrop(pBlock, Items.EMERALD, 1, 1);
    }

    private LootTable.Builder createDiamondOreDrops(Block pBlock) {
        return createOreDrop(pBlock, Items.DIAMOND, 1, 1);
    }

    private LootTable.Builder createOreDrop(Block pBlock, Item pDrop, int pMinDrops, int pMaxDrops){
        return BlockLootTableGenerator.dropsWithSilkTouch(pBlock,
                (LootPoolEntry.Builder) this.applyExplosionDecay(pBlock,
                        (LeafEntry.Builder) ItemEntry.builder(pDrop)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(pMinDrops, pMaxDrops)))
                ).apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))
        );
    }
}
