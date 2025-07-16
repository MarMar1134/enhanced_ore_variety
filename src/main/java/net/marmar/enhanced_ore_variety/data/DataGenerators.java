package net.marmar.enhanced_ore_variety.data;


import net.marmar.enhanced_ore_variety.EnhancedOreVariety;
import net.marmar.enhanced_ore_variety.data.lang.EnglishLangProvider;
import net.marmar.enhanced_ore_variety.data.lang.Spanish1LangProvider;
import net.marmar.enhanced_ore_variety.data.lang.Spanish2LangProvider;
import net.marmar.enhanced_ore_variety.data.loot.EOVLootTableProvider;
import net.marmar.enhanced_ore_variety.data.model.EOVBlockstateProvider;
import net.marmar.enhanced_ore_variety.data.recipe.EOVRecipeProvider;
import net.marmar.enhanced_ore_variety.data.tag.EOVBlockTagGenerator;
import net.marmar.enhanced_ore_variety.data.tag.EOVItemTagGenerator;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("all")
@EventBusSubscriber(modid = EnhancedOreVariety.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        //Generators
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        //Loot tables
        generator.addProvider(event.includeServer(), EOVLootTableProvider.create(packOutput, lookupProvider));

        //Recipes
        generator.addProvider(event.includeServer(), new EOVRecipeProvider(packOutput, lookupProvider));

        //Tags
        EOVBlockTagGenerator blockTagGenerator = generator.addProvider(event.includeServer(), new EOVBlockTagGenerator(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new EOVItemTagGenerator(packOutput, lookupProvider, blockTagGenerator.contentsGetter(),
                existingFileHelper));

        //Models
        generator.addProvider(event.includeClient(), new EOVBlockstateProvider(packOutput, existingFileHelper));

        //Worldgen
        generator.addProvider(event.includeServer(), new WorldGenProvider(packOutput, lookupProvider));

        //Language
        generator.addProvider(event.includeClient(), new EnglishLangProvider(packOutput));
        generator.addProvider(event.includeClient(), new Spanish2LangProvider(packOutput, "es_ar"));
        generator.addProvider(event.includeClient(), new Spanish2LangProvider(packOutput, "es_cl"));
        generator.addProvider(event.includeClient(), new Spanish2LangProvider(packOutput, "es_ec"));
        generator.addProvider(event.includeClient(), new Spanish2LangProvider(packOutput, "es_mx"));
        generator.addProvider(event.includeClient(), new Spanish1LangProvider(packOutput, "es_es"));
        generator.addProvider(event.includeClient(), new Spanish2LangProvider(packOutput, "es_uy"));
        generator.addProvider(event.includeClient(), new Spanish1LangProvider(packOutput, "es_ve"));
    }
}
