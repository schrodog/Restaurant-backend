package com.example.restaurant.domain.repository;

public abstract class CompositeSpecification<T> implements ISpecification<T> {
  public abstract boolean isSatisfied(T req);

  // itself 'and' another spec -> AndSpec type
  public ISpecification<T> and(ISpecification<T> spec){
    return new AndSpecification<T>(this, spec);
  }

  public ISpecification<T> not(ISpecification<T> spec){
    return new NotSpecification<T>(this);
  }

  public ISpecification<T> or(ISpecification<T> spec){
    return new OrSpecification<T>(this, spec);
  }
}









