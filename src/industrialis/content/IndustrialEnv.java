package industrialis.content;

import industrialis.content.enviromentals.*;
import industrialis.content.enviromentals.vultarEnviroment.*;

public class IndustrialEnv {
    public static void load() {
        //Vultar-Region
        VultarOres.load();
        VultarTiles.load();
        //Vultar-EndRegion
        IndustrialPlanets.load();
    }
}