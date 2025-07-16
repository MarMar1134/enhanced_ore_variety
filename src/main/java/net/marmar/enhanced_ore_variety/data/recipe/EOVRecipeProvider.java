package net.marmar.enhanced_ore_variety.data.recipe;

import net.marmar.enhanced_ore_variety.EnhancedOreVariety;
import net.marmar.enhanced_ore_variety.data.tag.EOVTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class EOVRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public EOVRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput consumer) {
        smeltRecipe(consumer, ItemTags.COAL_ORES, Items.COAL, 0.1f);
        smeltRecipe(consumer, ItemTags.COPPER_ORES, Items.COPPER_INGOT, 0.7f);
        smeltRecipe(consumer, ItemTags.IRON_ORES, Items.IRON_INGOT, 0.7f);
        smeltRecipe(consumer, ItemTags.GOLD_ORES, Items.GOLD_INGOT, 1);
        smeltRecipe(consumer, EOVTags.Items.QUARTZ_ORES, Items.QUARTZ, 1f);
        smeltRecipe(consumer, ItemTags.LAPIS_ORES, Items.LAPIS_LAZULI, 0.2f);
        smeltRecipe(consumer, ItemTags.REDSTONE_ORES, Items.REDSTONE, 0.7f);
        smeltRecipe(consumer, ItemTags.EMERALD_ORES, Items.EMERALD, 1f);
        smeltRecipe(consumer, ItemTags.DIAMOND_ORES, Items.DIAMOND, 1f);
    }

    protected static void smeltRecipe(RecipeOutput pOutput, TagKey<Item> pIngredient, ItemLike pResult, float pExperience){
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(pIngredient), RecipeCategory.MISC, pResult, pExperience, 200)
                .unlockedBy(pIngredient.toString(), has(pIngredient))
                .save(pOutput, EnhancedOreVariety.MOD_ID + ":" + getItemName(pResult) + "_from_smelting");
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(pIngredient), RecipeCategory.MISC, pResult, pExperience, 100)
                .unlockedBy(pIngredient.toString(), has(pIngredient))
                .save(pOutput, EnhancedOreVariety.MOD_ID + ":" + getItemName(pResult) + "_from_blasting");
    }
}
