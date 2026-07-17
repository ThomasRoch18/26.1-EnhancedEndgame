package legendary138.enhancedendgame.datagen.bootstrap;

import legendary138.enhancedendgame.init.ModBlocks;
import legendary138.enhancedendgame.worldgen.EnhancedEndgameWorldgen;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

import java.util.List;

import static legendary138.enhancedendgame.worldgen.EnhancedEndgameWorldgen.ENDIRIUM_ORE;
import static legendary138.enhancedendgame.worldgen.EnhancedEndgameWorldgen.ENDIRIUM_ORE_PLACED;

public class EnhancedEndgameWorldgenBootstrapper {
    private EnhancedEndgameWorldgenBootstrapper() {
    }

    public static void bootstrapConfiguredFeatures(BootstrapContext<ConfiguredFeature<?, ?>> context) {

        RuleTest endStoneReplacement = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> targets = List.of(
                OreConfiguration.target(endStoneReplacement, ModBlocks.ENDIRIUM_ORE.get().defaultBlockState()));

        context.register(ENDIRIUM_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(targets, 3, 0.0F)));
    }

    public static void bootstrapPlacedFeatures(BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures =
                context.lookup(Registries.CONFIGURED_FEATURE);

        BlockPredicate exposedToAir = BlockPredicate.anyOf(
                Direction.stream().map(direction ->
                                BlockPredicate.matchesBlocks(direction.getUnitVec3i(), Blocks.AIR, Blocks.CAVE_AIR, Blocks.VOID_AIR)).toList());

        context.register(
                ENDIRIUM_ORE_PLACED,
                new PlacedFeature(configuredFeatures.getOrThrow(ENDIRIUM_ORE),
                        List.of(CountPlacement.of(1),
                                InSquarePlacement.spread(),
                                HeightRangePlacement.uniform(VerticalAnchor.absolute(55),
                                        VerticalAnchor.absolute(65)
                                ), BlockPredicateFilter.forPredicate(exposedToAir), BiomeFilter.biome())));
    }
}
