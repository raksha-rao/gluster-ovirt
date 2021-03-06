package org.ovirt.engine.ui.webadmin.section.main.presenter.tab.gluster;

import org.ovirt.engine.core.common.businessentities.GlusterVolumeEntity;
import org.ovirt.engine.core.common.businessentities.permissions;
import org.ovirt.engine.ui.uicommonweb.models.configure.PermissionListModel;
import org.ovirt.engine.ui.uicommonweb.models.gluster.VolumeListModel;
import org.ovirt.engine.ui.webadmin.gin.ClientGinjector;
import org.ovirt.engine.ui.webadmin.place.ApplicationPlaces;
import org.ovirt.engine.ui.webadmin.section.main.presenter.AbstractSubTabPresenter;
import org.ovirt.engine.ui.webadmin.section.main.presenter.tab.VolumeSelectionChangeEvent;
import org.ovirt.engine.ui.webadmin.uicommon.model.SearchableDetailModelProvider;
import org.ovirt.engine.ui.webadmin.widget.tab.ModelBoundTabData;

import com.google.gwt.event.shared.EventBus;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.TabData;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.annotations.ProxyEvent;
import com.gwtplatform.mvp.client.annotations.TabInfo;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;
import com.gwtplatform.mvp.client.proxy.TabContentProxyPlace;

public class SubTabVolumePermissionPresenter extends AbstractSubTabPresenter<GlusterVolumeEntity, VolumeListModel, PermissionListModel, SubTabVolumePermissionPresenter.ViewDef, SubTabVolumePermissionPresenter.ProxyDef> {

    @TabInfo(container = VolumeSubTabPanelPresenter.class)
    static TabData getTabData(ClientGinjector ginjector) {
        return new ModelBoundTabData(ginjector.getApplicationConstants().volumePermissionSubTabLabel(), 3,
                ginjector.getSubTabVolumePermissionModelProvider());
    }

    @Inject
    public SubTabVolumePermissionPresenter(
            EventBus eventBus,
            ViewDef view,
            ProxyDef proxy,
            PlaceManager placeManager,
            SearchableDetailModelProvider<permissions, VolumeListModel, PermissionListModel> modelProvider) {
        super(eventBus, view, proxy, placeManager, modelProvider);
    }

    @ProxyCodeSplit
    @NameToken(ApplicationPlaces.volumePermissionSubTabPlace)
    public interface ProxyDef extends TabContentProxyPlace<SubTabVolumePermissionPresenter> {
    }

    public interface ViewDef extends AbstractSubTabPresenter.ViewDef<GlusterVolumeEntity> {
    }

    @Override
    protected PlaceRequest getMainTabRequest() {
        return new PlaceRequest(ApplicationPlaces.volumeMainTabPlace);
    }

    @Override
    protected void revealInParent() {
        RevealContentEvent.fire(this, VolumeSubTabPanelPresenter.TYPE_SetTabContent, this);
    }

    @ProxyEvent
    public void onVolumeSelectionChange(VolumeSelectionChangeEvent event) {
        updateMainTabSelection(event.getSelectedItems());
    }
}
