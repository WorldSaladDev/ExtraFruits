//adapted from "Ad Astra" code by Terrarium

package io.github.worldsaladdev.extrafruits.recipes;

import com.google.gson.JsonObject;
import io.github.worldsaladdev.extrafruits.initialization.ItemInitialization;
import io.github.worldsaladdev.extrafruits.initialization.RecipeSerializerInitialization;
import io.github.worldsaladdev.extrafruits.items.JuicerItem;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.NonNullList;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CraftingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.ShapelessRecipe;

@MethodsReturnNonnullByDefault
public class JuicerRecipe extends ShapelessRecipe {

    public JuicerRecipe(ResourceLocation id, String group, CraftingBookCategory category, ItemStack output, NonNullList<Ingredient> input) {
        super(id, group, category, output, input);
    }

    @Override
    public ItemStack assemble(CraftingContainer craftingInventory, RegistryAccess registryAccess) {
        return getResultItem(RegistryAccess.fromRegistryOfRegistries(BuiltInRegistries.REGISTRY)).copy();
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return RecipeSerializerInitialization.JUICER_SERIALIZER.get();
    }

    @Override
    public NonNullList<ItemStack> getRemainingItems(CraftingContainer inventory) {

        NonNullList<ItemStack> defaultedList = NonNullList.withSize(inventory.getContainerSize(), ItemStack.EMPTY);

        // Damage the juicer in the recipe.
        for (int i = 0; i < inventory.getContainerSize(); i++) {
            ItemStack stack = inventory.getItem(i);
            Item item = stack.getItem();
            if (item instanceof JuicerItem) {
                ItemStack juicer = new ItemStack(ItemInitialization.JUICER.get(), 1);
                juicer.setDamageValue(stack.getDamageValue() + 1);
                if (juicer.getDamageValue() >= juicer.getMaxDamage())
                    continue;
                defaultedList.set(i, juicer);
            }
        }
        return defaultedList;
    }

    public static class Serializer extends ShapelessRecipe.Serializer {

        @Override
        public JuicerRecipe fromJson(ResourceLocation id, JsonObject json) {
            ShapelessRecipe shapelessRecipe = super.fromJson(id, json);
            String group = GsonHelper.getAsString(json, "group", "");
            return new JuicerRecipe(shapelessRecipe.getId(), group, shapelessRecipe.category(), shapelessRecipe.getResultItem(null), shapelessRecipe.getIngredients());
        }

        @Override
        public JuicerRecipe fromNetwork(ResourceLocation id, FriendlyByteBuf buf) {
            ShapelessRecipe shapelessRecipe = super.fromNetwork(id, buf);
            return new JuicerRecipe(shapelessRecipe.getId(), shapelessRecipe.getGroup(), shapelessRecipe.category(), shapelessRecipe.getResultItem(null), shapelessRecipe.getIngredients());
        }
    }
}
