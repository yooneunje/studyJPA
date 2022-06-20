package hellojpa;

import javax.persistence.*;
import java.util.List;

public class JpaMain {

    public static void main(String[] args) {
        //데이터 베이스당 하나만 생성
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        //요청이 올때 마다 사용 후 close로 버림. 쓰레드간에 공유 절대 금지!
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

        //JPQL->쿼리작성 가능
        /*try {
            //테이블이 아닌 Entity 객체를 대상으로 쿼리를 작성.
            List<Member> result = em.createQuery("select m from Member as m", Member.class).getResultList();

            for (Member member : result) {
                System.out.println("member.name = " + member.getName());
            }

            //커밋
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();*/
    }
}
