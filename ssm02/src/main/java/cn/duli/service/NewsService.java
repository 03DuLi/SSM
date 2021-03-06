package cn.duli.service;

import cn.duli.pojo.News;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewsService {
    /**
     * 查询所有新闻列表
     * @return
     */
    List<News> queryAll();

    /**
     * 根据新闻id删除新闻
     * @param id
     */
    void deleteOne(Integer id);

    /**
     * 根据新闻标题模糊查询
     * @param title
     * @return
     */
    List<News> queryLikeByTitle(@Param("title") String title);

    /**
     * 发布新闻
     * @param news
     * @return
     */
    void insertOne(News news);

    /**
     * 根据新闻Id回显内容
     * @param id
     * @return
     */
    News selectById(Integer id);

    /**
     * 更新新闻信息
     * @param news
     */
    void updateOne(News news);

    /**
     * 批量删除
     * @param id
     */
    void batchDelete(List<Integer> id);


    /**
     * 前台部分
     */


    /**
     * 查询最新发布的前7条新闻
     * @return
     */

    List<News> queryLimit();

    /**
     * 查询前7条国际新闻
     * @return
     */
    List<News> queryCategoryName();

    /**
     * 查询前7条点击排行
     * @return
     */
    List<News> queryYule();

    /**
     * 查询前7条国内新闻
     * @return
     */
    List<News> queryOwnNews();

    /**
     * 查询前5条军事新闻
     * @return
     */
    List<News> queryMilitary();

    /**
     * 查询某个类别下的新闻
     * @return
     */
    List<News> queryCategoryById(Integer categoryid);
}
