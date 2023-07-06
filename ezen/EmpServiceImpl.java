package ezen.exam.service;

import java.util.List;

import org.conan.mapper.ReplyMapper;
import org.conan.service.ReplyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ezen.exam.mapper.EmpMapper;
import ezen.exam.vo.EmpVO;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor

public class EmpServiceImpl implements EmpService{
    @Setter(onMethod_=@Autowired)
   public EmpMapper mapper;
   
   @Override
   public List<EmpVO> getList(){
      return mapper.getList();
   }
   @Transactional
   @Override
   public void insert(EmpVO vo) {
      mapper.insert(vo);
   }
     @Override
   public EmpVO read(Integer empno) {
      return mapper.read(empno);
   }
   @Override
   public boolean delete(Integer empno) {
      return mapper.delete(empno) == 1;
   }      
}