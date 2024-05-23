package com.med.medai.model.dto.aiassistant;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;

/**
 * AI 问答助手信息表
 * @author lcx
 * @TableName ai_assistant
 */
@Data
public class AiAssistantUpdateRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 问题名称
     */
    private String questionName;

    /**
     * 问题概述
     */
    private String questionGoal;

    /**
     * 问答结果
     */
    private String questionResult;

    /**
     * 问题类型
     */
    private String questionType;

    /**
     * wait-等待,running-生成中,succeed-成功生成,failed-生成失败
     */
    private String questionStatus;

    /**
     * 执行信息
     */
    private String execMessage;

    /**
     * 创建用户 id
     */
    private Long userId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}