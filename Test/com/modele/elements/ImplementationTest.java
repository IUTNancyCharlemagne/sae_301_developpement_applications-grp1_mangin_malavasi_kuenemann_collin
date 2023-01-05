package com.modele.elements;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImplementationTest
{
    Implementation i;
    ClasseInterface depart, destination;

    @BeforeEach
    void setUp()
    {
        depart = new ClasseInterface("Classe1");
        destination = new ClasseInterface("Classe2");
        i = new Implementation(depart, destination);
    }

    @Test
    public void test_constructeur_ok()
    {
        //Test
        assertEquals(i.getInitClasse(), depart, "doit etre la meme classe");
        assertEquals(i.getDestinationClasse(), destination, "doit etre la meme classe");
    }

    @Test
    void modifier() {
    }
}