package industrialis.content;

import static mindustry.*;
import arc.graphics.Color;
import arc.graphics.gl.Shader;
import industrialis.Industrialis;
import mindustry.content.*;
import mindustry.entities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.gen.Sounds;
import mindustry.graphics.Pal;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.Block;
import mindustry.world.blocks.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.heat.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.sandBox.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;

import static mindustry.type.Category.*;
import static mindustry.type.ItemStack.with;

public class IndustrialBlocks {
    public static Block
            //liquids
            hexPump, metalurgicConduit, metalurgicFluidSource, metalurgicFluidVoid, 
            metalurgicLiquidBridge, metalurgicLiquidJunction, metalurgicLiquidRouter, 
            metalurgicPump, metalurgicReservoir, thermalTank,

            //distribution
            metalurgicBridge, metalurgicConveyor, metalurgicJunction, metalurgicOverflow,
            metalurgicOverflowInverted, metalurgicPayload, metalurgicPayloadRouter, metalurgicRouter, 
            metalurgicSorter, metalurgicSorterInverted, metalurgicSource, metalurgicUnloader, metalurgicVoid,

            //drill
            greenhouse, hyperDrill, ironDrill, steelBore, steelDrill,

            //env
            ancientMetal, ancientPlates, ancientPlatesDamaged, basaltFloor,
            basaltWall, goldOre, ironOre, mineralCoalOre, mineralCopperOre, mineralLeadOre,
            moltenCopperTile, moltenGoldTile, moltenIronTile, moltenLeadTile, moltenScrappedMetalTile,
            moltenTinTile, redRockFloor, redRockWall, tinOre,

            //props
            basalticRockyBoulder, redRockyBoulder,

            //turret
            heatedBlaster, mini, stinger,

            //power
            combustionReactor, connector, energySource, energyVoid, largeBattery, largeConnector,
            powerNode, smallBattery, solarPannel,

            //production
            copperInfuser, metalScrapper, mold, obsidianKlin, smelter, steelForge,

            //defense
            ironWall, ironWallLarge, steelWall, steelWallLarge,

            //units
            aequorAssembler, assemblySource, assemblyVoid, divumAssembler, loadingStation, modulator,
            payloadLauncher, terraAssembler, unloadingStation,

            //effect
            metalicCore, repairGenerator,

            //logic
            button, codeAssembler, cpu, database, logicInterface, largeInterface, logicMemory, messageBoard,
            serverCompiler, worldCpu, worldLogicMemory, worldMessageBoard;

