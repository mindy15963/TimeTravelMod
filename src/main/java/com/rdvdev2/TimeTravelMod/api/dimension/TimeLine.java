package com.rdvdev2.TimeTravelMod.api.dimension;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;

import javax.annotation.OverridingMethodsMustInvokeSuper;

// TODO: JavaDoc
public abstract class TimeLine extends WorldProvider {
    private DimensionType DIMENSION_TYPE;

    private int dimId;
    private int modRegistryId = -1;
    private int minTier;

    public int getDimId() {
        return dimId;
    }

    public int getMinTier() {
        return minTier;
    }

    public TimeLine(int dimId, DimensionType dimType, int minTier) {
        super();
        this.dimId = dimId;
        this.DIMENSION_TYPE = dimType;
        this.minTier = minTier;
    }

    public final void setModRegistryId(int id) {
        modRegistryId = modRegistryId == -1 ? id : throw_id();
    }

    public final int getModRegistryId() {
        return modRegistryId;
    }

    public int throw_id() {
        throw new RuntimeException("The registry id of a TimeLine can't be changed once is set");
    }

    @OverridingMethodsMustInvokeSuper
    public void init() {
        this.setDimension(dimId);
    }

    @Override
    public final boolean canRespawnHere() {
        return true;
    }

    @Override
    public final int getRespawnDimension(EntityPlayerMP player) {
        return dimId;
    }

    @Override
    public boolean isSurfaceWorld() {
        return true;
    }

    public final DimensionType getDimensionType() {
        return DIMENSION_TYPE;
    }
}