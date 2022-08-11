package cn.qingyandark.controller;

import cn.qingyandark.controller.data.Code;
import cn.qingyandark.controller.data.UserResult;
import cn.qingyandark.domain.User;
import cn.qingyandark.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// rest风格
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public UserResult save(@RequestBody User user){
        boolean flag = userService.save(user);
        Integer code = flag ? Code.SAVE_OK:Code.SAVE_ERR;
        String msg = flag ? "添加成功" : "添加错误";
        return new UserResult(code, null, msg);
    }

    @DeleteMapping("/{id}")
    public UserResult delete(@PathVariable Integer id){
        boolean flag = userService.delete(id);
        Integer code = flag ? Code.DELETE_OK:Code.DELETE_ERR;
        String msg = flag ? "更新成功" : "更新错误";
        return new UserResult(code, null, msg);
    }

    @PutMapping
    public UserResult update(@RequestBody User user){
        boolean flag = userService.update(user);
        Integer code = flag ? Code.UPDATE_OK:Code.UPDATE_ERR;
        String msg = flag ? "查询成功" : "查询错误";
        return new UserResult(code, null, msg);
    }

    @GetMapping("/{id}")
    public UserResult getById(@PathVariable Integer id){
        User user = userService.getById(id);
        Integer code = user != null? Code.GET_OK : Code.GET_ERR;
        String msg = user != null? "查询成功" : "查询错误";
        return new UserResult(code, user, msg);
    }

    @GetMapping
    public UserResult getAll(){
        List<User> users = userService.selectALL();
        Integer code = users != null? Code.GET_OK : Code.GET_ERR;
        String msg = users != null? "查询成功" : "查询错误";
        return new UserResult(code, users, msg);
    }

}
