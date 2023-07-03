package net.emilsg.clutter.block.custom;

import net.minecraft.block.BlockSetType;
import net.minecraft.block.BlockState;
import net.minecraft.block.ButtonBlock;
import net.minecraft.block.Oxidizable;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class OxidizableButtonBlock extends ButtonBlock implements Oxidizable {

    private final OxidationLevel oxidationLevel;

    public OxidizableButtonBlock(OxidationLevel oxidationLevel, Settings settings, BlockSetType blockSetType, int pressTicks, boolean wooden) {
        super(settings, blockSetType, pressTicks, wooden);
        this.oxidationLevel = oxidationLevel;
    }


    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        this.tickDegradation(state, world, pos, random);
    }

    public boolean hasRandomTicks(BlockState state) {
        if (!state.get(POWERED)) {
            return Oxidizable.getIncreasedOxidationBlock(state.getBlock()).isPresent();
        } else {
            return false;
        }
    }

    public OxidationLevel getDegradationLevel() {
        return this.oxidationLevel;
    }
}
