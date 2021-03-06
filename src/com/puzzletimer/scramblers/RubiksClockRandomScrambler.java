package com.puzzletimer.scramblers;

import java.util.Random;

import com.puzzletimer.models.Scramble;
import com.puzzletimer.models.ScramblerInfo;
import com.puzzletimer.solvers.RubiksClockSolver;

public class RubiksClockRandomScrambler implements Scrambler {
    private ScramblerInfo scramblerInfo;
    private Random random;

    public RubiksClockRandomScrambler(ScramblerInfo scramblerInfo) {
        this.scramblerInfo = scramblerInfo;
        this.random = new Random();
    }

    @Override
    public ScramblerInfo getScramblerInfo() {
        return this.scramblerInfo;
    }

    @Override
    public Scramble getNextScramble() {
        return new Scramble(
            getScramblerInfo().getScramblerId(),
            RubiksClockSolver.getRandomSequence(this.random));
    }

    @Override
    public String toString() {
        return getScramblerInfo().getDescription();
    }
}
