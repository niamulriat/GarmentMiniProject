void removeGarment(String id) {
    garments.removeIf(g -> g.id.equals(id));
}
