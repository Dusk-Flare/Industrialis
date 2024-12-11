package industrialis.content.blocks;

import multicraft.*;
import industrialis.content.*;
import mindustry.content.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;
import mindustry.world.consumers.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.entities.effect.*;
import arc.graphics.*;
import arc.struct.*;
import arc.math.*;

import static mindustry.type.ItemStack.*;


public class IndustrialProduction {
    public static Block
            steelForge, smelter, obsidianKlin, mold, metalScrapper, copperInfuser;

    public static void load() {

        steelForge = new GenericCrafter("steel-forge"){{
            health = 250;
            size = 2;
            craftTime = 60;
            consumePower(0.5f);
            consumeItems(with(IndustrialItems.iron, 2, IndustrialItems.mineralCoal, 1));
            drawer = new DrawMulti(
                    new DrawDefault(),
                    new DrawFlame(Color.valueOf("0f0f0f")){{
                        flameRadius = 3.2f;
                        flameRadiusIn = 1.0f;
                        flameRadiusScl = 3.5f;
                        flameRadiusMag = 2.0f;
                        flameRadiusInMag = 1.0f;
                    }},
                    new DrawParticles(){{
                        color = Color.valueOf("0f0f0f");
                        alpha = 0.4f;
                        blending = Blending.additive;
                        particleSize = 1.3f;
                        reverse = true;
                        particleRad = 18;
                        particles = 16;
                        fadeMargin = 1;
                        rotateScl = 7;
                        particleLife = 60;
                    }},
                    new DrawParticles(){{
                        color = Color.valueOf("ffb361");
                        alpha = 0.4f;
                        blending = Blending.additive;
                        particleSize = 2;
                        reverse = true;
                        particleRad = 10;
                        particles = 16;
                        fadeMargin = 1;
                        rotateScl = 7;
                        particleLife = 80;
                    }},
                    new DrawGlowRegion("-top"){{
                        glowScale = 10;
                        color = Color.valueOf("ff0f0f");
                    }}
            );
            requirements(Category.crafting, with(IndustrialItems.iron, 15, IndustrialItems.tin, 5));
        }};

        smelter = new MultiCrafter("smelter"){{
            health = 250;
            size = 1;
            hasItems = true;
            hasPower = true;
            hasLiquids = true;
            liquidCapacity = 80;
            resolvedRecipes = Seq.with(
                    new Recipe() {{
                        input = new IOEntry() {{
                            items = Seq.with(ItemStack.with(IndustrialItems.copperRod, 1));
                            power = 1.5f;
                        }};
                        output = new IOEntry() {{
                            fluids = Seq.with(LiquidStack.with(IndustrialLiquids.moltenCopper, 0.5f));
                        }};
                        craftTime = 30f;
                    }},
                    new Recipe() {{
                        input = new IOEntry() {{
                            items = Seq.with(ItemStack.with(IndustrialItems.gold, 1));
                            power = 1.5f;
                        }};
                        output = new IOEntry() {{
                            fluids = Seq.with(LiquidStack.with(IndustrialLiquids.moltenGold, 0.5f));
                        }};
                        craftTime = 30f;
                    }},
                    new Recipe() {{
                        input = new IOEntry() {{
                            items = Seq.with(ItemStack.with(IndustrialItems.iron, 1));
                            power = 1.5f;
                        }};
                        output = new IOEntry() {{
                            fluids = Seq.with(LiquidStack.with(IndustrialLiquids.moltenIron, 0.5f));
                        }};
                        craftTime = 30f;
                    }},
                    new Recipe() {{
                        input = new IOEntry() {{
                            items = Seq.with(ItemStack.with(IndustrialItems.leadClump, 1));
                            power = 1.5f;
                        }};
                        output = new IOEntry() {{
                            fluids = Seq.with(LiquidStack.with(IndustrialLiquids.moltenLead, 0.5f));
                        }};
                        craftTime = 30f;
                    }},
                    new Recipe() {{
                        input = new IOEntry() {{
                            items = Seq.with(ItemStack.with(IndustrialItems.scrappedMetal, 1));
                            power = 1.5f;
                        }};
                        output = new IOEntry() {{
                            fluids = Seq.with(LiquidStack.with(IndustrialLiquids.moltenScrappedMetal, 0.5f));
                        }};
                        craftTime = 30f;
                    }},
                    new Recipe() {{
                        input = new IOEntry() {{
                            items = Seq.with(ItemStack.with(IndustrialItems.tin, 1));
                            power = 1.5f;
                        }};
                        output = new IOEntry() {{
                            fluids = Seq.with(LiquidStack.with(IndustrialLiquids.moltenTin, 0.5f));
                        }};
                        craftTime = 30f;
                    }}
            );
            requirements(Category.crafting, with(IndustrialItems.steel, 25, IndustrialItems.tin, 10, IndustrialItems.gold, 1));
        }};

        mold = new MultiCrafter("mold"){{
            health = 250;
            size = 1;
            hasItems = true;
            hasPower = true;
            hasLiquids = true;
            liquidCapacity = 80;
            resolvedRecipes = Seq.with(
                    new Recipe() {{
                        output = new IOEntry() {{
                            items = Seq.with(ItemStack.with(IndustrialItems.copperRod, 1));
                        }};
                        input = new IOEntry() {{
                            fluids = Seq.with(LiquidStack.with(IndustrialLiquids.moltenCopper, 0.5f));
                            power = 1.5f;
                        }};
                        craftTime = 30f;
                    }},
                    new Recipe() {{
                        output = new IOEntry() {{
                            items = Seq.with(ItemStack.with(IndustrialItems.gold, 1));
                        }};
                        input = new IOEntry() {{
                            fluids = Seq.with(LiquidStack.with(IndustrialLiquids.moltenGold, 0.5f));
                            power = 1.5f;
                        }};
                        craftTime = 30f;
                    }},
                    new Recipe() {{
                        output = new IOEntry() {{
                            items = Seq.with(ItemStack.with(IndustrialItems.iron, 1));
                        }};
                        input = new IOEntry() {{
                            fluids = Seq.with(LiquidStack.with(IndustrialLiquids.moltenIron, 0.5f));
                            power = 1.5f;
                        }};
                        craftTime = 30f;
                    }},
                    new Recipe() {{
                        output = new IOEntry() {{
                            items = Seq.with(ItemStack.with(IndustrialItems.leadClump, 1));
                        }};
                        input = new IOEntry() {{
                            fluids = Seq.with(LiquidStack.with(IndustrialLiquids.moltenLead, 0.5f));
                            power = 1.5f;
                        }};
                        craftTime = 30f;
                    }},
                    new Recipe() {{
                        output = new IOEntry() {{
                            items = Seq.with(ItemStack.with(IndustrialItems.scrappedMetal, 1));
                        }};
                        input = new IOEntry() {{
                            fluids = Seq.with(LiquidStack.with(IndustrialLiquids.moltenScrappedMetal, 0.5f));
                            power = 1.5f;
                        }};
                        craftTime = 30f;
                    }},
                    new Recipe() {{
                        output = new IOEntry() {{
                            items = Seq.with(ItemStack.with(IndustrialItems.tin, 1));
                        }};
                        input = new IOEntry() {{
                            fluids = Seq.with(LiquidStack.with(IndustrialLiquids.moltenTin, 0.5f));
                            power = 1.5f;
                        }};
                        craftTime = 30f;
                    }}
            );
            requirements(Category.crafting, with(IndustrialItems.steel, 25, IndustrialItems.tin, 10, IndustrialItems.gold, 1));
        }};

        metalScrapper = new MultiCrafter("metal-scrapper"){{
            health = 250;
            size = 1;
            hasItems = true;
            hasPower = true;
            hasLiquids = true;
            liquidCapacity = 80;
            resolvedRecipes = Seq.with(
                    new Recipe() {{
                        input = new IOEntry() {{
                            items = Seq.with(ItemStack.with(IndustrialItems.copperRod, 1));
                            power = 1.5f;
                        }};
                        output = new IOEntry() {{
                            items = Seq.with(ItemStack.with(IndustrialItems.scrappedMetal, 1));
                        }};
                        craftTime = 30f;
                    }},
                    new Recipe() {{
                        input = new IOEntry() {{
                            items = Seq.with(ItemStack.with(IndustrialItems.gold, 1));
                            power = 1.5f;
                        }};
                        output = new IOEntry() {{
                            items = Seq.with(ItemStack.with(IndustrialItems.scrappedMetal, 1));
                        }};
                        craftTime = 30f;
                    }},
                    new Recipe() {{
                        input = new IOEntry() {{
                            items = Seq.with(ItemStack.with(IndustrialItems.iron, 1));
                            power = 1.5f;
                        }};
                        output = new IOEntry() {{
                            items = Seq.with(ItemStack.with(IndustrialItems.scrappedMetal, 1));
                        }};
                        craftTime = 30f;
                    }},
                    new Recipe() {{
                        input = new IOEntry() {{
                            items = Seq.with(ItemStack.with(IndustrialItems.leadClump, 1));
                            power = 1.5f;
                        }};
                        output = new IOEntry() {{
                            items = Seq.with(ItemStack.with(IndustrialItems.scrappedMetal, 1));
                        }};
                        craftTime = 30f;
                    }},
                    new Recipe() {{
                        input = new IOEntry() {{
                            items = Seq.with(ItemStack.with(IndustrialItems.tin, 1));
                            power = 1.5f;
                        }};
                        output = new IOEntry() {{
                            items = Seq.with(ItemStack.with(IndustrialItems.scrappedMetal, 1));
                        }};
                        craftTime = 30f;
                    }}
            );
            requirements(Category.crafting, with(IndustrialItems.steel, 25, IndustrialItems.tin, 10, IndustrialItems.gold, 1));
        }};

        obsidianKlin = new GenericCrafter("obsidian-klin"){{
            health = 300;
            size = 2;
            craftTime = 30;
            hasItems = true;
            hasPower = true;
            hasLiquids = true;
            liquidCapacity = 70;
            consumePower(0.70f);
            consumeLiquid(IndustrialLiquids.moltenScrappedMetal, 0.5f);
            consumeItem(IndustrialItems.basalt, 2);
            outputItem = new ItemStack(IndustrialItems.obsidian, 1);
            drawer = new DrawMulti(
                    new DrawDefault(),
                    new DrawRegion("-bottom"),
                    new DrawGlowRegion("-glow"){{
                        alpha = 0.7f;
                        color = Color.valueOf("000f00");
                        glowIntensity = 0.3f;
                        glowScale = 8f;
                    }},
                    new DrawLiquidRegion(IndustrialLiquids.moltenScrappedMetal){{
                        suffix = "-liquid";
                    }}
            );
            requirements(Category.crafting, with(IndustrialItems.steel, 10, IndustrialItems.tin, 5));
        }};

        copperInfuser = new GenericCrafter("copper-infuser"){{
            health = 500;
            size = 2;
            craftTime = 60;
            hasItems = true;
            hasPower = true;
            hasLiquids = true;
            liquidCapacity = 70;
            consumePower(0.70f);
            consumeLiquids(LiquidStack.with(IndustrialLiquids.moltenCopper, 1, IndustrialLiquids.moltenLead, 2));
            outputItem = new ItemStack(IndustrialItems.leadedCopper, 1);
            drawer = new DrawMulti(
                    new DrawDefault(),
                    new DrawGlowRegion("-top"){{
                        alpha = 0.7f;
                        color = Color.valueOf("ff0f0f");
                        glowIntensity = 0.3f;
                        glowScale = 10;
                    }},
                    new DrawFlame(Color.valueOf("0f0f0f")){{
                        flameRadius = 3.2f;
                        flameRadiusIn = 1.0f;
                        flameRadiusScl = 3.5f;
                        flameRadiusMag = 2.0f;
                        flameRadiusInMag = 1.0f;
                    }},
                    new DrawParticles(){{
                        color = Color.valueOf("0f0f0f");
                        alpha = 0.4f;
                        blending = Blending.additive;
                        particleSize = 1.3f;
                        reverse = true;
                        particleRad = 18;
                        particles = 16;
                        fadeMargin = 1;
                        rotateScl = 7;
                        particleLife = 60;
                    }}
            );
            requirements(Category.crafting, with(IndustrialItems.steel, 15, IndustrialItems.tin, 5));
        }};
    }
}