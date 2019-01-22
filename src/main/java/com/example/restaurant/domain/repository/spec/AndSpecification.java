package com.example.restaurant.domain.repository;

public class AndSpecification<T> extends CompositeSpecification<T> {
  private ISpecification<T> left;
  private ISpecification<T> right;

  public AndSpecification(ISpecification<T> left, ISpecification<T> right){
    this.left = left;
    this.right = right;
  }

  // implement and logic
  @Override
  public boolean isSatisfied(T request){
    return left.isSatisfied(request) && right.isSatisfied(request);
  }
}




