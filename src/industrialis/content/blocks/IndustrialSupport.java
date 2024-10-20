package industrialis.content.blocks;

import industrialis.content.*;
import mindustry.content.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;
import mindustry.world.consumers.*;
import mindustry.world.blocks.units.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.entities.effect.*;
import arc.graphics.*;
import arc.math.*;

import static mindustry.type.ItemStack.*;

public class IndustrialSupport {
    //effect
    public static Block
            //Cores
            metalicCore
            //Shields

            //Storage

            //Menders
            ;

    public static void load() {

        metalicCore = new CoreBlock("metalic-core"){{
            size = 3;
            health = 6870;
            isFirstTier = true;
            absorbLasers = true;
            itemCapacity = 6000;
            unitCapModifier = 15;
            squareSprite = false;
            alwaysUnlocked = true;
            unitType = IndustrialUnits.forger;
            requirements(Category.effect, BuildVisibility.shown, 
                with(
                    IndustrialItems.steel, 2000, 
                    IndustrialItems.iron, 1000, 
                   IndustrialItems.tin, 1000, 
                    IndustrialItems.gold, 500
                )
            );
        }};

    }

}
