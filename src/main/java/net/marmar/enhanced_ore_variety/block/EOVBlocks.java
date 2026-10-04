package net.marmar.enhanced_ore_variety.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.marmar.enhanced_ore_variety.EnhancedOreVariety;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.RedstoneOreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class EOVBlocks {
    //Diorite variants
    public static final Block DIORITE_COAL_ORE = registerBlock("diorite_coal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.COAL_ORE), UniformIntProvider.create(0, 2)));
    public static final Block DIORITE_COPPER_ORE = registerBlock("diorite_copper_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_ORE)));
    public static final Block DIORITE_IRON_ORE = registerBlock("diorite_iron_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block DIORITE_GOLD_ORE = registerBlock("diorite_gold_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_ORE)));
    public static final Block DIORITE_LAPIS_ORE = registerBlock("diorite_lapis_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_ORE), UniformIntProvider.create(2, 5)));
    public static final Block DIORITE_REDSTONE_ORE = registerBlock("diorite_redstone_ore",
            new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_ORE)));
    public static final Block DIORITE_EMERALD_ORE = registerBlock("diorite_emerald_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE), UniformIntProvider.create(3, 7)));
    public static final Block DIORITE_DIAMOND_ORE = registerBlock("diorite_diamond_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE), UniformIntProvider.create(3, 7)));

    //Andesite variants
    public static final Block ANDESITE_COAL_ORE = registerBlock("andesite_coal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.COAL_ORE), UniformIntProvider.create(0, 2)));
    public static final Block ANDESITE_COPPER_ORE = registerBlock("andesite_copper_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_ORE)));
    public static final Block ANDESITE_IRON_ORE = registerBlock("andesite_iron_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block ANDESITE_GOLD_ORE = registerBlock("andesite_gold_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_ORE)));
    public static final Block ANDESITE_LAPIS_ORE = registerBlock("andesite_lapis_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_ORE), UniformIntProvider.create(2, 5)));
    public static final Block ANDESITE_REDSTONE_ORE = registerBlock("andesite_redstone_ore",
            new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_ORE)));
    public static final Block ANDESITE_EMERALD_ORE = registerBlock("andesite_emerald_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE), UniformIntProvider.create(3, 7)));
    public static final Block ANDESITE_DIAMOND_ORE = registerBlock("andesite_diamond_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE), UniformIntProvider.create(3, 7)));

    //Granite variants
    public static final Block GRANITE_COAL_ORE = registerBlock("granite_coal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.COAL_ORE), UniformIntProvider.create(0, 2)));
    public static final Block GRANITE_COPPER_ORE = registerBlock("granite_copper_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_ORE)));
    public static final Block GRANITE_IRON_ORE = registerBlock("granite_iron_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block GRANITE_GOLD_ORE = registerBlock("granite_gold_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_ORE)));
    public static final Block GRANITE_LAPIS_ORE = registerBlock("granite_lapis_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_ORE), UniformIntProvider.create(2, 5)));
    public static final Block GRANITE_REDSTONE_ORE = registerBlock("granite_redstone_ore",
            new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_ORE)));
    public static final Block GRANITE_EMERALD_ORE = registerBlock("granite_emerald_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE), UniformIntProvider.create(3, 7)));
    public static final Block GRANITE_DIAMOND_ORE = registerBlock("granite_diamond_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE), UniformIntProvider.create(3, 7)));

    //Tuff variants
    public static final Block TUFF_COAL_ORE = registerBlock("tuff_coal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.COAL_ORE), UniformIntProvider.create(0, 2)));
    public static final Block TUFF_COPPER_ORE = registerBlock("tuff_copper_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_ORE)));
    public static final Block TUFF_IRON_ORE = registerBlock("tuff_iron_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block TUFF_GOLD_ORE = registerBlock("tuff_gold_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_ORE)));
    public static final Block TUFF_LAPIS_ORE = registerBlock("tuff_lapis_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_ORE), UniformIntProvider.create(2, 5)));
    public static final Block TUFF_REDSTONE_ORE = registerBlock("tuff_redstone_ore",
            new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_ORE)));
    public static final Block TUFF_EMERALD_ORE = registerBlock("tuff_emerald_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE), UniformIntProvider.create(3, 7)));
    public static final Block TUFF_DIAMOND_ORE = registerBlock("tuff_diamond_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE), UniformIntProvider.create(3, 7)));

    //Blackstone
    public static final Block BLACKSTONE_COAL_ORE = registerBlock("blackstone_coal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.COAL_ORE), UniformIntProvider.create(0, 2)));
    public static final Block BLACKSTONE_COPPER_ORE = registerBlock("blackstone_copper_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_ORE)));
    public static final Block BLACKSTONE_IRON_ORE = registerBlock("blackstone_iron_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block BLACKSTONE_GOLD_ORE = registerBlock("blackstone_gold_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.GOLD_ORE), UniformIntProvider.create(0, 1)));
    public static final Block BLACKSTONE_LAPIS_ORE = registerBlock("blackstone_lapis_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_ORE), UniformIntProvider.create(2, 5)));
    public static final Block BLACKSTONE_REDSTONE_ORE = registerBlock("blackstone_redstone_ore",
            new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_ORE)));
    public static final Block BLACKSTONE_EMERALD_ORE = registerBlock("blackstone_emerald_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE), UniformIntProvider.create(3, 7)));
    public static final Block BLACKSTONE_DIAMOND_ORE = registerBlock("blackstone_diamond_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE), UniformIntProvider.create(3, 7)));

    //Helper methods
    private static Block registerBlock(String name, Block block) {
        Identifier id = new Identifier(EnhancedOreVariety.MOD_ID, name);
        if (Registries.BLOCK.containsId(id)) {
            return Registries.BLOCK.get(id);
        }

        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, id, block);
    }

    private static Item registerBlockItem(String name, Block block) {
        Identifier id = new Identifier(EnhancedOreVariety.MOD_ID, name);
        if (Registries.ITEM.containsId(id)) {
            return Registries.ITEM.get(id);
        }

        return Registry.register(Registries.ITEM, id, new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        EnhancedOreVariety.LOGGER.info("Registering ModBlocks for " + EnhancedOreVariety.MOD_ID);
    }
}
