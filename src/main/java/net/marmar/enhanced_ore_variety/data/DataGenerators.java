package net.marmar.enhanced_ore_variety.data;


import net.marmar.enhanced_ore_variety.EnhancedOreVariety;
import net.marmar.enhanced_ore_variety.data.lang.EnglishLangProvider;
import net.marmar.enhanced_ore_variety.data.lang.Spanish1LangProvider;
import net.marmar.enhanced_ore_variety.data.lang.Spanish2LangProvider;
import net.marmar.enhanced_ore_variety.data.loot.LootTableProvider;
import net.marmar.enhanced_ore_variety.data.model.EOVBlockstateProvider;
import net.marmar.enhanced_ore_variety.data.recipe.EOVRecipeProvider;
import net.marmar.enhanced_ore_variety.data.tag.EOVBlockTagGenerator;
import net.marmar.enhanced_ore_variety.data.tag.EOVItemTagGenerator;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = EnhancedOreVariety.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        //Generators
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> LookupProvider = event.getLookupProvider();

        //Loot tables
        generator.addProvider(event.includeServer(), LootTableProvider.create(packOutput));

        //Recipes
        generator.addProvider(event.includeServer(), new EOVRecipeProvider(packOutput));

        //Tags
        EOVBlockTagGenerator blockTagGenerator = generator.addProvider(event.includeServer(), new EOVBlockTagGenerator(packOutput, LookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new EOVItemTagGenerator(packOutput, LookupProvider, blockTagGenerator.contentsGetter(),
                existingFileHelper));

        //Models
        generator.addProvider(event.includeClient(), new EOVBlockstateProvider(packOutput, existingFileHelper));

        //Worldgen
        generator.addProvider(event.includeServer(), new WorldGenProvider(packOutput, LookupProvider));

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
