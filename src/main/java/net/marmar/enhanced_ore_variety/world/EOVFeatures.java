package net.marmar.enhanced_ore_variety.world;

import net.marmar.enhanced_ore_variety.EnhancedOreVariety;
import net.marmar.enhanced_ore_variety.block.EOVBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.BlockReplacement;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

import java.util.List;

public class EOVFeatures {
    public static final ResourceKey<Feature> COAL_ORES_FEATURE = registerKey("coal_ores_feature");
    public static final ResourceKey<Feature> COAL_ORES_BURIED_FEATURE = registerKey("coal_ores_buried_feature");

    public static final ResourceKey<Feature> COPPER_ORES_SMALL_FEATURE = registerKey("copper_ores_small_feature");
    public static final ResourceKey<Feature> COPPER_ORES_LARGE_FEATURE = registerKey("copper_ores_large_feature");

    public static final ResourceKey<Feature> IRON_ORES_FEATURE = registerKey("iron_ores_feature");
    public static final ResourceKey<Feature> IRON_ORES_SMALL_FEATURE = registerKey("iron_ores_small_feature");

    public static final ResourceKey<Feature> GOLD_ORES_FEATURE = registerKey("gold_ores_feature");
    public static final ResourceKey<Feature> GOLD_ORES_BURIED_FEATURE = registerKey("gold_ores_buried_feature");
    public static final ResourceKey<Feature> NETHER_GOLD_ORES_FEATURE = registerKey("nether_gold_ores_feature");

    public static final ResourceKey<Feature> QUARTZ_ORES_FEATURE = registerKey("quartz_ores_feature");

    public static final ResourceKey<Feature> LAPIS_ORES_FEATURE = registerKey("lapis_ores_feature");
    public static final ResourceKey<Feature> LAPIS_ORES_BURIED_FEATURE = registerKey("lapis_ores_buried_feature");

    public static final ResourceKey<Feature> REDSTONE_ORES_FEATURE = registerKey("redstone_ores_feature");

    public static final ResourceKey<Feature> EMERALD_ORES_FEATURE = registerKey("emerald_ores_feature");

    public static final ResourceKey<Feature> DIAMOND_ORES_SMALL_FEATURE = registerKey("diamond_ores_small_feature");
    public static final ResourceKey<Feature> DIAMOND_ORES_LARGE_FEATURE = registerKey("diamond_ores_large_feature");
    public static final ResourceKey<Feature> DIAMOND_ORES_BURIED_FEATURE = registerKey("diamond_ores_buried_feature");

