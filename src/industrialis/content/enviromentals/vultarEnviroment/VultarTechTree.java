package industrialis.content.enviromentals.vultarEnviroment;

import industrialis.content.enviromentals.IndustrialPlanets;

import static industrialis.content.IndustrialItems.*;
import static industrialis.content.IndustrialLiquids.*;
import static industrialis.content.IndustrialUnits.*;
import static industrialis.content.blocks.IndustrialAssembly.*;
import static industrialis.content.blocks.IndustrialDefence.*;
import static industrialis.content.blocks.IndustrialExtractors.*;
import static industrialis.content.blocks.IndustrialFluidTransport.*;
import static industrialis.content.blocks.IndustrialLogic.*;
import static industrialis.content.blocks.IndustrialPower.*;
import static industrialis.content.blocks.IndustrialProduction.*;
import static industrialis.content.blocks.IndustrialSupport.industrialNexus;
import static industrialis.content.blocks.IndustrialSupport.metalicCore;
import static industrialis.content.blocks.IndustrialTransport.*;
import static mindustry.content.TechTree.node;
import static mindustry.content.TechTree.nodeRoot;

public class VultarTechTree {
    public static void load(){
        IndustrialPlanets.vultar.techTree = nodeRoot("industrialis-vultar", metalicCore, () -> {
            //support
            node(industrialNexus);
            //Item-transport
            node(metalurgicConveyor, () -> {
                node(metalurgicJunction, () -> {
                    node(metalurgicRouter, () -> {
                        node(metalurgicSorter, () -> {
                            node(metalurgicSorterInverted);
                            node(metalurgicOverflow, () -> {
                                node(metalurgicUnderflow);
                            });
                        });
                        node(metalurgicBridge);
                    });
                });
            });
            //Fluid-Transport
            node(metalurgicConduit, () -> {
                node(metalurgicLiquidJunction, () -> {
                    node(metalurgicLiquidRouter, () -> {
                        node(metalurgicLiquidBridge);
                    });
                });
                node(thermalTank, () -> {
                    node(metalurgicReservoir);
                    node(metalurgicPump, () -> {
                        node(hexPump);
                    });
                });
            });
            //Resource-Extraction
            node(ironDrill, () -> {
                node(greenhouse);
                node(steelDrill, () -> {
                    node(steelBore, () -> {
                        node(hyperDrill);
                    });
                });
            });
            //Power
            node(connector, () -> {
                node(largeConnector, () -> {
                    node(powerNode);
                });
                node(smallBattery, () -> {
                    node(largeBattery);
                });
                node(photovoltaicPlating, () -> {
                    node(combustionReactor);
                });
            });
            //Logic
            node(cpu, () -> {
                node(codeAssembler, () -> {
                    node(serverCompiler);
                });
                node(button);
                node(interfacing, () -> {
                    node(largeInterface);
                });
                node(logicMemory, () -> {
                    node(database);
                });
            });
            //Defence
            node(mini, () -> {
                node(stinger, () -> {
                    node(heatedBlaster);
                });
                node(ironWall, () -> {
                    node(largeIronWall);
                    node(steelWall, () -> {
                        node(largeSteelWall);
                    });
                });
            });
            //Production
            node(steelForge, () -> {
                node(smelter, () -> {
                    node(mold);
                    node(obsidianKiln, () -> {
                        node(copperInfuser);
                    });
                });
                node(metalScrapper);
            });
            //Assembly
            node(metalurgicPayload, () -> {
                node(metalurgicPayloadRouter, () -> {
                    node(loadingStation, () -> {
                        node(unloadingStation);
                        node(payloadLauncher);
                    });
                });
                node(terraAssembler, () -> {
                    node(divumAssembler, () -> {
                        node(aequorAssembler, () -> {
                            node(moltenDrift);
                        });
                        node(welder, () -> {
                            node(ionizer);
                        });
                    });
                    node(modulator);
                    node(disassembler, () -> {
                        node(disruptor);
                    });
                });
            });
            //Resources
            node(iron, () -> {
                node(mineralCoal, () -> {
                    node(steel);
                });
                node(tin, () -> {
                    node(gold);
                });
                node(leadClump, () -> {
                    node(copperRod, () -> {
                        node(leadedCopper);
                    });
                });
                node(basalt, () -> {
                    node(obsidian);
                    node(basalticConcrete);
                });
                node(lithium, () -> {
                    node(energyCell);
                });
                node(scrappedMetal, () -> {
                    node(moltenIron);
                    node(moltenLead);
                    node(moltenCopper);
                    node(moltenTin);
                    node(moltenGold);
                    node(hyperCoolant);
                    node(heaterFluid);
                });
            });
        });
    }
}
