package io.github.worldsaladdev.extrafruits;

import io.github.worldsaladdev.extrafruits.initialization.*;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExtraFruits.MODID)
public class ExtraFruits {
    public static final String MODID = "extrafruits";

    public ExtraFruits() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        //BlockInitialization.BLOCKS.register(bus);
        ItemInitialization.ITEMS.register(bus);
        CreativeTabInitialization.CREATIVE_TAB.register(bus);
        RecipeSerializerInitialization.RECIPE_SERIALIZERS.register(bus);

    }
}