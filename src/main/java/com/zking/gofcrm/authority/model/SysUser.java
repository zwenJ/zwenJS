package com.zking.gofcrm.authority.model;

import org.apache.ibatis.type.Alias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sys_user
 *
 * @mbg.generated do_not_delete_during_merge
 */
@Component
public class SysUser implements Serializable {

    /**
     * Database Column Remarks:
     *   用户编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.user_id
     *
     * @mbg.generated
     */
    private String userId;

    /**
     * Database Column Remarks:
     *   用户姓名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.user_name
     *
     * @mbg.generated
     */
    private String userName;

    /**
     * Database Column Remarks:
     *   用户密码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.user_pwd
     *
     * @mbg.generated
     */
    private String userPwd;

    /**
     * Database Column Remarks:
     *   用户状态 0代表可用 1代表不可用
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.user_flag
     *
     * @mbg.generated
     */
    private Integer userFlag;

    /**
     * 添加该用户的用户编号
     */
    private String userAddId;


    /**
     * 用户的角色
     */

    private List<SysRole> roleList = new ArrayList<SysRole>();

    public SysUser() {

    }

    public SysUser(String userName, String userPwd) {
        this.userName = userName;
        this.userPwd = userPwd;
    }

    public List<SysRole> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<SysRole> roleList) {
        this.roleList = roleList;
    }

    public String getUserAddId() {
        return userAddId;
    }

    public void setUserAddId(String userAddId) {
        this.userAddId = userAddId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.user_id
     *
     * @return the value of sys_user.user_id
     *
     * @mbg.generated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.user_id
     *
     * @param userId the value for sys_user.user_id
     *
     * @mbg.generated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.user_name
     *
     * @return the value of sys_user.user_name
     *
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.user_name
     *
     * @param userName the value for sys_user.user_name
     *
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.user_pwd
     *
     * @return the value of sys_user.user_pwd
     *
     * @mbg.generated
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.user_pwd
     *
     * @param userPwd the value for sys_user.user_pwd
     *
     * @mbg.generated
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.user_flag
     *
     * @return the value of sys_user.user_flag
     *
     * @mbg.generated
     */
    public String getUserFlag() {
        switch (userFlag){
            case 0:
                return "可用";
            case 1:
                return "不可用";
            default:
                return userFlag.toString();
        }
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.user_flag
     *
     * @param userFlag the value for sys_user.user_flag
     *
     * @mbg.generated
     */
    public void setUserFlag(Integer userFlag) {
        this.userFlag = userFlag;
    }


    @Override
    public String toString() {
        return "SysUser{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userFlag=" + userFlag +
                ", userAddId='" + userAddId + '\'' +
                ", roleList=" + roleList +
                '}';
    }

}