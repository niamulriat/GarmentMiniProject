double calculateTotalAmount() {
    double totalAmount = 0;
    for (Garment g : garments) {
        totalAmount += g.price;
    }
    return totalAmount;
}
