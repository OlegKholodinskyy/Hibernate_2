package lesson1_hw;

import org.hibernate.Session;

public class ProductRepository {
    /*
    Сигнатура метода:
void save(Product product)
void delete(long id)
void update(Product product)
     */

     void save(Product product){
        Session session = new HibernateUtils().createSessionFactory().openSession();
        session.getTransaction().begin();
        session.save(product);
        session.getTransaction().commit();
        System.out.println("Product Id: " + product.getId() + " saved in DB");
        session.close();
    }


     void delete(long id){
         Product productForDelete = new Product();
         productForDelete.setId(id);
        Session session = new HibernateUtils().createSessionFactory().openSession();
        session.getTransaction().begin();
        session.delete(productForDelete);
        session.getTransaction().commit();
        System.out.println("Product Id: " + id + " deleted from DB");
        session.close();
    }

     void update(Product product){
        Session session = new HibernateUtils().createSessionFactory().openSession();
        session.getTransaction().begin();
        session.update(product);
        session.getTransaction().commit();
        System.out.println("Product Id: " + product.getId() + " updated in DB");
        session.close();
    }



}
