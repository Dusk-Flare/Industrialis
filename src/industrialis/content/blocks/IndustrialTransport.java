package industrialis.content.blocks;

import industrialis.content.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.meta.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.sandbox.*;

import static mindustry.type.ItemStack.*;

public class IndustrialTransport {
    public static Block
            metalurgicConveyor, metalurgicRouter, metalurgicJunction,
            metalurgicOverflow, metalurgicUnderflow, metalurgicBridge,
            metalurgicSorter, metalurgicSorterInverted, metalurgicSource,
            metalurgicVoid;

    public static void load() {

        metalurgicConveyor = new Conveyor("metalurgic-conveyor") {{
            health = 250;
            speed = 0.16f;
            displayedSpeed = 16;
            junctionReplacement = metalurgicJunction;
            bridgeReplacement = metalurgicBridge;

            requirements(Category.distribution, with(IndustrialItems.iron, 1));
        }};

        metalurgicRouter = new Router("metalurgic-router") {{
            health = 160;

            requirements(Category.distribution, with(IndustrialItems.iron, 2, IndustrialItems.tin, 2));
        }};

        metalurgicJunction = new Junction("metalurgic-junction") {{
            health = 160;

            requirements(Category.distribution, with(IndustrialItems.iron, 3, IndustrialItems.tin, 3));
        }};

        metalurgicBridge = new ItemBridge("metalurgic-bridge") {{
            range = 6;

            requirements(Category.distribution, with(IndustrialItems.iron, 5, IndustrialItems.tin, 7));
        }};

        metalurgicSorter = new Sorter("metalurgic-sorter") {{
            invert = false;

            requirements(Category.distribution, with(IndustrialItems.iron, 2, IndustrialItems.tin, 2));
        }};

        metalurgicSorterInverted = new Sorter("metalurgic-sorter-inverted")  {{
           invert = true;

            requirements(Category.distribution, with(IndustrialItems.iron, 2, IndustrialItems.tin, 2));
        }};

        metalurgicOverflow = new OverflowGate("metalurgic-overflow")  {{
            invert = false;

            requirements(Category.distribution, with(IndustrialItems.iron, 2, IndustrialItems.tin, 2));
        }};

        metalurgicUnderflow = new OverflowGate("metalurgic-overflow-inverted")  {{
            invert = true;

            requirements(Category.distribution, with(IndustrialItems.iron, 2, IndustrialItems.tin, 2));
        }};

        metalurgicSource = new ItemSource("metalurgic-source") {{
            itemsPerSecond = 10000;

            requirements(Category.distribution, BuildVisibility.sandboxOnly, with());
        }};

        metalurgicVoid = new ItemVoid("metalurgic-void") {{

            requirements(Category.distribution, BuildVisibility.sandboxOnly, with());
        }};
    }
}