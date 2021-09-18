package com.example.apollographqltutorial.databinding;
import com.example.apollographqltutorial.R;
import com.example.apollographqltutorial.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemCharacterBindingImpl extends ItemCharacterBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemCharacterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemCharacterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.missionDateTv.setTag(null);
        this.missionIv.setTag(null);
        this.missionNameTv.setTag(null);
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
        if (BR.character == variableId) {
            setCharacter((com.example.apollographqltutorial.SpaceLaunchesListQuery.LaunchesPast) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCharacter(@Nullable com.example.apollographqltutorial.SpaceLaunchesListQuery.LaunchesPast Character) {
        this.mCharacter = Character;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.character);
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
        java.lang.String characterLinksMissionPatch = null;
        com.example.apollographqltutorial.SpaceLaunchesListQuery.Links characterLinks = null;
        com.example.apollographqltutorial.SpaceLaunchesListQuery.LaunchesPast character = mCharacter;
        java.lang.String characterLaunchDateLocalToString = null;
        java.lang.Object characterLaunchDateLocal = null;
        java.lang.String characterMissionName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (character != null) {
                    // read character.links
                    characterLinks = character.getLinks();
                    // read character.launch_date_local
                    characterLaunchDateLocal = character.getLaunch_date_local();
                    // read character.mission_name
                    characterMissionName = character.getMission_name();
                }


                if (characterLinks != null) {
                    // read character.links.mission_patch
                    characterLinksMissionPatch = characterLinks.getMission_patch();
                }
                if (characterLaunchDateLocal != null) {
                    // read character.launch_date_local.toString()
                    characterLaunchDateLocalToString = characterLaunchDateLocal.toString();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.missionDateTv, characterLaunchDateLocalToString);
            com.example.apollographqltutorial.view.adapter.LaunchAdapterKt.setImageUrl(this.missionIv, characterLinksMissionPatch);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.missionNameTv, characterMissionName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): character
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}