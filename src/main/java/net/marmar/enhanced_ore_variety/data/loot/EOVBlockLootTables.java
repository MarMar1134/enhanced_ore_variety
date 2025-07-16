package net.marmar.enhanced_ore_variety.data.loot;

import net.marmar.enhanced_ore_variety.block.EOVBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class EOVBlockLootTables extends BlockLootSubProvider {
    protected EOVBlockLootTables(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        //Diorite variants
        this.add(EOVBlocks.DIORITE_COAL_ORE.get(), this::createCoalOreDrops);
        this.add(EOVBlocks.DIORITE_COPPER_ORE.get(), this::createCopperOreDrops);
        this.add(EOVBlocks.DIORITE_IRON_ORE.get(), this::createIronOreDrops);
        this.add(EOVBlocks.DIORITE_GOLD_ORE.get(), this::createGoldOreDrops);
        this.add(EOVBlocks.DIORITE_LAPIS_ORE.get(), this::createLapisOreDrops);
        this.add(EOVBlocks.DIORITE_REDSTONE_ORE.get(), this::createRedstoneOreDrops);
        this.add(EOVBlocks.DIORITE_EMERALD_ORE.get(), this::createEmeraldOreDrops);
        this.add(EOVBlocks.DIORITE_DIAMOND_ORE.get(), this::createDiamondOreDrops);

        //Andesite variants
        this.add(EOVBlocks.ANDESITE_COAL_ORE.get(), this::createCoalOreDrops);
        this.add(EOVBlocks.ANDESITE_COPPER_ORE.get(), this::createCopperOreDrops);
        this.add(EOVBlocks.ANDESITE_IRON_ORE.get(), this::createIronOreDrops);
        this.add(EOVBlocks.ANDESITE_GOLD_ORE.get(), this::createGoldOreDrops);
        this.add(EOVBlocks.ANDESITE_LAPIS_ORE.get(), this::createLapisOreDrops);
        this.add(EOVBlocks.ANDESITE_REDSTONE_ORE.get(), this::createRedstoneOreDrops);
        this.add(EOVBlocks.ANDESITE_EMERALD_ORE.get(), this::createEmeraldOreDrops);
        this.add(EOVBlocks.ANDESITE_DIAMOND_ORE.get(), this::createDiamondOreDrops);

        //Granite variants
        this.add(EOVBlocks.GRANITE_COAL_ORE.get(), this::createCoalOreDrops);
        this.add(EOVBlocks.GRANITE_COPPER_ORE.get(), this::createCopperOreDrops);
        this.add(EOVBlocks.GRANITE_IRON_ORE.get(), this::createIronOreDrops);
        this.add(EOVBlocks.GRANITE_GOLD_ORE.get(), this::createGoldOreDrops);
        this.add(EOVBlocks.GRANITE_LAPIS_ORE.get(), this::createLapisOreDrops);
        this.add(EOVBlocks.GRANITE_REDSTONE_ORE.get(), this::createRedstoneOreDrops);
        this.add(EOVBlocks.GRANITE_EMERALD_ORE.get(), this::createEmeraldOreDrops);
        this.add(EOVBlocks.GRANITE_DIAMOND_ORE.get(), this::createDiamondOreDrops);

        //Tuff variants
        this.add(EOVBlocks.TUFF_COAL_ORE.get(), this::createCoalOreDrops);
        this.add(EOVBlocks.TUFF_COPPER_ORE.get(), this::createCopperOreDrops);
        this.add(EOVBlocks.TUFF_IRON_ORE.get(), this::createIronOreDrops);
        this.add(EOVBlocks.TUFF_GOLD_ORE.get(), this::createGoldOreDrops);
        this.add(EOVBlocks.TUFF_LAPIS_ORE.get(), this::createLapisOreDrops);
        this.add(EOVBlocks.TUFF_REDSTONE_ORE.get(), this::createRedstoneOreDrops);
        this.add(EOVBlocks.TUFF_EMERALD_ORE.get(), this::createEmeraldOreDrops);
        this.add(EOVBlocks.TUFF_DIAMOND_ORE.get(), this::createDiamondOreDrops);

        //Blackstone variants
        this.add(EOVBlocks.BLACKSTONE_GOLD_ORE.get(), this::createNetherGoldOreDrops);
        this.add(EOVBlocks.BLACKSTONE_QUARTZ_ORE.get(), block -> createOreDrop(block, Items.QUARTZ));
    }

    private LootTable.Builder createCoalOreDrops(Block pBlock) {
        return createOreDrop(pBlock, Items.COAL);
    }

    private LootTable.Builder createIronOreDrops(Block pBlock) {
        return createOreDrop(pBlock, Items.RAW_IRON);
    }

    private LootTable.Builder createGoldOreDrops(Block pBlock) {
        return createOreDrop(pBlock, Items.RAW_GOLD);
    }

    private LootTable.Builder createNetherGoldOreDrops(Block pBlock){
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);

        return createSilkTouchDispatchTable(pBlock, this.applyExplosionDecay(pBlock, LootItem.lootTableItem(Items.GOLD_NUGGET)
                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 6)))
                .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    private LootTable.Builder createEmeraldOreDrops(Block pBlock) {
        return createOreDrop(pBlock, Items.EMERALD);
    }

    private LootTable.Builder createDiamondOreDrops(Block pBlock) {
        return createOreDrop(pBlock, Items.DIAMOND);
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return EOVBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
