package net.marmar.enhanced_ore_variety.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.marmar.enhanced_ore_variety.EnhancedOreVariety;
import net.marmar.enhanced_ore_variety.block.EOVBlocks;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class EOVEnglishLangProvider extends FabricLanguageProvider {


    public EOVEnglishLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        //Tabs
        translationBuilder.add("tab." + EnhancedOreVariety.MOD_ID + "enhanced_ores", "Ore variants");

        //Diorite
        translationBuilder.add(EOVBlocks.DIORITE_COAL_ORE, "Diorite coal ore");
        translationBuilder.add(EOVBlocks.DIORITE_COPPER_ORE, "Diorite copper ore");
        translationBuilder.add(EOVBlocks.DIORITE_IRON_ORE, "Diorite iron ore");
        translationBuilder.add(EOVBlocks.DIORITE_GOLD_ORE, "Diorite gold ore");
        translationBuilder.add(EOVBlocks.DIORITE_LAPIS_ORE, "Diorite lapis lazuli ore");
        translationBuilder.add(EOVBlocks.DIORITE_REDSTONE_ORE, "Diorite redstone ore");
        translationBuilder.add(EOVBlocks.DIORITE_EMERALD_ORE, "Diorite emerald ore");
        translationBuilder.add(EOVBlocks.DIORITE_DIAMOND_ORE, "Diorite diamond ore");
        
        //Andesite
        translationBuilder.add(EOVBlocks.ANDESITE_COAL_ORE, "Andesite coal ore");
        translationBuilder.add(EOVBlocks.ANDESITE_COPPER_ORE, "Andesite copper ore");
        translationBuilder.add(EOVBlocks.ANDESITE_IRON_ORE, "Andesite iron ore");
        translationBuilder.add(EOVBlocks.ANDESITE_GOLD_ORE, "Andesite gold ore");
        translationBuilder.add(EOVBlocks.ANDESITE_LAPIS_ORE, "Andesite lapis lazuli ore");
        translationBuilder.add(EOVBlocks.ANDESITE_REDSTONE_ORE, "Andesite redstone ore");
        translationBuilder.add(EOVBlocks.ANDESITE_EMERALD_ORE, "Andesite emerald ore");
        translationBuilder.add(EOVBlocks.ANDESITE_DIAMOND_ORE, "Andesite diamond ore");
        
        //Granite
        translationBuilder.add(EOVBlocks.GRANITE_COAL_ORE, "Granite coal ore");
        translationBuilder.add(EOVBlocks.GRANITE_COPPER_ORE, "Granite copper ore");
        translationBuilder.add(EOVBlocks.GRANITE_IRON_ORE, "Granite iron ore");
        translationBuilder.add(EOVBlocks.GRANITE_GOLD_ORE, "Granite gold ore");
        translationBuilder.add(EOVBlocks.GRANITE_LAPIS_ORE, "Granite lapis lazuli ore");
        translationBuilder.add(EOVBlocks.GRANITE_REDSTONE_ORE, "Granite redstone ore");
        translationBuilder.add(EOVBlocks.GRANITE_EMERALD_ORE, "Granite emerald ore");
        translationBuilder.add(EOVBlocks.GRANITE_DIAMOND_ORE, "Granite diamond ore");
        
        //Tuff
        translationBuilder.add(EOVBlocks.TUFF_COAL_ORE, "Tuff coal ore");
        translationBuilder.add(EOVBlocks.TUFF_COPPER_ORE, "Tuff copper ore");
        translationBuilder.add(EOVBlocks.TUFF_IRON_ORE, "Tuff iron ore");
        translationBuilder.add(EOVBlocks.TUFF_GOLD_ORE, "Tuff gold ore");
        translationBuilder.add(EOVBlocks.TUFF_LAPIS_ORE, "Tuff lapis lazuli ore");
        translationBuilder.add(EOVBlocks.TUFF_REDSTONE_ORE, "Tuff redstone ore");
        translationBuilder.add(EOVBlocks.TUFF_EMERALD_ORE, "Tuff emerald ore");
        translationBuilder.add(EOVBlocks.TUFF_DIAMOND_ORE, "Tuff diamond ore");
        
        //Blackstone
        translationBuilder.add(EOVBlocks.BLACKSTONE_COAL_ORE, "Blackstone coal ore");
        translationBuilder.add(EOVBlocks.BLACKSTONE_COPPER_ORE, "Blackstone copper ore");
        translationBuilder.add(EOVBlocks.BLACKSTONE_IRON_ORE, "Blackstone iron ore");
        translationBuilder.add(EOVBlocks.BLACKSTONE_GOLD_ORE, "Blackstone gold ore");
        translationBuilder.add(EOVBlocks.BLACKSTONE_LAPIS_ORE, "Blackstone lapis lazuli ore");
        translationBuilder.add(EOVBlocks.BLACKSTONE_REDSTONE_ORE, "Blackstone redstone ore");
        translationBuilder.add(EOVBlocks.BLACKSTONE_EMERALD_ORE, "Blackstone emerald ore");
        translationBuilder.add(EOVBlocks.BLACKSTONE_DIAMOND_ORE, "Blackstone diamond ore");
    }
}
