package net.marmar.enhanced_ore_variety.data;

import net.marmar.enhanced_ore_variety.EnhancedOreVariety;
import net.marmar.enhanced_ore_variety.data.lang.*;
import net.marmar.enhanced_ore_variety.data.loot.EOVBlockLootTables;
import net.marmar.enhanced_ore_variety.data.model.EOVBlockModelProvider;
import net.marmar.enhanced_ore_variety.data.recipe.EOVRecipeProvider;
import net.marmar.enhanced_ore_variety.data.tag.EOVBlockTagGenerator;
import net.marmar.enhanced_ore_variety.data.tag.EOVItemTagGenerator;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Collections;
import java.util.List;

@EventBusSubscriber(modid = EnhancedOreVariety.MOD_ID)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event){
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        var lookupProvider = event.getLookupProvider();

        //Loot tables
        generator.addProvider(true, new LootTableProvider(packOutput, Collections.emptySet(),
                List.of(new LootTableProvider.SubProviderEntry(EOVBlockLootTables::new, LootContextParamSets.BLOCK)), lookupProvider));

        //Recipes
        generator.addProvider(true, new EOVRecipeProvider.Runner(packOutput, lookupProvider));

        //Tags
        generator.addProvider(true, new EOVBlockTagGenerator(packOutput, lookupProvider));
        generator.addProvider(true, new EOVItemTagGenerator(packOutput, lookupProvider));

        //Models
        generator.addProvider(true, new EOVBlockModelProvider(packOutput));

        //Worldgen
        generator.addProvider(true, new WorldGenProvider(packOutput, lookupProvider));

        //Language
        generator.addProvider(true, new EnglishLangProvider(packOutput));
        generator.addProvider(true, new ArgentinianLangProvider(packOutput));
        generator.addProvider(true, new UruguayanLangProvider(packOutput));
        generator.addProvider(true, new ChileanLangProvider(packOutput));
        generator.addProvider(true, new EcuatorianLangProvider(packOutput));
        generator.addProvider(true, new MexicanLangProvider(packOutput));
        generator.addProvider(true, new VenezuelanLangProvider(packOutput));
        generator.addProvider(true, new SpanishLangProvider(packOutput));
    }
}
