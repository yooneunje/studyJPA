package hellojpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//테이블명과 클래스 명이 다른 경우 @Table(name="테이블명")을 선언해준다.
public class Member {

    @Id
    private Long id;

    //컬럼명과 변수명이 다른 경우 @Column(name="컬럼명")을 선언해준다.
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
