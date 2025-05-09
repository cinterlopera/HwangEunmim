package top.d7c.springboot.client.services.sys;

import java.util.List;

import top.d7c.plugins.core.PageData;
import top.d7c.plugins.core.PageResult;
import top.d7c.plugins.core.context.BaseService;
import top.d7c.springboot.common.dos.sys.SysImg;

/**
 * @Title: SysImgService
 * @Package: top.d7c.springboot.client.services.sys
 * @Description: d7c 系统_图片管理 Service
 * @author: 吴佳隆
 * @date: 2019年06月18日 08:57:30
 */
public interface SysImgService extends BaseService<SysImg, Long> {

    /**
     * @Title: listByImgType
     * @author: 吴佳隆
     * @data: 2020年4月28日 下午5:07:41
     * @Description: 根据图片类型查询图片列表
     * @param pd
     * @return List<PageData>
     */
    List<PageData> listByImgType(PageData pd);

    /**
     * @Title: updateStatus
     * @author: 吴佳隆
     * @data: 2020年4月16日 下午5:32:05
     * @Description: 软删除图片
     * @param pd
     * @return PageResult
     */
    PageResult updateStatus(PageData pd);

    /**
     * @Title: delBatch
     * @author: 吴佳隆
     * @data: 2020年4月28日 下午7:29:29
     * @Description: 批量从图片服务器删除图片
     * @param pd
     * @return PageResult
     */
    PageResult delBatch(PageData pd);

}