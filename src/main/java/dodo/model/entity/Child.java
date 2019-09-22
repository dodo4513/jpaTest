package dodo.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * @author doyoung hwang on 2019-09-22
 */

@Entity
@Getter
@Setter
public class Child {

  @Id
  @GeneratedValue
  private long childNo;

  private long parentNo;

  private String name;
}
