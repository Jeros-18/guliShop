package com.atjh.eduService.controller;

import com.atjh.commonUtils.R;
import com.atjh.eduService.service.EduSubjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@Api(description="课程分类管理")
@CrossOrigin //跨域
@RestController
@RequestMapping("/eduservice/subject")
public class SubjectAdminController {

    @Autowired
    private EduSubjectService subjectService;

    //批量导入课程分类
    @ApiOperation(value = "Excel批量导入")
    @PostMapping("addSubject")
    public R addSubject(MultipartFile file) {
        //1 获取上传的excel文件 MultipartFile
        //返回错误提示信息
//        subjectService.importSubjectData(file,subjectService);
        subjectService.addSubject(file,subjectService);
        //判断返回集合是否为空
        return R.ok();
    }
}
