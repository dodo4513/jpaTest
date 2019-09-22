package dodo.service;

import dodo.model.entity.Parent;
import dodo.repository.ParentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author doyoung hwang on 2019-09-22
 */

@Service
@RequiredArgsConstructor
public class ParentService {

  private final ParentRepository parentRepository;

  public Parent getParent(long id) {

    return parentRepository.getOne(id);
  }
}
