package net.marmar.enhanced_ore_variety.worldgen;

import net.marmar.enhanced_ore_variety.EnhancedOreVariety;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class EOVPlacedFeatures {
    public static final RegistryKey<PlacedFeature> UPPER_COAL_ORES_PLACED = registerKey("upper_coal_ores_placed");
    public static final RegistryKey<PlacedFeature> LOWER_COAL_ORES_PLACED = registerKey("lower_coal_ores_placed");

    public static final RegistryKey<PlacedFeature> COPPER_ORES_PLACED = registerKey("copper_ores_placed");
    public static final RegistryKey<PlacedFeature> LARGE_COPPER_ORES_PLACED = registerKey("large_copper_ores_placed");

    public static final RegistryKey<PlacedFeature> UPPER_IRON_ORES_PLACED = registerKey("upper_iron_ores_placed");
    public static final RegistryKey<PlacedFeature> MIDDLE_IRON_ORES_PLACED = registerKey("middle_iron_ores_placed");
    public static final RegistryKey<PlacedFeature> SMALL_IRON_ORES_PLACED = registerKey("small_iron_ores_placed");

    public static final RegistryKey<PlacedFeature> EXTRA_GOLD_ORES_PLACED = registerKey("extra_gold_ores_placed");
    public static final RegistryKey<PlacedFeature> GOLD_ORES_PLACED = registerKey("gold_ores_placed");
    public static final RegistryKey<PlacedFeature> LOWER_GOLD_ORES_PLACED = registerKey("lower_gold_ores_placed");
    public static final RegistryKey<PlacedFeature> NETHER_GOLD_ORES_PLACED = registerKey("nether_gold_ores_placed");

    //public static final RegistryKey<PlacedFeature> QUARTZ_ORES_PLACED = registerKey("quartz_ores_placed");

    public static final RegistryKey<PlacedFeature> LAPIS_ORES_PLACED = registerKey("lapis_ores_placed");
    public static final RegistryKey<PlacedFeature> LAPIS_BURIED_ORES_PLACED = registerKey("lapis_buried_ores_placed");

    public static final RegistryKey<PlacedFeature> REDSTONE_ORES_PLACED = registerKey("redstone_ores_placed");
    public static final RegistryKey<PlacedFeature> LOWER_REDSTONE_ORES_PLACED = registerKey("lower_redstone_ores_placed");

    public static final RegistryKey<PlacedFeature> EMERALD_ORES_PLACED = registerKey("emerald_ores_placed");

    public static final RegistryKey<PlacedFeature> DIAMOND_ORES_PLACED = registerKey("diamond_ores_placed");
    public static final RegistryKey<PlacedFeature> LARGE_DIAMOND_ORES_PLACED = registerKey("large_diamond_ores_placed");
    public static final RegistryKey<PlacedFeature> BURIED_DIAMOND_ORES_PLACED = registerKey("buried_diamond_ores_placed");

    public static void boostrap(Registerable<PlacedFeature> context){
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        //Coal
        register(context, UPPER_COAL_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.COAL_ORES_FEATURE),
                EOVOrePlacement.commonOrePlacement(30,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(136), YOffset.TOP)));
        register(context, LOWER_COAL_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.COAL_ORES_BURIED_FEATURE),
                EOVOrePlacement.commonOrePlacement(20,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(192))));

        //Copper
        register(context, COPPER_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.COPPER_ORES_SMALL_FEATURE),
                EOVOrePlacement.commonOrePlacement(16,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-16), YOffset.fixed(112))));
        register(context, LARGE_COPPER_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.COPPER_ORES_LARGE_FEATURE),
                EOVOrePlacement.commonOrePlacement(12,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-16), YOffset.fixed(112))));

        //Iron
        register(context, UPPER_IRON_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.IRON_ORES_FEATURE),
                EOVOrePlacement.commonOrePlacement(80,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(80), YOffset.fixed(384))));
        register(context, MIDDLE_IRON_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.IRON_ORES_FEATURE),
                EOVOrePlacement.commonOrePlacement(10,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-24), YOffset.fixed(56))));
        register(context, SMALL_IRON_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.IRON_ORES_SMALL_FEATURE),
                EOVOrePlacement.commonOrePlacement(10,
                        HeightRangePlacementModifier.uniform(YOffset.BOTTOM, YOffset.fixed(72))));

        //Gold
        register(context, EXTRA_GOLD_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.GOLD_ORES_FEATURE),
                EOVOrePlacement.commonOrePlacement(50,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(32), YOffset.fixed(256))));
        register(context, GOLD_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.GOLD_ORES_BURIED_FEATURE),
                EOVOrePlacement.commonOrePlacement(4,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(32))));
        register(context, LOWER_GOLD_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.GOLD_ORES_BURIED_FEATURE),
                EOVOrePlacement.commonOrePlacement(8,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(-48))));
        register(context, NETHER_GOLD_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.NETHER_GOLD_ORES_FEATURE),
                EOVOrePlacement.commonOrePlacement(10,
                        HeightRangePlacementModifier.uniform(YOffset.aboveBottom(10), YOffset.belowTop(10))));

//        register(context, QUARTZ_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.QUARTZ_ORES_FEATURE),
//                EOVOrePlacement.commonOrePlacement(16,
//                        HeightRangePlacementModifier.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(10))));

        //Lapis
        register(context, LAPIS_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.LAPIS_ORES_FEATURE),
                EOVOrePlacement.commonOrePlacement(2,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-32), YOffset.fixed(32))));
        register(context, LAPIS_BURIED_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.LAPIS_ORES_BURIED_FEATURE),
                EOVOrePlacement.commonOrePlacement(4,
                        HeightRangePlacementModifier.uniform(YOffset.BOTTOM, YOffset.fixed(64))));

        //Redstone
        register(context, REDSTONE_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.REDSTONE_ORES_FEATURE),
                EOVOrePlacement.commonOrePlacement(4,
                        HeightRangePlacementModifier.uniform(YOffset.BOTTOM, YOffset.fixed(15))));
        register(context, LOWER_REDSTONE_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.REDSTONE_ORES_FEATURE),
                EOVOrePlacement.commonOrePlacement(8,
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-32), YOffset.aboveBottom(32))));

        //Emerald
        register(context, EMERALD_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.EMERALD_ORES_FEATURE),
                EOVOrePlacement.commonOrePlacement(100,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-16), YOffset.fixed(480))));

        //Diamond
        register(context, DIAMOND_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.DIAMOND_ORES_SMALL_FEATURE),
                EOVOrePlacement.commonOrePlacement(7,
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
        register(context, LARGE_DIAMOND_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.DIAMOND_ORES_LARGE_FEATURE),
                EOVOrePlacement.rarityOrePlacement(9,
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
        register(context, BURIED_DIAMOND_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.DIAMOND_ORES_BURIED_FEATURE),
                EOVOrePlacement.commonOrePlacement(4,
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(EnhancedOreVariety.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
