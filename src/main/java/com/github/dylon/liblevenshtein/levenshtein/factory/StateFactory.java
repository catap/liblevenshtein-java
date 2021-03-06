package com.github.dylon.liblevenshtein.levenshtein.factory;

import java.util.ArrayDeque;
import java.util.Queue;

import lombok.Setter;

import com.github.dylon.liblevenshtein.levenshtein.IState;
import com.github.dylon.liblevenshtein.levenshtein.State;

/**
 * Builds Levenshtein states.
 * @author Dylon Edwards
 * @since 2.1.0
 */
public class StateFactory implements IStateFactory {

  /**
   * Builds and recycles linked-list nodes for state positions.
   * -- SETTER --
   * Builds and recycles linked-list nodes for state positions.
   * @param elementFactory Builds and recycles linked-list nodes for state
   * positions.
   * @return This {@link StateFactory} for fluency.
   */
  @Setter
  private IElementFactory<int[]> elementFactory;

  /**
   * {@inheritDoc}
   */
  @Override
  public IState build(final int[]... positions) {
    final IState state = new State(elementFactory);

    for (final int[] position : positions) {
      state.add(position);
    }

    return state;
  }
}
