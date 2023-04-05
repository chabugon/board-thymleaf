package idusw.springboot.boardthymleaf.controller;

import ch.qos.logback.core.model.Model;
import idusw.springboot.boardthymleaf.domain.Memo;
import idusw.springboot.boardthymleaf.entity.MemoEntity;
import idusw.springboot.boardthymleaf.repository.MemoRepository;
import idusw.springboot.boardthymleaf.service.MemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Controller
public class HomeController {
    MemoService memoService;
    public HomeController(MemoService memoService){
        this.memoService = memoService;
    }
     /*
    @Autowired
    MemoRepository memoRepository; //DI (Dependency Injection)
      */
    @Autowired
    MemoRepository memoRepository;
    @GetMapping("/init")
    public String goHome(){
        memoService.initailize();
        return "index";
    }

    List<Memo> result = new ArrayList<>(); // 결과 리스트
    @GetMapping("/memo")
    public String getMemoList(Model model) {
        result = memoService.readList(); // 서비스 객체의 메소드를 호출하여 업무를 처리한다.
        model.addAttribute("memoList", result); // 처리된 결과를 전달하기 위해 model 객체의 속성으로 지정
        return "list"; // view 이름
    }
}
