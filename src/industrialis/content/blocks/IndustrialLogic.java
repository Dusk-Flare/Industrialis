package industrialis.content.blocks;

import industrialis.content.IndustrialItems;
import industrialis.content.IndustrialLiquids;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.blocks.logic.*;
import mindustry.world.meta.BuildVisibility;

import static mindustry.type.ItemStack.with;

public class IndustrialLogic {
    public static Block
            cpu, codeAssembler, serverCompiler, logicMemory, database, interfacing, messageBoard,
            largeInterface, button, worldCpu, worldLogicMemory, worldMessageBoard;

    public static void load() {

        cpu = new LogicBlock("CPU") {{
            health = 200;
            range = 80;
            instructionsPerTick = 220;
            requirements(Category.logic, with(
                    IndustrialItems.steel, 6,
                    IndustrialItems.leadedCopper, 5,
                    IndustrialItems.gold, 2
            ));
        }};

        codeAssembler = new LogicBlock("code-assembler") {{
            health = 400;
            size = 2;
            range = 160;
            instructionsPerTick = 220;
            requirements(Category.logic, with(
                    IndustrialItems.steel, 30,
                    IndustrialItems.leadedCopper, 15,
                    IndustrialItems.gold, 8
            ));
        }};

        serverCompiler = new LogicBlock("server-compiler") {{
            health = 1600;
            size = 3;
            range = 640;
            instructionsPerTick = 2000;
            consumeLiquid(IndustrialLiquids.hyperCoolant, 0.5f);
            requirements(Category.logic, with(
                    IndustrialItems.steel, 80,
                    IndustrialItems.leadedCopper, 35,
                    IndustrialItems.gold, 30
            ));
        }};

        logicMemory = new MemoryBlock("logic-memory") {{
            health = 200;
            memoryCapacity = 64;
            requirements(Category.logic, with(
                    IndustrialItems.steel, 2,
                    IndustrialItems.leadedCopper, 1,
                    IndustrialItems.gold, 1
            ));
        }};

        database = new MemoryBlock("database") {{
            health = 400;
            size = 2;
            memoryCapacity = 256;
            requirements(Category.logic, with(
                    IndustrialItems.steel, 2,
                    IndustrialItems.leadedCopper, 1,
                    IndustrialItems.gold, 1
            ));
        }};

        interfacing = new LogicDisplay("interface") {{
            health = 800;
            size = 3;
            displaySize = 80;
            maxSides = 30;
            requirements(Category.logic, with(
                    IndustrialItems.steel, 4,
                    IndustrialItems.leadedCopper, 2,
                    IndustrialItems.gold, 2,
                    IndustrialItems.obsidian, 2
            ));
        }};

        messageBoard = new MessageBlock("message-board") {{
            health = 200;
            forceDark = true;

            requirements(Category.logic, with(
                    IndustrialItems.steel, 6,
                    IndustrialItems.leadedCopper, 5,
                    IndustrialItems.gold, 5
            ));
        }};

        largeInterface = new LogicDisplay("large-interface") {{
            health = 2800;
            size = 6;
            displaySize = 176;
            maxSides = 60;
            requirements(Category.logic, with(
                    IndustrialItems.steel, 12,
                    IndustrialItems.leadedCopper, 6,
                    IndustrialItems.gold, 6,
                    IndustrialItems.obsidian, 6
            ));
        }};

        button = new SwitchBlock("button") {{
            health = 200;
            requirements(Category.logic, with(
                    IndustrialItems.steel, 2,
                    IndustrialItems.leadedCopper, 1,
                    IndustrialItems.gold, 1
            ));
        }};

        worldCpu = new LogicBlock("world-CPU") {{
            health = 200;
            canOverdrive = false;
            targetable = false;
            instructionsPerTick = 9999;
            range = Float.MAX_VALUE;
            placeableLiquid = true;
            forceDark = true;
            privileged = true;

            requirements(Category.logic, BuildVisibility.editorOnly , with());
        }};

        worldLogicMemory = new MemoryBlock("world-logic-memory") {{
            health = 200;
            memoryCapacity = 1024;
            placeableLiquid = true;
            targetable = false;
            forceDark = true;
            privileged = true;

            requirements(Category.logic, BuildVisibility.editorOnly , with());
        }};

        worldMessageBoard = new MessageBlock("world-message-board") {{
            health = 200;
            placeableLiquid = true;
            targetable = false;
            forceDark = true;
            privileged = true;


            requirements(Category.logic, BuildVisibility.editorOnly , with());
        }};
    }
}