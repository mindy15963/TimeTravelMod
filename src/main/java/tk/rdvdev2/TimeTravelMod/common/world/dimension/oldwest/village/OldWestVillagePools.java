package tk.rdvdev2.TimeTravelMod.common.world.dimension.oldwest.village;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.block.Blocks;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.jigsaw.*;
import net.minecraft.world.gen.feature.template.*;

public class OldWestVillagePools {
    public static void init() {
    }

    static {
        ImmutableList<StructureProcessor> immutablelist = ImmutableList.of(new RuleStructureProcessor(ImmutableList.of(new RuleEntry(new TagMatchRuleTest(BlockTags.DOORS), AlwaysTrueRuleTest.INSTANCE, Blocks.AIR.getDefaultState()), new RuleEntry(new BlockMatchRuleTest(Blocks.TORCH), AlwaysTrueRuleTest.INSTANCE, Blocks.AIR.getDefaultState()), new RuleEntry(new BlockMatchRuleTest(Blocks.WALL_TORCH), AlwaysTrueRuleTest.INSTANCE, Blocks.AIR.getDefaultState()), new RuleEntry(new RandomBlockMatchRuleTest(Blocks.SMOOTH_SANDSTONE, 0.08F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()), new RuleEntry(new RandomBlockMatchRuleTest(Blocks.CUT_SANDSTONE, 0.1F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()), new RuleEntry(new RandomBlockMatchRuleTest(Blocks.TERRACOTTA, 0.08F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()), new RuleEntry(new RandomBlockMatchRuleTest(Blocks.SMOOTH_SANDSTONE_STAIRS, 0.08F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()), new RuleEntry(new RandomBlockMatchRuleTest(Blocks.SMOOTH_SANDSTONE_SLAB, 0.08F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()), new RuleEntry(new RandomBlockMatchRuleTest(Blocks.WHEAT, 0.2F), AlwaysTrueRuleTest.INSTANCE, Blocks.BEETROOTS.getDefaultState()), new RuleEntry(new RandomBlockMatchRuleTest(Blocks.WHEAT, 0.1F), AlwaysTrueRuleTest.INSTANCE, Blocks.MELON_STEM.getDefaultState()))));
        JigsawManager.field_214891_a.register(new JigsawPattern(new ResourceLocation("minecraft","village/oldwest/town_centers"), new ResourceLocation("minecraft:empty"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("village/oldwest/town_centers/desert_meeting_point_1"), 98), new Pair<>(new SingleJigsawPiece("village/oldwest/town_centers/desert_meeting_point_2"), 98), new Pair<>(new SingleJigsawPiece("village/oldwest/town_centers/desert_meeting_point_3"), 49), new Pair<>(new SingleJigsawPiece("village/oldwest/zombie/town_centers/desert_meeting_point_1", immutablelist), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/zombie/town_centers/desert_meeting_point_2", immutablelist), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/zombie/town_centers/desert_meeting_point_3", immutablelist), 1)), JigsawPattern.PlacementBehaviour.RIGID));
        JigsawManager.field_214891_a.register(new JigsawPattern(new ResourceLocation("minecraft","village/oldwest/streets"), new ResourceLocation("minecraft","village/oldwest/terminators"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("village/oldwest/streets/corner_01"), 3), new Pair<>(new SingleJigsawPiece("village/oldwest/streets/corner_02"), 3), new Pair<>(new SingleJigsawPiece("village/oldwest/streets/straight_01"), 4), new Pair<>(new SingleJigsawPiece("village/oldwest/streets/straight_02"), 4), new Pair<>(new SingleJigsawPiece("village/oldwest/streets/straight_03"), 3), new Pair<>(new SingleJigsawPiece("village/oldwest/streets/crossroad_01"), 3), new Pair<>(new SingleJigsawPiece("village/oldwest/streets/crossroad_02"), 3), new Pair<>(new SingleJigsawPiece("village/oldwest/streets/crossroad_03"), 3), new Pair<>(new SingleJigsawPiece("village/oldwest/streets/square_01"), 3), new Pair<>(new SingleJigsawPiece("village/oldwest/streets/square_02"), 3), new Pair<>(new SingleJigsawPiece("village/oldwest/streets/turn_01"), 3)), JigsawPattern.PlacementBehaviour.TERRAIN_MATCHING));
        JigsawManager.field_214891_a.register(new JigsawPattern(new ResourceLocation("minecraft","village/oldwest/zombie/streets"), new ResourceLocation("minecraft","village/oldwest/zombie/terminators"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("village/oldwest/zombie/streets/corner_01"), 3), new Pair<>(new SingleJigsawPiece("village/oldwest/zombie/streets/corner_02"), 3), new Pair<>(new SingleJigsawPiece("village/oldwest/zombie/streets/straight_01"), 4), new Pair<>(new SingleJigsawPiece("village/oldwest/zombie/streets/straight_02"), 4), new Pair<>(new SingleJigsawPiece("village/oldwest/zombie/streets/straight_03"), 3), new Pair<>(new SingleJigsawPiece("village/oldwest/zombie/streets/crossroad_01"), 3), new Pair<>(new SingleJigsawPiece("village/oldwest/zombie/streets/crossroad_02"), 3), new Pair<>(new SingleJigsawPiece("village/oldwest/zombie/streets/crossroad_03"), 3), new Pair<>(new SingleJigsawPiece("village/oldwest/zombie/streets/square_01"), 3), new Pair<>(new SingleJigsawPiece("village/oldwest/zombie/streets/square_02"), 3), new Pair<>(new SingleJigsawPiece("village/oldwest/zombie/streets/turn_01"), 3)), JigsawPattern.PlacementBehaviour.TERRAIN_MATCHING));
        ImmutableList<StructureProcessor> immutablelist1 = ImmutableList.of(new RuleStructureProcessor(ImmutableList.of(new RuleEntry(new RandomBlockMatchRuleTest(Blocks.WHEAT, 0.2F), AlwaysTrueRuleTest.INSTANCE, Blocks.BEETROOTS.getDefaultState()), new RuleEntry(new RandomBlockMatchRuleTest(Blocks.WHEAT, 0.1F), AlwaysTrueRuleTest.INSTANCE, Blocks.MELON_STEM.getDefaultState()))));
        JigsawManager.field_214891_a.register(new JigsawPattern(new ResourceLocation("minecraft","village/oldwest/houses"), new ResourceLocation("minecraft","village/oldwest/terminators"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_small_house_1"), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_small_house_2"), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_small_house_3"), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_small_house_4"), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_small_house_5"), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_small_house_6"), 1), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_small_house_7"), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_small_house_8"), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_medium_house_1"), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_medium_house_2"), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_butcher_shop_1"), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_tool_smith_1"), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_fletcher_house_1"), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_shepherd_house_1"), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_armorer_1"), 1), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_fisher_1"), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_tannery_1"), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_cartographer_house_1"), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_library_1"), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_mason_1"), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_weaponsmith_1"), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_temple_1"), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_temple_2"), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_large_farm_1", immutablelist1), 11), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_farm_1", immutablelist1), 4), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_farm_2", immutablelist1), 4), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_animal_pen_1"), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_animal_pen_2"), 2), Pair.of(EmptyJigsawPiece.INSTANCE, 5)), JigsawPattern.PlacementBehaviour.RIGID));
        JigsawManager.field_214891_a.register(new JigsawPattern(new ResourceLocation("minecraft","village/oldwest/zombie/houses"), new ResourceLocation("minecraft","village/oldwest/zombie/terminators"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("village/oldwest/zombie/houses/desert_small_house_1", immutablelist), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/zombie/houses/desert_small_house_2", immutablelist), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/zombie/houses/desert_small_house_3", immutablelist), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/zombie/houses/desert_small_house_4", immutablelist), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/zombie/houses/desert_small_house_5", immutablelist), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/zombie/houses/desert_small_house_6", immutablelist), 1), new Pair<>(new SingleJigsawPiece("village/oldwest/zombie/houses/desert_small_house_7", immutablelist), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/zombie/houses/desert_small_house_8", immutablelist), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/zombie/houses/desert_medium_house_1", immutablelist), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/zombie/houses/desert_medium_house_2", immutablelist), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_butcher_shop_1", immutablelist), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_tool_smith_1", immutablelist), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_fletcher_house_1", immutablelist), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_shepherd_house_1", immutablelist), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_armorer_1", immutablelist), 1), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_fisher_1", immutablelist), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_tannery_1", immutablelist), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_cartographer_house_1", immutablelist), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_library_1", immutablelist), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_mason_1", immutablelist), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_weaponsmith_1", immutablelist), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_temple_1", immutablelist), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_temple_2", immutablelist), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_large_farm_1", immutablelist), 7), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_farm_1", immutablelist), 4), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_farm_2", immutablelist), 4), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_animal_pen_1", immutablelist), 2), new Pair<>(new SingleJigsawPiece("village/oldwest/houses/desert_animal_pen_2", immutablelist), 2), Pair.of(EmptyJigsawPiece.INSTANCE, 5)), JigsawPattern.PlacementBehaviour.RIGID));
        JigsawManager.field_214891_a.register(new JigsawPattern(new ResourceLocation("minecraft","village/oldwest/terminators"), new ResourceLocation("minecraft:empty"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("village/oldwest/terminators/terminator_01"), 1), new Pair<>(new SingleJigsawPiece("village/oldwest/terminators/terminator_02"), 1)), JigsawPattern.PlacementBehaviour.TERRAIN_MATCHING));
        JigsawManager.field_214891_a.register(new JigsawPattern(new ResourceLocation("minecraft","village/oldwest/zombie/terminators"), new ResourceLocation("minecraft:empty"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("village/oldwest/terminators/terminator_01"), 1), new Pair<>(new SingleJigsawPiece("village/oldwest/zombie/terminators/terminator_02"), 1)), JigsawPattern.PlacementBehaviour.TERRAIN_MATCHING));
        JigsawManager.field_214891_a.register(new JigsawPattern(new ResourceLocation("minecraft","village/oldwest/decor"), new ResourceLocation("minecraft:empty"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("village/oldwest/desert_lamp_1"), 10), new Pair<>(new FeatureJigsawPiece(Feature.field_227248_z_.func_225566_b_(DefaultBiomeFeatures.field_226729_Q_)), 4), new Pair<>(new FeatureJigsawPiece(Feature.field_227244_A_.func_225566_b_(DefaultBiomeFeatures.field_226731_S_)), 4), Pair.of(EmptyJigsawPiece.INSTANCE, 10)), JigsawPattern.PlacementBehaviour.RIGID));
        JigsawManager.field_214891_a.register(new JigsawPattern(new ResourceLocation("minecraft","village/oldwest/zombie/decor"), new ResourceLocation("minecraft:empty"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("village/oldwest/desert_lamp_1", immutablelist), 10), new Pair<>(new FeatureJigsawPiece(Feature.field_227248_z_.func_225566_b_(DefaultBiomeFeatures.field_226729_Q_)), 4), new Pair<>(new FeatureJigsawPiece(Feature.field_227244_A_.func_225566_b_(DefaultBiomeFeatures.field_226731_S_)), 4), Pair.of(EmptyJigsawPiece.INSTANCE, 10)), JigsawPattern.PlacementBehaviour.RIGID));
        JigsawManager.field_214891_a.register(new JigsawPattern(new ResourceLocation("minecraft","village/oldwest/villagers"), new ResourceLocation("minecraft:empty"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("village/oldwest/villagers/nitwit"), 1), new Pair<>(new SingleJigsawPiece("village/oldwest/villagers/baby"), 1), new Pair<>(new SingleJigsawPiece("village/oldwest/villagers/unemployed"), 10)), JigsawPattern.PlacementBehaviour.RIGID));
        JigsawManager.field_214891_a.register(new JigsawPattern(new ResourceLocation("minecraft","village/oldwest/zombie/villagers"), new ResourceLocation("minecraft:empty"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("village/oldwest/zombie/villagers/nitwit"), 1), new Pair<>(new SingleJigsawPiece("village/oldwest/zombie/villagers/unemployed"), 10)), JigsawPattern.PlacementBehaviour.RIGID));
    }
}
