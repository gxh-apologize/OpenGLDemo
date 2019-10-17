package cn.gxh.opengldemo;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.view.View;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import cn.gxh.opengldemo.shape.Triangle;

public class GLRender implements GLSurfaceView.Renderer {

    private View view;
    private Triangle triangle;

    public GLRender(View view) {
        this.view=view;
    }

    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        //不起clear作用，只是指定刷新颜色缓冲区时所用的颜色，也就是为后面的glClear设置值
        GLES20.glClearColor(0,0,0,0);
        triangle=new Triangle();
    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {

    }

    //不断被调用
    @Override
    public void onDrawFrame(GL10 gl) {
        //GLES20.glClear();
        triangle.onDrawFrame(gl);
    }
}
