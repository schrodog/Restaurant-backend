package com.example.restaurant.domain.repository;

public class NotSpecification<T> extends CompositeSpecification<T> {
  private ISpecification<T> x;

  public NotSpecification(ISpecification<T> x){
    this.x = x;
  }

  @Override
  public boolean isSatisfied(T request){
    return !x.isSatisfied(request);
  }
}




