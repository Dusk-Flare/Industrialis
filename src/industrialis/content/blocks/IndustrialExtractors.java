package industrialis.content.blocks;

import industrialis.content.*;
import mindustry.content.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;
import mindustry.world.consumers.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.entities.effect.*;
import arc.graphics.*;
import arc.math.*;

import static mindustry.type.ItemStack.*;

public class IndustrialExtractors {
    public static Block
            greenhouse, hyperDrill, ironDrill, steelBore, steelDrill;

    public static void load() {

        greenhouse = new GenericCrafter("greenhouse") {{
            size = 3;
            health = 350;
            hasItems = true;
            hasPower = true;
            hasLiquids = true;
            consumeLiquid(Liquids.water, 1f);
            consumePower(1.2f);
            outputItem = new ItemStack(IndustrialItems.plantMatter, 1);

            drawer = new DrawMulti(
                    new DrawDefault(),
                    new DrawRegion("-bottom"),
                    new DrawGlowRegion("-glow"){{
                        alpha = 0.7f;
                        color = Color.valueOf("000f00");
                        glowIntensity = 0.3f;
                        glowScale = 8f;
                    }},
                    new DrawParticles() {{
                        color = Color.valueOf("000f00");
                        alpha = 0.4f;
                        reverse = true;
                        blending = Blending.additive;
                        particleRad = 8;
                        particles = 16;
                        fadeMargin = 1;
                        rotateScl = 7;
                        particleLife = 120;
                    }}
                    );

            requirements(Category.production, with(
                    IndustrialItems.steel, 35,
                    IndustrialItems.leadedCopper, 30,
                    IndustrialItems.gold, 3
            ));
        }};

        hyperDrill = new Drill("hyper-drill"){{
            size = 5;
            health = 2120;
            itemCapacity = 100;
            tier = 7;
            drillTime = 75;
            drillEffectChance = 1;
            drawRim = true;
            heatColor = Color.valueOf("5ea1f2");
            hasPower = true;
            rotateSpeed = 15;
            liquidBoostIntensity = 6;
            consumeLiquid(IndustrialLiquids.heaterFluid, 0.09f).boost();
            consumeLiquid(IndustrialLiquids.hyperCoolant, 0.2f);
            consumePower(0.8f);

            updateEffect = new ParticleEffect(){{
                particles = 20;
                length = 15;
                lifetime = 60;
                interp = Interp.circleOut;
                interp = Interp.pow5In;
                colorFrom = Color.valueOf("ff0000");
                colorTo = Color.valueOf("a0a0a0");
                sizeFrom = 3;
                sizeTo = 0;
                spin = 5;
            }};

            requirements(Category.production, with(
                    IndustrialItems.steel, 26,
                    IndustrialItems.leadedCopper, 17,
                    IndustrialItems.gold, 12,
                    IndustrialItems.energyCell, 9
            ));
        }};

        ironDrill = new Drill("iron-drill"){{
            size = 2;
            itemCapacity = 5;
            tier = 2;
            drillTime = 320;

            requirements(Category.production, with(
                    IndustrialItems.iron, 10
            ));
        }};

        steelBore = new Drill("steel-bore"){{
            size = 4;
            health = 1060;
            itemCapacity = 50;
            tier = 4;
            drillTime = 125;
            drawMineItem = true;
            drillEffectChance = 1;
            drawRim = true;
            heatColor = Color.valueOf("5ea1f2");
            hasPower = true;
            rotateSpeed = 6;
            liquidBoostIntensity = 2;
            consumeLiquid(IndustrialLiquids.heaterFluid, 0.09f).boost();
            consumePower(0.8f);

            updateEffect = new ParticleEffect(){{
                particles = 20;
                length = 15;
                lifetime = 60;
                interp = Interp.circleOut;
                interp = Interp.pow5In;
                colorFrom = Color.valueOf("ff0000");
                colorTo = Color.valueOf("a0a0a0");
                sizeFrom = 3;
                sizeTo = 0;
                spin = 5;
            }};

            requirements(Category.production, with(
                    IndustrialItems.steel, 25,
                    IndustrialItems.leadedCopper, 6,
                    IndustrialItems.gold, 4
            ));
        }};

        steelDrill = new Drill("steel-drill"){{
            size = 3;
            health = 560;
            itemCapacity = 25;
            tier = 3;
            drillTime = 250;
            drawMineItem = true;
            drillEffectChance = 1;
            drawRim = true;
            heatColor = Color.valueOf("5ea1f2");
            hasPower = true;
            rotateSpeed = 6;
            liquidBoostIntensity = 2;
            consumeLiquid(IndustrialLiquids.heaterFluid, 0.09f).boost();
            consumePower(0.8f);

            updateEffect = new ParticleEffect(){{
                particles = 20;
                length = 15;
                lifetime = 60;
                interp = Interp.circleOut;
                interp = Interp.pow5In;
                colorFrom = Color.valueOf("ff0000");
                colorTo = Color.valueOf("a0a0a0");
                sizeFrom = 3;
                sizeTo = 0;
                spin = 5;
            }};

            requirements(Category.production, with(
                    IndustrialItems.steel, 12,
                    IndustrialItems.iron, 10,
                    IndustrialItems.gold, 2
            ));
        }};
    }
}