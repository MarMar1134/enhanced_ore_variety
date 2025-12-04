package net.marmar.enhanced_ore_variety.data.lang;

import net.marmar.enhanced_ore_variety.EnhancedOreVariety;
import net.marmar.enhanced_ore_variety.block.EOVBlocks;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class EnglishLangProvider extends LanguageProvider {
    public EnglishLangProvider(PackOutput output) {
        super(output, EnhancedOreVariety.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        //Diorite variants
        addBlock(EOVBlocks.DIORITE_COAL_ORE, "Diorite coal ore");
        addBlock(EOVBlocks.DIORITE_COPPER_ORE, "Diorite copper ore");
        addBlock(EOVBlocks.DIORITE_IRON_ORE, "Diorite iron ore");
        addBlock(EOVBlocks.DIORITE_GOLD_ORE, "Diorite gold ore");
        addBlock(EOVBlocks.DIORITE_LAPIS_ORE, "Diorite lapis lazuli ore");
        addBlock(EOVBlocks.DIORITE_REDSTONE_ORE, "Diorite redstone ore");
        addBlock(EOVBlocks.DIORITE_EMERALD_ORE, "Diorite emerald ore");
        addBlock(EOVBlocks.DIORITE_DIAMOND_ORE, "Diorite diamond ore");

        //Andesite variants
        addBlock(EOVBlocks.ANDESITE_COAL_ORE, "Andesite coal ore");
        addBlock(EOVBlocks.ANDESITE_COPPER_ORE, "Andesite copper ore");
        addBlock(EOVBlocks.ANDESITE_IRON_ORE, "Andesite iron ore");
        addBlock(EOVBlocks.ANDESITE_GOLD_ORE, "Andesite gold ore");
        addBlock(EOVBlocks.ANDESITE_LAPIS_ORE, "Andesite lapis lazuli ore");
        addBlock(EOVBlocks.ANDESITE_REDSTONE_ORE, "Andesite redstone ore");
        addBlock(EOVBlocks.ANDESITE_EMERALD_ORE, "Andesite emerald ore");
        addBlock(EOVBlocks.ANDESITE_DIAMOND_ORE, "Andesite diamond ore");

        //Granite variants
        addBlock(EOVBlocks.GRANITE_COAL_ORE, "Granite coal ore");
        addBlock(EOVBlocks.GRANITE_COPPER_ORE, "Granite copper ore");
        addBlock(EOVBlocks.GRANITE_IRON_ORE, "Granite iron ore");
        addBlock(EOVBlocks.GRANITE_GOLD_ORE, "Granite gold ore");
        addBlock(EOVBlocks.GRANITE_LAPIS_ORE, "Granite lapis lazuli ore");
        addBlock(EOVBlocks.GRANITE_REDSTONE_ORE, "Granite redstone ore");
        addBlock(EOVBlocks.GRANITE_EMERALD_ORE, "Granite emerald ore");
        addBlock(EOVBlocks.GRANITE_DIAMOND_ORE, "Granite diamond ore");

        //Tuff variants
        addBlock(EOVBlocks.TUFF_COAL_ORE, "Tuff coal ore");
        addBlock(EOVBlocks.TUFF_COPPER_ORE, "Tuff copper ore");
        addBlock(EOVBlocks.TUFF_IRON_ORE, "Tuff iron ore");
        addBlock(EOVBlocks.TUFF_GOLD_ORE, "Tuff gold ore");
        addBlock(EOVBlocks.TUFF_LAPIS_ORE, "Tuff lapis lazuli ore");
        addBlock(EOVBlocks.TUFF_REDSTONE_ORE, "Tuff redstone ore");
        addBlock(EOVBlocks.TUFF_EMERALD_ORE, "Tuff emerald ore");
        addBlock(EOVBlocks.TUFF_DIAMOND_ORE, "Tuff diamond ore");

        //Blackstone variants
        addBlock(EOVBlocks.BLACKSTONE_COAL_ORE, "Blackstone coal ore");
        addBlock(EOVBlocks.BLACKSTONE_COPPER_ORE, "Blackstone copper ore");
        addBlock(EOVBlocks.BLACKSTONE_IRON_ORE, "Blackstone iron ore");
        addBlock(EOVBlocks.BLACKSTONE_GOLD_ORE, "Blackstone gold ore");
        addBlock(EOVBlocks.BLACKSTONE_LAPIS_ORE, "Blackstone lapis lazuli ore");
        addBlock(EOVBlocks.BLACKSTONE_REDSTONE_ORE, "Blackstone redstone ore");
        addBlock(EOVBlocks.BLACKSTONE_EMERALD_ORE, "Blackstone emerald ore");
        addBlock(EOVBlocks.BLACKSTONE_DIAMOND_ORE, "Blackstone diamond ore");
        addBlock(EOVBlocks.BLACKSTONE_QUARTZ_ORE, "Blackstone quartz ore");
    }
}
