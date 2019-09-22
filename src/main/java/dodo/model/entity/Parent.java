package dodo.model.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

/**
 * @author doyoung hwang on 2019-09-22
 */

@Entity
@Setter
@Getter
public class Parent {

  @Id
  @GeneratedValue
  private long parentNo;

  private String name;

  @OneToMany
  @JoinColumn(name = "parentNo")
  private List<Child> children;
}
