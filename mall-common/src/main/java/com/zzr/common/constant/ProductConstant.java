package com.zzr.common.constant;

/**
 * 商品信息常量
 *
 * @author zhouzhirui
 * @email zzr2635373196@icloud.com
 * @date 2022/5/10 20:28
 */
public class ProductConstant {

    public enum AttrEnum {
        ATTR_TYPE_BASE(1, "基本属性"), ATTR_TYPE_SALE(0, "销售属性");
        private int code;
        private String msg;

        AttrEnum(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }

        public int getCode() {
            return code;
        }

        public String getMsg() {
            return msg;
        }
    }
}
