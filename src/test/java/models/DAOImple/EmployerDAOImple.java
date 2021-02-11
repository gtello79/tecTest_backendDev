package models.DAOImple;

import models.bussines.Product;
import models.bussines.Transaction;

public interface EmployerDAOImple {
    public Product enchargedProduct(Transaction toMark2, Product toMark, int option);
}
