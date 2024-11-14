Garment findGarment(String id) {
    for (Garment g : garments) {
        if (g.id.equals(id))
            return g;
    }
    return null;
}
