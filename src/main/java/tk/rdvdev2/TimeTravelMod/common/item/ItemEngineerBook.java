package tk.rdvdev2.TimeTravelMod.common.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import tk.rdvdev2.TimeTravelMod.TimeTravelMod;

public class ItemEngineerBook extends Item {

    private String name = "engineerbook";

    public ItemEngineerBook() {
        super(new Properties()
                .group(TimeTravelMod.tabTTM)
                .maxStackSize(1));
        setRegistryName(name);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ActionResultType result = ActionResultType.PASS;
        CompoundNBT data = playerIn.getHeldItem(handIn).getOrCreateChildTag("data");
        if (data.isEmpty()) {
            data.putInt("page", 0);
            data.putInt("y", 0);
        }
        if (worldIn.isRemote) {
            TimeTravelMod.proxy.displayEngineerBookGuiScreen(playerIn);
            result = ActionResultType.PASS;
        }
        return new ActionResult<ItemStack>(result, playerIn.getHeldItem(handIn));
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}
