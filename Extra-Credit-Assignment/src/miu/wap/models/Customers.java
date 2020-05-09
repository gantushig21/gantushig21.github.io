package miu.wap.models;

import miu.wap.beans.Customer;

import java.util.ArrayList;
import java.util.List;

public class Customers {
    private List<Customer> list = null;

    public Customers() {
        list = new ArrayList<>();
        list.add(new Customer("Anna Jones", "Female", "Inquiry", "This is an inquiry"));
        list.add(new Customer("Bob W. Adamson", "Male", "Complaint", "This is a complaint"));
        list.add(new Customer("Carlos Hernandez", "Male", "Inquiry", "This is an inquiry"));
        list.add(new Customer("John H. Smith", "Male", "Feedback", "This is a feedback"));
        list.add(new Customer("Tuyen Le Nguyen", "Female", "Feedback", "This is a feedback"));
        list.add(new Customer("Zacary Najib Ali", "Male", "Inquiry", "This is an inquiry"));
    }

    public List<Customer> getCustomers(String search) {
        List<Customer> filtered = new ArrayList<>();
        for (Customer customer: list) {
            if (customer.getName().toLowerCase().indexOf(search) > -1 ||
                customer.getGender().toLowerCase().indexOf(search) > -1 ||
                customer.getCategory().toLowerCase().indexOf(search) > -1 ||
                customer.getMessage().toLowerCase().indexOf(search) > -1) {
                filtered.add(customer);
            }
        }

        return filtered;
    }

    public void addCustomer(Customer customer) {
        list.add(customer);
    }
}
