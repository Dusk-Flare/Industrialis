package industrialis.content.blocks;

import industrialis.content.*;
import mindustry.content.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;
import mindustry.world.consumers.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.entities.effect.*;
import arc.flabel.*;
import arc.graphics.*;
import arc.math.*;

import static mindustry.type.ItemStack.*;

public class IndustrialPower {
    public static Block
            photovoltaicPlating, smallBattery, powerNode, largeConnector,
            largeBattery, energyVoid, energySource, connector, combustionReactor;

    public static void load() {
        photovoltaicPlating = new SolarGenerator("photovoltaic-plating"){{
            size = 1;
            hasPower = true;
            requirements(Category.power, with(IndustrialItems.tin, 5, IndustrialItems.gold, 5, IndustrialItems.obsidian, 1, IndustrialItems.plantMatter, 5));
        }};

        smallBattery = new Battery("small-battery"){{
            size = 2;
            health = 450;
            hasPower = true;
            canOverdrive = false;
            consumesPower = true;
            consumePowerBuffered(32000);
            fullLightColor = Color.valueOf("FF0000");
            emptyLightColor = Color.valueOf("800000");
            drawer = new DrawMulti(
                     new DrawDefault(),
                     new DrawRegion("-top")
            );
            requirements(Category.power, with(IndustrialItems.tin, 19, IndustrialItems.iron, 10, IndustrialItems.gold, 15));
        }};

        powerNode = new PowerNode("power-node"){{
            size = 2;
            health = 550;
            maxNodes = 2;
            laserRange = 50;
            laserColor1 = Color.valueOf("FF0000");
            laserColor2 =  Color.valueOf("800000");
            requirements(Category.power, BuildVisibility.hidden, with(IndustrialItems.leadedCopper, 25, IndustrialItems.iron, 30, IndustrialItems.steel, 50, IndustrialItems.gold, 450));
        }};

        largeConnector = new PowerNode("large-connector"){{
            size = 2;
            health = 450;
            maxNodes = 26;
            laserRange = 21;
            laserColor1 = Color.valueOf("FF0000");
            laserColor2 =  Color.valueOf("800000");
            requirements(Category.power, with(IndustrialItems.leadedCopper, 25, IndustrialItems.iron, 30, IndustrialItems.steel, 50, IndustrialItems.gold, 10));
        }};

        largeBattery = new Battery("large-battery"){{
            size = 3;
            health = 550;
            hasPower = true;
            canOverdrive = false;
            consumesPower = true;
            consumePowerBuffered(100000);
            fullLightColor = Color.valueOf("FF0000");
            emptyLightColor = Color.valueOf("800000");
            drawer = new DrawMulti(
                    new DrawDefault(),
                    new DrawRegion("-top")
            );
            requirements(Category.power, with(IndustrialItems.tin, 57, IndustrialItems.iron, 30, IndustrialItems.gold, 45));
        }};

        energyVoid = new PowerVoid("energy-void"){{
            size = 1;
            requirements(Category.power, BuildVisibility.sandboxOnly, with());
        }};

        energySource = new PowerSource("energy-source"){{
            size = 1;
            powerProduction = 10000;
            laserColor1 = Color.valueOf("FF0000");
            laserColor2 =  Color.valueOf("800000");
            requirements(Category.power, BuildVisibility.sandboxOnly, with());
        }};

        connector = new PowerNode("connector"){{
            size = 1;
            health = 250;
            maxNodes = 19;
            laserRange = 15;
            laserColor1 = Color.valueOf("FF0000");
            laserColor2 =  Color.valueOf("800000");
            requirements(Category.power, with(IndustrialItems.tin, 5, IndustrialItems.gold, 1));
        }};

         combustionReactor = new ConsumeGenerator("combustion-reactor"){{
             size = 1;
             itemDuration = 240;
             baseExplosiveness = 0;
             powerProduction = 0.75f;
             generateEffectRange = 1;
             effectChance = 0.02f;
             drawer = new DrawMulti(
                     new DrawDefault(),
                     new DrawFlame(Color.valueOf("0f0f0f")){{
                         flameRadius = 3.2f;
                         flameRadiusIn = 1.0f;
                         flameRadiusScl = 3.5f;
                         flameRadiusMag = 2.0f;
                         flameRadiusInMag = 1.0f;
                     }},
                     new DrawParticles(){{
                         color = Color.valueOf("0f0f0f");
                         alpha = 0.4f;
                         blending = Blending.additive;
                         particleSize = 1.3f;
                         reverse = true;
                         particleRad = 18;
                         particles = 16;
                         fadeMargin = 1;
                         rotateScl = 7;
                         particleLife = 60;
                     }},
                     new DrawParticles(){{
                         color = Color.valueOf("ffb361");
                         alpha = 0.4f;
                         blending = Blending.additive;
                         particleSize = 2;
                         reverse = true;
                         particleRad = 10;
                         particles = 16;
                         fadeMargin = 1;
                         rotateScl = 7;
                         particleLife = 80;
                     }},
                     new DrawGlowRegion(){{
                         suffix = "-top";
                         color = Color.valueOf("ffb361");
                     }}
             );
             generateEffect = new RadialEffect(){{
                 layer = 118;
                 rotationSpacing = 0;
                 amount = 1;
                 lengthOffset = 0;
             }};
             consumeItem(IndustrialItems.mineralCoal, 1);
             requirements(Category.power, with(IndustrialItems.iron, 20, IndustrialItems.tin, 10, IndustrialItems.gold, 1));
         }};
    }
}


