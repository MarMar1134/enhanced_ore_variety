package net.marmar.enhanced_ore_variety.block;

import net.marmar.enhanced_ore_variety.EnhancedOreVariety;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class EOVBlocks {
    //Diorite variants
    public static final Block DIORITE_COAL_ORE = registerBlock("diorite_coal_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(0, 2), AbstractBlock.Settings.copy(Blocks.COAL_ORE)));
    public static final Block DIORITE_COPPER_ORE = registerBlock("diorite_copper_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.COPPER_ORE)));
    public static final Block DIORITE_IRON_ORE = registerBlock("diorite_iron_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Block DIORITE_GOLD_ORE = registerBlock("diorite_gold_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.GOLD_ORE)));
    public static final Block DIORITE_LAPIS_ORE = registerBlock("diorite_lapis_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.copy(Blocks.LAPIS_ORE)));
    public static final Block DIORITE_REDSTONE_ORE = registerBlock("diorite_redstone_ore",
            new RedstoneOreBlock(AbstractBlock.Settings.copy(Blocks.REDSTONE_ORE)));
    public static final Block DIORITE_EMERALD_ORE = registerBlock("diorite_emerald_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(Blocks.EMERALD_ORE)));
    public static final Block DIORITE_DIAMOND_ORE = registerBlock("diorite_diamond_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)));

    //Andesite variants
    public static final Block ANDESITE_COAL_ORE = registerBlock("andesite_coal_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(0, 2), AbstractBlock.Settings.copy(Blocks.COAL_ORE)));
    public static final Block ANDESITE_COPPER_ORE = registerBlock("andesite_copper_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.COPPER_ORE)));
    public static final Block ANDESITE_IRON_ORE = registerBlock("andesite_iron_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Block ANDESITE_GOLD_ORE = registerBlock("andesite_gold_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.GOLD_ORE)));
    public static final Block ANDESITE_LAPIS_ORE = registerBlock("andesite_lapis_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.copy(Blocks.LAPIS_ORE)));
    public static final Block ANDESITE_REDSTONE_ORE = registerBlock("andesite_redstone_ore",
            new RedstoneOreBlock(AbstractBlock.Settings.copy(Blocks.REDSTONE_ORE)));
    public static final Block ANDESITE_EMERALD_ORE = registerBlock("andesite_emerald_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(Blocks.EMERALD_ORE)));
    public static final Block ANDESITE_DIAMOND_ORE = registerBlock("andesite_diamond_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)));

    //Granite variants
    public static final Block GRANITE_COAL_ORE = registerBlock("granite_coal_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(0, 2), AbstractBlock.Settings.copy(Blocks.COAL_ORE)));
    public static final Block GRANITE_COPPER_ORE = registerBlock("granite_copper_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.COPPER_ORE)));
    public static final Block GRANITE_IRON_ORE = registerBlock("granite_iron_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Block GRANITE_GOLD_ORE = registerBlock("granite_gold_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.GOLD_ORE)));
    public static final Block GRANITE_LAPIS_ORE = registerBlock("granite_lapis_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.copy(Blocks.LAPIS_ORE)));
    public static final Block GRANITE_REDSTONE_ORE = registerBlock("granite_redstone_ore",
            new RedstoneOreBlock(AbstractBlock.Settings.copy(Blocks.REDSTONE_ORE)));
    public static final Block GRANITE_EMERALD_ORE = registerBlock("granite_emerald_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(Blocks.EMERALD_ORE)));
    public static final Block GRANITE_DIAMOND_ORE = registerBlock("granite_diamond_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)));

    //Tuff variants
    public static final Block TUFF_COAL_ORE = registerBlock("tuff_coal_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(0, 2), AbstractBlock.Settings.copy(Blocks.COAL_ORE)));
    public static final Block TUFF_COPPER_ORE = registerBlock("tuff_copper_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.COPPER_ORE)));
    public static final Block TUFF_IRON_ORE = registerBlock("tuff_iron_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Block TUFF_GOLD_ORE = registerBlock("tuff_gold_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.GOLD_ORE)));
    public static final Block TUFF_LAPIS_ORE = registerBlock("tuff_lapis_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.copy(Blocks.LAPIS_ORE)));
    public static final Block TUFF_REDSTONE_ORE = registerBlock("tuff_redstone_ore",
            new RedstoneOreBlock(AbstractBlock.Settings.copy(Blocks.REDSTONE_ORE)));
    public static final Block TUFF_EMERALD_ORE = registerBlock("tuff_emerald_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(Blocks.EMERALD_ORE)));
    public static final Block TUFF_DIAMOND_ORE = registerBlock("tuff_diamond_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)));

    //Blackstone
    public static final Block BLACKSTONE_COAL_ORE = registerBlock("blackstone_coal_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(0, 2), AbstractBlock.Settings.copy(Blocks.COAL_ORE)));
    public static final Block BLACKSTONE_COPPER_ORE = registerBlock("blackstone_copper_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.COPPER_ORE)));
    public static final Block BLACKSTONE_IRON_ORE = registerBlock("blackstone_iron_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Block BLACKSTONE_GOLD_ORE = registerBlock("blackstone_gold_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(0, 1), AbstractBlock.Settings.copy(Blocks.GOLD_ORE)));
    public static final Block BLACKSTONE_LAPIS_ORE = registerBlock("blackstone_lapis_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.copy(Blocks.LAPIS_ORE)));
    public static final Block BLACKSTONE_REDSTONE_ORE = registerBlock("blackstone_redstone_ore",
            new RedstoneOreBlock(AbstractBlock.Settings.copy(Blocks.REDSTONE_ORE)));
    public static final Block BLACKSTONE_EMERALD_ORE = registerBlock("blackstone_emerald_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(Blocks.EMERALD_ORE)));
    public static final Block BLACKSTONE_DIAMOND_ORE = registerBlock("blackstone_diamond_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)));

    //Helper methods
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(EnhancedOreVariety.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(EnhancedOreVariety.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        EnhancedOreVariety.LOGGER.info("Registering ModBlocks for " + EnhancedOreVariety.MOD_ID);
    }
}
