package com.xznn.service;


import com.xznn.mapper.PmsBrandMapper;
import com.xznn.mapper.PmsProductMapper;
import com.xznn.model.PmsBrand;
import com.xznn.model.PmsBrandExample;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 商品品牌Service实现类
 * Created by macro on 2018/4/26.
 */
@Service
public class PmsBrandService {
    @Autowired
    private PmsBrandMapper brandMapper;

    public List<PmsBrand> listAllBrand() {
        return brandMapper.selectByExample(new PmsBrandExample());
    }

}
