package cn.gxh.opengldemo;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

public class GLView extends GLSurfaceView {
    public GLView(Context context) {
        super(context);
    }

    public GLView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setEGLContextClientVersion(2);
        setRenderer(new GLRender(this));
        //设置渲染模式 RENDERMODE_WHEN_DIRTY 这种模式自己需要手动请求渲染
        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }
}
