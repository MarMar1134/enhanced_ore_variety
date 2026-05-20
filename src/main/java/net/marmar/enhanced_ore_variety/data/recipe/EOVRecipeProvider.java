package net.marmar.enhanced_ore_variety.data.recipe;

import net.marmar.enhanced_ore_variety.EnhancedOreVariety;
import net.marmar.enhanced_ore_variety.block.EOVBlocks;
import net.marmar.enhanced_ore_variety.data.tag.EOVTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class EOVRecipeProvider extends RecipeProvider {
    private static final List<ItemLike> COAL_ORES;
    private static final List<ItemLike> COPPER_ORES;
    private static final List<ItemLike> IRON_ORES;
    private static final List<ItemLike> GOLD_ORES;
    private static final List<ItemLike> QUARTZ_ORES;
    private static final List<ItemLike> LAPIS_ORES;
    private static final List<ItemLike> REDSTONE_ORES;
    private static final List<ItemLike> EMERALD_ORES;
    private static final List<ItemLike> DIAMOND_ORES;

    public EOVRecipeProvider(HolderLookup.Provider provider, RecipeOutput output) {
        super(provider, output);
    }

    protected void smeltRecipe(List<ItemLike> pIngredients, ItemLike pResult, float pExperience){
        for (ItemLike ingredient : pIngredients) {
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(ingredient), RecipeCategory.MISC, CookingBookCategory.BLOCKS, pResult, pExperience, 200)
                    .unlockedBy(pIngredients.toString(), has(ingredient))
                    .save(this.output, EnhancedOreVariety.MOD_ID + ":" + getItemName(pResult) + "_from_smelting_" + getItemName(ingredient));
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(ingredient), RecipeCategory.MISC, CookingBookCategory.BLOCKS, pResult, pExperience, 100)
                    .unlockedBy(pIngredients.toString(), has(ingredient))
                    .save(this.output, EnhancedOreVariety.MOD_ID + ":" + getItemName(pResult) + "_from_blasting_" + getItemName(ingredient));
        }
    }

    @Override
    protected void buildRecipes() {
        smeltRecipe(COAL_ORES, Items.COAL, 0.1f);
        smeltRecipe(COPPER_ORES, Items.COPPER_INGOT, 0.7f);
        smeltRecipe(IRON_ORES, Items.IRON_INGOT, 0.7f);
        smeltRecipe(GOLD_ORES, Items.GOLD_INGOT, 1);
        smeltRecipe(QUARTZ_ORES, Items.QUARTZ, 1f);
        smeltRecipe(LAPIS_ORES, Items.LAPIS_LAZULI, 0.2f);
        smeltRecipe(REDSTONE_ORES, Items.REDSTONE, 0.7f);
        smeltRecipe(EMERALD_ORES, Items.EMERALD, 1f);
        smeltRecipe(DIAMOND_ORES, Items.DIAMOND, 1f);
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
            super(output, lookupProvider);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput output) {
            return new EOVRecipeProvider(provider, output);
        }

        @Override
        public String getName() {
            return "Enhanced Ore Variety recipes";
        }
    }

    static {
        COAL_ORES = List.of(EOVBlocks.ANDESITE_COAL_ORE, EOVBlocks.DIORITE_COAL_ORE, EOVBlocks.GRANITE_COAL_ORE, EOVBlocks.TUFF_COAL_ORE, EOVBlocks.BLACKSTONE_COAL_ORE);
        COPPER_ORES = List.of(EOVBlocks.ANDESITE_COPPER_ORE, EOVBlocks.DIORITE_COPPER_ORE, EOVBlocks.GRANITE_COPPER_ORE, EOVBlocks.TUFF_COPPER_ORE, EOVBlocks.BLACKSTONE_COPPER_ORE);
        IRON_ORES = List.of(EOVBlocks.ANDESITE_IRON_ORE, EOVBlocks.DIORITE_IRON_ORE, EOVBlocks.GRANITE_IRON_ORE, EOVBlocks.TUFF_IRON_ORE, EOVBlocks.BLACKSTONE_IRON_ORE);
        GOLD_ORES = List.of(EOVBlocks.ANDESITE_GOLD_ORE, EOVBlocks.DIORITE_GOLD_ORE, EOVBlocks.GRANITE_GOLD_ORE, EOVBlocks.TUFF_GOLD_ORE, EOVBlocks.BLACKSTONE_GOLD_ORE);
        QUARTZ_ORES = List.of(EOVBlocks.BLACKSTONE_QUARTZ_ORE);
        LAPIS_ORES = List.of(EOVBlocks.ANDESITE_LAPIS_ORE, EOVBlocks.DIORITE_LAPIS_ORE, EOVBlocks.GRANITE_LAPIS_ORE, EOVBlocks.TUFF_LAPIS_ORE, EOVBlocks.BLACKSTONE_LAPIS_ORE);
        REDSTONE_ORES = List.of(EOVBlocks.ANDESITE_REDSTONE_ORE, EOVBlocks.DIORITE_REDSTONE_ORE, EOVBlocks.GRANITE_REDSTONE_ORE, EOVBlocks.TUFF_REDSTONE_ORE, EOVBlocks.BLACKSTONE_REDSTONE_ORE);
        EMERALD_ORES = List.of(EOVBlocks.ANDESITE_EMERALD_ORE, EOVBlocks.DIORITE_EMERALD_ORE, EOVBlocks.GRANITE_EMERALD_ORE, EOVBlocks.TUFF_EMERALD_ORE, EOVBlocks.BLACKSTONE_EMERALD_ORE);
        DIAMOND_ORES = List.of(EOVBlocks.ANDESITE_DIAMOND_ORE, EOVBlocks.DIORITE_DIAMOND_ORE, EOVBlocks.GRANITE_DIAMOND_ORE, EOVBlocks.TUFF_DIAMOND_ORE, EOVBlocks.BLACKSTONE_DIAMOND_ORE);
    }
}
