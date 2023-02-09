package com.jike.demo.controller;


import com.jike.demo.pojo.TbStudent;
import com.jike.demo.service.TbStudentService;
import com.jike.demo.vo.Result;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Cyp123
 * @since 2023-02-09
 */
@RestController
@RequestMapping("/tbStudent")
@MapperScan("com.jike.demo.dao")
public class TbStudentController {

    @Autowired
    private TbStudentService tbStudentService;



    @PostMapping("/save")
    public Result insert(@RequestBody TbStudent student){

        if (tbStudentService.save(student)){
            return Result.success();
        }else {
            return Result.error("失败");
        }
    }
}

