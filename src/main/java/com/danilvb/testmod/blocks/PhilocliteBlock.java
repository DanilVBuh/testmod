package com.danilvb.testmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class PhilocliteBlock extends Block {
    public PhilocliteBlock() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(4.0f,8.0f)
                .sound(SoundType.METAL)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
