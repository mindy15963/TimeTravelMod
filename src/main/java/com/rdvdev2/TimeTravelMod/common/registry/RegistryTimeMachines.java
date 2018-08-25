package com.rdvdev2.TimeTravelMod.common.registry;

import com.rdvdev2.TimeTravelMod.TimeTravelMod;
import com.rdvdev2.TimeTravelMod.api.event.EventRegisterTimeMachine;
import com.rdvdev2.TimeTravelMod.common.event.EventSetTimeMachine;
import com.rdvdev2.TimeTravelMod.api.timemachine.ITimeMachine;
import net.minecraft.block.state.IBlockState;

import java.util.Arrays;

import static net.minecraftforge.common.MinecraftForge.EVENT_BUS;

public class RegistryTimeMachines {

    private ITimeMachine[] timeMachines = new ITimeMachine[]{};

    public RegistryTimeMachines(){}

    public void start() {
        EVENT_BUS.post(new EventRegisterTimeMachine(this));
    }

    public void link() {
        EVENT_BUS.post(new EventSetTimeMachine(this));
    }

    public int register(ITimeMachine tm) {
        int id = timeMachines.length;
        timeMachines = Arrays.copyOf(timeMachines, id+1);
        tm.setId(id);
        timeMachines[id] = tm;
        return id;
    }

    public ITimeMachine getCompatibleTimeMachine(IBlockState block) {
        for (int i = 0; i < timeMachines.length; i++) {
            IBlockState[] blocks = timeMachines[i].getBlocks();
            for (int j = 0; j < blocks.length; j++) {
                if (blocks[j] == block) {
                    TimeTravelMod.logger.info("Found an appropiate Time Machine");
                    return timeMachines[i];
                }
            }
        }
        TimeTravelMod.logger.info("This is not registered :( "+block.toString());
        return null;
    }

    public ITimeMachine getFromId(int id) {
        return timeMachines[id];
    }
}