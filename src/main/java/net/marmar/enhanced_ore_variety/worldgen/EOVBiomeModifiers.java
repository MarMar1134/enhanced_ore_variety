package net.marmar.enhanced_ore_variety.worldgen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.marmar.enhanced_ore_variety.EnhancedOreVariety;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.OrePlacedFeatures;
import net.minecraft.world.gen.feature.PlacedFeature;

import java.util.function.Predicate;

public class EOVBiomeModifiers {
    private static final GenerationStep.Feature ORES = GenerationStep.Feature.UNDERGROUND_ORES;

    public static void InitializeBiomeModifications() {
        removeVanillaOres();
        addEnhancedOres();
    }

    private static void removeVanillaOres() {
        remove("remove_overworld_ores", BiomeSelectors.foundInOverworld(),
                OrePlacedFeatures.ORE_COPPER, OrePlacedFeatures.ORE_COPPER_LARGE,
                OrePlacedFeatures.ORE_COAL_UPPER, OrePlacedFeatures.ORE_COAL_LOWER,
                OrePlacedFeatures.ORE_IRON_UPPER, OrePlacedFeatures.ORE_IRON_MIDDLE, OrePlacedFeatures.ORE_IRON_SMALL,
                OrePlacedFeatures.ORE_GOLD_EXTRA, OrePlacedFeatures.ORE_GOLD, OrePlacedFeatures.ORE_GOLD_LOWER,
                OrePlacedFeatures.ORE_REDSTONE, OrePlacedFeatures.ORE_REDSTONE_LOWER,
                OrePlacedFeatures.ORE_LAPIS, OrePlacedFeatures.ORE_LAPIS_BURIED,
                OrePlacedFeatures.ORE_EMERALD,
                OrePlacedFeatures.ORE_DIAMOND, OrePlacedFeatures.ORE_DIAMOND_LARGE, OrePlacedFeatures.ORE_DIAMOND_BURIED);

        remove("remove_nether_ores", BiomeSelectors.foundInTheNether(), OrePlacedFeatures.ORE_GOLD_NETHER);
    }

    private static void addEnhancedOres() {
        add(BiomeSelectors.foundInOverworld(),
                EOVPlacedFeatures.COPPER_ORES_PLACED, EOVPlacedFeatures.LARGE_COPPER_ORES_PLACED,
                EOVPlacedFeatures.UPPER_COAL_ORES_PLACED, EOVPlacedFeatures.LOWER_COAL_ORES_PLACED,
                EOVPlacedFeatures.UPPER_IRON_ORES_PLACED, EOVPlacedFeatures.MIDDLE_IRON_ORES_PLACED,
                EOVPlacedFeatures.SMALL_IRON_ORES_PLACED,
                EOVPlacedFeatures.GOLD_ORES_PLACED, EOVPlacedFeatures.LOWER_GOLD_ORES_PLACED,
                EOVPlacedFeatures.REDSTONE_ORES_PLACED, EOVPlacedFeatures.LOWER_REDSTONE_ORES_PLACED,
                EOVPlacedFeatures.LAPIS_ORES_PLACED, EOVPlacedFeatures.LAPIS_BURIED_ORES_PLACED,
                EOVPlacedFeatures.DIAMOND_ORES_PLACED, EOVPlacedFeatures.LARGE_DIAMOND_ORES_PLACED,
                EOVPlacedFeatures.BURIED_DIAMOND_ORES_PLACED);

        add(BiomeSelectors.tag(BiomeTags.IS_BADLANDS), EOVPlacedFeatures.EXTRA_GOLD_ORES_PLACED);
        add(BiomeSelectors.tag(BiomeTags.IS_MOUNTAIN), EOVPlacedFeatures.EMERALD_ORES_PLACED);
        add(BiomeSelectors.foundInTheNether(), EOVPlacedFeatures.NETHER_GOLD_ORES_PLACED);
    }

    @SafeVarargs
    private static void remove(String name, Predicate<BiomeSelectionContext> selector, RegistryKey<PlacedFeature>... features) {
        BiomeModifications.create(new Identifier(EnhancedOreVariety.MOD_ID, name))
                .add(ModificationPhase.REMOVALS, selector, context -> {
                    for (RegistryKey<PlacedFeature> feature : features) {
                        context.getGenerationSettings().removeFeature(ORES, feature);
                    }
                });
    }

    @SafeVarargs
    private static void add(Predicate<BiomeSelectionContext> selector, RegistryKey<PlacedFeature>... features) {
        for (RegistryKey<PlacedFeature> feature : features) {
            BiomeModifications.addFeature(selector, ORES, feature);
        }
    }
}