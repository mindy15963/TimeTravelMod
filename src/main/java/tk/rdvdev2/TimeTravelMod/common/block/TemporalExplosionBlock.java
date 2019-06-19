package tk.rdvdev2.TimeTravelMod.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootContext;
import tk.rdvdev2.TimeTravelMod.ModBlocks;

import java.util.Collections;
import java.util.List;

public class TemporalExplosionBlock extends Block {
    private String name = "temporalexplosion";
    public static DamageSource damage = new DamageSource("temporalerror").setDamageIsAbsolute();

    public TemporalExplosionBlock() {
        super(Properties.create(Material.PORTAL)
                .sound(SoundType.METAL)
                .hardnessAndResistance(-1)
                .lightValue(0)
                .variableOpacity()
        );
        setRegistryName(name);
    }

    @Override
    public List<ItemStack> getDrops(BlockState p_220076_1_, LootContext.Builder p_220076_2_) {
        return Collections.emptyList();
    }

    @Override
    public boolean canEntityDestroy(BlockState state, IBlockReader world, BlockPos pos, Entity entity) {
        if (entity instanceof PlayerEntity) {
            if (((PlayerEntity)entity).isCreative()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void onEntityCollision(BlockState p_196262_1_, World p_196262_2_, BlockPos p_196262_3_, Entity entity) {
        entity.attackEntityFrom(damage, 1000000);
    }

    @Override
    public VoxelShape getCollisionShape(BlockState p_196268_1_, IBlockReader p_196268_2_, BlockPos p_196268_3_, ISelectionContext context) {
        return VoxelShapes.create(VoxelShapes.fullCube().getBoundingBox().shrink(0.1));
    }

    @Override
    public boolean onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity playerIn, Hand hand, BlockRayTraceResult blockRayTraceResult) {
        if (ItemStack.areItemStacksEqual(playerIn.inventory.getCurrentItem(), new ItemStack(ModBlocks.reinforcedHeavyBlock, playerIn.inventory.getCurrentItem().getCount()))) {
            if(!playerIn.isCreative()) playerIn.inventory.getCurrentItem().grow(-1);
            worldIn.setBlockState(pos, ModBlocks.reinforcedHeavyBlock.getDefaultState());
            worldIn.playSound(null, pos, SoundEvents.BLOCK_METAL_PLACE, SoundCategory.BLOCKS, 3.0F, 1);
            return true;
        }
        return false;
    }
}