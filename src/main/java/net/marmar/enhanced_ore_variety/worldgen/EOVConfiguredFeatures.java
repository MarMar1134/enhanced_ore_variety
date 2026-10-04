package net.marmar.enhanced_ore_variety.worldgen;

import net.marmar.enhanced_ore_variety.EnhancedOreVariety;
import net.marmar.enhanced_ore_variety.block.EOVBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class EOVConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?,?>> COAL_ORES_FEATURE = registerKey("coal_ores_feature");
    public static final RegistryKey<ConfiguredFeature<?,?>> COAL_ORES_BURIED_FEATURE = registerKey("coal_ores_buried_feature");

    public static final RegistryKey<ConfiguredFeature<?,?>> COPPER_ORES_SMALL_FEATURE = registerKey("copper_ores_small_feature");
    public static final RegistryKey<ConfiguredFeature<?,?>> COPPER_ORES_LARGE_FEATURE = registerKey("copper_ores_large_feature");

    public static final RegistryKey<ConfiguredFeature<?,?>> IRON_ORES_FEATURE = registerKey("iron_ores_feature");
    public static final RegistryKey<ConfiguredFeature<?,?>> IRON_ORES_SMALL_FEATURE = registerKey("iron_ores_small_feature");

    public static final RegistryKey<ConfiguredFeature<?,?>> GOLD_ORES_FEATURE = registerKey("gold_ores_feature");
    public static final RegistryKey<ConfiguredFeature<?,?>> GOLD_ORES_BURIED_FEATURE = registerKey("gold_ores_buried_feature");
    public static final RegistryKey<ConfiguredFeature<?,?>> NETHER_GOLD_ORES_FEATURE = registerKey("nether_gold_ores_feature");

    //public static final RegistryKey<ConfiguredFeature<?,?>> QUARTZ_ORES_FEATURE = registerKey("quartz_ores_feature");

    public static final RegistryKey<ConfiguredFeature<?,?>> LAPIS_ORES_FEATURE = registerKey("lapis_ores_feature");
    public static final RegistryKey<ConfiguredFeature<?,?>> LAPIS_ORES_BURIED_FEATURE = registerKey("lapis_ores_buried_feature");

    public static final RegistryKey<ConfiguredFeature<?,?>> REDSTONE_ORES_FEATURE = registerKey("redstone_ores_feature");

    public static final RegistryKey<ConfiguredFeature<?,?>> EMERALD_ORES_FEATURE = registerKey("emerald_ores_feature");

    public static final RegistryKey<ConfiguredFeature<?,?>> DIAMOND_ORES_SMALL_FEATURE = registerKey("diamond_ores_small_feature");
    public static final RegistryKey<ConfiguredFeature<?,?>> DIAMOND_ORES_LARGE_FEATURE = registerKey("diamond_ores_large_feature");
    public static final RegistryKey<ConfiguredFeature<?,?>> DIAMOND_ORES_BURIED_FEATURE = registerKey("diamond_ores_buried_feature");

    public static void boostrap(Registerable<ConfiguredFeature<?, ?>> context){
        //Rule tests
        RuleTest stoneReplaceable = new BlockMatchRuleTest(Blocks.STONE);
        RuleTest dioriteReplaceable = new BlockMatchRuleTest(Blocks.DIORITE);
        RuleTest andesiteReplaceable = new BlockMatchRuleTest(Blocks.ANDESITE);
        RuleTest graniteReplaceable = new BlockMatchRuleTest(Blocks.GRANITE);
        RuleTest deepslateReplaceable = new BlockMatchRuleTest(Blocks.DEEPSLATE);
        RuleTest tuffReplaceable = new BlockMatchRuleTest(Blocks.TUFF);
        RuleTest netherrackReplaceable = new BlockMatchRuleTest(Blocks.NETHERRACK);
        RuleTest blackstoneReplaceable = new BlockMatchRuleTest(Blocks.BLACKSTONE);

        //Coal
        List<OreFeatureConfig.Target> coalOres = List.of(
                OreFeatureConfig.createTarget(stoneReplaceable, Blocks.COAL_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(dioriteReplaceable, EOVBlocks.DIORITE_COAL_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(andesiteReplaceable, EOVBlocks.ANDESITE_COAL_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(graniteReplaceable, EOVBlocks.GRANITE_COAL_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceable, Blocks.DEEPSLATE_COAL_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(tuffReplaceable, EOVBlocks.TUFF_COAL_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(blackstoneReplaceable, EOVBlocks.BLACKSTONE_COAL_ORE.getDefaultState()));

        register(context, COAL_ORES_FEATURE, Feature.ORE, new OreFeatureConfig(coalOres, 17));
        register(context, COAL_ORES_BURIED_FEATURE, Feature.ORE, new OreFeatureConfig(coalOres, 17, 0.5f));

        //Copper
        List<OreFeatureConfig.Target> copperOres = List.of(
                OreFeatureConfig.createTarget(stoneReplaceable, Blocks.COPPER_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(dioriteReplaceable, EOVBlocks.DIORITE_COPPER_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(andesiteReplaceable, EOVBlocks.ANDESITE_COPPER_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(graniteReplaceable, EOVBlocks.GRANITE_COPPER_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceable, Blocks.DEEPSLATE_COPPER_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(tuffReplaceable, EOVBlocks.TUFF_COPPER_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(blackstoneReplaceable, EOVBlocks.BLACKSTONE_COPPER_ORE.getDefaultState()));

        register(context, COPPER_ORES_LARGE_FEATURE, Feature.ORE, new OreFeatureConfig(copperOres, 20, 0.5f));
        register(context, COPPER_ORES_SMALL_FEATURE, Feature.ORE, new OreFeatureConfig(copperOres, 10, 0.2f));

        //Iron
        List<OreFeatureConfig.Target> ironOres = List.of(
                OreFeatureConfig.createTarget(stoneReplaceable, Blocks.IRON_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(dioriteReplaceable, EOVBlocks.DIORITE_IRON_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(andesiteReplaceable, EOVBlocks.ANDESITE_IRON_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(graniteReplaceable, EOVBlocks.GRANITE_IRON_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceable, Blocks.DEEPSLATE_IRON_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(tuffReplaceable, EOVBlocks.TUFF_IRON_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(blackstoneReplaceable, EOVBlocks.BLACKSTONE_IRON_ORE.getDefaultState()));

        register(context, IRON_ORES_FEATURE, Feature.ORE, new OreFeatureConfig(ironOres, 9));
        register(context, IRON_ORES_SMALL_FEATURE, Feature.ORE, new OreFeatureConfig(ironOres, 4));

        //Gold
        List<OreFeatureConfig.Target> goldOres = List.of(
                OreFeatureConfig.createTarget(stoneReplaceable, Blocks.GOLD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(dioriteReplaceable, EOVBlocks.DIORITE_GOLD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(andesiteReplaceable, EOVBlocks.ANDESITE_GOLD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(graniteReplaceable, EOVBlocks.GRANITE_GOLD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceable, Blocks.DEEPSLATE_GOLD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(tuffReplaceable, EOVBlocks.TUFF_GOLD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(blackstoneReplaceable, EOVBlocks.BLACKSTONE_GOLD_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> netherGoldOres = List.of(
                OreFeatureConfig.createTarget(netherrackReplaceable, Blocks.NETHER_GOLD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(blackstoneReplaceable, EOVBlocks.BLACKSTONE_GOLD_ORE.getDefaultState())
        );

        register(context, GOLD_ORES_FEATURE, Feature.ORE, new OreFeatureConfig(goldOres, 9));
        register(context, GOLD_ORES_BURIED_FEATURE, Feature.ORE, new OreFeatureConfig(goldOres, 9, 0.5f));
        register(context, NETHER_GOLD_ORES_FEATURE, Feature.ORE, new OreFeatureConfig(netherGoldOres, 10));

        //Quartz
//        List<OreFeatureConfig.Target> quartzOres = List.of(
//                OreFeatureConfig.createTarget(netherrackReplaceable, Blocks.NETHER_QUARTZ_ORE.getDefaultState()),
//                OreFeatureConfig.createTarget(blackstoneReplaceable, EOVBlocks.BLACKSTONE_QUARTZ_ORE.getDefaultState())
//        );
//
//        register(context, QUARTZ_ORES_FEATURE, Feature.ORE, new OreFeatureConfig(quartzOres, 14));

        //Lapis lazuli
        List<OreFeatureConfig.Target> lapisOres = List.of(
                OreFeatureConfig.createTarget(stoneReplaceable, Blocks.LAPIS_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(dioriteReplaceable, EOVBlocks.DIORITE_LAPIS_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(andesiteReplaceable, EOVBlocks.ANDESITE_LAPIS_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(graniteReplaceable, EOVBlocks.GRANITE_LAPIS_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceable, Blocks.DEEPSLATE_LAPIS_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(tuffReplaceable, EOVBlocks.TUFF_LAPIS_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(blackstoneReplaceable, EOVBlocks.BLACKSTONE_LAPIS_ORE.getDefaultState()));

        register(context, LAPIS_ORES_FEATURE, Feature.ORE, new OreFeatureConfig(lapisOres, 7));
        register(context, LAPIS_ORES_BURIED_FEATURE, Feature.ORE, new OreFeatureConfig(lapisOres, 7, 1.0f));

        //Redstone
        List<OreFeatureConfig.Target> redstoneOres = List.of(
                OreFeatureConfig.createTarget(stoneReplaceable, Blocks.REDSTONE_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(dioriteReplaceable, EOVBlocks.DIORITE_REDSTONE_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(andesiteReplaceable, EOVBlocks.ANDESITE_REDSTONE_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(graniteReplaceable, EOVBlocks.GRANITE_REDSTONE_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceable, Blocks.DEEPSLATE_REDSTONE_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(tuffReplaceable, EOVBlocks.TUFF_REDSTONE_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(blackstoneReplaceable, EOVBlocks.BLACKSTONE_REDSTONE_ORE.getDefaultState()));

        register(context, REDSTONE_ORES_FEATURE, Feature.ORE, new OreFeatureConfig(redstoneOres, 8, 0.1f));

        //Emerald
        List<OreFeatureConfig.Target> emeraldOres = List.of(
                OreFeatureConfig.createTarget(stoneReplaceable, Blocks.EMERALD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(dioriteReplaceable, EOVBlocks.DIORITE_EMERALD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(andesiteReplaceable, EOVBlocks.ANDESITE_EMERALD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(graniteReplaceable, EOVBlocks.GRANITE_EMERALD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceable, Blocks.DEEPSLATE_EMERALD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(tuffReplaceable, EOVBlocks.TUFF_EMERALD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(blackstoneReplaceable, EOVBlocks.BLACKSTONE_DIAMOND_ORE.getDefaultState()));

        register(context, EMERALD_ORES_FEATURE, Feature.ORE, new OreFeatureConfig(emeraldOres, 3));

        //Diamond
        List<OreFeatureConfig.Target> diamondOres = List.of(
                OreFeatureConfig.createTarget(stoneReplaceable, Blocks.DIAMOND_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(dioriteReplaceable, EOVBlocks.DIORITE_DIAMOND_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(andesiteReplaceable, EOVBlocks.ANDESITE_DIAMOND_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(graniteReplaceable, EOVBlocks.GRANITE_DIAMOND_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceable, Blocks.DEEPSLATE_DIAMOND_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(tuffReplaceable, EOVBlocks.TUFF_DIAMOND_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(blackstoneReplaceable, EOVBlocks.BLACKSTONE_DIAMOND_ORE.getDefaultState()));

        register(context, DIAMOND_ORES_LARGE_FEATURE, Feature.ORE, new OreFeatureConfig(diamondOres, 12, 0.7f));
        register(context, DIAMOND_ORES_SMALL_FEATURE, Feature.ORE, new OreFeatureConfig(diamondOres, 4, 0.5f));
        register(context, DIAMOND_ORES_BURIED_FEATURE, Feature.ORE, new OreFeatureConfig(diamondOres, 8, 1.0f));
    }


    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(EnhancedOreVariety.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context, RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
