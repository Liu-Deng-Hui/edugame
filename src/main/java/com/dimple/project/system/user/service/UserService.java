package com.dimple.project.system.user.service;

import com.dimple.project.system.user.domain.User;

import java.util.List;

/**
 * @className: UserService
 * @description: 用户 业务层
 * @auther: Dimple
 * @Date: 2019/3/13
 * @Version: 1.1
 */
 public interface UserService {
    /**
     * 根据条件分页查询用户对象
     *
     * @param user 用户信息
     * @return 用户信息集合信息
     */
     List<User> selectUserList(User user);

    /**
     * 通过用户名查询用户
     *
     * @param userName 用户名
     * @return 用户对象信息
     */
     User selectUserByLoginName(String userName);

    /**
     * 通过手机号码查询用户
     *
     * @param phoneNumber 手机号码
     * @return 用户对象信息
     */
     User selectUserByPhoneNumber(String phoneNumber);

    /**
     * 通过邮箱查询用户
     *
     * @param email 邮箱
     * @return 用户对象信息
     */
     User selectUserByEmail(String email);

    /**
     * 通过用户ID查询用户
     *
     * @param userId 用户ID
     * @return 用户对象信息
     */
     User selectUserById(Long userId);

    /**
     * 通过用户ID删除用户
     *
     * @param userId 用户ID
     * @return 结果
     */
     int deleteUserById(Long userId);

    /**
     * 批量删除用户信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     * @throws Exception 异常
     */
     int deleteUserByIds(String ids) throws Exception;

    /**
     * 保存用户信息
     *
     * @param user 用户信息
     * @return 结果
     */
     int insertUser(User user);

    /**
     * 保存用户信息
     *
     * @param user 用户信息
     * @return 结果
     */
     int updateUser(User user);

    /**
     * 修改用户详细信息
     *
     * @param user 用户信息
     * @return 结果
     */
     int updateUserInfo(User user);

    /**
     * 修改用户密码信息
     *
     * @param user 用户信息
     * @return 结果
     */
     int resetUserPwd(User user);

    /**
     * 校验用户名称是否唯一
     *
     * @param loginName 登录名称
     * @return 结果
     */
     String checkLoginNameUnique(String loginName);

    /**
     * 校验手机号码是否唯一
     *
     * @param user 用户信息
     * @return 结果
     */
     String checkPhoneUnique(User user);

    /**
     * 校验email是否唯一
     *
     * @param user 用户信息
     * @return 结果
     */
     String checkEmailUnique(User user);

    /**
     * 根据用户ID查询用户所属角色组
     *
     * @param userId 用户ID
     * @return 结果
     */
     String selectUserRoleGroup(Long userId);

    /**
     * 导入用户数据
     *
     * @param userList        用户数据列表
     * @param isUpdateSupport 是否更新支持，如果已存在，则进行更新数据
     * @return 结果
     */
     String importUser(List<User> userList, Boolean isUpdateSupport);

    /**
     * 用户状态修改
     *
     * @param user 用户信息
     * @return 结果
     */
     int changeStatus(User user);
}
