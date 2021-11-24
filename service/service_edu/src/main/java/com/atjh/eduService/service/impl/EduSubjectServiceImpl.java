package com.atjh.eduService.service.impl;

import com.alibaba.excel.EasyExcel;
import com.atjh.baseService.handler.GuliException;
import com.atjh.eduService.Listener.SubjectExcelListener;
import com.atjh.eduService.entity.EduSubject;
import com.atjh.eduService.entity.vo.ExcelSubjectData;
import com.atjh.eduService.mapper.EduSubjectMapper;
import com.atjh.eduService.service.EduSubjectService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

/**
 * <p>
 * 课程科目 服务实现类
 * </p>
 *
 * @author jahui
 * @since 2021-11-23
 */
@Service
public class EduSubjectServiceImpl extends ServiceImpl<EduSubjectMapper, EduSubject> implements EduSubjectService {
    /**
     * 批量导入课程分类
     * @param file
     * @param subjectService
     */
    @Override
    public void addSubject(MultipartFile file, EduSubjectService subjectService) {
        try {
            InputStream inputStream = file.getInputStream();
            EasyExcel.read(inputStream, ExcelSubjectData.class,
                    new SubjectExcelListener(subjectService)).sheet().doRead();
        } catch (IOException e) {
            e.printStackTrace();
            throw new GuliException(20001,"导入课程分类失败");
        }
    }

}
