package industrialis.content.enviromentals;

import mindustry.maps.generators.BlankPlanetGenerator;
import mindustry.type.SectorPreset;

public class IndustrialSectorPresets {
    public static SectorPreset
            moltenValley;

    public static void load() {

        moltenValley = new SectorPreset("molten-valley", IndustrialPlanets.vultar, 0) {{
            alwaysUnlocked = true;
            addStartingItems = true;
            overrideLaunchDefaults = true;
            noLighting = true;
        }};
    }
}