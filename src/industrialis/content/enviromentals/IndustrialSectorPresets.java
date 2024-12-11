package industrialis.content.enviromentals;

import mindustry.type.*;
import industrialis.content.enviromentals.*;

public class IndustrialSectorPresets {
    public static SectorPreset
            moltenValley;

    public static void load() {
        //region serpulo

        moltenValley = new SectorPreset("molten-valley", IndustrialPlanets.vultar, 0) {{
            alwaysUnlocked = true;
            addStartingItems = true;
            overrideLaunchDefaults = true;
            noLighting = true;
        }};
    }
}