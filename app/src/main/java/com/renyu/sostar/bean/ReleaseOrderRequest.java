package com.renyu.sostar.bean;

import android.os.Build;

import com.renyu.commonlibrary.commonutils.Utils;
import com.renyu.sostar.BuildConfig;

import java.io.Serializable;
import java.util.List;

/**
 * Created by renyu on 2017/3/9.
 */

public class ReleaseOrderRequest implements Serializable {

    /**
     * deviceId : string
     * param : {"address":"string","aggregateAddress":"string","aggregateTime":"string","confirmFlg":"string","description":"string","endTime":"string","jobType":"string","latitude":"string","longitude":"string","orderRange":"string","orderStatus":"string","paymentType":"string","periodTimeList":[{"endTime":"string","startTime":"string"}],"picListArray":["string"],"sex":"string","staffAccount":0,"startTime":"string","unitPrice":0,"unitPriceType":"string","userId":"string"}
     * platform : string
     * sysversion : string
     * ver : string
     */

    private String deviceId = Utils.getUniquePsuedoID();
    private ParamBean param;
    private String platform = "android";
    private String sysversion = Build.VERSION.RELEASE;
    private String ver = BuildConfig.VERSION_NAME;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public ParamBean getParam() {
        return param;
    }

    public void setParam(ParamBean param) {
        this.param = param;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getSysversion() {
        return sysversion;
    }

    public void setSysversion(String sysversion) {
        this.sysversion = sysversion;
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public static class ParamBean implements Serializable {
        /**
         * address : string
         * aggregateAddress : string
         * aggregateTime : string
         * confirmFlg : string
         * description : string
         * endTime : string
         * jobType : string
         * latitude : string
         * longitude : string
         * orderRange : string
         * orderStatus : string
         * paymentType : string
         * periodTimeList : [{"endTime":"string","startTime":"string"}]
         * picListArray : ["string"]
         * sex : string
         * staffAccount : 0
         * startTime : string
         * unitPrice : 0
         * unitPriceType : string
         * userId : string
         */

        private String orderId;
        private String address;
        private String aggregateAddress;
        private String aggregateTime;
        private String confirmFlg;
        private String description;
        private String endTime;
        private String jobType;
        private String latitude;
        private String longitude;
        private String orderRange;
        private String orderStatus;
        private String paymentType;
        private String sex;
        private int staffAccount;
        private String startTime;
        private String unitPrice;
        private String unitPriceType;
        private String userId;
        private List<PeriodTimeListBean> periodTimeList;
        private List<String> picListArray;

        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getAggregateAddress() {
            return aggregateAddress;
        }

        public void setAggregateAddress(String aggregateAddress) {
            this.aggregateAddress = aggregateAddress;
        }

        public String getAggregateTime() {
            return aggregateTime;
        }

        public void setAggregateTime(String aggregateTime) {
            this.aggregateTime = aggregateTime;
        }

        public String getConfirmFlg() {
            return confirmFlg;
        }

        public void setConfirmFlg(String confirmFlg) {
            this.confirmFlg = confirmFlg;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getEndTime() {
            return endTime;
        }

        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }

        public String getJobType() {
            return jobType;
        }

        public void setJobType(String jobType) {
            this.jobType = jobType;
        }

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

        public String getOrderRange() {
            return orderRange;
        }

        public void setOrderRange(String orderRange) {
            this.orderRange = orderRange;
        }

        public String getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
        }

        public String getPaymentType() {
            return paymentType;
        }

        public void setPaymentType(String paymentType) {
            this.paymentType = paymentType;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public int getStaffAccount() {
            return staffAccount;
        }

        public void setStaffAccount(int staffAccount) {
            this.staffAccount = staffAccount;
        }

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public String getUnitPrice() {
            return unitPrice;
        }

        public void setUnitPrice(String unitPrice) {
            this.unitPrice = unitPrice;
        }

        public String getUnitPriceType() {
            return unitPriceType;
        }

        public void setUnitPriceType(String unitPriceType) {
            this.unitPriceType = unitPriceType;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public List<PeriodTimeListBean> getPeriodTimeList() {
            return periodTimeList;
        }

        public void setPeriodTimeList(List<PeriodTimeListBean> periodTimeList) {
            this.periodTimeList = periodTimeList;
        }

        public List<String> getPicListArray() {
            return picListArray;
        }

        public void setPicListArray(List<String> picListArray) {
            this.picListArray = picListArray;
        }

        public static class PeriodTimeListBean implements Serializable {
            /**
             * endTime : string
             * startTime : string
             */

            private String endTime;
            private String startTime;

            public String getEndTime() {
                return endTime;
            }

            public void setEndTime(String endTime) {
                this.endTime = endTime;
            }

            public String getStartTime() {
                return startTime;
            }

            public void setStartTime(String startTime) {
                this.startTime = startTime;
            }
        }
    }
}
