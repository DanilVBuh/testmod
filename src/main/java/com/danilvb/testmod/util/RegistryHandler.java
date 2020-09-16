package com.danilvb.testmod.util;

import com.danilvb.testmod.TestMod;
import com.danilvb.testmod.blocks.BlockItemBase;
import com.danilvb.testmod.blocks.MiodiumBlock;
import com.danilvb.testmod.blocks.MiodiumOre;
import com.danilvb.testmod.blocks.PerekristiumBlock;
import com.danilvb.testmod.items.ItemBase;
import net.minecraft.block.Block;
import com.danilvb.testmod.armor.TestArmorMaterial;
import com.danilvb.testmod.tools.TestItemTier;
import net.minecraft.item.*;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TestMod.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


    //Items
    public static final RegistryObject<Item> MIODIUM = ITEMS.register("miodium", ItemBase::new);
    public static final RegistryObject<Item> PEREKRISTIUM = ITEMS.register("perekristium", ItemBase::new);


    //Blocks
    public static final RegistryObject<Block> MIODIUM_BLOCK = BLOCKS.register("miodium_block", MiodiumBlock::new);
    public static final RegistryObject<Block> MIODIUM_ORE = BLOCKS.register("miodium_ore", MiodiumOre::new);
    public static final RegistryObject<Block> PEREKRISTIUM_BLOCK = BLOCKS.register("perekristium_block", PerekristiumBlock::new);


    //Block Items
    public static final RegistryObject<Item> MIODIUM_BLOCK_ITEM = ITEMS.register("miodium_block", () -> new BlockItemBase(MIODIUM_BLOCK.get()));
    public static final RegistryObject<Item> MIODIUM_ORE_ITEM = ITEMS.register("miodium_ore", () -> new BlockItemBase(MIODIUM_ORE.get()));
    public static final RegistryObject<Item> PEREKRISTIUM_BLOCK_ITEM = ITEMS.register("perekristium_block", () -> new BlockItemBase(PEREKRISTIUM_BLOCK.get()));


    //Tools
    public static final RegistryObject<SwordItem> MIODIUM_SWORD = ITEMS.register("miodium_sword", () ->
            new SwordItem(TestItemTier.MIODIUM, 3, -1.0f, new Item.Properties().group(TestMod.TAB)));
    public static final RegistryObject<AxeItem> MIODIUM_AXE = ITEMS.register("miodium_axe", () ->
            new AxeItem(TestItemTier.MIODIUM, 4, -2.0f, new Item.Properties().group(TestMod.TAB)));
    public static final RegistryObject<PickaxeItem> MIODIUM_PICKAXE = ITEMS.register("miodium_pickaxe", () ->
            new PickaxeItem(TestItemTier.MIODIUM, 1, -2.8f, new Item.Properties().group(TestMod.TAB)));
    public static final RegistryObject<ShovelItem> MIODIUM_SHOVEL = ITEMS.register("miodium_shovel", () ->
            new ShovelItem(TestItemTier.MIODIUM, 2, -3.2f, new Item.Properties().group(TestMod.TAB)));
    public static final RegistryObject<HoeItem> MIODIUM_HOE = ITEMS.register("miodium_hoe", () ->
            new HoeItem(TestItemTier.MIODIUM, -3.2f, new Item.Properties().group(TestMod.TAB)));
  
    //Armor
    public static final RegistryObject<ArmorItem> MIODIUM_HELMET = ITEMS.register("miodium_helmet",
            () -> new ArmorItem(TestArmorMaterial.MIODIUM, EquipmentSlotType.HEAD, new Item.Properties().group(TestMod.TAB)));
    public static final RegistryObject<ArmorItem> MIODIUM_CHESTPLATE = ITEMS.register("miodium_chestplate",
            () -> new ArmorItem(TestArmorMaterial.MIODIUM, EquipmentSlotType.CHEST, new Item.Properties().group(TestMod.TAB)));
    public static final RegistryObject<ArmorItem> MIODIUM_LEGGINGS = ITEMS.register("miodium_leggings",
            () -> new ArmorItem(TestArmorMaterial.MIODIUM, EquipmentSlotType.LEGS, new Item.Properties().group(TestMod.TAB)));
    public static final RegistryObject<ArmorItem> MIODIUM_BOOTS = ITEMS.register("miodium_boots",
            () -> new ArmorItem(TestArmorMaterial.MIODIUM, EquipmentSlotType.FEET, new Item.Properties().group(TestMod.TAB)));
}
