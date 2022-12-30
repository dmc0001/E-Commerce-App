import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        // Create the main window
        JFrame frame = new JFrame("E-Commerce App");
        frame.setSize(300,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel to hold the product list and product details
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // Create a list of products
       /* DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Product 1");
        listModel.addElement("Product 2");
        listModel.addElement("Product 3");
        JList<String> productList = new JList<>(listModel);*/


        // Create a panel to display the selected product's details
        JPanel productPanel = new JPanel();
        productPanel.setLayout(new GridLayout(3, 1));
        productPanel.add(new JLabel("Selected product:"));
        JLabel productImageLabel = new JLabel();
        productPanel.add(productImageLabel);
        JTextArea productDescription = new JTextArea();
        productPanel.add(productDescription);
        mainPanel.add(productPanel, BorderLayout.CENTER);

        // Add a button to add the selected product to the shopping cart
        JButton addToCartButton = new JButton("Add to Cart");
        mainPanel.add(addToCartButton, BorderLayout.SOUTH);

        // Add the main panel to the frame and show the window
        frame.add(mainPanel);
        frame.pack();
        frame.setVisible(true);


        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Product 1", "Description of Product 1", 19.99, new ImageIcon("productOne.png")));
        products.add(new Product("Product 2", "Description of Product 2", 29.99, new ImageIcon("productTwo.png")));
        products.add(new Product("Product 3", "Description of Product 3", 39.99, new ImageIcon("productThree.png")));

        // Create a list model to hold the products

        DefaultListModel<Product> listModel = new DefaultListModel<>();
        for (Product product : products) {
            listModel.addElement(product);
        }
        // Use the list model to create the product list
        JList<Product> productList = new JList<>(listModel);

// Add a listener to the product list to update the product details panel when a product is selected
        productList.addListSelectionListener(e -> {
            Product selectedProduct = productList.getSelectedValue();
            productImageLabel.setIcon(selectedProduct.getImage());
            productDescription.setText(selectedProduct.getDescription());
        });
        mainPanel.add(productList, BorderLayout.WEST);





    }
}