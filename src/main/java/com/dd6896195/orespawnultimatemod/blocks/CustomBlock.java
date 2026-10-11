package com.dd6896195.orespawnultimatemod.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.network.chat.Component;

public class CustomBlock extends Block {
    
    public CustomBlock() {
        super(BlockBehaviour.Properties
            .of(Material.STONE)
            .strength(3.0f, 3.0f)
            .requiresCorrectToolForDrops()
        );
    }
    
    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, 
                                  Player player, InteractionHand hand, BlockHitResult hit) {
        if (!level.isClientSide) {
            player.sendSystemMessage(Component.literal("You clicked the custom block!"));
        }
        return InteractionResult.SUCCESS;
    }
}