package com.danilvb.testmod.util;

import com.danilvb.testmod.TestMod;
import com.danilvb.testmod.blocks.BlockItemBase;
import com.danilvb.testmod.blocks.MiodiumBlock;
import com.danilvb.testmod.blocks.PerekristiumBlock;
import com.danilvb.testmod.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
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
    public static final RegistryObject<Block> PEREKRISTIUM_BLOCK = BLOCKS.register("perekristium_block", PerekristiumBlock::new);


    //Block Items
    public static final RegistryObject<Item> MIODIUM_BLOCK_ITEM = ITEMS.register("miodium_block", () -> new BlockItemBase(MIODIUM_BLOCK.get()));
    public static final RegistryObject<Item> PEREKRISTIUM_BLOCK_ITEM = ITEMS.register("perekristium_block", () -> new BlockItemBase(PEREKRISTIUM_BLOCK.get()));


}
