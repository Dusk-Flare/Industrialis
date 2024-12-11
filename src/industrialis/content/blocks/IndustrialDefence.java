package industrialis.content.blocks;

import mindustry.*;
import mindustry.type.*;
import mindustry.audio.*;
import mindustry.world.*;
import mindustry.content.*;
import mindustry.entities.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;
import industrialis.content.*;
import mindustry.entities.part.*;
import mindustry.entities.bullet.*;
import mindustry.entities.pattern.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.entities.effect.*;
import arc.scene.ui.ProgressBar.*;
import mindustry.graphics.*;
import arc.graphics.*;
import arc.struct.*;
import arc.math.*;

import static mindustry.type.ItemStack.*;

public class IndustrialDefence {
    public static Block
            //Turrets
            stinger, mini, heatedBlaster,
            //Walls
            steelWall, ironWall, largeSteelWall, largeIronWall;

    public static void load() {
        //Turret-Region
        mini = new ItemTurret("mini"){{
            requirements(Category.turret, with(IndustrialItems.iron, 12, IndustrialItems.tin, 5));
            ammo(
                    IndustrialItems.iron,  new BasicBulletType(2, 25){{
                        width = 7f;
                        height = 9f;
                        lifetime = 56f;
                        inaccuracy = 10;
                        ammoMultiplier = 2;
                        frontColor = Color.valueOf("600000");
                        backColor = Color.valueOf("2f0000");
                    }}
            );

            shoot = new ShootAlternate(3.5f);

            recoils = 2;
            drawer = new DrawTurret(){{
                for(int i = 0; i < 2; i ++){
                    int f = i;
                    parts.add(new RegionPart("-barrel-" + (i == 0 ? "l" : "r")){{
                        progress = PartProgress.recoil;
                        recoilIndex = f;
                        under = true;
                        moveY = -1.5f;
                    }});
                }
            }};

            recoil = 0.5f;
            shootY = 3f;
            reload = 20f;
            range = 110;
            shootCone = 15f;
            ammoUseEffect = Fx.casing1;
            health = 250;
            inaccuracy = 2f;
            rotateSpeed = 10f;
            coolant = consumeCoolant(0.1f);
            researchCostMultiplier = 0.05f;
            outlineRadius = 1;
            limitRange();
        }};

        heatedBlaster = new LiquidTurret("heated-blaster"){{
            requirements(Category.turret, with(IndustrialItems.steel, 25, IndustrialItems.tin, 20, IndustrialItems.iron, 20, IndustrialItems.gold, 2));
            drawer = new DrawTurret(){{
                for(int i = 0; i < 3; i ++){
                    int f = i;
                    parts.add(new RegionPart("-barrel-" + f){{
                        progress = PartProgress.recoil;
                        recoilIndex = f;
                        under = true;
                        moveY = -1.5f;
                    }});
                }

            }};
            ammo(
                    IndustrialLiquids.moltenCopper, new LiquidBulletType(IndustrialLiquids.moltenCopper){{
                        lifetime = 21f;
                        speed = 9f;
                        knockback = 0.1f;
                        puddleSize = 8f;
                        orbSize = 1.7f;
                        drag = 0.001f;
                        ammoMultiplier = 0.4f;
                        statusDuration = 60f * 4f;
                        damage = 0.8f;
                        layer = Layer.bullet - 2f;
                    }},
                    IndustrialLiquids.moltenGold, new LiquidBulletType(IndustrialLiquids.moltenGold){{
                        lifetime = 21f;
                        speed = 9f;
                        knockback = 0.1f;
                        puddleSize = 8f;
                        orbSize = 1.7f;
                        drag = 0.001f;
                        ammoMultiplier = 0.4f;
                        statusDuration = 60f * 4f;
                        damage = 0.8f;
                        layer = Layer.bullet - 2f;
                    }},
                    IndustrialLiquids.moltenIron, new LiquidBulletType(IndustrialLiquids.moltenIron){{
                        lifetime = 21f;
                        speed = 9f;
                        knockback = 0.1f;
                        puddleSize = 8f;
                        orbSize = 1.7f;
                        drag = 0.001f;
                        ammoMultiplier = 0.4f;
                        statusDuration = 60f * 4f;
                        damage = 0.8f;
                        layer = Layer.bullet - 2f;
                    }},
                    IndustrialLiquids.moltenLead, new LiquidBulletType(IndustrialLiquids.moltenLead){{
                        lifetime = 21f;
                        speed = 9f;
                        knockback = 0.1f;
                        puddleSize = 8f;
                        orbSize = 1.7f;
                        drag = 0.001f;
                        ammoMultiplier = 0.4f;
                        statusDuration = 60f * 4f;
                        damage = 0.8f;
                        layer = Layer.bullet - 2f;
                    }},
                    IndustrialLiquids.moltenTin, new LiquidBulletType(IndustrialLiquids.moltenTin){{
                        lifetime = 21f;
                        speed = 9f;
                        knockback = 0.1f;
                        puddleSize = 8f;
                        orbSize = 1.7f;
                        drag = 0.001f;
                        ammoMultiplier = 0.4f;
                        statusDuration = 60f * 4f;
                        damage = 0.8f;
                        layer = Layer.bullet - 2f;
                    }},
                    IndustrialLiquids.moltenScrappedMetal, new LiquidBulletType(IndustrialLiquids.moltenScrappedMetal){{
                        lifetime = 21f;
                        speed = 9f;
                        knockback = 0.1f;
                        puddleSize = 8f;
                        orbSize = 1.7f;
                        drag = 0.001f;
                        ammoMultiplier = 0.4f;
                        statusDuration = 60f * 4f;
                        damage = 0.8f;
                        layer = Layer.bullet - 2f;
                    }},
                    IndustrialLiquids.heaterFluid, new LiquidBulletType(IndustrialLiquids.heaterFluid){{
                        lifetime = 21f;
                        speed = 10f;
                        knockback = 0.2f;
                        puddleSize = 8f;
                        orbSize = 1.7f;
                        drag = 0.001f;
                        ammoMultiplier = 0.4f;
                        statusDuration = 60f * 4f;
                        damage = 1f;
                        layer = Layer.bullet - 2f;
                    }}
            );
            size = 2;
            reload = 3f;
            shoot.shots = 2;
            velocityRnd = 0.1f;
            inaccuracy = 4f;
            recoil = 1f;
            shootCone = 45f;
            liquidCapacity = 40f;
            shootEffect = Fx.shootLiquid;
            range = 190f;
            scaledHealth = 250;
            placeableLiquid = true;
            outlineRadius = 0;
            flags = EnumSet.of(BlockFlag.turret, BlockFlag.extinguisher);
        }};

        stinger = new ItemTurret("stinger"){{
            requirements(Category.turret, with(IndustrialItems.tin, 25, IndustrialItems.steel, 10));
            ammo(
                    IndustrialItems.scrappedMetal, new FlakBulletType(4f, 3){{
                        lifetime = 60f;
                        ammoMultiplier = 5f;
                        shootEffect = Fx.shootSmall;
                        reloadMultiplier = 0.5f;
                        width = 6f;
                        height = 8f;
                        hitEffect = Fx.flakExplosion;
                        splashDamage = 22f * 1.5f;
                        splashDamageRadius = 24f;
                    }},
                    IndustrialItems.tin, new FlakBulletType(4.2f, 3){{
                        lifetime = 60f;
                        ammoMultiplier = 4f;
                        shootEffect = Fx.shootSmall;
                        width = 6f;
                        height = 8f;
                        hitEffect = Fx.flakExplosion;
                        splashDamage = 27f * 1.5f;
                        splashDamageRadius = 15f;
                    }},
                    IndustrialItems.obsidian, new FlakBulletType(4f, 3){{
                        lifetime = 60f;
                        ammoMultiplier = 5f;
                        shootEffect = Fx.shootSmall;
                        reloadMultiplier = 0.8f;
                        width = 6f;
                        height = 8f;
                        hitEffect = Fx.flakExplosion;
                        splashDamage = 30f * 1.5f;
                        splashDamageRadius = 20f;
                        fragBullets = 6;
                        fragBullet = new BasicBulletType(3f, 5){{
                            width = 5f;
                            height = 12f;
                            shrinkY = 1f;
                            lifetime = 20f;
                            backColor = Pal.gray;
                            frontColor = Color.white;
                            despawnEffect = Fx.none;
                            collidesGround = false;
                        }};
                    }}
            );

            reload = 18f;
            range = 220f;
            size = 2;
            targetGround = false;

            shoot.shotDelay = 5f;
            shoot.shots = 2;

            recoil = 1f;
            rotateSpeed = 15f;
            inaccuracy = 17f;
            shootCone = 35f;

            scaledHealth = 200;
            coolant = consumeCoolant(0.2f);
            researchCostMultiplier = 0.05f;

            limitRange(2);
        }};
        //Turret-EndRegion

        //Wall-Region
        int wallHealthMultiplier = 8;
        int largeWallHealthMultiplier = 4 * wallHealthMultiplier;

        ironWall = new Wall("iron-wall"){{
            requirements(Category.defense, with(IndustrialItems.iron, 6));
            health = 90 * wallHealthMultiplier;
            researchCostMultiplier = 0.1f;
        }};

        largeIronWall = new Wall("iron-wall-large"){{
            requirements(Category.defense, ItemStack.mult(ironWall.requirements, 4));
            health = 90 * largeWallHealthMultiplier;
            size = 2;
        }};

        steelWall = new Wall("steel-wall"){{
            requirements(Category.defense, with(IndustrialItems.steel, 6));
            health = 130 * wallHealthMultiplier;
        }};

        largeSteelWall = new Wall("steel-wall-large"){{
            requirements(Category.defense, ItemStack.mult(steelWall.requirements, 4));
            health = 130 * largeWallHealthMultiplier;
            size = 2;
        }};
        //Wall-EndRegion
    }
}