package industrialis.content;

import industrialis.content.*;
import mindustry.content.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;
import mindustry.entities.effect.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;
import mindustry.ai.*;
import mindustry.ai.types.*;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.ammo.*;
import mindustry.type.unit.*;
import mindustry.type.weapons.*;
import mindustry.world.meta.*;

import static arc.graphics.g2d.Draw.*;
import static arc.graphics.g2d.Lines.*;
import static arc.math.Angles.*;
import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;

public class IndustrialUnits {
    public static UnitType
            //t1
    forger, disassembler, welder, moltenDrift,
            //t2
    disruptor, ionizer;
            //t3

            //t4

            //t5

    public static void load() {

        forger = new UnitType("forger"){{
            constructor = UnitEntity::create;
            lowAltitude = true;
            speed = 2.5f;
            accel = 0.1f;
            drag = 0.04f;
            flying = true;
            health = 300;
            hitSize = 10;
            armor = 1;
            itemCapacity = 50;
            outlineColor = Color.valueOf("36363c");
            engineOffset = 6;
            faceTarget = true;
            mineTier = 2;
            mineSpeed = 5;
            buildSpeed = 7;
            buildBeamOffset = 5;
            weapons.add(new Weapon("forger-gun"){{
                x = 2;
                y = 5;
                mirror = true;
                top = false;
                rotate = false;
                reload = 45;
                recoil = 4;
                bullet = new BasicBulletType(2.5f, 9){{
                    buildingDamageMultiplier = 0.03f;
                    speed = 4;
                    lifetime = 40;
                    damage = 13;
                    pierce = true;
                    pierceBuilding = true;
                    pierceCap = 4;
                    width = 9;
                    height = 20;
                    frontColor = Color.valueOf("800000");
                    backColor = Color.valueOf("600000");
                    despawnHit = true;
                    trailChance = 0.7f;
                    trailLength = 5;
                    trailWidth = 2.7f;
                    trailColor = Color.valueOf("800000");
                    hitEffect = new MultiEffect(
                        new ParticleEffect(){{
                            particles = 6;
                            line = true;
                            lifetime = 15;
                            length = 15;
                            lenFrom = 3;
                            lenTo = 0;
                            strokeFrom = 1;
                            strokeTo = 0;
                            colorFrom = Color.valueOf("800000");
                            colorTo = Color.valueOf("600000");
                        }}, 
                        new WaveEffect(){{
                            sizeFrom = 3;
                            sizeTo = 10;
                            lifetime = 15;
                            strokeFrom = 3;
                            strokeTo = 0;
                            colorFrom = Color.valueOf("800000");
                            colorTo = Color.valueOf("600000");
                        }});
                }};
            }});
        }};
    }
}