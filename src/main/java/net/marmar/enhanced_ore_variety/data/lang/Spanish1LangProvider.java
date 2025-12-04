package net.marmar.enhanced_ore_variety.data.lang;

import net.marmar.enhanced_ore_variety.EnhancedOreVariety;
import net.marmar.enhanced_ore_variety.block.EOVBlocks;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class Spanish1LangProvider extends LanguageProvider {
    public Spanish1LangProvider(PackOutput output, String locale) {
        super(output, EnhancedOreVariety.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        //Diorite variants
        addBlock(EOVBlocks.DIORITE_COAL_ORE, "Mena de carbón de diorita");
        addBlock(EOVBlocks.DIORITE_COPPER_ORE, "Mena de cobre de diorita");
        addBlock(EOVBlocks.DIORITE_IRON_ORE, "Mena de hierro de diorita");
        addBlock(EOVBlocks.DIORITE_GOLD_ORE, "Mena de oro de diorita");
        addBlock(EOVBlocks.DIORITE_LAPIS_ORE, "Mena de lapis lázuli de diorita");
        addBlock(EOVBlocks.DIORITE_REDSTONE_ORE, "Mena de redstone de diorita");
        addBlock(EOVBlocks.DIORITE_EMERALD_ORE, "Mena de esmeralda de diorita");
        addBlock(EOVBlocks.DIORITE_DIAMOND_ORE, "Mena de diamante de diorita");

        //Andesite variants
        addBlock(EOVBlocks.ANDESITE_COAL_ORE, "Mena de carbón de andesita");
        addBlock(EOVBlocks.ANDESITE_COPPER_ORE, "Mena de cobre de andesita");
        addBlock(EOVBlocks.ANDESITE_IRON_ORE, "Mena de hierro de andesita");
        addBlock(EOVBlocks.ANDESITE_GOLD_ORE, "Mena de oro de andesita");
        addBlock(EOVBlocks.ANDESITE_LAPIS_ORE, "Mena de lapis lázuli de andesita");
        addBlock(EOVBlocks.ANDESITE_REDSTONE_ORE, "Mena de redstone de andesita");
        addBlock(EOVBlocks.ANDESITE_EMERALD_ORE, "Mena de esmeralda de andesita");
        addBlock(EOVBlocks.ANDESITE_DIAMOND_ORE, "Mena de diamante de andesita");

        //Granite variants
        addBlock(EOVBlocks.GRANITE_COAL_ORE, "Mena de carbón de granito");
        addBlock(EOVBlocks.GRANITE_COPPER_ORE, "Mena de cobre de granito");
        addBlock(EOVBlocks.GRANITE_IRON_ORE, "Mena de hierro de granito");
        addBlock(EOVBlocks.GRANITE_GOLD_ORE, "Mena de oro de granito");
        addBlock(EOVBlocks.GRANITE_LAPIS_ORE, "Mena de lapis lázuli de granito");
        addBlock(EOVBlocks.GRANITE_REDSTONE_ORE, "Mena de redstone de granito");
        addBlock(EOVBlocks.GRANITE_EMERALD_ORE, "Mena de esmeralda de granito");
        addBlock(EOVBlocks.GRANITE_DIAMOND_ORE, "Mena de diamante de granito");

        //Tuff variants
        addBlock(EOVBlocks.TUFF_COAL_ORE, "Mena de carbón de toba volcánica");
        addBlock(EOVBlocks.TUFF_COPPER_ORE, "Mena de cobre toba volcánica");
        addBlock(EOVBlocks.TUFF_IRON_ORE, "Mena de hierro toba volcánica");
        addBlock(EOVBlocks.TUFF_GOLD_ORE, "Mena de oro toba volcánica");
        addBlock(EOVBlocks.TUFF_LAPIS_ORE, "Mena de lapis lázuli toba volcánica");
        addBlock(EOVBlocks.TUFF_REDSTONE_ORE, "Mena de redstone toba volcánica");
        addBlock(EOVBlocks.TUFF_EMERALD_ORE, "Mena de esmeralda toba volcánica");
        addBlock(EOVBlocks.TUFF_DIAMOND_ORE, "Mena de diamante de toba volcánica");

        //Blackstone variants
        addBlock(EOVBlocks.BLACKSTONE_COAL_ORE, "Mena de carbón de piedra negra");
        addBlock(EOVBlocks.BLACKSTONE_COPPER_ORE, "Mena de cobre de piedra negra");
        addBlock(EOVBlocks.BLACKSTONE_IRON_ORE, "Mena de hierro de piedra negra");
        addBlock(EOVBlocks.BLACKSTONE_GOLD_ORE, "Mena de oro de piedra negra");
        addBlock(EOVBlocks.BLACKSTONE_LAPIS_ORE, "Mena de lapis lazuli de piedra negra");
        addBlock(EOVBlocks.BLACKSTONE_REDSTONE_ORE, "Mena de redstone de piedra negra");
        addBlock(EOVBlocks.BLACKSTONE_EMERALD_ORE, "Mena de esmeralda de piedra negra");
        addBlock(EOVBlocks.BLACKSTONE_DIAMOND_ORE, "Mena de diamante de piedra negra");
        addBlock(EOVBlocks.BLACKSTONE_QUARTZ_ORE, "Mena de cuarzo de piedra negra");
    }
}
