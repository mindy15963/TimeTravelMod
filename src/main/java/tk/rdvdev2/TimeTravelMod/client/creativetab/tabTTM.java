package tk.rdvdev2.TimeTravelMod.client.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import tk.rdvdev2.TimeTravelMod.ModItems;

public class tabTTM extends CreativeTabs {
    public tabTTM(int id){
        super(id, "Time Travel Mod");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ItemStack getTabIconItem(){
        return new ItemStack(ModItems.timeCrystal);
    }

    public String getTranslatedTabLabel() {
        return "Time Travel Mod";
    }
}