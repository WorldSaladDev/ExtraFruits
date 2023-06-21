package io.github.worldsaladdev.extrafruits.initialization;

import io.github.worldsaladdev.extrafruits.ExtraFruits;
import io.github.worldsaladdev.extrafruits.items.DrinkableFoodItem;
import io.github.worldsaladdev.extrafruits.items.JuicerItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInitialization {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtraFruits.MODID);

//Tools
    public static final RegistryObject<Item> JUICER = ITEMS.register("juicer",
            () -> new JuicerItem(new Item.Properties().stacksTo(1).durability(64)));

//Fruits
    public static final RegistryObject<Item> ORANGE = ITEMS.register("orange",
            () -> new Item(new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(4).saturationMod(2.8f).build())));

    public static final RegistryObject<Item> LEMON = ITEMS.register("lemon",
            () -> new Item(new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(3).saturationMod(2.2f).build())));

    public static final RegistryObject<Item> LIME = ITEMS.register("lime",
            () -> new Item(new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(3).saturationMod(2.2f).build())));

    public static final RegistryObject<Item> KIWI = ITEMS.register("kiwi",
            () -> new Item(new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(3).saturationMod(2.4f).build())));

    public static final RegistryObject<Item> PINEAPPLE = ITEMS.register("pineapple",
            () -> new Item(new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(5).saturationMod(3.2f).build())));

    public static final RegistryObject<Item> PEACH = ITEMS.register("peach",
            () -> new Item(new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(4).saturationMod(2.8f).build())));

    public static final RegistryObject<Item> COCONUT = ITEMS.register("coconut",
            () -> new Item(new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(1).saturationMod(0.5f).build())));

    public static final RegistryObject<Item> BLUEBERRY = ITEMS.register("blueberry",
            () -> new Item(new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(1).saturationMod(0.3f).build())));

//Juices
    public static final RegistryObject<Item> ORANGE_JUICE = ITEMS.register("orange_juice",
            () -> new DrinkableFoodItem(new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(4).saturationMod(3.0f).build())));

    public static final RegistryObject<Item> LEMON_JUICE = ITEMS.register("lemon_juice",
            () -> new DrinkableFoodItem(new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(3).saturationMod(2.4f).build())));

    public static final RegistryObject<Item> LIME_JUICE = ITEMS.register("lime_juice",
            () -> new DrinkableFoodItem(new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(3).saturationMod(2.4f).build())));

    public static final RegistryObject<Item> KIWI_JUICE = ITEMS.register("kiwi_juice",
            () -> new DrinkableFoodItem(new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(4).saturationMod(2.4f).build())));

    public static final RegistryObject<Item> PINEAPPLE_JUICE = ITEMS.register("pineapple_juice",
            () -> new DrinkableFoodItem(new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(5).saturationMod(3.4f).build())));

    public static final RegistryObject<Item> PEACH_JUICE = ITEMS.register("peach_juice",
            () -> new DrinkableFoodItem(new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(4).saturationMod(3.0f).build())));

    public static final RegistryObject<Item> COCONUT_MILK = ITEMS.register("coconut_milk",
            () -> new DrinkableFoodItem(new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.8f).build())));

    public static final RegistryObject<Item> BLUEBERRY_JUICE = ITEMS.register("blueberry_juice",
            () -> new DrinkableFoodItem(new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.4f).build())));

    public static final RegistryObject<Item> APPLE_JUICE = ITEMS.register("apple_juice",
            () -> new DrinkableFoodItem(new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(4).saturationMod(2.8f).build())));

    public static final RegistryObject<Item> MELON_JUICE = ITEMS.register("melon_juice",
            () -> new DrinkableFoodItem(new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(2).saturationMod(1.8f).build())));

    public static final RegistryObject<Item> SWEET_BERRY_JUICE = ITEMS.register("sweet_berry_juice",
            () -> new DrinkableFoodItem(new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.6f).build())));

    public static final RegistryObject<Item> GLOW_BERRY_JUICE = ITEMS.register("glow_berry_juice",
            () -> new DrinkableFoodItem(new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.6f).alwaysEat().effect(() -> new MobEffectInstance(MobEffects.GLOWING, 600, 1), 1f).build())));

    public static final RegistryObject<Item> CHORUS_JUICE = ITEMS.register("chorus_juice",
            () -> new DrinkableFoodItem(new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.6f).build())));


//cocktails
    public static final RegistryObject<Item> CITRUS_SPRINT = ITEMS.register("citrus_sprint",
            () -> new DrinkableFoodItem(new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(4).saturationMod(3.0f).alwaysEat().effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1800, 1), 1f).build())));

    public static final RegistryObject<Item> PINA_COLADA = ITEMS.register("pina_colada",
            () -> new DrinkableFoodItem(new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(4).saturationMod(3.0f).alwaysEat().effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 125, 1), 1f).effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 1800, 0), 0.5f).build())));
}


