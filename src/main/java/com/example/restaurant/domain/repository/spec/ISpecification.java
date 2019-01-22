package com.example.restaurant.domain.repository;


public interface ISpecification<T>{

  boolean isSatisfied(T request);
  public ISpecification<T> and(ISpecification<T> spec);
  public ISpecification<T> or(ISpecification<T> spec);
  public ISpecification<T> not(ISpecification<T> spec);
    
}





