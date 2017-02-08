package cn.ucai.fulicenter.application;

public interface I {
    String SERVER_URL = "http://139.196.185.33:8080/FuLiCenterServer/Server";
    /**
     * 下拉刷新
     */
    int ACTION_DOWNLOAD = 0;
    /**
     * 第一次下载
     */
    int ACTION_PULL_DOWN = 1;
    /**
     * 上拉刷新
     */
    int ACTION_PULL_UP = 2;

    /**
     * 每行显示的数量columNum
     */
    int COLUM_NUM = 2;

    String AVATAR_SUFFIX_JPG = ".jpg";

    /**
     * 表示列表项布局的两种类型
     */
    int TYPE_ITEM = 0;
    int TYPE_FOOTER = 1;

    interface Boutique extends Goods {
        String ID = "id";
        String KEY_CAT_ID = "catId";
        String TITLE = "title";
        String DESCRIPTION = "description";
        String NAME = "name";
        String IMAGE_URL = "imageurl";
    }

    interface NewAndBoutiqueGoods {
        String CAT_ID = "cat_id";
        /**
         * 颜色id
         */
        String COLOR_ID = "color_id";
        /**
         * 颜色名
         */
        String COLOR_NAME = "color_name";
        /**
         * 颜色代码
         */
        String COLOR_CODE = "color_code";
        /**
         * 导购链接
         */
        String COLOR_URL = "color_url";
    }

    interface CategoryGroup {
        String ID = "id";
        String NAME = "name";
        String IMAGE_URL = "imageurl";
    }

    interface CategoryChild extends CategoryGroup {
        String PARENT_ID = "parent_id";
        String CAT_ID = "catId";
    }

    interface CategoryGood {
        String TABLE_NAME = "tb_category_good";
        String ID = "id";
        /**
         * 商品id
         */
        String GOODS_ID = "goods_id";
        /**
         * 所属类别的id
         */
        String CAT_ID = "cat_id";
        /**
         * 商品的中文名称
         */
        String GOODS_NAME = "goods_name";
        /**
         * 商品的英文名称
         */
        String GOODS_ENGLISH_NAME = "goods_english_name";
        /**
         * 商品简介
         */
        String GOODS_BRIEF = "goods_brief";
        /**
         * 商品原始价格
         */
        String SHOP_PRICE = "shop_price";
        /**
         * 商品的RMB价格
         */
        String CURRENT_PRICE = "currency_price";
        /**
         * 商品折扣价格
         */
        String PROMOTE_PRICE = "promote_price";
        /**
         * 人民币折扣价格
         */
        String RANK_PRICE = "rank_price";
        /**
         * 是否折扣
         */
        String IS_PROMOTE = "is_promote";
        /**
         * 商品缩略图地址
         */
        String GOODS_THUMB = "goods_thumb";
        /**
         * 商品图片地址
         */
        String GOODS_IMG = "goods_img";
        /**
         * 分享地址
         */
        String ADD_TIME = "add_time";
        /**
         * 分享地址
         */
        String SHARE_URL = "share_url";

    }

    interface Property {
        String ID = "id";
        String goodsId = "goods_id";
        String COLOR_ID = "colorid";
        String COLOR_NAME = "colorname";
        String COLOR_CODE = "colorcode";
        String COLOR_IMG = "colorimg";
        String COLOR_URL = "colorurl";
    }

    interface Album {
        String TABLE_NAME = "tb_album";
        String ID = "id";
        String PID = "pid";
        String IMG_ID = "img_id";
        String IMG_URL = "img_url";
        String THUMB_URL = "thumb_url";
        String IMG_DESC = "img_desc";
    }

    int CAT_ID = 0;

    /**
     * 商品排序方式
     */
    int SORT_BY_PRICE_ASC = 1;
    int SORT_BY_PRICE_DESC = 2;
    int SORT_BY_ADDTIME_ASC = 3;
    int SORT_BY_ADDTIME_DESC = 4;
    String ISON8859_1 = "iso8859-1";
    String UTF_8 = "utf-8";
    String PAGE_ID = "page_id";                        //分页的起始下标
    String PAGE_SIZE = "page_size";                    //分页的每页数量
    int PAGE_ID_DEFAULT = 0;                                //分页的起始下标默认值
    int PAGE_SIZE_DEFAULT = 10;                                //分页的每页数量默认值

    String QUESTION = "?";                            //问号
    String EQUAL = "=";                            //等号
    String MSG_PREFIX_MSG = "msg_";                         //消息码前缀

    String KEY_REQUEST = "request";

    /**
     * 从服务端查询精选首页的数据
     */
    String REQUEST_FIND_BOUTIQUES = "find_boutiques";
    /**
     * 从服务端查询新品或精选的商品
     */
    String REQUEST_FIND_NEW_BOUTIQUE_GOODS = "find_new_boutique_goods";

    /**
     * 从服务端下载tb_category_parent表的数据
     */
    String REQUEST_FIND_CATEGORY_GROUP = "find_category_group";

    /**
     * 从服务端下载tb_category_child表的数据
     */
    String REQUEST_FIND_CATEGORY_CHILDREN = "find_category_children";

