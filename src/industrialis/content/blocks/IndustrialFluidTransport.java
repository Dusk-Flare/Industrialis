package industrialis.content.blocks;

import industrialis.content.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.meta.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;

import static mindustry.type.ItemStack.*;

public class IndustrialFluidTransport {
    public static Block
            metalurgicConduit, metalurgicLiquidRouter, metalurgicLiquidJunction,
            metalurgicLiquidBridge, metalurgicPump, hexPump, thermalTank,
            metalurgicReservoir, metalurgicFluidSource, metalurgicFluidVoid;

    public static void load() {

        metalurgicConduit = new Conduit("metalurgic-conduit") {{
            health = 250;
            junctionReplacement = metalurgicLiquidJunction;
            bridgeReplacement = metalurgicLiquidBridge;
            padCorners = false;

            requirements(Category.liquid, with(IndustrialItems.steel, 1, IndustrialItems.obsidian, 1));
        }};

        metalurgicLiquidRouter = new LiquidRouter("metalurgic-liquid-router") {{
            health = 160;

            requirements(Category.liquid, with(IndustrialItems.steel, 3, IndustrialItems.obsidian, 1));
        }};

        metalurgicLiquidJunction = new LiquidJunction("metalurgic-liquid-junction") {{
            health = 160;

            requirements(Category.liquid, with(IndustrialItems.steel, 2, IndustrialItems.obsidian, 1));
        }};

        metalurgicLiquidBridge = new LiquidBridge("metalurgic-liquid-bridge") {{
            range = 6;

            requirements(Category.liquid, with(IndustrialItems.steel, 7, IndustrialItems.obsidian, 3));
        }};

        metalurgicPump = new Pump("metalurgic-pump") {{
            size = 2;
            squareSprite = false;
            consumePower(0.50f);
            requirements(Category.liquid, with(IndustrialItems.steel, 37, IndustrialItems.obsidian, 5, IndustrialItems.gold, 10));
        }};

        hexPump = new Pump("hex-pump") {{
            size = 3;
            squareSprite = false;
            consumePower(1.50f);
            requirements(Category.liquid, with(IndustrialItems.steel, 37, IndustrialItems.obsidian, 5, IndustrialItems.gold, 10));
        }};

        thermalTank = new LiquidRouter("thermal-tank"){{
            requirements(Category.liquid, with(IndustrialItems.obsidian, 500, IndustrialItems.steel, 7));
            size = 2;
            solid = true;
            liquidCapacity = 700f;
            health = 450;
        }};

        metalurgicReservoir = new LiquidRouter("metalurgic-reservoir"){{
            requirements(Category.liquid, with(IndustrialItems.obsidian, 750, IndustrialItems.steel, 25));
            size = 3;
            solid = true;
            liquidCapacity = 2500f;
            health = 700;
        }};

        metalurgicFluidSource = new LiquidSource("metalurgic-fluid-source") {{

            requirements(Category.liquid, BuildVisibility.sandboxOnly, with());
        }};

        metalurgicFluidVoid = new LiquidVoid("metalurgic-fluid-void") {{

            requirements(Category.liquid, BuildVisibility.sandboxOnly, with());
        }};
    }
}