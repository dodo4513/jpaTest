package dodo.service;

import dodo.model.entity.Child;
import dodo.model.entity.Parent;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author doyoung hwang on 2019-09-22
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ParentServiceTest {

  @Autowired
  private ParentService parentService;


  @Test
  @Transactional
  public void 원투매니lazy로딩_테스트() {

    log.info("end");
    Parent parent = parentService.getParent(1);

    for (Child child : parent.getChildren()) {
      log.info(child.getName());
    }

    log.info("end");
  }

}
