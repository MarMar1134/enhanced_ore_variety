package net.marmar.enhanced_ore_variety.data;

import net.marmar.enhanced_ore_variety.EnhancedOreVariety;
import net.marmar.enhanced_ore_variety.world.EOVBiomeModifiers;
import net.marmar.enhanced_ore_variety.world.EOVConfiguredFeatures;
import net.marmar.enhanced_ore_variety.world.EOVPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class WorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, EOVConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, EOVPlacedFeatures::bootstrap)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, EOVBiomeModifiers::bootstrap);

    public WorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(EnhancedOreVariety.MOD_ID));
    }
}
