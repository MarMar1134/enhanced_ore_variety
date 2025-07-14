package net.marmar.enhanced_ore_variety.data.recipe;

import net.marmar.enhanced_ore_variety.EnhancedOreVariety;
import net.marmar.enhanced_ore_variety.data.tag.EOVTags;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;

import java.util.function.Consumer;

public class EOVRecipeProvider extends RecipeProvider {
    public EOVRecipeProvider(PackOutput packOutput) {
        super(packOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        smeltRecipe(consumer, ItemTags.COAL_ORES, Items.COAL, 0.1f, "coal");
        smeltRecipe(consumer, ItemTags.COPPER_ORES, Items.COPPER_INGOT, 0.7f, "copper_ingot");
        smeltRecipe(consumer, ItemTags.IRON_ORES, Items.IRON_INGOT, 0.7f, "iron_ingot");
        smeltRecipe(consumer, ItemTags.GOLD_ORES, Items.GOLD_INGOT, 1, "gold_ingot");
        smeltRecipe(consumer, EOVTags.Items.QUARTZ_ORES, Items.QUARTZ, 1f, "quartz");
        smeltRecipe(consumer, ItemTags.LAPIS_ORES, Items.LAPIS_LAZULI, 0.2f, "lapis_lazuli");
        smeltRecipe(consumer, ItemTags.REDSTONE_ORES, Items.REDSTONE, 0.7f, "redstone");
        smeltRecipe(consumer, ItemTags.EMERALD_ORES, Items.EMERALD, 1f, "emerald");
        smeltRecipe(consumer, ItemTags.DIAMOND_ORES, Items.DIAMOND, 1f, "diamond");
    }

    protected static void smeltRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, TagKey<Item> pIngredient, ItemLike pResult, float pExperience, String pGroup){
        oreCookingSerializerWithTag(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredient, pResult, pExperience, 100, pGroup, "_from_blasting");
        oreCookingSerializerWithTag(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredient, pResult, pExperience, 200, pGroup, "_from_smelting");
    }

    protected static void oreCookingSerializerWithTag(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, TagKey<Item> pIngredient, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName){
        SimpleCookingRecipeBuilder.generic(Ingredient.of(pIngredient), RecipeCategory.MISC, pResult, pExperience, pCookingTime, pCookingSerializer)
                .group(pGroup)
                .unlockedBy(pIngredient.toString(), has(pIngredient))
                .save(pFinishedRecipeConsumer, EnhancedOreVariety.MOD_ID + ":" + getItemName(pResult) + "_" + pRecipeName);
    }
}
