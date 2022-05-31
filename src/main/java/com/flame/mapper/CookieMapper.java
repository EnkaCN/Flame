package com.flame.mapper;

import com.flame.pojo.Cookie;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CookieMapper {

    /**
     * 增加一块饼干
     */

    void addACookie(@Param("cookieId") Integer id,
                    @Param("cookieName") String cookieName,
                    @Param("cookieUser") Integer cookieUser,
                    @Param("cookieSuper") Boolean cookieSuper);

    /**
     * 碎饼！
     *
     * @param cookieName
     */
    void deleteByName(@Param("cookieName") String cookieName);

    /**
     * 查找一块饼干
     *
     * @param id
     * @param cookieName
     * @param cookieUser
     * @param cookieSuper
     * @return List<Cookie>
     */
    List<Cookie> selectByCond(@Param("cookieId") Integer id,
                              @Param("cookieName") String cookieName,
                              @Param("cookieUser") Integer cookieUser,
                              @Param("cookieSuper") Boolean cookieSuper);

    /**
     * 修改一个权限
     */
    void updateCookieSuperByCookieName(@Param("cookieName")String cookieName, @Param("cookieSuper")Boolean cookieSuper);
}
