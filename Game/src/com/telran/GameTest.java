package com.telran;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GameTest {
        Game game = new Game();

        @Test
        public void test_1Winning1Doublings_0Games() {
            assertEquals(0, game.startGame(1, 1));
        }

        @Test
        public void test_2Winning0Doublings_1Games() {
            assertEquals(1, game.startGame(2, 0));
        }

        @Test
        public void test_2Winning1Doublings_1Games() {
            assertEquals(1, game.startGame(2, 1));
        }

        @Test
        public void test_2Winning2Doublings_1Games() {
            assertEquals(1, game.startGame(2, 2));
        }


        @Test
        public void test_8Winning1Doublings_4Games() {
            assertEquals(4, game.startGame(8, 1));
        }

    }

