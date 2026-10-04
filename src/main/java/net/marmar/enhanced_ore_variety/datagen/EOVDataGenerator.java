package net.marmar.enhanced_ore_variety.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.marmar.enhanced_ore_variety.datagen.lang.EOVEnglishLangProvider;
import net.marmar.enhanced_ore_variety.datagen.lang.spanish.*;
import net.marmar.enhanced_ore_variety.datagen.loot.EOVLootTableProvider;
import net.marmar.enhanced_ore_variety.datagen.model.EOVModelProvider;
import net.marmar.enhanced_ore_variety.datagen.recipe.EOVRecipeProvider;
import net.marmar.enhanced_ore_variety.datagen.tag.EOVBlockTagProvider;
import net.marmar.enhanced_ore_variety.worldgen.EOVConfiguredFeatures;
import net.marmar.enhanced_ore_variety.worldgen.EOVPlacedFeatures;
import net.marmar.enhanced_ore_variety.worldgen.EOVWorldGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class EOVDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        //Block tags
        pack.addProvider(EOVBlockTagProvider::new);

        //Block models
        pack.addProvider(EOVModelProvider::new);

        //Block loot tables
        pack.addProvider(EOVLootTableProvider::new);

        //Recipes
        pack.addProvider(EOVRecipeProvider::new);

        //World gen
        pack.addProvider(EOVWorldGenerator::new);

        //English translations
        pack.addProvider(EOVEnglishLangProvider::new);

        //Spanish translations
        pack.addProvider(ArgLangProvider::new);
        pack.addProvider(ClLangProvider::new);
        pack.addProvider(EcLangProvider::new);
        pack.addProvider(EsLangProvider::new);
        pack.addProvider(MxLangProvider::new);
        pack.addProvider(UyLangProvider::new);
        pack.addProvider(VeLangProvider::new);
    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, EOVConfiguredFeatures::boostrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, EOVPlacedFeatures::boostrap);
    }
}
