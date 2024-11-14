Scanner scanner = new Scanner(System.in);
boolean exit = false;

while (!exit) {
    System.out.println("---- Garment Management System ----");
    System.out.println("1. Add Garment");
    System.out.println("2. Remove Garment");
    System.out.println("3. View Garments");
    System.out.println("4. Calculate Discount");
    System.out.println("5. Exit");
    System.out.print("Enter your choice: ");
    int choice = scanner.nextInt();

    switch (choice) {
        case 1:
            // Logic for Add Garment
            break;
        case 2:
            // Logic for Remove Garment
            break;
        case 3:
            // Logic for View Garments
            break;
        case 4:
            // Logic for Calculate Discount
            break;
        case 5:
            exit = true;
            break;
        default:
            System.out.println("Invalid option, try again.");
            break;
    }
}