    public static void bootstrap(BootstrapContext<Feature> context){
        //Rule tests
        RuleTest stoneReplaceable = new BlockMatchTest(Blocks.STONE);
        RuleTest dioriteReplaceable = new BlockMatchTest(Blocks.DIORITE);
        RuleTest andesiteReplaceable = new BlockMatchTest(Blocks.ANDESITE);
        RuleTest graniteReplaceable = new BlockMatchTest(Blocks.GRANITE);
        RuleTest deepslateReplaceable = new BlockMatchTest(Blocks.DEEPSLATE);
        RuleTest tuffReplaceable = new BlockMatchTest(Blocks.TUFF);
        RuleTest netherrackReplaceable = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest blackstoneReplaceable = new BlockMatchTest(Blocks.BLACKSTONE);

        //Coal
        List<BlockReplacement> coalOres = List.of(
                BlockReplacement.replace(stoneReplaceable, Blocks.COAL_ORE.defaultBlockState()),
                BlockReplacement.replace(dioriteReplaceable, EOVBlocks.DIORITE_COAL_ORE.get().defaultBlockState()),
                BlockReplacement.replace(andesiteReplaceable, EOVBlocks.ANDESITE_COAL_ORE.get().defaultBlockState()),
                BlockReplacement.replace(graniteReplaceable, EOVBlocks.GRANITE_COAL_ORE.get().defaultBlockState()),
                BlockReplacement.replace(deepslateReplaceable, Blocks.DEEPSLATE_COAL_ORE.defaultBlockState()),
                BlockReplacement.replace(tuffReplaceable, EOVBlocks.TUFF_COAL_ORE.get().defaultBlockState()),
                BlockReplacement.replace(blackstoneReplaceable, EOVBlocks.BLACKSTONE_COAL_ORE.get().defaultBlockState())
        );

        context.register(COAL_ORES_FEATURE, new OreFeature(coalOres, 17));
        context.register(COAL_ORES_BURIED_FEATURE, new OreFeature(coalOres, 17, 0.5f));

        //Copper
        List<BlockReplacement> copperOres = List.of(
                BlockReplacement.replace(stoneReplaceable, Blocks.COPPER_ORE.defaultBlockState()),
                BlockReplacement.replace(dioriteReplaceable, EOVBlocks.DIORITE_COPPER_ORE.get().defaultBlockState()),
                BlockReplacement.replace(andesiteReplaceable, EOVBlocks.ANDESITE_COPPER_ORE.get().defaultBlockState()),
                BlockReplacement.replace(graniteReplaceable, EOVBlocks.GRANITE_COPPER_ORE.get().defaultBlockState()),
                BlockReplacement.replace(deepslateReplaceable, Blocks.DEEPSLATE_COPPER_ORE.defaultBlockState()),
                BlockReplacement.replace(tuffReplaceable, EOVBlocks.TUFF_COPPER_ORE.get().defaultBlockState()),
                BlockReplacement.replace(blackstoneReplaceable, EOVBlocks.BLACKSTONE_COPPER_ORE.get().defaultBlockState())
        );

        context.register(COPPER_ORES_LARGE_FEATURE, new OreFeature(copperOres, 20));
        context.register(COPPER_ORES_SMALL_FEATURE, new OreFeature(copperOres, 10));

        //Iron
        List<BlockReplacement> ironOres = List.of(
                BlockReplacement.replace(stoneReplaceable, Blocks.IRON_ORE.defaultBlockState()),
                BlockReplacement.replace(dioriteReplaceable, EOVBlocks.DIORITE_IRON_ORE.get().defaultBlockState()),
                BlockReplacement.replace(andesiteReplaceable, EOVBlocks.ANDESITE_IRON_ORE.get().defaultBlockState()),
                BlockReplacement.replace(graniteReplaceable, EOVBlocks.GRANITE_IRON_ORE.get().defaultBlockState()),
                BlockReplacement.replace(deepslateReplaceable, Blocks.DEEPSLATE_IRON_ORE.defaultBlockState()),
                BlockReplacement.replace(tuffReplaceable, EOVBlocks.TUFF_IRON_ORE.get().defaultBlockState()),
                BlockReplacement.replace(blackstoneReplaceable, EOVBlocks.BLACKSTONE_IRON_ORE.get().defaultBlockState())
        );

        context.register(IRON_ORES_FEATURE, new OreFeature(ironOres, 9));
        context.register(IRON_ORES_SMALL_FEATURE, new OreFeature(ironOres, 4));

        //Gold
        List<BlockReplacement> goldOres = List.of(
                BlockReplacement.replace(stoneReplaceable, Blocks.GOLD_ORE.defaultBlockState()),
                BlockReplacement.replace(dioriteReplaceable, EOVBlocks.DIORITE_GOLD_ORE.get().defaultBlockState()),
                BlockReplacement.replace(andesiteReplaceable, EOVBlocks.ANDESITE_GOLD_ORE.get().defaultBlockState()),
                BlockReplacement.replace(graniteReplaceable, EOVBlocks.GRANITE_GOLD_ORE.get().defaultBlockState()),
                BlockReplacement.replace(deepslateReplaceable, Blocks.DEEPSLATE_GOLD_ORE.defaultBlockState()),
                BlockReplacement.replace(tuffReplaceable, EOVBlocks.TUFF_GOLD_ORE.get().defaultBlockState()),
                BlockReplacement.replace(blackstoneReplaceable, EOVBlocks.BLACKSTONE_GOLD_ORE.get().defaultBlockState())
        );

        List<BlockReplacement> netherGoldOres = List.of(
                BlockReplacement.replace(netherrackReplaceable, Blocks.NETHER_GOLD_ORE.defaultBlockState()),
                BlockReplacement.replace(blackstoneReplaceable, EOVBlocks.BLACKSTONE_GOLD_ORE.get().defaultBlockState())
        );

        context.register(GOLD_ORES_FEATURE, new OreFeature(goldOres, 9));
        context.register(GOLD_ORES_BURIED_FEATURE, new OreFeature(goldOres, 9, 0.5f));
        context.register(NETHER_GOLD_ORES_FEATURE, new OreFeature(netherGoldOres, 10));

        //Quartz
        List<BlockReplacement> quartzOres = List.of(
                BlockReplacement.replace(netherrackReplaceable, Blocks.NETHER_QUARTZ_ORE.defaultBlockState()),
                BlockReplacement.replace(blackstoneReplaceable, EOVBlocks.BLACKSTONE_QUARTZ_ORE.get().defaultBlockState())
        );

        context.register(QUARTZ_ORES_FEATURE, new OreFeature(quartzOres, 14));

        //Lapis lazuli
        List<BlockReplacement> lapisOres = List.of(
                BlockReplacement.replace(stoneReplaceable, Blocks.LAPIS_ORE.defaultBlockState()),
                BlockReplacement.replace(dioriteReplaceable, EOVBlocks.DIORITE_LAPIS_ORE.get().defaultBlockState()),
                BlockReplacement.replace(andesiteReplaceable, EOVBlocks.ANDESITE_LAPIS_ORE.get().defaultBlockState()),
                BlockReplacement.replace(graniteReplaceable, EOVBlocks.GRANITE_LAPIS_ORE.get().defaultBlockState()),
                BlockReplacement.replace(deepslateReplaceable, Blocks.DEEPSLATE_LAPIS_ORE.defaultBlockState()),
                BlockReplacement.replace(tuffReplaceable, EOVBlocks.TUFF_LAPIS_ORE.get().defaultBlockState()),
                BlockReplacement.replace(blackstoneReplaceable, EOVBlocks.BLACKSTONE_LAPIS_ORE.get().defaultBlockState())
        );

        context.register(LAPIS_ORES_FEATURE, new OreFeature(lapisOres, 7));
        context.register(LAPIS_ORES_BURIED_FEATURE, new OreFeature(lapisOres, 7, 1.0f));

        //Redstone
        List<BlockReplacement> redstoneOres = List.of(
                BlockReplacement.replace(stoneReplaceable, Blocks.REDSTONE_ORE.defaultBlockState()),
                BlockReplacement.replace(dioriteReplaceable, EOVBlocks.DIORITE_REDSTONE_ORE.get().defaultBlockState()),
                BlockReplacement.replace(andesiteReplaceable, EOVBlocks.ANDESITE_REDSTONE_ORE.get().defaultBlockState()),
                BlockReplacement.replace(graniteReplaceable, EOVBlocks.GRANITE_REDSTONE_ORE.get().defaultBlockState()),
                BlockReplacement.replace(deepslateReplaceable, Blocks.DEEPSLATE_REDSTONE_ORE.defaultBlockState()),
                BlockReplacement.replace(tuffReplaceable, EOVBlocks.TUFF_REDSTONE_ORE.get().defaultBlockState()),
                BlockReplacement.replace(blackstoneReplaceable, EOVBlocks.BLACKSTONE_REDSTONE_ORE.get().defaultBlockState())
        );

        context.register(REDSTONE_ORES_FEATURE, new OreFeature(redstoneOres, 8));

        //Emerald
        List<BlockReplacement> emeraldOres = List.of(
                BlockReplacement.replace(stoneReplaceable, Blocks.EMERALD_ORE.defaultBlockState()),
                BlockReplacement.replace(dioriteReplaceable, EOVBlocks.DIORITE_EMERALD_ORE.get().defaultBlockState()),
                BlockReplacement.replace(andesiteReplaceable, EOVBlocks.ANDESITE_EMERALD_ORE.get().defaultBlockState()),
                BlockReplacement.replace(graniteReplaceable, EOVBlocks.GRANITE_EMERALD_ORE.get().defaultBlockState()),
                BlockReplacement.replace(deepslateReplaceable, Blocks.DEEPSLATE_EMERALD_ORE.defaultBlockState()),
                BlockReplacement.replace(tuffReplaceable, EOVBlocks.TUFF_EMERALD_ORE.get().defaultBlockState()),
                BlockReplacement.replace(blackstoneReplaceable, EOVBlocks.BLACKSTONE_EMERALD_ORE.get().defaultBlockState())
        );

        context.register(EMERALD_ORES_FEATURE, new OreFeature(emeraldOres, 3));

        //Diamond
        List<BlockReplacement> diamondOres = List.of(
                BlockReplacement.replace(stoneReplaceable, Blocks.DIAMOND_ORE.defaultBlockState()),
                BlockReplacement.replace(dioriteReplaceable, EOVBlocks.DIORITE_DIAMOND_ORE.get().defaultBlockState()),
                BlockReplacement.replace(andesiteReplaceable, EOVBlocks.ANDESITE_DIAMOND_ORE.get().defaultBlockState()),
                BlockReplacement.replace(graniteReplaceable, EOVBlocks.GRANITE_DIAMOND_ORE.get().defaultBlockState()),
                BlockReplacement.replace(deepslateReplaceable, Blocks.DEEPSLATE_DIAMOND_ORE.defaultBlockState()),
                BlockReplacement.replace(tuffReplaceable, EOVBlocks.TUFF_DIAMOND_ORE.get().defaultBlockState()),
                BlockReplacement.replace(blackstoneReplaceable, EOVBlocks.BLACKSTONE_DIAMOND_ORE.get().defaultBlockState()));

        context.register(DIAMOND_ORES_LARGE_FEATURE, new OreFeature(diamondOres, 12, 0.7f));
        context.register(DIAMOND_ORES_SMALL_FEATURE, new OreFeature(diamondOres, 4, 0.5f));
        context.register(DIAMOND_ORES_BURIED_FEATURE, new OreFeature(diamondOres, 8, 1.0f));
    }

    public static ResourceKey<Feature> registerKey(String name) {
        return ResourceKey.create(Registries.FEATURE, Identifier.fromNamespaceAndPath(EnhancedOreVariety.MOD_ID, name));
    }
}
