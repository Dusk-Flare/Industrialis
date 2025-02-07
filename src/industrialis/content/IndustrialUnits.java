package industrialis.content;

import arc.graphics.Color;
import mindustry.ai.types.BuilderAI;
import mindustry.content.StatusEffects;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.entities.bullet.BulletType;
import mindustry.entities.bullet.FlakBulletType;
import mindustry.entities.effect.MultiEffect;
import mindustry.entities.effect.ParticleEffect;
import mindustry.entities.effect.WaveEffect;
import mindustry.gen.LegsUnit;
import mindustry.gen.MechUnit;
import mindustry.gen.UnitEntity;
import mindustry.gen.UnitWaterMove;
import mindustry.type.UnitType;
import mindustry.type.Weapon;
import mindustry.type.weapons.RepairBeamWeapon;

public class IndustrialUnits {
    public static UnitType
            //t1
            bolt, disassembler, welder, moltenDrift,
            //t2
            forger, disruptor, ionizer,
            //t3
            reactance;
            //t4

            //t5

    public static void load() {

        bolt = new UnitType("bolt"){{
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
            outlineRadius = 0;
            engineSize = 0;
            faceTarget = true;
            mineTier = 2;
            mineSpeed = 5;
            buildSpeed = 7;
            buildBeamOffset = 5;
            coreUnitDock = true;
            targetable = false;
            hittable = false;
            setEnginesMirror(new UnitEngine(4f, -4.25f, 2.2f, 315f));
        }};

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
                bullet = new FlakBulletType(2.5f, 14){{
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
                    buildingDamageMultiplier = 0.1f;
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

        reactance = new UnitType("reactance"){{
            constructor = UnitEntity::create;
            coreUnitDock = true;
            controller = u -> new BuilderAI(false, 500f);
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
            engineOffset = 7.95f;
            engineSize = 3.4f;
            faceTarget = true;
            mineTier = 3;
            mineSpeed = 7;
            buildSpeed = 7;
            buildBeamOffset = 5;

            setEnginesMirror(new UnitEngine(2.25f, -7.95f, 3.7f, 45f));
            weapons.add(new RepairBeamWeapon(){{
                widthSinMag = 0.11f;
                reload = 20f;
                x = 0;
                y = 1f;
                rotate = false;
                shootY = 0f;
                beamWidth = 0.42f;
                aimDst = 0f;
                shootCone = 40f;
                mirror = true;
                repairSpeed = 3.6f / 2f;
                fractionRepairSpeed = 0.03f;
                targetUnits = true;
                targetBuildings = true;
                autoTarget = false;
                controllable = true;
                laserColor = Color.valueOf("6f0000");
                healColor = Color.valueOf("6f0000");

                bullet = new BulletType(){{
                    maxRange = 65f;
                }};
            }});
        }};
    }
}