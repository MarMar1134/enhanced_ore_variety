package net.marmar.enhanced_ore_variety.world;

import net.marmar.enhanced_ore_variety.EnhancedOreVariety;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.OrePlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.Set;

public class EOVBiomeModifiers {
    //Feature removers
    public static final ResourceKey<BiomeModifier> REMOVE_COPPER_ORE = registerKey("remove_copper_ore");
    public static final ResourceKey<BiomeModifier> REMOVE_COPPER_LARGE_ORE = registerKey("remove_copper_large_ore");

    public static final ResourceKey<BiomeModifier> REMOVE_COAL_UPPER_ORE = registerKey("remove_coal_upper_ore");
    public static final ResourceKey<BiomeModifier> REMOVE_COAL_LOWER_ORE = registerKey("remove_coal_lower_ore");

    public static final ResourceKey<BiomeModifier> REMOVE_IRON_UPPER_ORE = registerKey("remove_iron_upper_ore");
    public static final ResourceKey<BiomeModifier> REMOVE_IRON_MIDDLE_ORE = registerKey("remove_iron_middle_ore");
    public static final ResourceKey<BiomeModifier> REMOVE_IRON_SMALL_ORE = registerKey("remove_iron_small_ore");

    public static final ResourceKey<BiomeModifier> REMOVE_GOLD_ORE_EXTRA = registerKey("remove_gold_ore_extra");
    public static final ResourceKey<BiomeModifier> REMOVE_GOLD_ORE = registerKey("remove_gold_ore");
    public static final ResourceKey<BiomeModifier> REMOVE_GOLD_ORE_LOWER = registerKey("remove_gold_ore_lower");
    public static final ResourceKey<BiomeModifier> REMOVE_NETHER_GOLD_ORE = registerKey("remove_nether_gold_ore");

    public static final ResourceKey<BiomeModifier> REMOVE_QUARTZ_ORE = registerKey("remove_quartz_ore");

    public static final ResourceKey<BiomeModifier> REMOVE_REDSTONE_ORE = registerKey("remove_redstone_ore");
    public static final ResourceKey<BiomeModifier> REMOVE_REDSTONE_LOWER_ORE = registerKey("remove_redstone_lower_ore");

    public static final ResourceKey<BiomeModifier> REMOVE_LAPIS_ORE = registerKey("remove_lapis_ore");
    public static final ResourceKey<BiomeModifier> REMOVE_LAPIS_BURIED_ORE = registerKey("remove_lapis_buried_ore");

    public static final ResourceKey<BiomeModifier> REMOVE_EMERALD_ORE = registerKey("remove_emerald_ore");

    public static final ResourceKey<BiomeModifier> REMOVE_DIAMOND_ORE = registerKey("remove_diamond_ore");
    public static final ResourceKey<BiomeModifier> REMOVE_DIAMOND_LARGE_ORE = registerKey("remove_diamond_large_ore");
    public static final ResourceKey<BiomeModifier> REMOVE_DIAMOND_BURIED_ORE = registerKey("remove_diamond_buried_ore");

    //Feature adders
    public static final ResourceKey<BiomeModifier> ADD_COPPER_ORE = registerKey("add_copper_ore");
    public static final ResourceKey<BiomeModifier> ADD_COPPER_LARGE_ORE = registerKey("add_copper_large_ore");

    public static final ResourceKey<BiomeModifier> ADD_COAL_UPPER_ORE = registerKey("add_coal_upper_ore");
    public static final ResourceKey<BiomeModifier> ADD_COAL_LOWER_ORE = registerKey("add_coal_lower_ore");

    public static final ResourceKey<BiomeModifier> ADD_IRON_UPPER_ORE = registerKey("add_iron_upper_ore");
    public static final ResourceKey<BiomeModifier> ADD_IRON_MIDDLE_ORE = registerKey("add_iron_middle_ore");
    public static final ResourceKey<BiomeModifier> ADD_IRON_SMALL_ORE = registerKey("add_iron_small_ore");

    public static final ResourceKey<BiomeModifier> ADD_GOLD_ORE_EXTRA = registerKey("add_gold_ore_extra");
    public static final ResourceKey<BiomeModifier> ADD_GOLD_ORE = registerKey("add_gold_ore");
    public static final ResourceKey<BiomeModifier> ADD_GOLD_ORE_LOWER = registerKey("add_gold_ore_lower");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_GOLD_ORE = registerKey("add_nether_gold_ore");

    public static final ResourceKey<BiomeModifier> ADD_QUARTZ_ORE = registerKey("add_quartz_ore");

