package org.firststep;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;

public class helloImComing extends AnAction {
    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        // 弹窗显示消息
        Messages.showMessageDialog("选择要生成的代码",
                "Jaker's Mapper Generator", Messages.getInformationIcon());
    }
}
