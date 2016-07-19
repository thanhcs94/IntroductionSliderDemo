package thanhcs.com.introductionsliderdemo.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

import thanhcs.com.introductionsliderdemo.R;
import thanhcs.com.introductionsliderdemo.models.Project;
import thanhcs.com.introductionsliderdemo.models.Tag;
import thanhcs.com.introductionsliderdemo.util.TagGroup;

import static thanhcs.com.introductionsliderdemo.util.UtilMethods.browseUrl;
import static thanhcs.com.introductionsliderdemo.util.UtilMethods.getActionBarSize;
import static thanhcs.com.introductionsliderdemo.util.UtilMethods.getWindowSize;

/**
 * Created by thanhcs94 on 19/07/16
 */
public class HomePagerAdapter extends PagerAdapter {

    private Context mContext;
    private LayoutInflater inflater;
    private ImageView sliderImageView = null;
    private TextView headlineTextView = null;
    private RelativeLayout tagView = null;
    private TagGroup mTagGroup = null;
    private final static double TAG_VIEW_ASPECT_RATIO = 1d / 9d;
    private int displaySize;
    private List<Project> projectList = null;

    public HomePagerAdapter(Activity context, List<Project> projectList) {
        this.mContext = context;
        inflater = LayoutInflater.from(context);
        displaySize = getWindowSize(context).y - getActionBarSize(context);
        this.projectList = projectList;
    }


    @Override
    public int getCount() {
        return projectList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View itemView = inflater.inflate(R.layout.item_home, container, false);
        sliderImageView = (ImageView) itemView.findViewById(R.id.sliderImageView);
        headlineTextView = (TextView) itemView.findViewById(R.id.headingTv);
        tagView = (RelativeLayout) itemView.findViewById(R.id.tagView);
        tagView.getLayoutParams().height = (int) (displaySize * TAG_VIEW_ASPECT_RATIO);
        mTagGroup = (TagGroup) itemView.findViewById(R.id.tagGroupHome);
//        mTagGroup.getLayoutParams().height = scrollTagView.getLayoutParams().height/2;
//        mTagGroup.getLayoutParams().height = (int) (displaySize * TAG_VIEW_ASPECT_RATIO);
        mTagGroup.setTags(projectList.get(position).getTagList());
        mTagGroup.setOnTagClickListener(mTagClickListener);
        sliderImageView.setImageResource(projectList.get(position).getImage());
        headlineTextView.setText(projectList.get(position).getTitle());
        container.addView(itemView);
        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout) object);
    }

    private TagGroup.OnTagClickListener mTagClickListener = new TagGroup.OnTagClickListener() {
        @Override
        public void onTagClick(String text) {

        }

        @Override
        public void onTagClick(Tag tag) {
            browseUrl(mContext, tag.getUrl());
        }
    };
}
