package legendary138.enhancedendgame.datagen;

import legendary138.enhancedendgame.init.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;

import java.util.concurrent.CompletableFuture;

public class EnhancedEndgameRecipeProvider extends RecipeProvider {

    protected EnhancedEndgameRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    @Override
    protected void buildRecipes() {
        var itemLookup = this.registries.lookupOrThrow(net.minecraft.core.registries.Registries.ITEM);
        ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.MISC, ModItems.ENDIRIUM_UPGRADE_SMITHING_TEMPLATE.get(), 2)
                .pattern("#M#")
                .pattern("#I#")
                .pattern("###")
                .define('#', Items.DIAMOND)
                .define('I', Items.END_STONE)
                .define('M', ModItems.ENDIRIUM_UPGRADE_SMITHING_TEMPLATE.get())
                .unlockedBy("has_template", has(ModItems.ENDIRIUM_UPGRADE_SMITHING_TEMPLATE.get()))
                .save(this.output);
        ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.MISC, ModItems.ENDIRIUM_BLOCK_ITEM.get(), 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.ENDIRIUM_INGOT.get())
                .unlockedBy("has_ingot", has(ModItems.ENDIRIUM_INGOT.get()))
                .save(this.output);

        ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.MISC, ModItems.ENDIRIUM_INGOT.get(), 1)
                .pattern("###")
                .pattern("#M#")
                .pattern("###")
                .define('#', ModItems.ENDIRIUM_NUGGET.get())
                .define('M', Items.NETHERITE_INGOT)
                .group("endirium_ingot")
                .unlockedBy("has_nugget", has(ModItems.ENDIRIUM_NUGGET.get()))
                .save(this.output, "ingot_recipe");
        ShapelessRecipeBuilder.shapeless(itemLookup, RecipeCategory.MISC, ModItems.ENDIRIUM_INGOT.get(), 9)
                .requires(ModItems.ENDIRIUM_BLOCK_ITEM.get())
                .group("endirium_ingot")
                .unlockedBy("has_block", has(ModItems.ENDIRIUM_BLOCK_ITEM.get()))
                .save(this.output, "ingot_from_block");

        net.minecraft.data.recipes.SimpleCookingRecipeBuilder.blasting(
                    net.minecraft.world.item.crafting.Ingredient.of(ModItems.ENDIRIUM_ORE_ITEM.get()),
                    RecipeCategory.MISC,
                    CookingBookCategory.MISC,
                    ModItems.ENDIRIUM_NUGGET.get(),
                    3.0F,
                    200)
                .unlockedBy("has_custom_ore", has(ModItems.ENDIRIUM_ORE_ITEM.get()))
                .save(this.output);
    }

    public static class Runner extends RecipeProvider.Runner {

        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(packOutput, registries);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
            return new EnhancedEndgameRecipeProvider(provider, recipeOutput);
        }

        @Override
        public String getName() {
            return "Enhanced Endgame Recipes";
        }
    }

}
