package tk.rdvdev2.TimeTravelMod.common.timemachine;

import net.minecraft.util.text.TranslationTextComponent;
import tk.rdvdev2.TimeTravelMod.api.timemachine.TimeMachine;

public class Tier1TimeMachine extends TimeMachine {

    public Tier1TimeMachine() {};

    @Override
    public TranslationTextComponent getName() {
        return new TranslationTextComponent("tm.tmtier1.name");
    }

    @Override
    public int getCooldownTime() {
        return 20*20; // 20 seconds (20t = 1s)
    }

    public int getTier() {return 1;}

    public int[][] coreBlocksPos() {
        return new int[][]{{0, -2, -1}};
    }

    public int[][] basicBlocksPos() {
        return new int[][]{
                {-1, -2, 0}, {-1, -2, -1}, {-1, -2, -2}, {0, -2, 0}, {0, -2, -2},
                {1, -2, 0}, {1, -2, -1}, {1, -2, -2}, {-1, -1, 0}, {-1, -1, -1},
                {-1, -1, -2}, {0, -1, 0}, {1, -1, 0}, {1, -1, -1}, {1, -1, -2},
                {-1, 0, 0}, {-1, 0, -1}, {-1, 0, -2}, {1, 0, 0}, {1, 0, -1},
                {1, 0, -2}, {-1, 1, 0}, {-1, 1, -1}, {-1, 1, -2}, {0, 1, 0},
                {0, 1, -1}, {0, 1, -2}, {1, 1, 0}, {1, 1, -1}, {1, 1, -2}
        };
    }

    public int[][] airBlocksPos() {
        return new int[][]{{0, -1, -1}, {0, -1, -2}, {0, 0, -1}, {0, 0, -2}};
    }
}
