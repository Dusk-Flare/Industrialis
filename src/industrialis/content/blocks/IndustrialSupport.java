package industrialis.content.blocks;

import industrialis.content.IndustrialItems;
import industrialis.content.IndustrialUnits;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.blocks.storage.CoreBlock;

import static mindustry.type.ItemStack.with;


public class IndustrialSupport {
    //effect
    public static Block
            //Cores
            metalicCore, industrialNexus
            //Shields

            //Storage

            //Menders
            ;

    public static void load() {
        int BHEALTH = 6870;
        metalicCore = new CoreBlock("metalic-core"){{
            size = 3;
            health = BHEALTH;
            isFirstTier = true;
            absorbLasers = true;
            itemCapacity = 6000;
            unitCapModifier = 15;
            squareSprite = false;
            alwaysUnlocked = true;
            unitType = IndustrialUnits.forger;
        }};

        industrialNexus = new CoreBlock("industrial-nexus"){{
           size = 5;
           health = BHEALTH*2;
           isFirstTier = false;
           absorbLasers = true;
           itemCapacity = 12000;
           unitCapModifier = 30;
           squareSprite = false;
           unitType = IndustrialUnits.reactance;
            requirements(Category.effect,
                    with(
                            IndustrialItems.steel, 2000,
                            IndustrialItems.iron, 1000,
                            IndustrialItems.tin, 1000,
                            IndustrialItems.gold, 500
                    ));
        }};

    }

}