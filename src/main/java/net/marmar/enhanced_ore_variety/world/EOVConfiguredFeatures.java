package net.marmar.enhanced_ore_variety.world;

import net.marmar.enhanced_ore_variety.EnhancedOreVariety;
import net.marmar.enhanced_ore_variety.block.EOVBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

import java.util.List;

public class EOVConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?,?>> COAL_ORES_FEATURE = registerKey("coal_ores_feature");
    public static final ResourceKey<ConfiguredFeature<?,?>> COAL_ORES_BURIED_FEATURE = registerKey("coal_ores_buried_feature");

    public static final ResourceKey<ConfiguredFeature<?,?>> COPPER_ORES_SMALL_FEATURE = registerKey("copper_ores_small_feature");
    public static final ResourceKey<ConfiguredFeature<?,?>> COPPER_ORES_LARGE_FEATURE = registerKey("copper_ores_large_feature");

    public static final ResourceKey<ConfiguredFeature<?,?>> IRON_ORES_FEATURE = registerKey("iron_ores_feature");
    public static final ResourceKey<ConfiguredFeature<?,?>> IRON_ORES_SMALL_FEATURE = registerKey("iron_ores_small_feature");

    public static final ResourceKey<ConfiguredFeature<?,?>> GOLD_ORES_FEATURE = registerKey("gold_ores_feature");
    public static final ResourceKey<ConfiguredFeature<?,?>> GOLD_ORES_BURIED_FEATURE = registerKey("gold_ores_buried_feature");
    public static final ResourceKey<ConfiguredFeature<?,?>> NETHER_GOLD_ORES_FEATURE = registerKey("nether_gold_ores_feature");

    public static final ResourceKey<ConfiguredFeature<?,?>> QUARTZ_ORES_FEATURE = registerKey("quartz_ores_feature");

    public static final ResourceKey<ConfiguredFeature<?,?>> LAPIS_ORES_FEATURE = registerKey("lapis_ores_feature");
    public static final ResourceKey<ConfiguredFeature<?,?>> LAPIS_ORES_BURIED_FEATURE = registerKey("lapis_ores_buried_feature");

    public static final ResourceKey<ConfiguredFeature<?,?>> REDSTONE_ORES_FEATURE = registerKey("redstone_ores_feature");

    public static final ResourceKey<ConfiguredFeature<?,?>> EMERALD_ORES_FEATURE = registerKey("emerald_ores_feature");

    public static final ResourceKey<ConfiguredFeature<?,?>> DIAMOND_ORES_SMALL_FEATURE = registerKey("diamond_ores_small_feature");
    public static final ResourceKey<ConfiguredFeature<?,?>> DIAMOND_ORES_LARGE_FEATURE = registerKey("diamond_ores_large_feature");
    public static final ResourceKey<ConfiguredFeature<?,?>> DIAMOND_ORES_BURIED_FEATURE = registerKey("diamond_ores_buried_feature");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?,?>> context){
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
        List<OreConfiguration.TargetBlockState> coalOres = List.of(
                OreConfiguration.target(stoneReplaceable, Blocks.COAL_ORE.defaultBlockState()),
                OreConfiguration.target(dioriteReplaceable, EOVBlocks.DIORITE_COAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(andesiteReplaceable, EOVBlocks.ANDESITE_COAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(graniteReplaceable, EOVBlocks.GRANITE_COAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, Blocks.DEEPSLATE_COAL_ORE.defaultBlockState()),
                OreConfiguration.target(tuffReplaceable, EOVBlocks.TUFF_COAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(blackstoneReplaceable, EOVBlocks.BLACKSTONE_COAL_ORE.get().defaultBlockState()));

        register(context, COAL_ORES_FEATURE, Feature.ORE, new OreConfiguration(coalOres, 17));
        register(context, COAL_ORES_BURIED_FEATURE, Feature.ORE, new OreConfiguration(coalOres, 17, 0.5f));

        //Copper
        List<OreConfiguration.TargetBlockState> copperOres = List.of(
                OreConfiguration.target(stoneReplaceable, Blocks.COPPER_ORE.defaultBlockState()),
                OreConfiguration.target(dioriteReplaceable, EOVBlocks.DIORITE_COPPER_ORE.get().defaultBlockState()),
                OreConfiguration.target(andesiteReplaceable, EOVBlocks.ANDESITE_COPPER_ORE.get().defaultBlockState()),
                OreConfiguration.target(graniteReplaceable, EOVBlocks.GRANITE_COPPER_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, Blocks.DEEPSLATE_COPPER_ORE.defaultBlockState()),
                OreConfiguration.target(tuffReplaceable, EOVBlocks.TUFF_COPPER_ORE.get().defaultBlockState()),
                OreConfiguration.target(blackstoneReplaceable, EOVBlocks.BLACKSTONE_COPPER_ORE.get().defaultBlockState()));

        register(context, COPPER_ORES_LARGE_FEATURE, Feature.ORE, new OreConfiguration(copperOres, 20));
        register(context, COPPER_ORES_SMALL_FEATURE, Feature.ORE, new OreConfiguration(copperOres, 10));

        //Iron
        List<OreConfiguration.TargetBlockState> ironOres = List.of(
                OreConfiguration.target(stoneReplaceable, Blocks.IRON_ORE.defaultBlockState()),
                OreConfiguration.target(dioriteReplaceable, EOVBlocks.DIORITE_IRON_ORE.get().defaultBlockState()),
                OreConfiguration.target(andesiteReplaceable, EOVBlocks.ANDESITE_IRON_ORE.get().defaultBlockState()),
                OreConfiguration.target(graniteReplaceable, EOVBlocks.GRANITE_IRON_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, Blocks.DEEPSLATE_IRON_ORE.defaultBlockState()),
                OreConfiguration.target(tuffReplaceable, EOVBlocks.TUFF_IRON_ORE.get().defaultBlockState()),
                OreConfiguration.target(blackstoneReplaceable, EOVBlocks.BLACKSTONE_IRON_ORE.get().defaultBlockState()));

        register(context, IRON_ORES_FEATURE, Feature.ORE, new OreConfiguration(ironOres, 9));
        register(context, IRON_ORES_SMALL_FEATURE, Feature.ORE, new OreConfiguration(ironOres, 4));

        //Gold
        List<OreConfiguration.TargetBlockState> goldOres = List.of(
                OreConfiguration.target(stoneReplaceable, Blocks.GOLD_ORE.defaultBlockState()),
                OreConfiguration.target(dioriteReplaceable, EOVBlocks.DIORITE_GOLD_ORE.get().defaultBlockState()),
                OreConfiguration.target(andesiteReplaceable, EOVBlocks.ANDESITE_GOLD_ORE.get().defaultBlockState()),
                OreConfiguration.target(graniteReplaceable, EOVBlocks.GRANITE_GOLD_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, Blocks.DEEPSLATE_GOLD_ORE.defaultBlockState()),
                OreConfiguration.target(tuffReplaceable, EOVBlocks.TUFF_GOLD_ORE.get().defaultBlockState()),
                OreConfiguration.target(blackstoneReplaceable, EOVBlocks.BLACKSTONE_GOLD_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> netherGoldOres = List.of(
                OreConfiguration.target(netherrackReplaceable, Blocks.NETHER_GOLD_ORE.defaultBlockState()),
                OreConfiguration.target(blackstoneReplaceable, EOVBlocks.BLACKSTONE_GOLD_ORE.get().defaultBlockState())
        );

        register(context, GOLD_ORES_FEATURE, Feature.ORE, new OreConfiguration(goldOres, 9));
        register(context, GOLD_ORES_BURIED_FEATURE, Feature.ORE, new OreConfiguration(goldOres, 9, 0.5f));
        register(context, NETHER_GOLD_ORES_FEATURE, Feature.ORE, new OreConfiguration(netherGoldOres, 10));

        //Quartz
        List<OreConfiguration.TargetBlockState> quartzOres = List.of(
                OreConfiguration.target(netherrackReplaceable, Blocks.NETHER_QUARTZ_ORE.defaultBlockState()),
                OreConfiguration.target(blackstoneReplaceable, EOVBlocks.BLACKSTONE_QUARTZ_ORE.get().defaultBlockState())
        );

        register(context, QUARTZ_ORES_FEATURE, Feature.ORE, new OreConfiguration(quartzOres, 14));

        //Lapis lazuli
        List<OreConfiguration.TargetBlockState> lapisOres = List.of(
                OreConfiguration.target(stoneReplaceable, Blocks.LAPIS_ORE.defaultBlockState()),
                OreConfiguration.target(dioriteReplaceable, EOVBlocks.DIORITE_LAPIS_ORE.get().defaultBlockState()),
                OreConfiguration.target(andesiteReplaceable, EOVBlocks.ANDESITE_LAPIS_ORE.get().defaultBlockState()),
                OreConfiguration.target(graniteReplaceable, EOVBlocks.GRANITE_LAPIS_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, Blocks.DEEPSLATE_LAPIS_ORE.defaultBlockState()),
                OreConfiguration.target(tuffReplaceable, EOVBlocks.TUFF_LAPIS_ORE.get().defaultBlockState()),
                OreConfiguration.target(blackstoneReplaceable, EOVBlocks.BLACKSTONE_LAPIS_ORE.get().defaultBlockState()));

        register(context, LAPIS_ORES_FEATURE, Feature.ORE, new OreConfiguration(lapisOres, 7));
        register(context, LAPIS_ORES_BURIED_FEATURE, Feature.ORE, new OreConfiguration(lapisOres, 7, 1.0f));

        //Redstone
        List<OreConfiguration.TargetBlockState> redstoneOres = List.of(
                OreConfiguration.target(stoneReplaceable, Blocks.REDSTONE_ORE.defaultBlockState()),
                OreConfiguration.target(dioriteReplaceable, EOVBlocks.DIORITE_REDSTONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(andesiteReplaceable, EOVBlocks.ANDESITE_REDSTONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(graniteReplaceable, EOVBlocks.GRANITE_REDSTONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, Blocks.DEEPSLATE_REDSTONE_ORE.defaultBlockState()),
                OreConfiguration.target(tuffReplaceable, EOVBlocks.TUFF_REDSTONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(blackstoneReplaceable, EOVBlocks.BLACKSTONE_REDSTONE_ORE.get().defaultBlockState()));

        register(context, REDSTONE_ORES_FEATURE, Feature.ORE, new OreConfiguration(redstoneOres, 8));

        //Emerald
        List<OreConfiguration.TargetBlockState> emeraldOres = List.of(
                OreConfiguration.target(stoneReplaceable, Blocks.EMERALD_ORE.defaultBlockState()),
                OreConfiguration.target(dioriteReplaceable, EOVBlocks.DIORITE_EMERALD_ORE.get().defaultBlockState()),
                OreConfiguration.target(andesiteReplaceable, EOVBlocks.ANDESITE_EMERALD_ORE.get().defaultBlockState()),
                OreConfiguration.target(graniteReplaceable, EOVBlocks.GRANITE_EMERALD_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, Blocks.DEEPSLATE_EMERALD_ORE.defaultBlockState()),
                OreConfiguration.target(tuffReplaceable, EOVBlocks.TUFF_EMERALD_ORE.get().defaultBlockState()),
                OreConfiguration.target(blackstoneReplaceable, EOVBlocks.BLACKSTONE_EMERALD_ORE.get().defaultBlockState()));

        register(context, EMERALD_ORES_FEATURE, Feature.ORE, new OreConfiguration(emeraldOres, 3));

        //Diamond
        List<OreConfiguration.TargetBlockState> diamondOres = List.of(
                OreConfiguration.target(stoneReplaceable, Blocks.DIAMOND_ORE.defaultBlockState()),
                OreConfiguration.target(dioriteReplaceable, EOVBlocks.DIORITE_DIAMOND_ORE.get().defaultBlockState()),
                OreConfiguration.target(andesiteReplaceable, EOVBlocks.ANDESITE_DIAMOND_ORE.get().defaultBlockState()),
                OreConfiguration.target(graniteReplaceable, EOVBlocks.GRANITE_DIAMOND_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, Blocks.DEEPSLATE_DIAMOND_ORE.defaultBlockState()),
                OreConfiguration.target(tuffReplaceable, EOVBlocks.TUFF_DIAMOND_ORE.get().defaultBlockState()),
                OreConfiguration.target(blackstoneReplaceable, EOVBlocks.BLACKSTONE_DIAMOND_ORE.get().defaultBlockState()));

        register(context, DIAMOND_ORES_LARGE_FEATURE, Feature.ORE, new OreConfiguration(diamondOres, 12, 0.7f));
        register(context, DIAMOND_ORES_SMALL_FEATURE, Feature.ORE, new OreConfiguration(diamondOres, 4, 0.5f));
        register(context, DIAMOND_ORES_BURIED_FEATURE, Feature.ORE, new OreConfiguration(diamondOres, 8, 1.0f));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(EnhancedOreVariety.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
