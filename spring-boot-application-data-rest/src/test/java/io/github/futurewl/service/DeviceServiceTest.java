package io.github.futurewl.service;

import io.github.futurewl.repository.DeviceLoopGroupRepository;
import io.github.futurewl.repository.DeviceLoopRepository;
import io.github.futurewl.repository.DeviceRepository;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DeviceServiceTest {

    @Autowired
    private DeviceRepository deviceRepository;

    @Autowired
    private DeviceLoopRepository deviceLoopRepository;

    @Autowired
    private DeviceLoopGroupRepository deviceLoopGroupRepository;

//    @Test
//    public void create() {
//        for (int i = 0; i < 10; i++) {
//            Device device = new Device();
//            device.setName("设备" + i);
//            deviceRepository.save(device);
//        }
//    }
//
//    @Test
//    public void createLoop() {
//        for (int i = 0; i < 10; i++) {
//            DeviceLoop deviceLoop = new DeviceLoop();
//            deviceLoop.setName("设备" + i);
//            deviceLoopRepository.save(deviceLoop);
//        }
//    }
//
//    @Test
//    public void createLoopGroup() {
//        DeviceLoopGroup deviceLoopGroup = new DeviceLoopGroup();
//        deviceLoopGroup.setName("回路组");
//        deviceLoopGroupRepository.save(deviceLoopGroup);
//    }
//
//    @Test
//    public void showLoops(){
//        List<DeviceLoop> deviceLoops = deviceLoopRepository.findAll();
//        System.out.println(deviceLoops);
//    }
//
//    @Test
//    public void rel() {
//        List<DeviceLoop> deviceLoops = deviceLoopRepository.findAll();
//        for (DeviceLoop deviceLoop : deviceLoops) {
//            deviceLoop.setDevice(deviceRepository.findById(2L).get());
//            deviceLoopRepository.save(deviceLoop);
//        }
//    }
//
//    @Test
//    public void relLoopGroup() {
//        List<DeviceLoop> deviceLoops = deviceLoopRepository.findAll();
//        for (DeviceLoop deviceLoop : deviceLoops) {
//            deviceLoop.setDeviceLoopGroup(deviceLoopGroupRepository.findById(1L).get());
//            deviceLoopRepository.save(deviceLoop);
//        }
//    }

}