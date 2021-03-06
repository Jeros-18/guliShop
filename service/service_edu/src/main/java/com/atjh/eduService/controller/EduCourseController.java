package com.atjh.eduService.controller;


import com.atjh.commonUtils.R;
import com.atjh.eduService.entity.vo.CourseInfoForm;
import com.atjh.eduService.service.EduCourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 课程 前端控制器
 * </p>
 *
 * @author jahui
 * @since 2021-11-28
 */
@Api(description="课程管理")
@RestController
@RequestMapping("/eduservice/educourse")
@CrossOrigin
public class EduCourseController {

    @Autowired
    private EduCourseService courseService;

    @ApiOperation(value = "添加课程信息")
    @PostMapping("addCourseInfo")
    public R addCourseInfo(@RequestBody CourseInfoForm courseInfoForm){
        courseService.addCourseInfo(courseInfoForm);
        return R.ok();
    }

}



