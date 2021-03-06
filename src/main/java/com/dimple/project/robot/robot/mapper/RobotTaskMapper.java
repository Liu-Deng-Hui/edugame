package com.dimple.project.robot.robot.mapper;

import com.dimple.project.robot.robot.domain.RobotTask;
import com.dimple.project.robot.robot.domain.RobotUser;

import java.util.List;


public interface RobotTaskMapper {
    /***
     * 查询最近一条task信息
     * @param groupid
     * @return
     */
    RobotTask selectRobotTask(String groupid);

    /***
     * 查询该task是否存在
     * @param task
     * @return
     */
    List<RobotTask> selectRobotTaskRepeat(RobotTask task);
    /***
     * 新增查询记录
     * @param task
     * @return
     */
    int insertRobotTask(RobotTask task);
    /***
     * 更新task
     * @param task
     * @return
     */
    int updateRobotTask(RobotTask task);

    /***
     * 根据id查询task
     * @param id
     * @return
     */
    RobotTask selectRobotTaskById(String id);

    /***
     * 更新logs次数
     * @param task
     * @return
     */
    int addRobotTaskLogs(RobotTask task);

    /***
     *查询 0 ，1状态 且入库时间为30秒内的入库信息
     */
    List<RobotTask> timeRobotTaskList();
}
