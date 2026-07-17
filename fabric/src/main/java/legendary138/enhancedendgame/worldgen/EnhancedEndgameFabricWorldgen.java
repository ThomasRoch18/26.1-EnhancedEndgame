package legendary138.enhancedendgame.worldgen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;

public final class EnhancedEndgameFabricWorldgen {
    private EnhancedEndgameFabricWorldgen() {
    }

    public static void load() {
        BiomeModifications.addFeature(
                BiomeSelectors.tag(BiomeTags.IS_END),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                EnhancedEndgameWorldgen.ENDIRIUM_ORE_PLACED
        );
    }
}
