package industrialis.content;

import arc.graphics.Color;
import arc.struct.Seq;
import mindustry.type.Item;

public class IndustrialItems {
    public static Item
        //t1
        copperRod, gold, iron, leadClump, mineralCoal, obsidian, scrappedMetal, steel, tin,

        //t2
        basalt, basalticConcrete, energyCell, leadedCopper, lithium, plantMatter,
        
        //t3
        explosionCompound;

    public static final Seq<Item> vultarItems = new Seq<>();
    public static void load() {
        iron = new Item("iron", Color.valueOf("ffb6b6")){{
            hardness = 1;
            cost = 2.5f;
            alwaysUnlocked = true;
        }};

        tin = new Item("tin", Color.valueOf("7a7a7a")){{
            hardness = 1;
            cost = 1.9f;
        }};

        copperRod = new Item("copper-rod", Color.valueOf("202020")){{
            hardness = 1;
            cost = 1.5f;
        }};

        gold = new Item("gold", Color.valueOf("ff8700")){{
            hardness = 1;
            cost = 1.2f;
        }};

        leadClump = new Item("lead-clump", Color.valueOf("2f0045")){{
            hardness = 1;
            cost = 2.3f;
        }};

        mineralCoal = new Item("mineral-coal", Color.valueOf("ffb6b6")){{
            hardness = 1;
            cost = 1;
            flammability = 1f;
            explosiveness = 1.2f;
        }};

        obsidian = new Item("obsidian", Color.valueOf("1d0025")){{
            hardness = 1;
            cost = 1;
        }};

        scrappedMetal = new Item("scrapped-metal", Color.valueOf("ffb6b6")){{
            hardness = 1;
            cost = 0.5f;
        }};

        steel = new Item("steel", Color.valueOf("090909")){{
            hardness = 1;
            cost = 1.5f;
        }};

        //T2
        basalt = new Item("basalt", Color.valueOf("202020")){{
            hardness = 1;
            cost = 1;
        }};

        basalticConcrete = new Item("basaltic-concrete", Color.valueOf("101010")){{
            hardness = 1;
            cost = 1;
        }};

        energyCell = new Item("energy-cell", Color.valueOf("dd0000")){{
            cost = 1;
            flammability = 10f;
            explosiveness = 10f;
            charge = 10f;
        }};

        leadedCopper = new Item("leaded-copper", Color.valueOf("ff9e42")){{
            hardness = 1;
            cost = 1;
        }};

        energyCell = new Item("energy-cell", Color.valueOf("0d0d0d")){{
            cost= 1;
            flammability = 10f;
            charge = 10f;
        }};

        plantMatter = new Item("plant-matter", Color.valueOf("164500")){{
            hardness = 1;
            flammability = 0.6f;
            cost = 1;
        }};

        //t3
        explosionCompound = new Item("explosion-compound", Color.valueOf("ff7c00")){{
            cost = 1;
            flammability = 150f;
            explosiveness = 130f;
            charge = 80f;
        }};

        vultarItems.addAll(
          copperRod, gold, iron, leadClump, mineralCoal, 
          obsidian, scrappedMetal, steel, tin, basalt, 
          basalticConcrete, energyCell, leadedCopper, lithium, 
          plantMatter, explosionCompound
        );
    }
}
