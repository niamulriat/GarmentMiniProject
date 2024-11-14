void printOrderDetails() {
    System.out.println("--------------------------");
    System.out.println("Order Details");
    System.out.println("--------------------------");
    for (Garment g : garments) {
        System.out.println("Name: " + g.name);
        System.out.println("Price: " + g.price);
        System.out.println("Description: " + g.description);
        System.out.println("--------------------------");
    }
}
