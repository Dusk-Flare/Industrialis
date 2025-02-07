package industrialis.content.enviromentals;

import mindustry.type.SectorPreset;

public class IndustrialSectorPresets {
    public static SectorPreset
            moltenValley;

    public static void load() {

        moltenValley = new SectorPreset("molten-valley", IndustrialPlanets.vultar, 0) {{
            alwaysUnlocked = true;
            addStartingItems = true;
            captureWave = 6;
            difficulty = 1;
            overrideLaunchDefaults = true;
            noLighting = true;
        }};
    }
}