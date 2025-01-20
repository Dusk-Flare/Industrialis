package industrialis.content.enviromentals;

import arc.graphics.Color;
import industrialis.content.IndustrialItems;
import industrialis.content.blocks.IndustrialSupport;
import mindustry.content.Planets;
import mindustry.graphics.g3d.*;
import mindustry.maps.generators.BlankPlanetGenerator;
import mindustry.type.Planet;

public class IndustrialPlanets {
    public static Planet
            vultar;

    public static void load() {

        vultar = new Planet("vultar", Planets.sun, 1f, 1) {{
            generator = new BlankPlanetGenerator();
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
            allowLaunchToNumbered = false;
            allowLaunchSchematics = true;
            enemyCoreSpawnReplace = true;
            allowLaunchLoadout = true;
            alwaysUnlocked = true;
            itemWhitelist = IndustrialItems.vultarItems;
            ruleSetter = r -> {
                r.fog = true;
                r.staticFog = true;
            };
            meshLoader = () -> new MultiMesh(

                    //dark basalt substrate
                    new NoiseMesh(this, 27, 5, .933f, 1, .0001f, 3.75f, .1f,
                            Color.valueOf("090909"), Color.valueOf("090909"),
                            1, 1f, 1f, 4f),

                    //basalt hills
                    new NoiseMesh(this, 27, 4, .93f, 2, .0001f, 3.8f, .01f,
                            Color.valueOf("101010"), Color.valueOf("101010"),
                            1, 1f, 1f, 4f)
            );
            cloudMesh = new HexSkyMesh(this, 4, 2, .01f, 6, Color.valueOf("dd0000"), 4, 2, 2, .55f);
        }};
    }
}