package net.marmar.enhanced_ore_variety.data.provider;

import net.marmar.enhanced_ore_variety.data.loot.EOVBlockLootTables;
import net.marmar.enhanced_ore_variety.data.recipe.EOVRecipeProvider;
import net.marmar.enhanced_ore_variety.world.EOVBiomeModifiers;
import net.marmar.enhanced_ore_variety.world.EOVFeatures;
import net.marmar.enhanced_ore_variety.world.EOVPlacedFeatures;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.List;
import java.util.Set;

public class EOVDatapackProvider {
    public static final RegistrySetBuilder WORLD_BUILDER = new RegistrySetBuilder()
            .add(Registries.FEATURE, EOVFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, EOVPlacedFeatures::bootstrap)
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, EOVBiomeModifiers::bootstrap);

    public static final RegistrySetBuilder RELOADABLE_BUILDER = new RegistrySetBuilder()
            .add(Registries.LOOT_TABLE, new LootTableProvider(Set.of(), List.of(
                    new LootTableProvider.SubProviderEntry(EOVBlockLootTables::new, LootContextParamSets.BLOCK))))

            .add(EOVRecipeProvider.create());
}
