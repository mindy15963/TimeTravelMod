package com.rdvdev2.TimeTravelMod.common.dimension;

import com.rdvdev2.TimeTravelMod.api.timemachine.TimeMachine;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.util.ITeleporter;

public class ITeleporterTimeMachine implements ITeleporter {

    protected final WorldServer worldIn;
    protected final WorldServer worldOut;
    private TimeMachine tm;
    private BlockPos controlPos;
    private EnumFacing facing;

    public ITeleporterTimeMachine(WorldServer worldIn, WorldServer worldOut, TimeMachine tm, BlockPos controlPos, EnumFacing facing) {
        this.worldIn = worldIn;
        this.worldOut = worldOut;
        this.tm = tm;
        this.controlPos = controlPos;
        this.facing = facing;
    }

    @Override
    public void placeEntity(World world, Entity entity, float yaw)
    {
        tm.teleporterTasks(worldIn, worldOut, controlPos, facing);
    }
}
