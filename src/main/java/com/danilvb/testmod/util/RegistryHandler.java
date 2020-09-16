package com.danilvb.testmod.util;

import com.danilvb.testmod.TestMod;
import com.danilvb.testmod.armor.TestArmorMaterial;
import com.danilvb.testmod.items.ItemBase;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
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

    //Armor
    public static final RegistryObject<ArmorItem> MIODIUM_HELMET = ITEMS.register("miodium_helmet",
            () -> new ArmorItem(TestArmorMaterial.MIODIUM, EquipmentSlotType.HEAD, new Item.Properties().group(TestMod.TAB)));
}
