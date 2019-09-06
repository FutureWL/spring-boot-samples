package io.github.futurewl.service.impl;

import io.github.futurewl.entity.Permission;
import io.github.futurewl.entity.Role;
import io.github.futurewl.entity.User;
import io.github.futurewl.repository.PermissionRepository;
import io.github.futurewl.repository.RoleRepository;
import io.github.futurewl.repository.UserRepository;
import io.github.futurewl.service.UserService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * 功能描述：
 *
 * @author weilai
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final RoleRepository roleRepository;

    private final PermissionRepository permissionRepository;

    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository, PermissionRepository permissionRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.permissionRepository = permissionRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(1L).get();
    }


    //    @Async
    @Override
    public void test() {
        for (int i = 0; i < 1; i++) {
            Permission createPermission = new Permission();
            Permission updatePermission = new Permission();
            Permission deletePermission = new Permission();
            Permission findPermission = new Permission();
            createPermission.setName("新增");
            updatePermission.setName("更新");
            deletePermission.setName("删除");
            findPermission.setName("查询");
            createPermission = permissionRepository.save(createPermission);
            updatePermission = permissionRepository.save(updatePermission);
            deletePermission = permissionRepository.save(deletePermission);
            findPermission = permissionRepository.save(findPermission);
            Set<Permission> permissions = new HashSet<>();
            permissions.add(createPermission);
            permissions.add(updatePermission);
            permissions.add(deletePermission);
            permissions.add(findPermission);
            Role adminRole = new Role();
            adminRole.setName("管理员");
            adminRole.setPermissions(permissions);
            adminRole = roleRepository.save(adminRole);
            Set<Role> roles = new HashSet<>();
            roles.add(adminRole);
            User admin = new User();
            admin.setEmail("624263934@qq.com");
            admin.setUsername("管理员");
            admin.setRoles(roles);
            admin = userRepository.save(admin);
//            System.out.println(admin);
//            userRepository.delete(admin);
//            roleRepository.delete(adminRole);

//            Role newRole = new Role();
//            newRole.setName("新角色");
//            newRole = roleRepository.save(newRole);
//
//            admin.getRoles().add(newRole);
//            userRepository.save(admin);

            Permission newPermission = new Permission();
            newPermission.setName("新权限");
            newPermission = permissionRepository.save(newPermission);
            Role newRole = admin.getRoles().stream().findFirst().orElse(new Role());
            newRole.getPermissions().add(newPermission);
            admin = userRepository.save(admin);
            System.out.println(admin);
            System.out.println(adminRole);
            System.out.println(adminRole.getUsers());
            System.out.println(createPermission);
            System.out.println(updatePermission);
            System.out.println(deletePermission);
            System.out.println(findPermission);
            System.out.println(newPermission);

        }
    }


    /**
     * [User(id=1, username=管理员, email=624263934@qq.com,
     * roles=[
     * Role(id=1, name=管理员,
     * permissions=[
     * Permission(id=1, name=新增),
     * Permission(id=3, name=删除),
     * Permission(id=4, name=查询),
     * Permission(id=2, name=更新)]),
     * Role(id=2, name=管理员,
     * permissions=[
     * Permission(id=7, name=更新),
     * Permission(id=6, name=新增),
     * Permission(id=8, name=删除),
     * Permission(id=9, name=查询)])]),
     * User(id=2, username=管理员, email=624263934@qq.com,
     * roles=[
     * Role(id=1, name=管理员,
     * permissions=[
     * Permission(id=1, name=新增),
     * Permission(id=3, name=删除),
     * Permission(id=4, name=查询),
     * Permission(id=2, name=更新)]),
     * Role(id=2, name=管理员,
     * permissions=[
     * Permission(id=7, name=更新),
     * Permission(id=6, name=新增),
     * Permission(id=8, name=删除),
     * Permission(id=9, name=查询)])])]
     * <p>
     * <p>
     * [Role(id=1, name=管理员,
     * permissions=[
     * Permission(id=4, name=查询),
     * Permission(id=1, name=新增),
     * Permission(id=3, name=删除),
     * Permission(id=2, name=更新)])]
     * <p>
     * [Role(id=2, name=管理员,
     * permissions=[
     * Permission(id=6, name=新增),
     * Permission(id=7, name=更新),
     * Permission(id=9, name=查询),
     * Permission(id=8, name=删除)])]
     * <p>
     * [
     * User(id=1, username=管理员, email=624263934@qq.com,
     * roles=[Role(id=1, name=管理员,
     * permissions=[
     * Permission(id=1, name=新增),
     * Permission(id=4, name=查询),
     * Permission(id=2, name=更新),
     * Permission(id=3, name=删除)]),
     * Role(id=2, name=管理员,
     * permissions=[
     * Permission(id=9, name=查询),
     * Permission(id=8, name=删除),
     * Permission(id=6, name=新增),
     * Permission(id=7, name=更新)])]),
     * <p>
     * User(id=2, username=管理员, email=624263934@qq.com,
     * roles=[Role(id=1, name=管理员,
     * permissions=[
     * Permission(id=1, name=新增),
     * Permission(id=4, name=查询),
     * Permission(id=2, name=更新),
     * Permission(id=3, name=删除)]),
     * Role(id=2, name=管理员,
     * permissions=[
     * Permission(id=9, name=查询),
     * Permission(id=8, name=删除),
     * Permission(id=6, name=新增),
     * Permission(id=7, name=更新)])])]
     */
    public void test2() {

//        User user = userRepository.findById(1L).orElse(null);
//        System.out.println(user);
//        Set<Role> roles = user.getRoles();
//        System.out.println(roles);
//        Set<User> users = userRepository.findAllByRoles(roles.stream().findFirst().orElse(null));
//        System.out.println(users);


//        Permission permission = permissionRepository.findById(6L).orElse(null);
//        Set<Role> roles1 = roleRepository.findAllByPermissions(permission);
//        System.out.println(roles1);

//        Permission permission = permissionRepository.findById(1L).orElse(null);
//        Set<User> users = userRepository.findAllByRolesPermissions(permission);
//        System.out.println(users);

        Permission permission = permissionRepository.findById(1L).orElse(null);
        Set<User> users = userRepository.findAllByRoles_Permissions_Name(permission.getName());
        System.out.println(users);

    }

}
