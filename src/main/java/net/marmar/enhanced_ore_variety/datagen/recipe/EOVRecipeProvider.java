package net.marmar.enhanced_ore_variety.datagen.recipe;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.marmar.enhanced_ore_variety.block.EOVBlocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class EOVRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> COAL_ORES;
    private static final List<ItemConvertible> COPPER_ORES;
    private static final List<ItemConvertible> IRON_ORES;
    private static final List<ItemConvertible> GOLD_ORES;
    private static final List<ItemConvertible> LAPIS_ORES;
    private static final List<ItemConvertible> REDSTONE_ORES;
    private static final List<ItemConvertible> EMERALD_ORES;
    private static final List<ItemConvertible> DIAMOND_ORES;

    public EOVRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }


    @Override
    public void generate(RecipeExporter exporter) {
        //Smelting
        offerSmelting(exporter, COAL_ORES, RecipeCategory.MISC, Items.COAL, 0.1f, 200, "coal_ore");
        offerSmelting(exporter, COPPER_ORES, RecipeCategory.MISC, Items.COPPER_INGOT, 0.7f, 200, "copper_ore");
        offerSmelting(exporter, IRON_ORES, RecipeCategory.MISC, Items.IRON_INGOT, 0.7f, 200, "iron_ore");
        offerSmelting(exporter, GOLD_ORES, RecipeCategory.MISC, Items.GOLD_INGOT, 1f, 200, "gold_ore");
        offerSmelting(exporter, LAPIS_ORES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.2f, 200, "lapis_ore");
        offerSmelting(exporter, REDSTONE_ORES, RecipeCategory.MISC, Items.REDSTONE, 0.7f, 200, "redstone_ore");
        offerSmelting(exporter, EMERALD_ORES, RecipeCategory.MISC, Items.EMERALD, 1f, 200, "emerald_ore");
        offerSmelting(exporter, DIAMOND_ORES, RecipeCategory.MISC, Items.DIAMOND, 1f, 200, "diamond_ore");

        //Blasting
        offerBlasting(exporter, COAL_ORES, RecipeCategory.MISC, Items.COAL, 0.1f, 100, "coal_ore");
        offerBlasting(exporter, COPPER_ORES, RecipeCategory.MISC, Items.COPPER_INGOT, 0.7f, 100, "copper_ore");
        offerBlasting(exporter, IRON_ORES, RecipeCategory.MISC, Items.IRON_INGOT, 0.7f, 100, "iron_ore");
        offerBlasting(exporter, GOLD_ORES, RecipeCategory.MISC, Items.GOLD_INGOT, 1f, 100, "gold_ore");
        offerBlasting(exporter, LAPIS_ORES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.2f, 100, "lapis_ore");
        offerBlasting(exporter, REDSTONE_ORES, RecipeCategory.MISC, Items.REDSTONE, 0.7f, 100, "redstone_ore");
        offerBlasting(exporter, EMERALD_ORES, RecipeCategory.MISC, Items.EMERALD, 1f, 100, "emerald_ore");
        offerBlasting(exporter, DIAMOND_ORES, RecipeCategory.MISC, Items.DIAMOND, 1f, 100, "diamond_ore");
    }
    
    static {
        COAL_ORES = List.of(
                EOVBlocks.DIORITE_COAL_ORE,
                EOVBlocks.ANDESITE_COAL_ORE,
                EOVBlocks.GRANITE_COAL_ORE,
                EOVBlocks.TUFF_COAL_ORE,
                EOVBlocks.BLACKSTONE_COAL_ORE
        );
        COPPER_ORES = List.of(
                EOVBlocks.DIORITE_COPPER_ORE,
                EOVBlocks.ANDESITE_COPPER_ORE,
                EOVBlocks.GRANITE_COPPER_ORE,
                EOVBlocks.TUFF_COPPER_ORE,
                EOVBlocks.BLACKSTONE_COPPER_ORE
        );
        IRON_ORES = List.of(
                EOVBlocks.DIORITE_IRON_ORE,
                EOVBlocks.ANDESITE_IRON_ORE,
                EOVBlocks.GRANITE_IRON_ORE,
                EOVBlocks.TUFF_IRON_ORE,
                EOVBlocks.BLACKSTONE_IRON_ORE
        );
        GOLD_ORES = List.of(
                EOVBlocks.DIORITE_GOLD_ORE,
                EOVBlocks.ANDESITE_GOLD_ORE,
                EOVBlocks.GRANITE_GOLD_ORE,
                EOVBlocks.TUFF_GOLD_ORE,
                EOVBlocks.BLACKSTONE_GOLD_ORE
        );
        LAPIS_ORES = List.of(
                EOVBlocks.DIORITE_LAPIS_ORE,
                EOVBlocks.ANDESITE_LAPIS_ORE,
                EOVBlocks.GRANITE_LAPIS_ORE,
                EOVBlocks.TUFF_LAPIS_ORE,
                EOVBlocks.BLACKSTONE_LAPIS_ORE
        );
        REDSTONE_ORES = List.of(
                EOVBlocks.DIORITE_REDSTONE_ORE,
                EOVBlocks.ANDESITE_REDSTONE_ORE,
                EOVBlocks.GRANITE_REDSTONE_ORE,
                EOVBlocks.TUFF_REDSTONE_ORE,
                EOVBlocks.BLACKSTONE_REDSTONE_ORE
        );
        EMERALD_ORES = List.of(
                EOVBlocks.DIORITE_EMERALD_ORE,
                EOVBlocks.ANDESITE_EMERALD_ORE,
                EOVBlocks.GRANITE_EMERALD_ORE,
                EOVBlocks.TUFF_EMERALD_ORE,
                EOVBlocks.BLACKSTONE_EMERALD_ORE
        );
        DIAMOND_ORES = List.of(
                EOVBlocks.DIORITE_DIAMOND_ORE,
                EOVBlocks.ANDESITE_DIAMOND_ORE,
                EOVBlocks.GRANITE_DIAMOND_ORE,
                EOVBlocks.TUFF_DIAMOND_ORE,
                EOVBlocks.BLACKSTONE_DIAMOND_ORE
        );
    }
}
