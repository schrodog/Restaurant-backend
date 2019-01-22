package com.example.restaurant.domain.repository;

class OrSpecification<T> extends CompositeSpecification<T> {
  private ISpecification<T> left;
  private ISpecification<T> right;

  public OrSpecification(ISpecification<T> left, ISpecification<T> right){
    this.left = left;
    this.right = right;
  }

  @Override
  public boolean isSatisfied(T request){
    return left.isSatisfied(request) || right.isSatisfied(request);
  }
}




