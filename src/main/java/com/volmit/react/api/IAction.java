package com.volmit.react.api;

import com.volmit.react.util.AccessCallback;
import org.bukkit.inventory.ItemStack;
import primal.lang.collection.GMap;

public interface IAction {
    ItemStack getIcon();

    String getName();

    String getDescription();

    ActionHandle getHandleType();

    void act(IActionSource source, ISelector... selectors) throws ActionAlreadyRunningException;

    void enact(IActionSource source, ISelector... selectors);

    ActionState getState();

    ActionTargetType getTarget();

    String[] getNodes();

    void setNodes(String... nodes);

    String getStatus();

    void setStatus(String status);

    double getProgress();

    void setProgress(double progress);

    ActionType getType();

    GMap<Class<?>, AccessCallback<ISelector>> getDefaultSelectors();

    void setDefaultSelector(Class<?> clazz, AccessCallback<ISelector> selector);

    ISelector[] biselect(ISelector... selectors);

    IActionSource getCurrentSource();

    void completeAction();
}
