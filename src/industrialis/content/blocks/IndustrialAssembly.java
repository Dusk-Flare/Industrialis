package industrialis.content.blocks;

import industrialis.content.*;
import mindustry.content.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;
import mindustry.world.consumers.*;
import mindustry.world.blocks.units.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.entities.effect.*;
import arc.graphics.*;
import arc.math.*;

import static mindustry.type.ItemStack.*;

public class IndustrialAssembly {
    public static Block
            metalurgicPayload, metalurgicPayloadRouter ,aequorAssembler, divumAssembler, terraAssembler,
            modulator, payloadLauncher, loadingStation, unloadingStation, assemblySource, assemblyVoid;

    public static void load() {

        metalurgicPayload = new PayloadConveyor("metalurgic-payload"){{
            size = 3;
            moveTime = 40;
            moveForce = 500;
            payloadLimit = 4;
            requirements(Category.units, with(IndustrialItems.steel, 20, IndustrialItems.leadedCopper, 20));
            canOverdrive = false;
        }};

        metalurgicPayloadRouter = new PayloadRouter("metalurgic-payload-router"){{
            size = 3;
            moveTime = 40;
            moveForce = 500;
            payloadLimit = 4;
            requirements(Category.units, with(IndustrialItems.steel, 22, IndustrialItems.leadedCopper, 24));
            canOverdrive = false;
        }};

        terraAssembler = new UnitFactory("terra-assembler"){{
            health = 900;
            size = 3;
            consumePower(1.2f);
            plans.add(
                    new UnitPlan(
                            IndustrialUnits.disassembler, 950,
                            with(
                                    IndustrialItems.steel, 70,
                                    IndustrialItems.tin, 40,
                                    IndustrialItems.gold, 5
                            )
                    )
            );
            requirements(Category.units, with(IndustrialItems.steel, 60, IndustrialItems.tin, 40, IndustrialItems.gold, 15));
        }};

        divumAssembler = new UnitFactory("divum-assembler"){{
            health = 900;
            size = 3;
            consumePower(1.2f);
            plans.add(
                    new UnitPlan(
                            IndustrialUnits.welder, 750,
                            with(
                                    IndustrialItems.steel, 50,
                                    IndustrialItems.tin, 30
                            )
                    )
            );
            requirements(Category.units, with(IndustrialItems.steel, 60, IndustrialItems.tin, 40, IndustrialItems.gold, 15));
        }};

        aequorAssembler = new UnitFactory("aequor-assembler"){{
            health = 900;
            size = 3;
            consumePower(1.2f);
            placeableLiquid = true;
            plans.add(
                    new UnitPlan(
                            IndustrialUnits.moltenDrift, 750,
                            with(
                                    IndustrialItems.steel, 50,
                                    IndustrialItems.tin, 30,
                                    IndustrialItems.obsidian, 10
                            )
                    )
            );
            requirements(Category.units, with(IndustrialItems.steel, 60, IndustrialItems.tin, 40, IndustrialItems.gold, 15));
        }};

        modulator = new Reconstructor("modulator"){{
            health = 1500;
            size = 3;
            consumePower(2f);
            constructTime = 1500;
            liquidCapacity = 60;
            placeableLiquid = true;
            consumeLiquids(
                    LiquidStack.with(
                            IndustrialLiquids.moltenGold, 0.2f
                    )
            );
            consumeItems(
                    with(
                            IndustrialItems.steel, 80,
                            IndustrialItems.leadedCopper, 30
                    )
            );
            upgrades.addAll(
                    new UnitType[]{IndustrialUnits.disassembler, IndustrialUnits.disruptor},
                    new UnitType[]{IndustrialUnits.welder, IndustrialUnits.ionizer}
            );
            requirements(
                    Category.units,
                    with(
                            IndustrialItems.steel, 60,
                            IndustrialItems.leadedCopper, 40,
                            IndustrialItems.gold, 4
                    )
            );
        }};

        payloadLauncher = new PayloadMassDriver("payload-launcher"){{
            regionSuffix = "-dark";
            size = 3;
            reload = 130f;
            chargeTime = 60f;
            range = 700f;
            maxPayloadSize = 4f;
            consumePower(0.5f);
            placeableLiquid = true;
            requirements(
                    Category.units,
                    with(
                            IndustrialItems.steel, 35,
                            IndustrialItems.leadedCopper, 15,
                            IndustrialItems.gold, 6
                    )
            );
        }};

        loadingStation = new PayloadLoader("loading-station"){{
            regionSuffix = "-dark";
            hasPower = true;
            consumePower(2f);
            size = 3;
            fogRadius = 5;
            requirements(
                    Category.units,
                    with(
                            IndustrialItems.steel, 35,
                            IndustrialItems.leadedCopper, 15,
                            IndustrialItems.gold, 6
                    )
            );
        }};

        unloadingStation = new PayloadUnloader("unloading-station"){{
            regionSuffix = "-dark";
            hasPower = true;
            consumePower(2f);
            size = 3;
            fogRadius = 5;
            requirements(
                    Category.units,
                    with(
                            IndustrialItems.steel, 35,
                            IndustrialItems.leadedCopper, 15,
                            IndustrialItems.gold, 6
                    )
            );
        }};

        assemblySource = new PayloadSource("assembly-source"){{
            requirements(Category.units, BuildVisibility.sandboxOnly, with());
            size = 5;
            alwaysUnlocked = true;
        }};

        assemblyVoid = new PayloadVoid("assembly-void"){{
            requirements(Category.units, BuildVisibility.sandboxOnly, with());
            size = 5;
            alwaysUnlocked = true;
        }};
    }
}


