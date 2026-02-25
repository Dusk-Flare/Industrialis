package industrialis.content.enviromentals;
import industrialis.content.enviromentals.*;
import industrialis.content.enviromentals.vultarEnviroment.*;

import arc.graphics.*;

import mindustry.content.*;
import mindustry.graphics.g3d.*;
import mindustry.type.*;

import industrialis.content.*;
import industrialis.content.blocks.*;

public class IndustrialPlanets {
    public static Planet
            vultar;

    public static void load() {
        vultar = new Planet("vultar", Planets.sun, 1f, 1) {{
            //i need help plz
            //TODO
            //generator = new VultarPlanetGenerator();
            iconColor = Color.valueOf("dd0000");
            accessible = true;
            defaultCore = IndustrialSupport.metalicCore;
            drawOrbit = true;
            orbitRadius = 25f;
            rotateTime = 12 * 60; //The day lasts 12 minutes
            orbitTime = rotateTime * 34; // 34 days a year
            atmosphereColor = Color.valueOf("800000");
            atmosphereRadIn = 0.01f;
            atmosphereRadOut = 0.3f;
            sectorSeed = 30;
            startSector = 0;
            clearSectorOnLose = true;
            allowWaveSimulation = true;
            allowSectorInvasion = true;
            allowSectorInvasion = false;
            allowLaunchToNumbered = false;
            allowLaunchSchematics = true;
            enemyCoreSpawnReplace = true;
            allowLaunchLoadout = true;
            alwaysUnlocked = true;
            ruleSetter = r -> {
                r.fog = true;
                r.staticFog = true;
            };
            itemWhitelist = IndustrialItems.vultarItems;
            cloudMesh = new HexSkyMesh(this, 4, 2, .01f, 6, Color.valueOf("dd0000"), 4, 2, 2, .55f);
        }};
    }
}