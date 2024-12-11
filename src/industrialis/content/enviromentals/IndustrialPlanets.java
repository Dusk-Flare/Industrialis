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
            meshLoader = () -> new MultiMesh(

                    //NoiseMesh(Planet planet, int seed, int divisions, float radius,
                    // int octaves, float persistence, float scale, float mag,
                    // Color color1, Color color2, int coct, float cper, float cscl,
                    // float cthresh),

                    new NoiseMesh(this, 27, 5, .933f, 2, .0001f, 3.75f, .1f,
                            Color.valueOf("090909"), Color.valueOf("090909"),
                            1, 1f, 1f, 4f),

                    new NoiseMesh(this, 27, 6, .94f, 3, .9f, 1.75f, .165f,
                            Color.valueOf("111111"), Color.valueOf("2f0000"),
                            1, 1f, 1.8f, 1f),

                    new NoiseMesh(this, 27, 6, .895f, 4, .9f, .75f, .965f,
                            Color.valueOf("2f0000"), Color.valueOf("2f0000"),
                            4, 1f, 1.8f, 1f),

                    new NoiseMesh(this, 27, 6, .86f, 4, .9f, .74f, 1.65f,
                            Color.valueOf("2f0000"), Color.valueOf("2f0000"),
                            4, 1f, .7f, 1f),

                    new NoiseMesh(this, 27, 6, .74f, 4, .9f, 1.45f, 1.65f,
                            Color.valueOf("600000"), Color.valueOf("600000"),
                            4, 1f, 1.8f, 1f)
            );
            cloudMesh = new HexSkyMesh(this, 4, 2, .01f, 6, Color.valueOf("dd0000"), 4, 2, 2, .55f);
        }};
    }
}