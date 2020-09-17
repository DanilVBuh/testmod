package com.danilvb.testmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class PerekristiumBlock extends Block {
    public PerekristiumBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(4.0f,10.0f)
                .sound(SoundType.METAL)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
