package com.example.apollographqltutorial.databinding;
import com.example.apollographqltutorial.R;
import com.example.apollographqltutorial.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LaunchDetailsBindingImpl extends LaunchDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.mainCl, 9);
        sViewsWithIds.put(R.id.character_details_fetch_progress, 10);
        sViewsWithIds.put(R.id.character_details_not_found, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LaunchDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private LaunchDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ProgressBar) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[5]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[7]
            );
        this.descriptionTv.setTag(null);
        this.flickerIv.setTag(null);
        this.idTv.setTag(null);
        this.launchStatusTv.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.missionDateValTv.setTag(null);
        this.missionNameValTv.setTag(null);
        this.rocketNameTv.setTag(null);
        this.siteNameTv.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.query == variableId) {
            setQuery((com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Data) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setQuery(@Nullable com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Data Query) {
        this.mQuery = Query;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.query);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String queryLaunchLaunchDateLocalToString = null;
        boolean queryLaunchLinksFlickrImagesSizeInt0 = false;
        java.lang.String queryLaunchLaunchSiteSiteName = null;
        java.lang.String javaLangStringDescriptionQueryLaunchDetails = null;
        com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Data query = mQuery;
        java.lang.Boolean queryLaunchLaunchSuccess = null;
        boolean queryLaunchLaunchSiteSiteNameLengthInt0 = false;
        java.lang.String queryLaunchRocketRocketName = null;
        java.lang.String queryLaunchRocketRocketNameLengthInt0JavaLangStringRocketNameQueryLaunchRocketRocketNameJavaLangStringRocketNameNA = null;
        java.lang.String javaLangStringStatusQueryLaunchLaunchSuccess = null;
        com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Launch_site queryLaunchLaunchSite = null;
        java.lang.String queryLaunchLaunchDateLocalToStringLengthInt0JavaLangStringDateQueryLaunchLaunchDateLocalJavaLangStringDateNA = null;
        boolean queryLaunchDetailsLengthInt0 = false;
        java.lang.String queryLaunchLaunchSiteSiteNameLengthInt0JavaLangStringSiteNameQueryLaunchLaunchSiteSiteNameJavaLangStringSiteNameNA = null;
        com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Links queryLaunchLinks = null;
        int queryLaunchLinksFlickrImagesSize = 0;
        java.lang.String queryLaunchMissionNameLengthInt0JavaLangStringNameQueryLaunchMissionNameJavaLangStringNameNA = null;
        java.lang.Object queryLaunchLaunchDateLocal = null;
        com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Launch queryLaunch = null;
        java.lang.String queryLaunchId = null;
        int queryLaunchMissionNameLength = 0;
        java.lang.String queryLaunchLinksFlickrImagesSizeInt0QueryLaunchLinksFlickrImagesGetInt0JavaLangObjectNull = null;
        boolean queryLaunchLaunchDateLocalToStringLengthInt0 = false;
        int queryLaunchRocketRocketNameLength = 0;
        boolean queryLaunchLaunchSuccessJavaLangObjectNull = false;
        boolean queryLaunchRocketRocketNameLengthInt0 = false;
        int queryLaunchLaunchSiteSiteNameLength = 0;
        java.lang.String javaLangStringNameQueryLaunchMissionName = null;
        java.lang.String queryLaunchDetails = null;
        boolean queryLaunchMissionNameLengthInt0 = false;
        com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Rocket queryLaunchRocket = null;
        java.lang.String javaLangStringDateQueryLaunchLaunchDateLocal = null;
        java.lang.String javaLangStringIDQueryLaunchId = null;
        int queryLaunchDetailsLength = 0;
        java.lang.String queryLaunchLaunchSuccessJavaLangObjectNullJavaLangStringStatusQueryLaunchLaunchSuccessJavaLangStringStatusNA = null;
        java.util.List<java.lang.String> queryLaunchLinksFlickrImages = null;
        java.lang.String javaLangStringRocketNameQueryLaunchRocketRocketName = null;
        java.lang.String queryLaunchLinksFlickrImagesGetInt0 = null;
        java.lang.String javaLangStringSiteNameQueryLaunchLaunchSiteSiteName = null;
        int queryLaunchLaunchDateLocalToStringLength = 0;
        java.lang.String queryLaunchMissionName = null;
        java.lang.String queryLaunchDetailsLengthInt0JavaLangStringDescriptionQueryLaunchDetailsJavaLangStringDescriptionNA = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (query != null) {
                    // read query.launch
                    queryLaunch = query.getLaunch();
                }


                if (queryLaunch != null) {
                    // read query.launch.launch_success
                    queryLaunchLaunchSuccess = queryLaunch.getLaunch_success();
                    // read query.launch.launch_site
                    queryLaunchLaunchSite = queryLaunch.getLaunch_site();
                    // read query.launch.links
                    queryLaunchLinks = queryLaunch.getLinks();
                    // read query.launch.launch_date_local
                    queryLaunchLaunchDateLocal = queryLaunch.getLaunch_date_local();
                    // read query.launch.id
                    queryLaunchId = queryLaunch.getId();
                    // read query.launch.details
                    queryLaunchDetails = queryLaunch.getDetails();
                    // read query.launch.rocket
                    queryLaunchRocket = queryLaunch.getRocket();
                    // read query.launch.mission_name
                    queryLaunchMissionName = queryLaunch.getMission_name();
                }


                // read query.launch.launch_success != null
                queryLaunchLaunchSuccessJavaLangObjectNull = (queryLaunchLaunchSuccess) != (null);
                // read ("ID:  ") + (query.launch.id)
                javaLangStringIDQueryLaunchId = ("ID:  ") + (queryLaunchId);
            if((dirtyFlags & 0x3L) != 0) {
                if(queryLaunchLaunchSuccessJavaLangObjectNull) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }
                if (queryLaunchLaunchSite != null) {
                    // read query.launch.launch_site.site_name
                    queryLaunchLaunchSiteSiteName = queryLaunchLaunchSite.getSite_name();
                }
                if (queryLaunchLinks != null) {
                    // read query.launch.links.flickr_images
                    queryLaunchLinksFlickrImages = queryLaunchLinks.getFlickr_images();
                }
                if (queryLaunchLaunchDateLocal != null) {
                    // read query.launch.launch_date_local.toString()
                    queryLaunchLaunchDateLocalToString = queryLaunchLaunchDateLocal.toString();
                }
                if (queryLaunchDetails != null) {
                    // read query.launch.details.length()
                    queryLaunchDetailsLength = queryLaunchDetails.length();
                }
                if (queryLaunchRocket != null) {
                    // read query.launch.rocket.rocket_name
                    queryLaunchRocketRocketName = queryLaunchRocket.getRocket_name();
                }
                if (queryLaunchMissionName != null) {
                    // read query.launch.mission_name.length()
                    queryLaunchMissionNameLength = queryLaunchMissionName.length();
                }


                if (queryLaunchLaunchSiteSiteName != null) {
                    // read query.launch.launch_site.site_name.length()
                    queryLaunchLaunchSiteSiteNameLength = queryLaunchLaunchSiteSiteName.length();
                }
                if (queryLaunchLinksFlickrImages != null) {
                    // read query.launch.links.flickr_images.size()
                    queryLaunchLinksFlickrImagesSize = queryLaunchLinksFlickrImages.size();
                }
                if (queryLaunchLaunchDateLocalToString != null) {
                    // read query.launch.launch_date_local.toString().length()
                    queryLaunchLaunchDateLocalToStringLength = queryLaunchLaunchDateLocalToString.length();
                }
                // read query.launch.details.length() > 0
                queryLaunchDetailsLengthInt0 = (queryLaunchDetailsLength) > (0);
                // read query.launch.mission_name.length() > 0
                queryLaunchMissionNameLengthInt0 = (queryLaunchMissionNameLength) > (0);
            if((dirtyFlags & 0x3L) != 0) {
                if(queryLaunchDetailsLengthInt0) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(queryLaunchMissionNameLengthInt0) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }
                if (queryLaunchRocketRocketName != null) {
                    // read query.launch.rocket.rocket_name.length()
                    queryLaunchRocketRocketNameLength = queryLaunchRocketRocketName.length();
                }


                // read query.launch.launch_site.site_name.length() > 0
                queryLaunchLaunchSiteSiteNameLengthInt0 = (queryLaunchLaunchSiteSiteNameLength) > (0);
                // read query.launch.links.flickr_images.size() > 0
                queryLaunchLinksFlickrImagesSizeInt0 = (queryLaunchLinksFlickrImagesSize) > (0);
                // read query.launch.launch_date_local.toString().length() > 0
                queryLaunchLaunchDateLocalToStringLengthInt0 = (queryLaunchLaunchDateLocalToStringLength) > (0);
                // read query.launch.rocket.rocket_name.length() > 0
                queryLaunchRocketRocketNameLengthInt0 = (queryLaunchRocketRocketNameLength) > (0);
            if((dirtyFlags & 0x3L) != 0) {
                if(queryLaunchLaunchSiteSiteNameLengthInt0) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(queryLaunchLinksFlickrImagesSizeInt0) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(queryLaunchLaunchDateLocalToStringLengthInt0) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(queryLaunchRocketRocketNameLengthInt0) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x8000L) != 0) {

                // read ("Description:  ") + (query.launch.details)
                javaLangStringDescriptionQueryLaunchDetails = ("Description:  ") + (queryLaunchDetails);
        }
        if ((dirtyFlags & 0x2000L) != 0) {

                // read ("Status:  ") + (query.launch.launch_success)
                javaLangStringStatusQueryLaunchLaunchSuccess = ("Status:  ") + (queryLaunchLaunchSuccess);
        }
        if ((dirtyFlags & 0x200L) != 0) {

                // read ("Name:  ") + (query.launch.mission_name)
                javaLangStringNameQueryLaunchMissionName = ("Name:  ") + (queryLaunchMissionName);
        }
        if ((dirtyFlags & 0x20L) != 0) {

                // read ("Date:  ") + (query.launch.launch_date_local)
                javaLangStringDateQueryLaunchLaunchDateLocal = ("Date:  ") + (queryLaunchLaunchDateLocal);
        }
        if ((dirtyFlags & 0x8L) != 0) {

                // read ("Rocket Name:  ") + (query.launch.rocket.rocket_name)
                javaLangStringRocketNameQueryLaunchRocketRocketName = ("Rocket Name:  ") + (queryLaunchRocketRocketName);
        }
        if ((dirtyFlags & 0x800L) != 0) {

                if (queryLaunchLinksFlickrImages != null) {
                    // read query.launch.links.flickr_images.get(0)
                    queryLaunchLinksFlickrImagesGetInt0 = queryLaunchLinksFlickrImages.get(0);
                }
        }
        if ((dirtyFlags & 0x80L) != 0) {

                // read ("Site Name:  ") + (query.launch.launch_site.site_name)
                javaLangStringSiteNameQueryLaunchLaunchSiteSiteName = ("Site Name:  ") + (queryLaunchLaunchSiteSiteName);
        }

        if ((dirtyFlags & 0x3L) != 0) {

                // read query.launch.rocket.rocket_name.length() > 0 ? ("Rocket Name:  ") + (query.launch.rocket.rocket_name) : "Rocket Name:  N/A"
                queryLaunchRocketRocketNameLengthInt0JavaLangStringRocketNameQueryLaunchRocketRocketNameJavaLangStringRocketNameNA = ((queryLaunchRocketRocketNameLengthInt0) ? (javaLangStringRocketNameQueryLaunchRocketRocketName) : ("Rocket Name:  N/A"));
                // read query.launch.launch_date_local.toString().length() > 0 ? ("Date:  ") + (query.launch.launch_date_local) : "Date:  N/A"
                queryLaunchLaunchDateLocalToStringLengthInt0JavaLangStringDateQueryLaunchLaunchDateLocalJavaLangStringDateNA = ((queryLaunchLaunchDateLocalToStringLengthInt0) ? (javaLangStringDateQueryLaunchLaunchDateLocal) : ("Date:  N/A"));
                // read query.launch.launch_site.site_name.length() > 0 ? ("Site Name:  ") + (query.launch.launch_site.site_name) : "Site Name:  N/A"
                queryLaunchLaunchSiteSiteNameLengthInt0JavaLangStringSiteNameQueryLaunchLaunchSiteSiteNameJavaLangStringSiteNameNA = ((queryLaunchLaunchSiteSiteNameLengthInt0) ? (javaLangStringSiteNameQueryLaunchLaunchSiteSiteName) : ("Site Name:  N/A"));
                // read query.launch.mission_name.length() > 0 ? ("Name:  ") + (query.launch.mission_name) : "Name:  N/A"
                queryLaunchMissionNameLengthInt0JavaLangStringNameQueryLaunchMissionNameJavaLangStringNameNA = ((queryLaunchMissionNameLengthInt0) ? (javaLangStringNameQueryLaunchMissionName) : ("Name:  N/A"));
                // read query.launch.links.flickr_images.size() > 0 ? query.launch.links.flickr_images.get(0) : null
                queryLaunchLinksFlickrImagesSizeInt0QueryLaunchLinksFlickrImagesGetInt0JavaLangObjectNull = ((queryLaunchLinksFlickrImagesSizeInt0) ? (queryLaunchLinksFlickrImagesGetInt0) : (null));
                // read query.launch.launch_success != null ? ("Status:  ") + (query.launch.launch_success) : "Status:  N/A"
                queryLaunchLaunchSuccessJavaLangObjectNullJavaLangStringStatusQueryLaunchLaunchSuccessJavaLangStringStatusNA = ((queryLaunchLaunchSuccessJavaLangObjectNull) ? (javaLangStringStatusQueryLaunchLaunchSuccess) : ("Status:  N/A"));
                // read query.launch.details.length() > 0 ? ("Description:  ") + (query.launch.details) : "Description:  N/A"
                queryLaunchDetailsLengthInt0JavaLangStringDescriptionQueryLaunchDetailsJavaLangStringDescriptionNA = ((queryLaunchDetailsLengthInt0) ? (javaLangStringDescriptionQueryLaunchDetails) : ("Description:  N/A"));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.descriptionTv, queryLaunchDetailsLengthInt0JavaLangStringDescriptionQueryLaunchDetailsJavaLangStringDescriptionNA);
            com.example.apollographqltutorial.view.ui.LaunchDetailsFragmentKt.setImageUrl(this.flickerIv, queryLaunchLinksFlickrImagesSizeInt0QueryLaunchLinksFlickrImagesGetInt0JavaLangObjectNull);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.idTv, javaLangStringIDQueryLaunchId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.launchStatusTv, queryLaunchLaunchSuccessJavaLangObjectNullJavaLangStringStatusQueryLaunchLaunchSuccessJavaLangStringStatusNA);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.missionDateValTv, queryLaunchLaunchDateLocalToStringLengthInt0JavaLangStringDateQueryLaunchLaunchDateLocalJavaLangStringDateNA);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.missionNameValTv, queryLaunchMissionNameLengthInt0JavaLangStringNameQueryLaunchMissionNameJavaLangStringNameNA);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.rocketNameTv, queryLaunchRocketRocketNameLengthInt0JavaLangStringRocketNameQueryLaunchRocketRocketNameJavaLangStringRocketNameNA);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.siteNameTv, queryLaunchLaunchSiteSiteNameLengthInt0JavaLangStringSiteNameQueryLaunchLaunchSiteSiteNameJavaLangStringSiteNameNA);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): query
        flag 1 (0x2L): null
        flag 2 (0x3L): query.launch.rocket.rocket_name.length() > 0 ? ("Rocket Name:  ") + (query.launch.rocket.rocket_name) : "Rocket Name:  N/A"
        flag 3 (0x4L): query.launch.rocket.rocket_name.length() > 0 ? ("Rocket Name:  ") + (query.launch.rocket.rocket_name) : "Rocket Name:  N/A"
        flag 4 (0x5L): query.launch.launch_date_local.toString().length() > 0 ? ("Date:  ") + (query.launch.launch_date_local) : "Date:  N/A"
        flag 5 (0x6L): query.launch.launch_date_local.toString().length() > 0 ? ("Date:  ") + (query.launch.launch_date_local) : "Date:  N/A"
        flag 6 (0x7L): query.launch.launch_site.site_name.length() > 0 ? ("Site Name:  ") + (query.launch.launch_site.site_name) : "Site Name:  N/A"
        flag 7 (0x8L): query.launch.launch_site.site_name.length() > 0 ? ("Site Name:  ") + (query.launch.launch_site.site_name) : "Site Name:  N/A"
        flag 8 (0x9L): query.launch.mission_name.length() > 0 ? ("Name:  ") + (query.launch.mission_name) : "Name:  N/A"
        flag 9 (0xaL): query.launch.mission_name.length() > 0 ? ("Name:  ") + (query.launch.mission_name) : "Name:  N/A"
        flag 10 (0xbL): query.launch.links.flickr_images.size() > 0 ? query.launch.links.flickr_images.get(0) : null
        flag 11 (0xcL): query.launch.links.flickr_images.size() > 0 ? query.launch.links.flickr_images.get(0) : null
        flag 12 (0xdL): query.launch.launch_success != null ? ("Status:  ") + (query.launch.launch_success) : "Status:  N/A"
        flag 13 (0xeL): query.launch.launch_success != null ? ("Status:  ") + (query.launch.launch_success) : "Status:  N/A"
        flag 14 (0xfL): query.launch.details.length() > 0 ? ("Description:  ") + (query.launch.details) : "Description:  N/A"
        flag 15 (0x10L): query.launch.details.length() > 0 ? ("Description:  ") + (query.launch.details) : "Description:  N/A"
    flag mapping end*/
    //end
}