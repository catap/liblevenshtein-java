package com.github.dylon.liblevenshtein.levenshtein.factory;

import java.util.ArrayDeque;
import java.util.Queue;

import com.github.dylon.liblevenshtein.levenshtein.Element;

/**
 * Builds elements which are used to link position vectors together in
 * Levenshtein states.
 * @param <Type> Kind of position vectors that will be linked together.
 * @author Dylon Edwards
 * @since 2.1.0
 */
public class ElementFactory<Type> implements IElementFactory<Type> {

  /**
   * {@inheritDoc}
   */
  @Override
  public Element<Type> build(final Type value) {
    final Element<Type> element = new Element<Type>();
    element.value(value);
    return element;
  }
}
