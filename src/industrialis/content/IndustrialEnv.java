package industrialis.content;

import industrialis.content.enviromentals.*;
import industrialis.content.enviromentals.vultarEnviroment.*;

public class IndustrialEnv {
    public static void load() {
        VultarOres.load();
        VultarTiles.load();
        IndustrialPlanets.load();
        IndustrialSectorPresets.load();
        VultarTechTree.load();
    }
}