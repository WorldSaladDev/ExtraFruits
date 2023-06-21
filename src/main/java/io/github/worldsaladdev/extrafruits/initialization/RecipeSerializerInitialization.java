package io.github.worldsaladdev.extrafruits.initialization;

import io.github.worldsaladdev.extrafruits.ExtraFruits;
import io.github.worldsaladdev.extrafruits.recipes.JuicerRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.ShapelessRecipe;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RecipeSerializerInitialization {
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, ExtraFruits.MODID);

    public static final RegistryObject<RecipeSerializer<ShapelessRecipe>> JUICER_SERIALIZER = RECIPE_SERIALIZERS.register("juicing", JuicerRecipe.Serializer::new);
}