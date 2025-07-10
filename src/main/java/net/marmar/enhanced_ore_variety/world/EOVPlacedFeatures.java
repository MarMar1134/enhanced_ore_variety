package net.marmar.enhanced_ore_variety.world;

import net.marmar.enhanced_ore_variety.EnhancedOreVariety;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class EOVPlacedFeatures {
    public static final ResourceKey<PlacedFeature> UPPER_COAL_ORES_PLACED = registerKey("upper_coal_ores_placed");
    public static final ResourceKey<PlacedFeature> LOWER_COAL_ORES_PLACED = registerKey("lower_coal_ores_placed");

    public static final ResourceKey<PlacedFeature> COPPER_ORES_PLACED = registerKey("copper_ores_placed");
    public static final ResourceKey<PlacedFeature> LARGE_COPPER_ORES_PLACED = registerKey("large_copper_ores_placed");

    public static final ResourceKey<PlacedFeature> UPPER_IRON_ORES_PLACED = registerKey("upper_iron_ores_placed");
    public static final ResourceKey<PlacedFeature> MIDDLE_IRON_ORES_PLACED = registerKey("middle_iron_ores_placed");
    public static final ResourceKey<PlacedFeature> SMALL_IRON_ORES_PLACED = registerKey("small_iron_ores_placed");

    public static final ResourceKey<PlacedFeature> EXTRA_GOLD_ORES_PLACED = registerKey("extra_gold_ores_placed");
    public static final ResourceKey<PlacedFeature> GOLD_ORES_PLACED = registerKey("gold_ores_placed");
    public static final ResourceKey<PlacedFeature> LOWER_GOLD_ORES_PLACED = registerKey("lower_gold_ores_placed");

    public static final ResourceKey<PlacedFeature> LAPIS_ORES_PLACED = registerKey("lapis_ores_placed");
    public static final ResourceKey<PlacedFeature> LAPIS_BURIED_ORES_PLACED = registerKey("lapis_buried_ores_placed");

    public static final ResourceKey<PlacedFeature> REDSTONE_ORES_PLACED = registerKey("redstone_ores_placed");
    public static final ResourceKey<PlacedFeature> LOWER_REDSTONE_ORES_PLACED = registerKey("lower_redstone_ores_placed");

    public static final ResourceKey<PlacedFeature> EMERALD_ORES_PLACED = registerKey("emerald_ores_placed");

    public static final ResourceKey<PlacedFeature> DIAMOND_ORES_PLACED = registerKey("diamond_ores_placed");
    public static final ResourceKey<PlacedFeature> LARGE_DIAMOND_ORES_PLACED = registerKey("large_diamond_ores_placed");
    public static final ResourceKey<PlacedFeature> BURIED_DIAMOND_ORES_PLACED = registerKey("buried_diamond_ores_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context){
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        //Coal
        register(context, UPPER_COAL_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.COAL_ORES_FEATURE),
                EOVOrePlacement.commonOrePlacement(30,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(136), VerticalAnchor.top())));
        register(context, LOWER_COAL_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.COAL_ORES_BURIED_FEATURE),
                EOVOrePlacement.commonOrePlacement(20,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(0), VerticalAnchor.absolute(192))));

        //Copper
        register(context, COPPER_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.COPPER_ORES_SMALL_FEATURE),
                EOVOrePlacement.commonOrePlacement(16,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(112))));
        register(context, LARGE_COPPER_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.COPPER_ORES_LARGE_FEATURE),
                EOVOrePlacement.commonOrePlacement(16,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(112))));

        //Iron
        register(context, UPPER_IRON_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.IRON_ORES_FEATURE),
                EOVOrePlacement.commonOrePlacement(90,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(80), VerticalAnchor.absolute(384))));
        register(context, MIDDLE_IRON_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.IRON_ORES_FEATURE),
                EOVOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-24), VerticalAnchor.absolute(56))));
        register(context, SMALL_IRON_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.IRON_ORES_SMALL_FEATURE),
                EOVOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(72))));

        //Gold
        register(context, EXTRA_GOLD_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.GOLD_ORES_FEATURE),
                EOVOrePlacement.commonOrePlacement(50,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(32), VerticalAnchor.absolute(256))));
        register(context, GOLD_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.GOLD_ORES_BURIED_FEATURE),
                EOVOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));
        register(context, LOWER_GOLD_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.GOLD_ORES_BURIED_FEATURE),
                EOVOrePlacement.orePlacement(CountPlacement.of(UniformInt.of(0, 1)),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-48))));

        //Lapis
        register(context, LAPIS_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.LAPIS_ORES_FEATURE),
                EOVOrePlacement.commonOrePlacement(2,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-32), VerticalAnchor.absolute(32))));
        register(context, LAPIS_BURIED_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.LAPIS_ORES_BURIED_FEATURE),
                EOVOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(64))));

        //Redstone
        register(context, REDSTONE_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.REDSTONE_ORES_FEATURE),
                EOVOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(15))));
        register(context, LOWER_REDSTONE_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.REDSTONE_ORES_FEATURE),
                EOVOrePlacement.commonOrePlacement(8,
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-32), VerticalAnchor.aboveBottom(32))));

        //Emerald
        register(context, EMERALD_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.EMERALD_ORES_FEATURE),
                EOVOrePlacement.commonOrePlacement(100,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(480))));

        //Diamond
        register(context, DIAMOND_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.DIAMOND_ORES_SMALL_FEATURE),
                EOVOrePlacement.commonOrePlacement(7,
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, LARGE_DIAMOND_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.DIAMOND_ORES_LARGE_FEATURE),
                EOVOrePlacement.rareOrePlacement(9,
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, BURIED_DIAMOND_ORES_PLACED, configuredFeatures.getOrThrow(EOVConfiguredFeatures.DIAMOND_ORES_BURIED_FEATURE),
                EOVOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(EnhancedOreVariety.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
