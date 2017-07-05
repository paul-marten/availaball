package com.paulmarten.availaball;

/**
 * Created by paulms on 6/16/2017.
 */
public class ViewJSON {
    public interface AccountInFutsalFieldView{}
    public interface RoleView extends AccountInFutsalFieldView{}
    public interface AccountView extends RoleView {}
    public interface FutsalFieldView extends AccountInFutsalFieldView{}
}
