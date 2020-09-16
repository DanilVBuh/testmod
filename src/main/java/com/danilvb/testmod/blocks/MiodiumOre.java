package com.danilvb.testmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class MiodiumOre extends Block {
    public MiodiumOre() {
        super(OreBlock.Properties.create(Material.ROCK)
                .hardnessAndResistance(3.0f,2.0f)
                .sound(SoundType.STONE)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}