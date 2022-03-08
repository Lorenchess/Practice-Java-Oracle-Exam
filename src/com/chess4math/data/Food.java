package com.chess4math.data;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Food extends Product{
  private LocalDate bestBefore;

    public Food(int id, String name, BigDecimal price, Rating rating, LocalDate bestBefore) {
        super(id, name, price, rating);
        this.bestBefore = bestBefore;
    }

    /**
     * Get the value of the best before date for the product
     * @return the value of bestBefore
     */

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + bestBefore + " Polymorphism in action!";
    }

    @Override
    public BigDecimal getDiscount() {
        return (bestBefore.isEqual(LocalDate.now())) ? super.getDiscount() : BigDecimal.ZERO;
    }

    @Override
    public Product applyRating(Rating newRating) {
        return new Food(getId(), getName(), getPrice(),
                newRating, bestBefore);
    }
}