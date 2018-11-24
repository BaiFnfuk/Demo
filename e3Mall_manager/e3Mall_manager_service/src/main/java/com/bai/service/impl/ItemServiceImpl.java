package com.bai.service.impl;

import com.bai.mapper.TbItemMapper;
import com.bai.pojo.TbItem;
import com.bai.service.ItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("itemService")
public class ItemServiceImpl implements ItemService {

    @Resource(name = "tbItemMapper")
    private TbItemMapper tbItemMapper;

    @Override
    public TbItem getItemById(Long itemId) {
        TbItem tbItem = null;
        if (itemId != null) {
            tbItem = tbItemMapper.selectByPrimaryKey(itemId);
        }
        return tbItem;
    }
}
