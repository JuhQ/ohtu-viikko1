/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtuesimerkki;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juhatauriainen
 */
public class PlayerTest {

    Player player;
    public PlayerTest() {
        player = new Player("Semenko", "EDM", 4, 12);
    }

     @Test
     public void getNameTest() {
        assertEquals("Semenko", player.getName());
    }

     @Test
     public void getAssistsTest() {
        assertEquals(12, player.getAssists());
    }

     @Test
     public void getGoalsTest() {
        assertEquals(4, player.getGoals());
    }

     @Test
     public void getPointsTest() {
        assertEquals(16, player.getPoints());
    }

     @Test
     public void getTeamTest() {
        assertEquals("EDM", player.getTeam());
    }

     @Test
     public void setNameTest() {
        player.setName("Swag");
        assertEquals("Swag", player.getName());
    }

     @Test
     public void setAssistsTest() {
        player.setAssists(100);
        assertEquals(100, player.getAssists());
    }

     @Test
     public void setGoalsTest() {
        player.setGoals(400);
        assertEquals(400, player.getGoals());
    }

     @Test
     public void setTeamTest() {
        player.setTeam("Swag Team");
        assertEquals("Swag Team", player.getTeam());
    }

     @Test
     public void toStringTest() {
        assertTrue(player.toString().contains("Semenko"));
    }
}
