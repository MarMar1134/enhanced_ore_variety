package net.marmar.enhanced_ore_variety.datagen.lang.spanish;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.marmar.enhanced_ore_variety.EnhancedOreVariety;
import net.marmar.enhanced_ore_variety.block.EOVBlocks;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class AbstractSpanishLangProvider extends FabricLanguageProvider {
    private final String mainOreName;
    
    public AbstractSpanishLangProvider(FabricDataOutput dataOutput, String languageCode, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, languageCode, registryLookup);
        
        if (languageCode.equals("es_es") || languageCode.equals("es_ve")){
            this.mainOreName = "Mena";
        } else {
            this.mainOreName = "Mineral";
        }
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        //Tabs
        translationBuilder.add("tab." + EnhancedOreVariety.MOD_ID + "enhanced_ores", "Variantes de minerales");

        //Diorite
        translationBuilder.add(EOVBlocks.DIORITE_COAL_ORE, this.mainOreName + " de carbón de diorita");
        translationBuilder.add(EOVBlocks.DIORITE_COPPER_ORE, this.mainOreName + " de cobre en diorita");
        translationBuilder.add(EOVBlocks.DIORITE_IRON_ORE, this.mainOreName + " de hierro en diorita");
        translationBuilder.add(EOVBlocks.DIORITE_GOLD_ORE, this.mainOreName + " de oro en diorita");
        translationBuilder.add(EOVBlocks.DIORITE_LAPIS_ORE, this.mainOreName + " de lapis lázuli en diorita");
        translationBuilder.add(EOVBlocks.DIORITE_REDSTONE_ORE, this.mainOreName + " de redstone en diorita");
        translationBuilder.add(EOVBlocks.DIORITE_EMERALD_ORE, this.mainOreName + " de esmeralda en diorita");
        translationBuilder.add(EOVBlocks.DIORITE_DIAMOND_ORE, this.mainOreName + " de diamante en diorita");
        
        //Andesite
        translationBuilder.add(EOVBlocks.ANDESITE_COAL_ORE, this.mainOreName + " de carbón en andesita");
        translationBuilder.add(EOVBlocks.ANDESITE_COPPER_ORE, this.mainOreName + " de cobre en andesita");
        translationBuilder.add(EOVBlocks.ANDESITE_IRON_ORE, this.mainOreName + " de hierro en andesita");
        translationBuilder.add(EOVBlocks.ANDESITE_GOLD_ORE, this.mainOreName + " de oro en andesita");
        translationBuilder.add(EOVBlocks.ANDESITE_LAPIS_ORE, this.mainOreName + " de lapis lázuli en andesita");
        translationBuilder.add(EOVBlocks.ANDESITE_REDSTONE_ORE, this.mainOreName + " de redstone en andesita");
        translationBuilder.add(EOVBlocks.ANDESITE_EMERALD_ORE, this.mainOreName + " de esmeralda en andesita");
        translationBuilder.add(EOVBlocks.ANDESITE_DIAMOND_ORE, this.mainOreName + " de diamante en andesita");
        
        //Granite
        translationBuilder.add(EOVBlocks.GRANITE_COAL_ORE, this.mainOreName + " de carbón en granito");
        translationBuilder.add(EOVBlocks.GRANITE_COPPER_ORE, this.mainOreName + " de cobre en granito");
        translationBuilder.add(EOVBlocks.GRANITE_IRON_ORE, this.mainOreName + " de hierro en granito");
        translationBuilder.add(EOVBlocks.GRANITE_GOLD_ORE, this.mainOreName + " de oro en granito");
        translationBuilder.add(EOVBlocks.GRANITE_LAPIS_ORE, this.mainOreName + " de lapis lázuli en granito");
        translationBuilder.add(EOVBlocks.GRANITE_REDSTONE_ORE, this.mainOreName + " de redstone en granito");
        translationBuilder.add(EOVBlocks.GRANITE_EMERALD_ORE, this.mainOreName + " de esmeralda en granito");
        translationBuilder.add(EOVBlocks.GRANITE_DIAMOND_ORE, this.mainOreName + " de diamante en granito");
        
        //Tuff
        translationBuilder.add(EOVBlocks.TUFF_COAL_ORE, this.mainOreName + " de carbón en toba volcánica");
        translationBuilder.add(EOVBlocks.TUFF_COPPER_ORE, this.mainOreName + " de cobre en toba volcánica");
        translationBuilder.add(EOVBlocks.TUFF_IRON_ORE, this.mainOreName + " de hierro en toba volcánica");
        translationBuilder.add(EOVBlocks.TUFF_GOLD_ORE, this.mainOreName + " de oro en toba volcánica");
        translationBuilder.add(EOVBlocks.TUFF_LAPIS_ORE, this.mainOreName + " de lapis lázuli en toba volcánica");
        translationBuilder.add(EOVBlocks.TUFF_REDSTONE_ORE, this.mainOreName + " de redstone en toba volcánica");
        translationBuilder.add(EOVBlocks.TUFF_EMERALD_ORE, this.mainOreName + " de esmeralda en toba volcánica");
        translationBuilder.add(EOVBlocks.TUFF_DIAMOND_ORE, this.mainOreName + " de diamante en toba volcánica");
        
        //Blackstone
        translationBuilder.add(EOVBlocks.BLACKSTONE_COAL_ORE, this.mainOreName + " de carbón en piedra negra");
        translationBuilder.add(EOVBlocks.BLACKSTONE_COPPER_ORE, this.mainOreName + " de cobre en piedra negra");
        translationBuilder.add(EOVBlocks.BLACKSTONE_IRON_ORE, this.mainOreName + " de hierro en piedra negra");
        translationBuilder.add(EOVBlocks.BLACKSTONE_GOLD_ORE, this.mainOreName + " de oro en piedra negra");
        translationBuilder.add(EOVBlocks.BLACKSTONE_LAPIS_ORE, this.mainOreName + " de lapis lázuli en piedra negra");
        translationBuilder.add(EOVBlocks.BLACKSTONE_REDSTONE_ORE, this.mainOreName + " de redstone en piedra negra");
        translationBuilder.add(EOVBlocks.BLACKSTONE_EMERALD_ORE, this.mainOreName + " de esmeralda en piedra negra");
        translationBuilder.add(EOVBlocks.BLACKSTONE_DIAMOND_ORE, this.mainOreName + " de diamante en piedra negra");
    }
}