    public static void load() {

        //liquid
       metalurgicConduit = new Conduit("metalurgic-conduit"){{
            requirements(Category.liquid, with(IndustrialItems.obsidian, 1,IndustrialItems.steel, 1));
            bridgeReplacement = IndustrialBlocks.metalurgicLiquidBridge;
            junctionReplacement = IndustrialBlocks.metalurgicLiquidJunction;
            health = 143;
            botColor = Color.valueOf("262525");
        }};

        metalurgicLiquidRouter = new LiquidRouter("metalurgic-liquid-router"){{
            requirements(Category.liquid, with(IndustrialItems.obsidian, 1,IndustrialItems.steel, 3));
            health = 143;
            size = 1;
        }};

        metalurgicLiquidBridge = new LiquidBridge("metalurgic-liquid-bridge"){{
            requirements(Category.liquid, with(IndustrialItems.obsidian, 3,IndustrialItems.steel, 7));
            health = 143;
            size = 1;
            fadeIn = moveArrows = true;
            arrowSpacing = 6f;
            range = 6;
            hasPower = false;
        }};

        metalurgicLiquidJunction = new LiquidJunction("metalurgic-liquid-junction"){{
            requirements(Category.liquid, with(IndustrialItems.obsidian, 1, IndustrialItems.steel, 2));
            health = 143;
            size = 1;
        }};

        metalurgicPump = new Pump("metalurgic-pump"){{
            requirements(Category.liquid, with(IndustrialItems.obsidian, 5, IndustrialItems.gold, 10, IndustrialItems.steel, 37));
            ConsumePower(0.5f, 200, true);
            pumpAmount = 0.2f;
            size = 2;
            health = 265;
            placeableLiquid = true;
        }};

        hexPump = new Pump("hex-pump"){{
            requirements(Category.liquid, with(IndustrialItems.obsidian, 15, IndustrialItems.gold, 20, IndustrialItems.steel, 97));
            ConsumePower(0.6f, 200, true);
            pumpAmount = 0.3f;
            size = 3;
            health = 565;
            placeableLiquid = true;
        }};

        thermalTank = new LiquidTank("thermal-tank"){{
            requirements(Category.liquid, with(IndustrialItems.obsidian, 500, IndustrialItems.steel, 7));
            size = 2;
            liquidCapacity = 700;
            health = 450;
            placeableLiquid = true;
        }};

        metalurgicReservoir = new LiquidTank("metalurgic-reservoir"){{
            requirements(Category.liquid, with(IndustrialItems.obsidian, 500, IndustrialItems.steel, 7));
            size = 3;
            liquidCapacity = 2500;
            health = 700;
        }};

        metalurgicFluidSource = new LiquidSource("metalurgic-fluid-source"){{
            requirements(Category.liquid, BuildVisibility.sandboxOnly );
            placeableLiquid = true;
            alwaysUnlocked = true;
            size = 1;
        }};

        metalurgicFluidVoid = new LiquidVoid("metalurgic-fluid-void"){{
            requirements(Category.liquid, BuildVisibility.sandboxOnly );
            placeableLiquid = true;
            alwaysUnlocked = true;
            size = 1;
        }};
        //endregion

        //distribution
        metalurgicBridge = new BufferedItemBridge("metalurgic-bridge"){{
            requirements(Category.distribution, with(IndustrialItems.iron, 5, IndustrialItems.tin, 7));
            fadeIn = moveArrows = true;
            range = 6;
            speed = 74f;
            arrowSpacing = 6f;
            bufferCapacity = 14;
            underBullets = true;
        }};

        metalurgicConveyor = new Conveyor("metalurgic-conveyor"){{
            researchCost = with(IndustrialItems.iron, 15);
            bridgeReplacement = IndustrialBlocks.metalurgicBridge;
            junctionReplacement = IndustrialBlocks.metalurgicJunction;
            requirements(Category.distribution, with(IndustrialItems.iron, 1));
            health = 250;
            speed = 0.16f;
            displayedSpeed = 16f;
            underBullets = true;
        }};

        metalurgicJunction = new junction("metalurgic-junction"){{
            requirements(Category.distribution, with(IndustrialItems.iron, 2));
            underBullets = true;
            capacity = 15;
            speed = 12;
            health = 40;
        }};

        metalurgicRouter = new Router("metalurgic-router"){{
            requirements(Category.distribution, with(IndustrialItems.iron, 2, IndustrialItems.tin, 2));
            underBullets = true;
            capacity = 15;
            speed = 12;
            health = 40;
        }};

        metalurgicOverflow = new OverflowGate("metalurgic-overflow"){{
            requirements(Category.distribution, with(IndustrialItems.iron, 2, IndustrialItems.tin, 5));
            speed = 12;
            invert = false;
        }};

        metalurgicOverflowInverted = new OverflowGate("metalurgic-overflow-inverted"){{
            requirements(Category.distribution, with(IndustrialItems.iron, 2, IndustrialItems.tin, 5));
            speed = 12;
            invert = true;
        }};

        metalurgicSorter = new Sorter("metalurgic-sorter"){{
            requirements(Category.distribution, with(IndustrialItems.iron, 2, IndustrialItems.tin, 2));
            invert = false;
        }};

        metalurgicSorterInverted = new Sorter("metalurgic-sorter-inverted"){{
            requirements(Category.distribution, with(IndustrialItems.iron, 2, IndustrialItems.tin, 2));
            invert = true;
        }};

        metalurgicUnloader = new Unloader("metalurgic-unloader"){{
            requirements(Category.distribution, with(IndustrialItems.steel, 6, IndustrialItems.gold, 2, IndustrialItems.tin, 2));
            speed = 12;
        }};

        metalurgicSource = new LiquidSource("metalurgic-source"){{
            requirements(Category.liquid, BuildVisibility.sandboxOnly );
            itemsPerSecond = 10000;
            placeableLiquid = true;
            alwaysUnlocked = true;
            size = 1;
        }};

        metalurgicVoid = new LiquidVoid("metalurgic-void"){{
            requirements(Category.liquid, BuildVisibility.sandboxOnly );
            placeableLiquid = true;
            alwaysUnlocked = true;
            size = 1;
        }};
        //endregion

        //drills
        //endregion

        //environment
        //endregion

        //turrets
        //endregion

        //power
        //endregion

        //defense
        //endregion

        //units
        metalurgicPayload = new PayloadConveyor("metalurgic-payload"){{
            requirements(Category.units, with(IndustrialItems.steel, 20, IndustrialItems.leadedCopper, 20));
            size = 3;
            moveTime = 40;
            moveForce = 500;
            payloadLimit = 4;
        }};

        metalurgicPayloadRouter = new PayloadRouter("metalurgic-payload-router"){{
            requirements(Category.units, with(IndustrialItems.steel, 22, IndustrialItems.leadedCopper, 24));
            size = 3;
            moveTime = 40;
            moveForce = 500;
            payloadLimit = 4;
        }};

        /*terraAssembler = new UnitFactory("terra-assembler"){{
            requirements(Category.units, with(IndustrialItems.steel, 60, IndustrialItems.tin, 40, IndustrialItems.gold, 15));
            size = 3;
            plans.add(new UnitPlan(IndustrialUnits.disassembler, 60 * 12.5f, with(IndustrialItems.steel, 70, IndustrialItems.tin, 40, IndustrialItems.gold, 5)));
            ConsumePower(1.2f, 200, true);
        }};

        aequorAssembler = new UnitFactory("divum-assembler"){{
            requirements(Category.units, with(IndustrialItems.steel, 60, IndustrialItems.tin, 40, IndustrialItems.gold, 15));
            size = 3;
            plans.add(new UnitPlan(IndustrialUnits.welder, 60 * 12.5f, with(IndustrialItems.steel, 50, IndustrialItems.tin, 30)));
            ConsumePower(1.2f, 200, true);
        }};

        divumAssembler = new UnitFactory("aequor-assembler"){{
            requirements(Category.units, with(IndustrialItems.steel, 50, IndustrialItems.tin, 30));
            size = 3;
            plans.add(new UnitPlan(IndustrialUnits.moltenDrift, 60 * 12.5f, with(IndustrialItems.steel, 50, IndustrialItems.tin, 30)));
            ConsumePower(1.2f, 200, true);
        }};

        */loadingStation = new PayloadLoader("loading-station"){{
            requirements(Category.units, with(IndustrialItems.steel, 35, IndustrialItems.gold, 9, IndustrialItems.leadedCopper, 15));
            size = 3;
            maxPowerConsuption = 20;
            placeableLiquid = true;
        }};

        unloadingStation = new PayloadUnloader("unloading-station"){{
            requirements(Category.units, with(IndustrialItems.steel, 35, IndustrialItems.gold, 9, IndustrialItems.leadedCopper, 15));
            size = 3;
            maxPowerUnload = 80;
            offLoadSpeed = 8;
            maxPowerConsuption = 20;
            ConsumePower(0.8f, 200, true);
            placeableLiquid = true;
        }};

        assemblySource = new PayloadSource("assembly-source"){{
            requirements(Category.units, BuildVisibility.sandboxOnly );
            placeableLiquid = true;
            alwaysUnlocked = true;
            size = 5;
        }};

        assemblyVoid = new PayloadVoid("assembly-void"){{
            requirements(Category.units, BuildVisibility.sandboxOnly );
            placeableLiquid = true;
            alwaysUnlocked = true;
            size = 5;
        }};
        //endregion

        //effect
        metalicCore = new CoreBlock("metalic-core"){{
            requirements(Category.effect, BuildVisibility.shown, with( IndustrialItems.iron, 2000, IndustrialItems.tin, 2000));
            alwaysUnlocked = true;

            isFirstTier = true;
            unitType = IndustrialUnits.forger;
            health = 6870;
            itemCapacity = 6000;
            size = 3;
            squareSprite = false;

            unitCapModifier = 12;
        }};

        repairGenerator = new MendProjector("repair-generator"){{
            requirements(Category.effect, with( IndustrialItems.iron, 25, IndustrialItems.tin, 30, IndustrialItems.gold, 2));
            health = 400;
            reload = 120;
            range = 40;
            healPercent = 3;
            ConsumePower(2, 230, true);
        }};
        //endregion

        //logic
        button = new SwitchBlock("button"){{
            requirements(Category.logic, with( IndustrialItems.steel, 2, IndustrialItems.leadedCopper, 1, IndustrialItems.gold, 1));
            size = 1;
        }};

        codeAssembler = new LogicBlock("code-assembler"){{
            requirements(Category.logic, with( IndustrialItems.steel, 30, IndustrialItems.leadedCopper, 15, IndustrialItems.gold, 8));
            size = 2;
            range = 160;
            health = 400;
            instructionsPerTick = 440;
        }};

        cpu = new LogicBlock("CPU"){{
            requirements(Category.logic, with( IndustrialItems.steel, 6, IndustrialItems.leadedCopper, 5, IndustrialItems.gold, 2));
            size = 1;
            range = 80;
            health = 200;
            instructionsPerTick = 220;
        }};

        database = new MemoryBlock("database"){{
            requirements(Category.logic, with( IndustrialItems.steel, 24, IndustrialItems.leadedCopper, 8, IndustrialItems.gold, 8));
            size = 2;
            health = 400;
            memoryCapacity = 256;
        }};

        logicInterface = new LogicDisplay("interface"){{
            requirements(Category.logic, with( IndustrialItems.steel, 4, IndustrialItems.leadedCopper, 2, IndustrialItems.gold, 2, IndustrialItems.obsidian, 2));
            size = 3;
            displaySize = 80;
            maxSides = 30;
            health = 800;
        }};

        largeInterface = new LogicDisplay("large-interface"){{
            requirements(Category.logic, with( IndustrialItems.steel, 16, IndustrialItems.leadedCopper, 8, IndustrialItems.gold, 8, IndustrialItems.obsidian, 8));
            size = 6;
            displaySize = 176;
            maxSides = 60;
            health = 2800;
        }};

        logicMemory = new MemoryBlock("logic-memory"){{
            requirements(Category.logic, with( IndustrialItems.steel, 2, IndustrialItems.leadedCopper, 1, IndustrialItems.gold, 1));
            size = 1;
            health = 200;
            memoryCapacity = 64;
        }};

        messageBoard = new MessageBlock("message-board"){{
            requirements(Category.logic, with( IndustrialItems.steel, 2, IndustrialItems.leadedCopper, 1, IndustrialItems.gold, 1));
            size = 1;
            health = 200;
        }};

        serverCompiler = new LogicBlock("server-compiler"){{
            requirements(Category.logic, with( IndustrialItems.steel, 80, IndustrialItems.leadedCopper, 35, IndustrialItems.gold, 30));
            size = 3;
            health = 1600;
            range = 640;
            instructionsPerTick = 2000;
            
            consumeLiquid(IndustrialLiquids.hyperCoolant, 0.35f);
        }};

        worldCpu = new LogicBlock("world-CPU"){{
            requirements(Category.logic, BuildVisibility.worldProcessorOnly );
            size = 1;
            range = 640;
            instructionsPerTick = 9000;
            placeableLiquid = true;
            alwaysUnlocked = true;
        }};

        worldLogicMemory = new MemoryBlock("world-logic-memory"){{
            requirements(Category.logic, BuildVisibility.worldProcessorOnly );
            size = 1;
            memoryCapacity = 1024;
            placeableLiquid = true;
            alwaysUnlocked = true;
        }};

        worldMessageBoard = new MessageBlock("world-message-board"){{
            requirements(Category.logic, BuildVisibility.worldProcessorOnly );
            size = 1;
            placeableLiquid = true;
            alwaysUnlocked = true;
        }};
        //endregion
    }
}
