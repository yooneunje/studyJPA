package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        //트랜젝션 생성
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        //*********************입력************************
        /*try{
            Member member = new Member();
            member.setId(2L);
            member.setName("HelloB");

            //JPA에 저장
            em.persist(member);

            //커밋
            tx.commit();
        }catch (Exception e){
            tx.rollback();
        }finally {
            em.close();
        }
        emf.close();

        //*********************조회************************
        try {
            Member findMember = em.find(Member.class, 1l);
            System.out.println("findMember = " + findMember.getId());
            System.out.println("findMember = " + findMember.getName());

            //커밋
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }

        //*********************삭제************************
        try {
            Member findMember = em.find(Member.class, 1l);
            em.remove(findMember);

            //커밋
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }

        //*********************수정************************
        try {
            Member findMember = em.find(Member.class, 1l);
            findMember.setName("HelloJPA");

            //커밋
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }*/
    }
}
