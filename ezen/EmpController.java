package ezen.exam.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ezen.exam.service.EmpService;
import ezen.exam.vo.EmpVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@RequestMapping("/emp/*")
@AllArgsConstructor
@Controller
public class EmpController {

   private EmpService service;

   @GetMapping("/list")
   public void list(Model model) {
      log.info("list");
      model.addAttribute("eList", service.getList());
   }
   @GetMapping("/write")
   public void write() {
      log.info("write");

   }

   @PostMapping("/write")
   public String insert(EmpVO vo) {
      log.info("write");
      service.insert(vo);
      return "redirect:/emp/list";
   }

   @GetMapping("/read")
   public void read(@RequestParam("empno") Integer empno, Model model) {
      log.info("read");
      model.addAttribute("emp", service.read(empno));
   }

//   @DeleteMapping(value="/remove/{empno}",produces= {MediaType.TEXT_PLAIN_VALUE})
//   public ResponseEntity<String> remove(@PathVariable("empno") Integer empno){
//      log.info("delete");
//      return service.delete(empno) ? new ResponseEntity<>("success", HttpStatus.OK)
//            :new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//   }

}