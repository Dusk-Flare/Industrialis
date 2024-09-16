package industrialis.content;

import industrialis.content.*;
import mindustry.content.*;
import mindustry.content.Fx.*;
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

        disassembler = new UnitType("disassembler"){{
            constructor = MechUnit::create;
            lowAltitude = true;
            speed = 0.5f;
            accel = 0.1f;
            drag = 0.04f;
            health = 1020;
            hitSize = 11;
            armor = 3;
            itemCapacity = 50;
            outlineColor = Color.valueOf("36363c");
            outlineRadius = 1;
            engineOffset = 6;
            faceTarget = true;
            mineTier = 2;
            mineSpeed = 5;
            buildSpeed = 7;
            buildBeamOffset = 5;
            rotateSpeed = 2;
            mechFrontSway = 0.3f;
            mechSideSway = 0.3f;
            mechStepParticles = true;
            hovering = false;
            targetAir = true;
            weapons.add(new Weapon("disassembler-gun"){{
                x = 4;
                y = 0;
                mirror = true;
                top = true;
                rotate = false;
                reload = 60;
                recoil = 2;
                bullet = new FlakBulletType(2.5f, 9){{
                    buildingDamageMultiplier = 0.03f;
                    speed = 4;
                    lifetime = 50;
                    inaccuracy = 1;
                    pierce = true;
                    pierceBuilding = true;
                    pierceCap = 4;
                    width = 3;
                    height = 3;
                    frontColor = Color.valueOf("ff0000");
                    backColor = Color.valueOf("800000");
                    despawnHit = true;
                    ammoMultiplier = 5;
                    collidesTiles = true;
                    explodeRange = 5;
                    splashDamageRadius = 4;
                    splashDamage = 45;
                    trailColor = Color.valueOf("800000");
                }};
            }});
        }};

        disruptor = new UnitType("disruptor"){{
            constructor = LegsUnit::create;
            lowAltitude = true;
            speed = 0.7f;
            accel = 0.1f;
            drag = 0.04f;
            hovering = true;
            health = 1160;
            hitSize = 10;
            armor = 3;
            range = 40;
            itemCapacity = 50;
            rotateSpeed = 3;
            outlineColor = Color.valueOf("040404");
            outlineRadius = 1;
            engineOffset = 6;
            faceTarget = true;
            mineTier = 2;
            mineSpeed = 5;
            buildSpeed = 7;
            buildBeamOffset = 5;
            rotateSpeed = 2;
            mechFrontSway = 0.3f;
            mechSideSway = 0.3f;
            mechStepParticles = true;
            legMoveSpace = 1;
            legMaxLength = 1.0f;
            legMinLength = 0.3f;
            legLengthScl = 0.96f;
            legForwardScl = 0.3f;
            legPhysicsLayer = false;
            legGroupSize = 3;
            legCount = 6;
            legExtension = 0;
            legContinuousMove = true;
            lockLegBase = true;
            rippleScale = 1.0f;
            stepShake = 0.5f;
            legBaseOffset = 0;
            legLength = 13;
            allowLegStep = true;
            hovering = false;
            targetAir = true;
            weapons.add(new Weapon("disruptor-gun"){{
                x = 5.5f;
                y = 0;
                mirror = true;
                top = true;
                rotate = false;
                reload = 60;
                recoil = 2;
                bullet = new FlakBulletType(2.5f, 9){{
                    buildingDamageMultiplier = 0.03f;
                    speed = 4;
                    lifetime = 50;
                    inaccuracy = 1;
                    pierce = true;
                    pierceBuilding = true;
                    pierceCap = 4;
                    width = 3;
                    height = 3;
                    frontColor = Color.valueOf("ff0000");
                    backColor = Color.valueOf("800000");
                    despawnHit = true;
                    ammoMultiplier = 5;
                    collidesTiles = true;
                    explodeRange = 5;
                    splashDamageRadius = 4;
                    splashDamage = 45;
                    trailColor = Color.valueOf("800000");
                }};
            }});
        }};

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
            outlineRadius = 1;
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
                bullet = new BasicBulletType(2.5f, 13){{
                    buildingDamageMultiplier = 0.03f;
                    speed = 4;
                    lifetime = 40;
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

        ionizer = new UnitType("ionizer"){{
            constructor = UnitEntity::create;
            lowAltitude = false;
            speed = 7;
            accel = 0.3f;
            drag = 0.05f;
            flying = true;
            health = 480;
            hitSize = 12;
            armor = 4;
            itemCapacity = 20;
            outlineColor = Color.valueOf("020202");
            outlineRadius = 1;
            engineOffset = 9;
            faceTarget = true;
            weapons.add(new Weapon("ionizer-gun"){{
                x = 0;
                y = 3;
                top = false;
                rotate = false;
                reload = 45;
                recoil = 4;
                bullet = new BasicBulletType(2.5f, 13){{
                    buildingDamageMultiplier = 0.5f;
                    speed = 4;
                    lifetime = 40;
                    pierce = true;
                    pierceBuilding = true;
                    pierceCap = 4;
                    width = 9;
                    height = 40;
                    frontColor = Color.valueOf("800000");
                    backColor = Color.valueOf("600000");
                    despawnHit = true;
                    trailChance = 1.3f;
                    trailLength = 8;
                    trailWidth = 4.7f;
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

        moltenDrift = new UnitType("molten-drift"){{
            constructor = UnitWaterMove::create;
            lowAltitude = false;
            speed = 3;
            accel = 0.08f;
            drag = 0.09f;
            naval = true;
            health = 120;
            hitSize = 9;
            armor = 2;
            itemCapacity = 20;
            outlineColor = Color.valueOf("070707");
            outlineRadius = 1;
            engineOffset = 9;
            faceTarget = false;
            immunities.addAll(StatusEffects.burning, StatusEffects.melting);
            weapons.add(new Weapon("molten-drift-gun"){{
                x = 2;
                y = 6;
                mirror = true;
                top = false;
                rotate = true;
                reload = 45;
                recoil = 4;
                bullet = new BasicBulletType(2.5f, 13){{
                    buildingDamageMultiplier = 0.3f;
                    speed = 4;
                    lifetime = 40;
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

        welder = new UnitType("welder"){{
            constructor = UnitEntity::create;
            lowAltitude = false;
            speed = 5;
            accel = 0.08f;
            drag = 0.03f;
            flying = true;
            health = 120;
            hitSize = 9;
            armor = 2;
            itemCapacity = 20;
            outlineColor = Color.valueOf("070707");
            outlineRadius = 1;
            engineOffset = 6;
            faceTarget = true;
            weapons.add(new Weapon("welder-gun"){{
                x = 2;
                y = 6;
                top = false;
                rotate = false;
                mirror = true;
                reload = 45;
                recoil = 4;
                bullet = new BasicBulletType(2.5f, 13){{
                    buildingDamageMultiplier = 0.4f;
                    speed = 4;
                    lifetime = 40;
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