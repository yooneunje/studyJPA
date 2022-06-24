package jpabook.jpashop;

import jpabook.jpashop.domain.Order;
import jpabook.jpashop.domain.OrderItem;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        //데이터 베이스당 하나만 생성
        //persistence.xml 의 hello 라는 이름을 가진 설정 정보를 참고하여 만들어진다.
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        //요청이 올때 마다 사용 후 close로 버림. 쓰레드간에 공유 절대 금지!
        EntityManager em = emf.createEntityManager();

        //트랜젝션 생성
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }
}
