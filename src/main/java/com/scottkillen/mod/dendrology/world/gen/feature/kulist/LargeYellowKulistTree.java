package com.scottkillen.mod.dendrology.world.gen.feature.kulist;

import com.scottkillen.mod.dendrology.block.ModBlocks;
import net.minecraft.block.Block;

public class LargeYellowKulistTree extends LargeKulistTree
{
    public LargeYellowKulistTree(boolean isFromSapling)
    {
        super(isFromSapling);
    }

    @Override
    protected Block getLeavesBlock()
    {
        return ModBlocks.leaves3;
    }

    @Override
    protected int getLeavesMetadata()
    {
        return 0;
    }
}