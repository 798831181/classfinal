package net.roseboy.classfinal;

/**
 * 常量
 *
 * @author roseboy
 */
public class Const {

    //打包时需要删除的文件
    public static final String[] DLE_FILES = {".DS_Store", "Thumbs.db"};

    //加密出来的文件名
    public static final String FILE_NAME = "classes";

    //lib下的jar解压的目录名后缀
    public static final String LIB_JAR_DIR = "__temp__";

    //默认加密方式
    public static final int ENCRYPT_TYPE = 1;

    //密码标记
    public static final String FLAG_PASS = "org.springframework.config.Pass";

    //调试模式
    public static boolean DEBUG = false;

    public static void pringInfo() {
        System.out.println();
        System.out.println("=========================================================");
        System.out.println("=                                                       =");
        System.out.println("=      Java Class Encryption Tool v1.1.5   by Mr.K      =");
        System.out.println("=                                                       =");
        System.out.println("=========================================================");
        System.out.println();
    }

}
