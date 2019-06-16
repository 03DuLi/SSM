package cn.duli.service.impl;

import cn.duli.mapper.NewsMapper;
import cn.duli.pojo.News;
import cn.duli.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("newsService")
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;

    public List<News> queryAll(){
        return newsMapper.queryAll();
    }

    @Override
    public void deleteOne(Integer id) {
        newsMapper.deleteOne(id);
    }

    @Override
    public List<News> queryLikeByTitle(String title) {
        return newsMapper.queryLikeByTitle(title);
    }

    @Override
    public void insertOne(News news) {
        newsMapper.insertOne(news);
    }

    @Override
    public News selectById(Integer id) {
        return newsMapper.selectById(id);
    }

    @Override
    public void updateOne(News news) {
        newsMapper.updateOne(news);
    }

    @Override
    public void batchDelete(List<Integer> id) {
        newsMapper.batchDelete(id);
    }


}