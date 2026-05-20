package net.marmar.enhanced_ore_variety.data.lang;

import net.marmar.enhanced_ore_variety.EnhancedOreVariety;
import net.marmar.enhanced_ore_variety.block.EOVBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class MexicanLangProvider extends LanguageProvider {
    public MexicanLangProvider(PackOutput output) {
        super(output, EnhancedOreVariety.MOD_ID, "es_mx");
    }

    @Override
    protected void addTranslations() {
        add("tabs." + EnhancedOreVariety.MOD_ID + ".ore_variants", "Variantes de minerales");

        //Diorite variants
        addBlock(EOVBlocks.DIORITE_COAL_ORE, "Mineral de carbón de diorita");
        addBlock(EOVBlocks.DIORITE_COPPER_ORE, "Mineral de cobre de diorita");
        addBlock(EOVBlocks.DIORITE_IRON_ORE, "Mineral de hierro de diorita");
        addBlock(EOVBlocks.DIORITE_GOLD_ORE, "Mineral de oro de diorita");
        addBlock(EOVBlocks.DIORITE_LAPIS_ORE, "Mineral de lapis lázuli de diorita");
        addBlock(EOVBlocks.DIORITE_REDSTONE_ORE, "Mineral de redstone de diorita");
        addBlock(EOVBlocks.DIORITE_EMERALD_ORE, "Mineral de esmeralda de diorita");
        addBlock(EOVBlocks.DIORITE_DIAMOND_ORE, "Mineral de diamante de diorita");

        //Andesite variants
        addBlock(EOVBlocks.ANDESITE_COAL_ORE, "Mineral de carbón de andesita");
        addBlock(EOVBlocks.ANDESITE_COPPER_ORE, "Mineral de cobre de andesita");
        addBlock(EOVBlocks.ANDESITE_IRON_ORE, "Mineral de hierro de andesita");
        addBlock(EOVBlocks.ANDESITE_GOLD_ORE, "Mineral de oro de andesita");
        addBlock(EOVBlocks.ANDESITE_LAPIS_ORE, "Mineral de lapis de lázuli andesita");
        addBlock(EOVBlocks.ANDESITE_REDSTONE_ORE, "Mineral de redstone de andesita");
        addBlock(EOVBlocks.ANDESITE_EMERALD_ORE, "Mineral de esmeralda de andesita");
        addBlock(EOVBlocks.ANDESITE_DIAMOND_ORE, "Mineral de diamante de andesita");

        //Granite variants
        addBlock(EOVBlocks.GRANITE_COAL_ORE, "Mineral de carbón de granito");
        addBlock(EOVBlocks.GRANITE_COPPER_ORE, "Mineral de cobre de granito");
        addBlock(EOVBlocks.GRANITE_IRON_ORE, "Mineral de hierro de granito");
        addBlock(EOVBlocks.GRANITE_GOLD_ORE, "Mineral de oro granito de");
        addBlock(EOVBlocks.GRANITE_LAPIS_ORE, "Mineral de lapis lázuli de granito");
        addBlock(EOVBlocks.GRANITE_REDSTONE_ORE, "Mineral de redstone de granito");
        addBlock(EOVBlocks.GRANITE_EMERALD_ORE, "Mineral de esmeralda de granito");
        addBlock(EOVBlocks.GRANITE_DIAMOND_ORE, "Mineral de diamante de granito");

        //Tuff variants
        addBlock(EOVBlocks.TUFF_COAL_ORE, "Mineral de carbón de toba volcánica");
        addBlock(EOVBlocks.TUFF_COPPER_ORE, "Mineral de cobre toba volcánica");
        addBlock(EOVBlocks.TUFF_IRON_ORE, "Mineral de hierro toba volcánica");
        addBlock(EOVBlocks.TUFF_GOLD_ORE, "Mineral de oro toba volcánica");
        addBlock(EOVBlocks.TUFF_LAPIS_ORE, "Mineral de lapis lázuli toba volcánica");
        addBlock(EOVBlocks.TUFF_REDSTONE_ORE, "Mineral de redstone toba volcánica");
        addBlock(EOVBlocks.TUFF_EMERALD_ORE, "Mineral de esmeralda toba volcánica");
        addBlock(EOVBlocks.TUFF_DIAMOND_ORE, "Mineral de diamante de toba volcánica");

        //Blackstone variants
        addBlock(EOVBlocks.BLACKSTONE_COAL_ORE, "Mineral de carbón de piedra negra");
        addBlock(EOVBlocks.BLACKSTONE_COPPER_ORE, "Mineral de cobre piedra negra");
        addBlock(EOVBlocks.BLACKSTONE_IRON_ORE, "Mineral de hierro piedra negra");
        addBlock(EOVBlocks.BLACKSTONE_GOLD_ORE, "Mineral de oro de piedra negra");
        addBlock(EOVBlocks.BLACKSTONE_LAPIS_ORE, "Mineral de lapis lázuli piedra negra");
        addBlock(EOVBlocks.BLACKSTONE_REDSTONE_ORE, "Mineral de redstone piedra negra");
        addBlock(EOVBlocks.BLACKSTONE_EMERALD_ORE, "Mineral de esmeralda piedra negra");
        addBlock(EOVBlocks.BLACKSTONE_DIAMOND_ORE, "Mineral de diamante de piedra negra");
        addBlock(EOVBlocks.BLACKSTONE_QUARTZ_ORE, "Mineral de cuarzo de piedra negra");
    }
}
