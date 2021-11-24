package com.atjh.eduService.service;

import com.atjh.eduService.entity.EduSubject;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;

/**
 * <p>
 * 课程科目 服务类
 * </p>
 *
 * @author jahui
 * @since 2021-11-23
 */
public interface EduSubjectService extends IService<EduSubject> {
    /**
     * 批量导入课程分类
     * @param file
     * @param subjectService
     */
    void addSubject(MultipartFile file, EduSubjectService subjectService);

}