    public static final ResourceKey<BiomeModifier> ADD_REDSTONE_ORE = registerKey("add_redstone_ore");
    public static final ResourceKey<BiomeModifier> ADD_REDSTONE_LOWER_ORE = registerKey("add_redstone_lower_ore");

    public static final ResourceKey<BiomeModifier> ADD_LAPIS_ORE = registerKey("add_lapis_ore");
    public static final ResourceKey<BiomeModifier> ADD_LAPIS_BURIED_ORE = registerKey("add_lapis_buried_ore");

    public static final ResourceKey<BiomeModifier> ADD_EMERALD_ORE = registerKey("add_emerald_ore");

    public static final ResourceKey<BiomeModifier> ADD_DIAMOND_ORE = registerKey("add_diamond_ore");
    public static final ResourceKey<BiomeModifier> ADD_DIAMOND_LARGE_ORE = registerKey("add_diamond_large_ore");
    public static final ResourceKey<BiomeModifier> ADD_DIAMOND_BURIED_ORE = registerKey("add_diamond_buried_ore");


    public static void bootstrap(BootstrapContext<BiomeModifier> context){
        removeVanillaOres(context);
        addEnhancedOres(context);
    }

    public static void removeVanillaOres(BootstrapContext<BiomeModifier> pContext){
        var placedFeatures = pContext.lookup(Registries.PLACED_FEATURE);
        var biomes = pContext.lookup(Registries.BIOME);

        //Copper
        pContext.register(REMOVE_COPPER_ORE, new BiomeModifiers.RemoveFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(OrePlacements.ORE_COPPER)),
                Set.of(GenerationStep.Decoration.UNDERGROUND_ORES)));
        pContext.register(REMOVE_COPPER_LARGE_ORE, new BiomeModifiers.RemoveFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(OrePlacements.ORE_COPPER_LARGE)),
                Set.of(GenerationStep.Decoration.UNDERGROUND_ORES)));

        //Coal
        pContext.register(REMOVE_COAL_UPPER_ORE, new BiomeModifiers.RemoveFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(OrePlacements.ORE_COAL_UPPER)),
                Set.of(GenerationStep.Decoration.UNDERGROUND_ORES)));
        pContext.register(REMOVE_COAL_LOWER_ORE, new BiomeModifiers.RemoveFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(OrePlacements.ORE_COAL_LOWER)),
                Set.of(GenerationStep.Decoration.UNDERGROUND_ORES)));

        //Iron
        pContext.register(REMOVE_IRON_UPPER_ORE, new BiomeModifiers.RemoveFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(OrePlacements.ORE_IRON_UPPER)),
                Set.of(GenerationStep.Decoration.UNDERGROUND_ORES)));
        pContext.register(REMOVE_IRON_MIDDLE_ORE, new BiomeModifiers.RemoveFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(OrePlacements.ORE_IRON_MIDDLE)),
                Set.of(GenerationStep.Decoration.UNDERGROUND_ORES)));
        pContext.register(REMOVE_IRON_SMALL_ORE, new BiomeModifiers.RemoveFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(OrePlacements.ORE_IRON_SMALL)),
                Set.of(GenerationStep.Decoration.UNDERGROUND_ORES)));

        //Gold
        pContext.register(REMOVE_GOLD_ORE_EXTRA, new BiomeModifiers.RemoveFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(OrePlacements.ORE_GOLD_EXTRA)),
                Set.of(GenerationStep.Decoration.UNDERGROUND_ORES)));
        pContext.register(REMOVE_GOLD_ORE, new BiomeModifiers.RemoveFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(OrePlacements.ORE_GOLD)),
                Set.of(GenerationStep.Decoration.UNDERGROUND_ORES)));
        pContext.register(REMOVE_GOLD_ORE_LOWER, new BiomeModifiers.RemoveFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(OrePlacements.ORE_GOLD_LOWER)),
                Set.of(GenerationStep.Decoration.UNDERGROUND_ORES)));
        pContext.register(REMOVE_NETHER_GOLD_ORE, new BiomeModifiers.RemoveFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(OrePlacements.ORE_GOLD_NETHER)),
                Set.of(GenerationStep.Decoration.UNDERGROUND_ORES)));

        pContext.register(REMOVE_QUARTZ_ORE, new BiomeModifiers.RemoveFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(OrePlacements.ORE_QUARTZ_NETHER)),
                Set.of(GenerationStep.Decoration.UNDERGROUND_ORES)));

        //Redstone
        pContext.register(REMOVE_REDSTONE_ORE, new BiomeModifiers.RemoveFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(OrePlacements.ORE_REDSTONE)),
                Set.of(GenerationStep.Decoration.UNDERGROUND_ORES)));
        pContext.register(REMOVE_REDSTONE_LOWER_ORE, new BiomeModifiers.RemoveFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(OrePlacements.ORE_REDSTONE_LOWER)),
                Set.of(GenerationStep.Decoration.UNDERGROUND_ORES)));

        //Lapis lazuli
        pContext.register(REMOVE_LAPIS_ORE, new BiomeModifiers.RemoveFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(OrePlacements.ORE_LAPIS)),
                Set.of(GenerationStep.Decoration.UNDERGROUND_ORES)));
        pContext.register(REMOVE_LAPIS_BURIED_ORE, new BiomeModifiers.RemoveFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(OrePlacements.ORE_LAPIS_BURIED)),
                Set.of(GenerationStep.Decoration.UNDERGROUND_ORES)));

        //Emerald
        pContext.register(REMOVE_EMERALD_ORE, new BiomeModifiers.RemoveFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(OrePlacements.ORE_EMERALD)),
                Set.of(GenerationStep.Decoration.UNDERGROUND_ORES)));

        //Diamond
        pContext.register(REMOVE_DIAMOND_ORE, new BiomeModifiers.RemoveFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(OrePlacements.ORE_DIAMOND)),
                Set.of(GenerationStep.Decoration.UNDERGROUND_ORES)));
        pContext.register(REMOVE_DIAMOND_LARGE_ORE, new BiomeModifiers.RemoveFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(OrePlacements.ORE_DIAMOND_LARGE)),
                Set.of(GenerationStep.Decoration.UNDERGROUND_ORES)));
        pContext.register(REMOVE_DIAMOND_BURIED_ORE, new BiomeModifiers.RemoveFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(OrePlacements.ORE_DIAMOND_BURIED)),
                Set.of(GenerationStep.Decoration.UNDERGROUND_ORES)));
    }

    public static void addEnhancedOres(BootstrapContext<BiomeModifier> pContext){
        var placedFeatures = pContext.lookup(Registries.PLACED_FEATURE);
        var biomes = pContext.lookup(Registries.BIOME);

        //Coal
        pContext.register(ADD_COAL_UPPER_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EOVPlacedFeatures.UPPER_COAL_ORES_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        pContext.register(ADD_COAL_LOWER_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EOVPlacedFeatures.LOWER_COAL_ORES_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Copper
        pContext.register(ADD_COPPER_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EOVPlacedFeatures.COPPER_ORES_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        pContext.register(ADD_COPPER_LARGE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EOVPlacedFeatures.LARGE_COPPER_ORES_PLACED)),
               GenerationStep.Decoration.UNDERGROUND_ORES));

        //Iron
        pContext.register(ADD_IRON_UPPER_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EOVPlacedFeatures.UPPER_IRON_ORES_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        pContext.register(ADD_IRON_MIDDLE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EOVPlacedFeatures.MIDDLE_IRON_ORES_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        pContext.register(ADD_IRON_SMALL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EOVPlacedFeatures.SMALL_IRON_ORES_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Gold
        pContext.register(ADD_GOLD_ORE_EXTRA, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_BADLANDS),
                HolderSet.direct(placedFeatures.getOrThrow(EOVPlacedFeatures.EXTRA_GOLD_ORES_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        pContext.register(ADD_GOLD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EOVPlacedFeatures.GOLD_ORES_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        pContext.register(ADD_GOLD_ORE_LOWER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EOVPlacedFeatures.LOWER_GOLD_ORES_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        pContext.register(ADD_NETHER_GOLD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(OrePlacements.ORE_GOLD_NETHER)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        pContext.register(ADD_QUARTZ_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(OrePlacements.ORE_QUARTZ_NETHER)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Redstone
        pContext.register(ADD_REDSTONE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EOVPlacedFeatures.REDSTONE_ORES_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        pContext.register(ADD_REDSTONE_LOWER_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EOVPlacedFeatures.LOWER_REDSTONE_ORES_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Lapis lazuli
        pContext.register(ADD_LAPIS_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EOVPlacedFeatures.LAPIS_ORES_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        pContext.register(ADD_LAPIS_BURIED_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EOVPlacedFeatures.LAPIS_BURIED_ORES_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Emerald
        pContext.register(ADD_EMERALD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_MOUNTAIN),
                HolderSet.direct(placedFeatures.getOrThrow(EOVPlacedFeatures.EMERALD_ORES_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Diamond
        pContext.register(ADD_DIAMOND_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EOVPlacedFeatures.DIAMOND_ORES_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        pContext.register(ADD_DIAMOND_LARGE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EOVPlacedFeatures.LARGE_DIAMOND_ORES_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        pContext.register(ADD_DIAMOND_BURIED_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EOVPlacedFeatures.BURIED_DIAMOND_ORES_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(EnhancedOreVariety.MOD_ID, name));
    }
}
