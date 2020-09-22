package com.danilvb.testmod.util;

import com.danilvb.testmod.TestMod;
import com.danilvb.testmod.blocks.*;
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

    public static final RegistryObject<Item> PHILOCLITE = ITEMS.register("philoclite", ItemBase::new);

    public static final RegistryObject<Item> PEREKRISTIUM = ITEMS.register("perekristium", ItemBase::new);


    //Blocks
    public static final RegistryObject<Block> MIODIUM_BLOCK = BLOCKS.register("miodium_block", MiodiumBlock::new);
    public static final RegistryObject<Block> MIODIUM_ORE = BLOCKS.register("miodium_ore", MiodiumOre::new);

    public static final RegistryObject<Block> PHILOCLITE_BLOCK = BLOCKS.register("philoclite_block", PhilocliteBlock::new);
    public static final RegistryObject<Block> PHILOCLITE_ORE = BLOCKS.register("philoclite_ore", PhilocliteOre::new);

    public static final RegistryObject<Block> PEREKRISTIUM_BLOCK = BLOCKS.register("perekristium_block", PerekristiumBlock::new);


    //Block Items
    public static final RegistryObject<Item> MIODIUM_BLOCK_ITEM = ITEMS.register("miodium_block", () -> new BlockItemBase(MIODIUM_BLOCK.get()));
    public static final RegistryObject<Item> MIODIUM_ORE_ITEM = ITEMS.register("miodium_ore", () -> new BlockItemBase(MIODIUM_ORE.get()));

    public static final RegistryObject<Item> PHILOCLITE_BLOCK_ITEM = ITEMS.register("philoclite_block", () -> new BlockItemBase(PHILOCLITE_BLOCK.get()));
    public static final RegistryObject<Item> PHILOCLITE_ORE_ITEM = ITEMS.register("philoclite_ore", () -> new BlockItemBase(PHILOCLITE_ORE.get()));

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

    public static final RegistryObject<SwordItem> PHILOCLITE_SWORD = ITEMS.register("philoclite_sword", () ->
            new SwordItem(TestItemTier.PHILOCLITE, 3, -1.0f, new Item.Properties().group(TestMod.TAB)));
    public static final RegistryObject<AxeItem> PHILOCLITE_AXE = ITEMS.register("philoclite_axe", () ->
            new AxeItem(TestItemTier.PHILOCLITE, 4, -2.0f, new Item.Properties().group(TestMod.TAB)));
    public static final RegistryObject<PickaxeItem> PHILOCLITE_PICKAXE = ITEMS.register("philoclite_pickaxe", () ->
            new PickaxeItem(TestItemTier.PHILOCLITE, 1, -2.8f, new Item.Properties().group(TestMod.TAB)));
    public static final RegistryObject<ShovelItem> PHILOCLITE_SHOVEL = ITEMS.register("philoclite_shovel", () ->
            new ShovelItem(TestItemTier.PHILOCLITE, 2, -3.2f, new Item.Properties().group(TestMod.TAB)));
    public static final RegistryObject<HoeItem> PHILOCLITE_HOE = ITEMS.register("philoclite_hoe", () ->
            new HoeItem(TestItemTier.PHILOCLITE, -3.2f, new Item.Properties().group(TestMod.TAB)));
  
    //Armor
    public static final RegistryObject<ArmorItem> MIODIUM_HELMET = ITEMS.register("miodium_helmet",
            () -> new ArmorItem(TestArmorMaterial.MIODIUM, EquipmentSlotType.HEAD, new Item.Properties().group(TestMod.TAB)));
    public static final RegistryObject<ArmorItem> MIODIUM_CHESTPLATE = ITEMS.register("miodium_chestplate",
            () -> new ArmorItem(TestArmorMaterial.MIODIUM, EquipmentSlotType.CHEST, new Item.Properties().group(TestMod.TAB)));
    public static final RegistryObject<ArmorItem> MIODIUM_LEGGINGS = ITEMS.register("miodium_leggings",
            () -> new ArmorItem(TestArmorMaterial.MIODIUM, EquipmentSlotType.LEGS, new Item.Properties().group(TestMod.TAB)));
    public static final RegistryObject<ArmorItem> MIODIUM_BOOTS = ITEMS.register("miodium_boots",
            () -> new ArmorItem(TestArmorMaterial.MIODIUM, EquipmentSlotType.FEET, new Item.Properties().group(TestMod.TAB)));

    public static final RegistryObject<ArmorItem> PHILOCLITE_HELMET = ITEMS.register("philoclite_helmet",
            () -> new ArmorItem(TestArmorMaterial.PHILOCLITE, EquipmentSlotType.HEAD, new Item.Properties().group(TestMod.TAB)));
    public static final RegistryObject<ArmorItem> PHILOCLITE_CHESTPLATE = ITEMS.register("philoclite_chestplate",
            () -> new ArmorItem(TestArmorMaterial.PHILOCLITE, EquipmentSlotType.CHEST, new Item.Properties().group(TestMod.TAB)));
    public static final RegistryObject<ArmorItem> PHILOCLITE_LEGGINGS = ITEMS.register("philoclite_leggings",
            () -> new ArmorItem(TestArmorMaterial.PHILOCLITE, EquipmentSlotType.LEGS, new Item.Properties().group(TestMod.TAB)));
    public static final RegistryObject<ArmorItem> PHILOCLITE_BOOTS = ITEMS.register("philoclite_boots",
            () -> new ArmorItem(TestArmorMaterial.PHILOCLITE, EquipmentSlotType.FEET, new Item.Properties().group(TestMod.TAB)));
}
