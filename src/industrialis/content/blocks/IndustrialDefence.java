package industrialis.content.blocks;

import mindustry.type.*;
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
import arc.graphics.*;
import arc.flabel.*;
import arc.math.*;

import static mindustry.type.ItemStack.*;

public class IndustrialDefence {
    public static Block
            stinger, mini, heatedBlaster, steelWall, ironWall, largeSteelWall, largeIronWall;

    public static void load() {

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

            limitRange();
        }};

    }
}