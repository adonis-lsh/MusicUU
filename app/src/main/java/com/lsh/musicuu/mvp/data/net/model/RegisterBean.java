package com.lsh.musicuu.mvp.data.net.model;

/**
 * Created by "小灰灰"
 * on 22/2/2017 17:01
 * 邮箱：www.adonis_lsh.com
 */

public class RegisterBean {

    /**
     * Took : 16
     * result : {"ResultCode":"200","ResultMsg":"注册成功"}
     * data : {"Uid":"a8731032-341a-4833-97ab-bbc5e24c637b","NickName":"FN636233796356645597"}
     */

    public int Took;
    public ResultBean result;
    public DataBean data;

    public static class ResultBean {
        /**
         * ResultCode : 200
         * ResultMsg : 注册成功
         */

        public String ResultCode;
        public String ResultMsg;

        @Override
        public String toString() {
            return "ResultBean{" +
                    "ResultCode='" + ResultCode + '\'' +
                    ", ResultMsg='" + ResultMsg + '\'' +
                    '}';
        }
    }

    public static class DataBean {
        /**
         * Uid : a8731032-341a-4833-97ab-bbc5e24c637b
         * NickName : FN636233796356645597
         */

        public String Uid;
        public String NickName;

        @Override
        public String toString() {
            return "DataBean{" +
                    "Uid='" + Uid + '\'' +
                    ", NickName='" + NickName + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "RegisterBean{" +
                "Took=" + Took +
                ", result=" + result +
                ", data=" + data +
                '}';
    }
}