    /** 从服务端下载一组商品详情的数据*/
    String REQUEST_FIND_GOODS_DETAILS_LIST="find_goods_details_list";

    /** 从服务端下载tb_category_good表的数据*/
    String REQUEST_FIND_GOODS_DETAILS="find_goods_details";
    /**
     * 下载商品相册图像的请求
     */
    String REQUEST_DOWNLOAD_ALBUM_IMG = "download_album_img_url";
    /**
     * 下载商品相册图像的接口
     */
    String DOWNLOAD_ALBUM_IMG_URL = I.SERVER_URL +
            "?request=" + REQUEST_DOWNLOAD_ALBUM_IMG + "&img_url=";

    /**下载新品首页商品图片的请求*/
    String REQUEST_DOWNLOAD_NEW_GOODS_IMG = "download_new_goods_img";

    /**下载新品首页商品图片的URL*/
    String DOWNLOAD_NEW_GOODS_IMG_URL = I.SERVER_URL +
            "?request=" + REQUEST_DOWNLOAD_NEW_GOODS_IMG + "&" +  Boutique.IMAGE_URL + "=";
    /**
     * 下载精选首页图像的请求
     */
    String REQUEST_DOWNLOAD_BOUTIQUE_IMG = "download_boutique_img";
    /**
     * 下载精选首页图像的接口
     */
    String DOWNLOAD_BOUTIQUE_IMG_URL = I.SERVER_URL +
            "?request=" + REQUEST_DOWNLOAD_BOUTIQUE_IMG + "&" + CategoryGroup.IMAGE_URL + "=";

    /**
     * 下载分类商品大类图像的请求
     */
    String REQUEST_DOWNLOAD_CATEGORY_GROUP_IMAGE = "download_category_group_image";
    /**
     * 下载分类商品大类图像的接口
     */
    String REQUEST_DOWNLOAD_CATEGORY_GROUP_IMAGE_URL = I.SERVER_URL +
            "?request=" + REQUEST_DOWNLOAD_CATEGORY_GROUP_IMAGE
            + "&" + CategoryGroup.IMAGE_URL + "=";

    /**
     * 下载分类商品小类图像的请求
     */
    String REQUEST_DOWNLOAD_CATEGORY_CHILD_IMAGE = "download_category_child_image";
    /**
     * 下载分类商品小类图像的接口
     */
    String REQUEST_DOWNLOAD_CATEGORY_CHILD_IMAGE_URL = I.SERVER_URL +
            "?request=" + REQUEST_DOWNLOAD_CATEGORY_CHILD_IMAGE
            + "&" + CategoryGroup.IMAGE_URL + "=";

    String TEXT_HTML = "text/html";

    interface Goods {
        String KEY_RESULT = "result";
        String RESPONSE_SUCCESS = "success";
        String KEY_INFO = "info";
        String KEY_GOODS = "goods";
        String KEY_CURRENCY_PRICE = "currency_price";
        String KEY_GOODS_ID = "goods_id";
        String KEY_GOODS_NAME = "goods_name";
        String KEY_ENGLISH_NAME = "english_name";

        String HINT_DOWNLOAD_TITLE = "加载商品信息";
        String HINT_DOWNLOADING = "加载中...";
        String HINT_DOWNLOAD_FAILURE = "加载数据失败";
    }

    interface NewGoods extends Goods {
        String KEY_THUMB_URL = "thumb";
        String HINT_DOWNLOAD_TITLE = "加载新品列表";
        String HINT_DOWNLOADING = "加载中...";
        String HINT_DOWNLOAD_FAILURE = "加载数据失败";
    }

    interface GoodsDetails extends Goods {
        String HINT_DOWNLOAD_TITLE = "加载商品详细信息";
        String KEY_CAT_ID = "cat_id";
        String KEY_ENGLISH_NAME = "goods_english_name";
        String KEY_GOODS_BRIEF = "goods_brief";
        String KEY_GOODS_DESC = "goods_desc";
        String KEY_GOODS_IMG = "goods_img";
        String KEY_GOODS_THUMB = "goods_thumb";
        String KEY_SHOP_PRICE = "shop_price";
        String KEY_PROPERTIES = "properties";
        String KEY_ALBUMS = "albums";
    }


    interface Category extends Goods {
        String HINT_DOWNLOAD_TITLE = "加载分类列表";
        String KEY_ID = "id";
        String KEY_NAME = "name";
        String KEY_COLOR_ID = "colorid";
        String KEY_COLOR_NAME = "colorname";

        String KEY_CAT_ID = "cat_id";
        String KEY_CATEGORY_INFO = "category_info";
        String PARAM_PAGE = "&page=";
        String PARAM_C_ID = "&c_id=";
        String PARAM_CAT_ID = "&cat_id=";
        String PARAM_ORDER_PRICE = "&order_price=";
        String PARAM_COLOR_ID = "&getcolorid=";

        int SORT_DEFAULT = 0;// 排序默认值
        int SORT_PRICE_ASC = 1;// 价格升序排序
        int SORT_PRICE_DESC = 2;// 价格降序排序
        int SORT_DATE_ASC = 3;// 日期升序排序
        int SORT_DATE_DESC = 4;// 日期降序排序

        int COLOR_DEFAULT = -1;// 排序默认值
    }

}
