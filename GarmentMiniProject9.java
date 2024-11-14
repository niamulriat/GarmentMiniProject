double calculateDiscountPrice(double discountPercentage) {
    double discount = price * (discountPercentage / 100);
    return price - discount;
}
