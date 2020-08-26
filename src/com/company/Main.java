package com.company;

import com.company.lapuociai.Azuolas;
import com.company.lapuociai.Berzas;
import com.company.spygliuociai.Egle;
import com.company.spygliuociai.Kadagys;
import com.company.spygliuociai.Pusis;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Azuolas azuolas = new Azuolas();
        Berzas berzas = new Berzas();
        Egle egle = new Egle();
        Kadagys kadagys = new Kadagys();
        Pusis pusis = new Pusis();


        GenericTrees<Medis> genericTrees = new GenericTrees<>();
        System.out.println("Berzu miskas: ");
        genericTrees.berzuMiskas(berzas);
        genericTrees.berzuMiskas(berzas);
        genericTrees.berzuMiskas(berzas);
        System.out.println();
        System.out.println("Spygliuociu miskas turi: ");
        genericTrees.spygliuociuMiskas(kadagys);
        genericTrees.spygliuociuMiskas(egle);
        genericTrees.spygliuociuMiskas(pusis);
        System.out.println();
        System.out.println("Ivairus miskas turi: ");
        genericTrees.ivairusMiskas(egle);
        genericTrees.ivairusMiskas(azuolas);
        genericTrees.ivairusMiskas(berzas);
        genericTrees.ivairusMiskas(kadagys);
        genericTrees.ivairusMiskas(pusis);
    }
}
