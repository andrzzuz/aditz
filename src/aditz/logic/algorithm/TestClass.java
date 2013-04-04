package aditz.logic.algorithm;

import aditz.logic.crossover.CutAndSplice;
import aditz.logic.crossover.ExampleCrossover;
import aditz.logic.fitness.ExampleFitness;

public class TestClass {
    public static void main(String[] args) {
        ExampleFitness func = new ExampleFitness();
        Algorithm algo = new Algorithm(
                new ExampleCrossover(func), func);
        algo.setMaxIter(10);
        algo.setMinValue(-100);
        algo.setMaxValue(100);
        algo.setMutationProbability(0.01D);
        algo.setStartPopulation(10);
        algo.setSelection(2);

        algo.go();
    }
}
