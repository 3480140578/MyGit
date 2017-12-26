package com.example.jiachengbing.mygit.bean;

import java.util.List;

/**
 * User: 张亚博
 * Date: 2017-11-23 16:17
 * Description：
 */
public class getPinLun {

    /**
     * msg : 成功
     * ret : {"pnum":1,"totalRecords":8,"records":20,"list":[{"msg":"不错，期待谍5","phoneNumber":"端木若鱼","dataId":"ff8080815e192b12015e242cce76192c","userPic":"http://phonemovie.ks3-cn-beijing.ksyun.com/%2Fupload/memberPic/2017/08/19/1503076615895798927.jpg","time":"2017-08-27 22:51:09","likeNum":0},{"msg":"太太好看看了","phoneNumber":"灰谐","dataId":"ff8080815cb03cdc015cdf3723f700f6","userPic":"http://wx.qlogo.cn/mmopen/PiajxSqBRaEIoGr2ia02Qk0FGt0YlgoVH9Mia9jjqfdZE4OiaEGuJEAtFQbianrRwu6Kib9Ky6ibPDbnTWuus5s28Fn0w/0","time":"2017-06-25 20:25:51","likeNum":4},{"msg":"小说","phoneNumber":"158****3473","dataId":"ff8080815cb03cdc015ccab5f2001eaa","userPic":"","time":"2017-06-21 20:52:20","likeNum":0},{"msg":"有人吗？","phoneNumber":"晓不得","dataId":"ff8080815c9b961b015ca6b2e218536c","userPic":"http://wx.qlogo.cn/mmopen/ajNVdqHZLLDM6ku7ibY0UUOoG2uQQpNrhdrlXfcmxia7e0ZVickwHKQELc19EDunVQpuRj2I2f0qSJv7BIBaiaURicg/0","time":"2017-06-14 21:02:40","likeNum":0},{"msg":"这部片子得抽空再看一遍才行，拍的挺好的。","phoneNumber":"静等一旧人","dataId":"ff8080815c7b49e6015c8722592d5cb6","userPic":"","time":"2017-05-29 18:56:34","likeNum":5},{"msg":"这片子早就应该看了，幸好没有错过这么好的片子。","phoneNumber":"陌路丢了谁","dataId":"ff8080815c7b49e6015c872259325cb8","userPic":"","time":"2017-05-23 16:56:34","likeNum":1},{"msg":"好几个朋友推荐这部电影给我，看完也就那样。。。","phoneNumber":"一人一心一世界","dataId":"ff8080815c7b49e6015c872259345cb9","userPic":"","time":"2017-05-20 20:56:34","likeNum":5},{"msg":"演员的表演很卖力嘛！","phoneNumber":"假如回忆不再","dataId":"ff8080815c7b49e6015c872259305cb7","userPic":"","time":"2017-05-09 22:13:34","likeNum":2}],"totalPnum":1}
     * code : 200
     */

    private String msg;
    private RetBean ret;
    private String code;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public RetBean getRet() {
        return ret;
    }

    public void setRet(RetBean ret) {
        this.ret = ret;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static class RetBean {
        /**
         * pnum : 1
         * totalRecords : 8
         * records : 20
         * list : [{"msg":"不错，期待谍5","phoneNumber":"端木若鱼","dataId":"ff8080815e192b12015e242cce76192c","userPic":"http://phonemovie.ks3-cn-beijing.ksyun.com/%2Fupload/memberPic/2017/08/19/1503076615895798927.jpg","time":"2017-08-27 22:51:09","likeNum":0},{"msg":"太太好看看了","phoneNumber":"灰谐","dataId":"ff8080815cb03cdc015cdf3723f700f6","userPic":"http://wx.qlogo.cn/mmopen/PiajxSqBRaEIoGr2ia02Qk0FGt0YlgoVH9Mia9jjqfdZE4OiaEGuJEAtFQbianrRwu6Kib9Ky6ibPDbnTWuus5s28Fn0w/0","time":"2017-06-25 20:25:51","likeNum":4},{"msg":"小说","phoneNumber":"158****3473","dataId":"ff8080815cb03cdc015ccab5f2001eaa","userPic":"","time":"2017-06-21 20:52:20","likeNum":0},{"msg":"有人吗？","phoneNumber":"晓不得","dataId":"ff8080815c9b961b015ca6b2e218536c","userPic":"http://wx.qlogo.cn/mmopen/ajNVdqHZLLDM6ku7ibY0UUOoG2uQQpNrhdrlXfcmxia7e0ZVickwHKQELc19EDunVQpuRj2I2f0qSJv7BIBaiaURicg/0","time":"2017-06-14 21:02:40","likeNum":0},{"msg":"这部片子得抽空再看一遍才行，拍的挺好的。","phoneNumber":"静等一旧人","dataId":"ff8080815c7b49e6015c8722592d5cb6","userPic":"","time":"2017-05-29 18:56:34","likeNum":5},{"msg":"这片子早就应该看了，幸好没有错过这么好的片子。","phoneNumber":"陌路丢了谁","dataId":"ff8080815c7b49e6015c872259325cb8","userPic":"","time":"2017-05-23 16:56:34","likeNum":1},{"msg":"好几个朋友推荐这部电影给我，看完也就那样。。。","phoneNumber":"一人一心一世界","dataId":"ff8080815c7b49e6015c872259345cb9","userPic":"","time":"2017-05-20 20:56:34","likeNum":5},{"msg":"演员的表演很卖力嘛！","phoneNumber":"假如回忆不再","dataId":"ff8080815c7b49e6015c872259305cb7","userPic":"","time":"2017-05-09 22:13:34","likeNum":2}]
         * totalPnum : 1
         */

        private int pnum;
        private int totalRecords;
        private int records;
        private int totalPnum;
        private List<ListBean> list;

        public int getPnum() {
            return pnum;
        }

        public void setPnum(int pnum) {
            this.pnum = pnum;
        }

        public int getTotalRecords() {
            return totalRecords;
        }

        public void setTotalRecords(int totalRecords) {
            this.totalRecords = totalRecords;
        }

        public int getRecords() {
            return records;
        }

        public void setRecords(int records) {
            this.records = records;
        }

        public int getTotalPnum() {
            return totalPnum;
        }

        public void setTotalPnum(int totalPnum) {
            this.totalPnum = totalPnum;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * msg : 不错，期待谍5
             * phoneNumber : 端木若鱼
             * dataId : ff8080815e192b12015e242cce76192c
             * userPic : http://phonemovie.ks3-cn-beijing.ksyun.com/%2Fupload/memberPic/2017/08/19/1503076615895798927.jpg
             * time : 2017-08-27 22:51:09
             * likeNum : 0
             */

            private String msg;
            private String phoneNumber;
            private String dataId;
            private String userPic;
            private String time;
            private int likeNum;

            public String getMsg() {
                return msg;
            }

            public void setMsg(String msg) {
                this.msg = msg;
            }

            public String getPhoneNumber() {
                return phoneNumber;
            }

            public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
            }

            public String getDataId() {
                return dataId;
            }

            public void setDataId(String dataId) {
                this.dataId = dataId;
            }

            public String getUserPic() {
                return userPic;
            }

            public void setUserPic(String userPic) {
                this.userPic = userPic;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public int getLikeNum() {
                return likeNum;
            }

            public void setLikeNum(int likeNum) {
                this.likeNum = likeNum;
            }
        }
    }
}
