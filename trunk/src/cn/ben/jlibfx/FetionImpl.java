
package cn.ben.jlibfx;

import cn.ben.jlibfx.FxAccount.FxStatus;

/**
 * 
 * @author Ben.Pang
 */
class FetionImpl extends AbstractFetion {

    public FxUserInfo getUserInfo(FxAccount account) throws FxException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public FxUserInfo getSelfUserInfo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void login(String number, String password) throws FxException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void login(String number, String password, FxStatus status) throws FxException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void logout() throws FxException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public FxDialog beginDialog(FxAccount account) throws FxException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public FxDialog beginDialog(FxAccount[] accounts) throws FxException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public FxDialog beginDialog(FxGroup group) throws FxException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void endDialog(FxDialog dialog) throws FxException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    boolean addBuddyToGroup(GroupImpl group, FxAccount account) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    boolean addGroup(FxGroup group) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    boolean removeBuddyToGroup(GroupImpl aThis, FxAccount account) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    boolean removeGroup(FxGroup group) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    void send(FxMessage msg) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    void sendSMS(FxMessage msg) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    void setLocalname(AccountImpl aThis, String localname) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    void setStatus(AccountImpl aThis, FxStatus status) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

}
