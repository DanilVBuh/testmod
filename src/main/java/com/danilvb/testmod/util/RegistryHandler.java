package com.danilvb.testmod.util;

import com.danilvb.testmod.TestMod;
import com.danilvb.testmod.items.ItemBase;
import com.danilvb.testmod.tools.MiodiumItemTier;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> MIODIUM = ITEMS.register("miodium", ItemBase::new);
    public static final RegistryObject<Item> PEREKRISTIUM = ITEMS.register("perekristium", ItemBase::new);

    //Tools
    public static final RegistryObject<SwordItem> MIODIUM_SWORD = ITEMS.register("miodium_sword", () ->
            new SwordItem(MiodiumItemTier.MIODIUM, 3, -1.0f, new Item.Properties().group(TestMod.TAB)));
    public static final RegistryObject<AxeItem> MIODIUM_AXE = ITEMS.register("miodium_axe", () ->
            new AxeItem(MiodiumItemTier.MIODIUM, 4, -2.0f, new Item.Properties().group(TestMod.TAB)));
    public static final RegistryObject<PickaxeItem> MIODIUM_PICKAXE = ITEMS.register("miodium_pickaxe", () ->
            new PickaxeItem(MiodiumItemTier.MIODIUM, 1, -2.8f, new Item.Properties().group(TestMod.TAB)));
    public static final RegistryObject<ShovelItem> MIODIUM_SHOVEL = ITEMS.register("miodium_shovel", () ->
            new ShovelItem(MiodiumItemTier.MIODIUM, 2, -3.2f, new Item.Properties().group(TestMod.TAB)));
    public static final RegistryObject<HoeItem> MIODIUM_HOE = ITEMS.register("miodium_hoe", () ->
            new HoeItem(MiodiumItemTier.MIODIUM, -3.2f, new Item.Properties().group(TestMod.TAB)));
}
