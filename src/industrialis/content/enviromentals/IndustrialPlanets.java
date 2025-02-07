package industrialis.content.enviromentals;

import arc.graphics.Color;
import industrialis.content.IndustrialItems;
import industrialis.content.blocks.IndustrialSupport;
import mindustry.content.Planets;
import mindustry.graphics.g3d.*;
import mindustry.maps.generators.BlankPlanetGenerator;
import mindustry.type.Planet;

import static industrialis.content.enviromentals.vultarEnviroment.VultarPal.*;

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
                //r.defaultTeam = IndustrialTeams.technocrats;
            };
            meshLoader = () -> new MultiMesh(
                    new NoiseMesh(this, 7, 5, 0.933f, 1, 0.0001f, 0.0001f, 1,
                            darkGray, darkGray, 1, 1, 1, 4),

                    new NoiseMesh(this, 27, 6, 0.94f, 5, 0.9f, 0.65f, 1,
                            med2Gray, darkRed, 1, 1, 1.8f, 1),

                    new NoiseMesh(this, 27, 6, 0.895f, 5, 0.9f, 0.65f, 1.5f,
                            darkRed, medRed, 4, 1, 1.8f, 1),

                    new NoiseMesh(this, 27, 6, 0.83f, 5, 0.9f, 0.65f, 2.2f,
                            medRed, medRed, 4, 1, 0.7f, 1),

                    new NoiseMesh(this, 27, 6, 0.74f, 5, 0.9f, 0.65f, 3.3f,
                            lightRed, lightRed, 4, 1, 1.8f, 1)
            );
            cloudMesh = new HexSkyMesh(this, 4, 2, .01f, 6,
                    Color.valueOf("700000"), 4, 2, 2, .55f);
        }};
    }
}