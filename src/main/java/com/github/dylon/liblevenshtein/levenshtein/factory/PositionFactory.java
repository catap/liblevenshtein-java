package com.github.dylon.liblevenshtein.levenshtein.factory;

/**
 * Builds position vectors for the given algorithm.
 * @author Dylon Edwards
 * @since 2.1.0
 */
public abstract class PositionFactory implements IPositionFactory {

  /**
   * Builds position vectors for the standard algorithm.
   * @author Dylon Edwards
   * @since 2.1.0
   */
  public static class ForStandardPositions extends PositionFactory {

    /**
     * {@inheritDoc}
     */
    @Override
    public int[] build(final int i, final int e) {
      return new int[] { i, e };
    }
  }

  /**
   * Builds position vectors for the transposition and merge-and-split
   * algorithms.
   * @author Dylon Edwards
   * @since 2.1.0
   */
  public static class ForXPositions extends PositionFactory {

    /**
     * {@inheritDoc}
     */
    @Override
    public int[] build(final int i, final int e, final int x) {
      return new int[] { i, e, x };
    }
  }
}
