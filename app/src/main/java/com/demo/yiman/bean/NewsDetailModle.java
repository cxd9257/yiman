package com.demo.yiman.bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.demo.yiman.database.convert.NewsConvert;

import org.greenrobot.greendao.annotation.Convert;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import java.io.Serializable;
import java.util.List;
import org.greenrobot.greendao.annotation.Generated;
@Entity
public class NewsDetailModle implements Serializable {

    private static final long serialVersionUID = 2621342267618014474L;
    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"uniquekey":"ff9dc82ef29d5e8b464fd8d7bcf469c1","title":"全球最大集装箱巨轮首航深圳盐田港区","date":"2019-07-23 18:19","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/190723181915882.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20190723/20190723181915_cf003b9d0afe66b85c10fa131331bfd6_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20190723/20190723181915_cf003b9d0afe66b85c10fa131331bfd6_2_mwpm_03200403.jpg"},{"uniquekey":"aa6b82cb9c15c263af53af984f24e362","title":"在清朝为什么没人愿意娶宫女为妻呢？连乞丐都不愿意，全因一种病","date":"2019-07-23 18:16","category":"头条","author_name":"上夏不得所","url":"http://mini.eastday.com/mobile/190723181636171.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20190723/20190723181636_dc8567a3c4451c502b4b5db1ff5e258e_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20190723/20190723181636_dc8567a3c4451c502b4b5db1ff5e258e_8_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20190723/20190723181636_dc8567a3c4451c502b4b5db1ff5e258e_7_mwpm_03200403.jpg"},{"uniquekey":"b2cfbefb41f8cf035e7c8b7e1de0447b","title":"她是女排传奇，曾肩上埋七颗钉，跟死神擦肩而过，退役去青海执教","date":"2019-07-23 18:14","category":"头条","author_name":"蜗牛侃排球","url":"http://mini.eastday.com/mobile/190723181417249.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190723/2019072318_c5922a38c0d147ce9c5817530f216607_9076_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190723/2019072318_40251346a3db4d719345b534ebbb3561_2750_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20190723/2019072318_0c65bbd39f03450d860ec2be0d797c69_4662_mwpm_03200403.jpg"},{"uniquekey":"5245117bbb1f1a0baab128a57da31bc1","title":"苏拉特困局：被洪灾扼住咽喉的\u201c钻石之城\u201d","date":"2019-07-23 18:14","category":"头条","author_name":"纵相新闻","url":"http://mini.eastday.com/mobile/190723181407140.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20190723/2019072318_7f8ce6e1d6d74dd9a456ce535f391c63_8792_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20190723/2019072318_b6144c6fb1f6419888bb32062cb618d1_4943_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20190723/2019072318_baf758a42664476a907f81e2d2d08690_8448_mwpm_03200403.jpg"},{"uniquekey":"97f2a8aa71ee823c24127b1c1735f35b","title":"难怪味道不对，看了大厨炒的酸辣土豆丝第一步，就知道自己错了","date":"2019-07-23 18:13","category":"头条","author_name":"小小星座说说","url":"http://mini.eastday.com/mobile/190723181331358.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20190723/2019072318_cc8bb055cbb44aefa888cb80a39d458c_1299_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20190723/2019072318_00c4e230b32c48cba505bdb3b5d0e0d5_2593_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20190723/2019072318_438564208aa743769d2328656c83cf30_6466_mwpm_03200403.jpg"},{"uniquekey":"8fe161a33f1546fe3248468af2eb1e9e","title":"深受孩子喜欢的胡萝卜贝果，凉了都软和酥香，好吃，吃不腻","date":"2019-07-23 18:13","category":"头条","author_name":"城市食报","url":"http://mini.eastday.com/mobile/190723181312040.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190723/2019072318_163363d1585640d499e98a954b4d6189_4198_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190723/2019072318_49bbe467f4ca4729a142f2b9841f9289_1692_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190723/2019072318_1a7baa084b554ed0aa82921153207877_9596_cover_mwpm_03200403.jpg"},{"uniquekey":"cf7ad2fa157364da0d84b9618b70f517","title":"都知道女人吃红枣补血养颜，却不适合这4类人，不然越吃越伤身体","date":"2019-07-23 18:06","category":"头条","author_name":"美味大满贯","url":"http://mini.eastday.com/mobile/190723180647803.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190723/2019072318_aa58a7f1b9a94169af29447987b489b7_4875_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190723/2019072318_7d174456c2f24d0e87f95789b5d409f6_1390_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190723/2019072318_c2fb29110a9d456587757983c655e99e_9143_mwpm_03200403.jpg"},{"uniquekey":"6c040abdf17fdc8bb4cc532a6d4d61b2","title":"河北保定市长：奋力开创京津保地区率先联动发展新局面","date":"2019-07-23 18:01","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/190723180115891.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20190723/20190723180115_2a28134b21ca413ab83125a923239eaa_1_mwpm_03200403.jpg"},{"uniquekey":"68da4bbb1ee9d5af19857180c8aa204c","title":"时隔13年，皇马再战阿森纳：日本天才PK新亨利 厄齐尔反戈旧","date":"2019-07-23 18:00","category":"头条","author_name":"体坛扒客","url":"http://mini.eastday.com/mobile/190723180037930.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190723/2019072317_48fc45cd856c488c9b4a6516ab5c6d97_4225_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190723/2019072317_19902890bebc43e68c404df3a6917a92_8243_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190723/2019072317_6359ebfc52764fb3a4c0bf184d01edbb_3715_mwpm_03200403.jpg"},{"uniquekey":"81c1140d4c5d939b32dec89b53ec7c6a","title":"是枝裕和新片《真相》发新剧照 德纳芙比诺什相拥","date":"2019-07-23 17:59","category":"头条","author_name":"1905电影网","url":"http://mini.eastday.com/mobile/190723175943272.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20190723/20190723175943_3d55299b6a3d4b4457832899ee5b1c02_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20190723/20190723175943_3d55299b6a3d4b4457832899ee5b1c02_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20190723/20190723175943_3d55299b6a3d4b4457832899ee5b1c02_3_mwpm_03200403.jpg"},{"uniquekey":"be331341845a653af4f4abb1d2f80685","title":"国际欧亚科学院粤港澳大湾区首届院士论坛在东莞举行","date":"2019-07-23 17:59","category":"头条","author_name":"科技日报","url":"http://mini.eastday.com/mobile/190723175902685.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190723/20190723180003_c7c0117bc51a4e8aca6822b454de71de_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20190723/20190723180003_c7c0117bc51a4e8aca6822b454de71de_1_mwpm_03200403.jpg"},{"uniquekey":"b6914d1aad582849de6fe5d3434f9bbd","title":"寻梦之路遭质疑 王晓麟直面挑战有何底气？","date":"2019-07-23 17:58","category":"头条","author_name":"河源新闻网","url":"http://mini.eastday.com/mobile/190723175809086.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20190723/20190723175809_1ae2fe7efc93f35ae1a1cf97fea1eaeb_7_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20190723/20190723175809_1ae2fe7efc93f35ae1a1cf97fea1eaeb_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20190723/20190723175809_1ae2fe7efc93f35ae1a1cf97fea1eaeb_2_mwpm_03200403.jpg"},{"uniquekey":"df376f6cb8ef9c9e4ccc36307ca0a4d7","title":"游戏除了娱乐还能干啥？这群人有不一样的看法","date":"2019-07-23 17:57","category":"头条","author_name":"刺猬公社","url":"http://mini.eastday.com/mobile/190723175742131.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20190723/20190723175742_bb4bd058429160dacd4fed2ffd77a7fe_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20190723/20190723175742_bb4bd058429160dacd4fed2ffd77a7fe_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20190723/20190723175742_bb4bd058429160dacd4fed2ffd77a7fe_3_mwpm_03200403.jpg"},{"uniquekey":"98d7556583e4688a826e5b16de783445","title":"践行公益慈善精神 福信集团组织志愿者家访慰问贫困大学生","date":"2019-07-23 17:56","category":"头条","author_name":"中国经济导报网","url":"http://mini.eastday.com/mobile/190723175610818.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20190723/20190723175610_d4a89bcc9c287b7c15fcfed4e4f2f202_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20190723/20190723175610_d4a89bcc9c287b7c15fcfed4e4f2f202_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20190723/20190723175610_d4a89bcc9c287b7c15fcfed4e4f2f202_2_mwpm_03200403.jpg"},{"uniquekey":"e88aa896cb4150901848a37077b4116f","title":"广州小将为何能踢出\u201c世界波\u201d？他们的球技是这样练出来的","date":"2019-07-23 17:54","category":"头条","author_name":"北青网","url":"http://mini.eastday.com/mobile/190723175434528.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190723/20190723175434_d16d1aff40996e8489302fc16b430917_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20190723/20190723175434_d16d1aff40996e8489302fc16b430917_1_mwpm_03200403.jpg"},{"uniquekey":"240342830e525ed5fb5b994fb4ada4a8","title":"中国男足迎劲敌！菲律宾再归化5名旅欧球员，1人曾效力拜仁梯队","date":"2019-07-23 17:52","category":"头条","author_name":"英超那些事","url":"http://mini.eastday.com/mobile/190723175244666.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20190723/20190723175244_0dc26a207f1c4f3d7364f6e338033406_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20190723/20190723175244_0dc26a207f1c4f3d7364f6e338033406_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20190723/20190723175244_0dc26a207f1c4f3d7364f6e338033406_4_mwpm_03200403.jpg"},{"uniquekey":"1cd39e6000e4fc7c0e315b68dda4e7bc","title":"国产水泥霸主，首次入围世界五百强，2018年营收284亿元","date":"2019-07-23 17:52","category":"头条","author_name":"携景网","url":"http://mini.eastday.com/mobile/190723175221500.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20190723/20190723175221_deeabccce84b0dcdd73037f41b4a6519_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20190723/20190723175221_deeabccce84b0dcdd73037f41b4a6519_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20190723/20190723175221_deeabccce84b0dcdd73037f41b4a6519_1_mwpm_03200403.jpg"},{"uniquekey":"0e7687980baf0bb17a06cca10d9c35ee","title":"张子枫想养的三种宠物，袋鼠和猴子能接受，最后一种吓坏彭昱畅","date":"2019-07-23 17:52","category":"头条","author_name":"光明网","url":"http://mini.eastday.com/mobile/190723175213192.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20190723/20190723175213_d2847f32f0d795ef24946c9425a79e97_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20190723/20190723175213_d2847f32f0d795ef24946c9425a79e97_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20190723/20190723175213_d2847f32f0d795ef24946c9425a79e97_2_mwpm_03200403.jpg"},{"uniquekey":"912d418457c777e343ce0f59747c87ff","title":"麒麟810加持：荣耀9X来了，1399起横扫友商！","date":"2019-07-23 17:52","category":"头条","author_name":"机智玩机机","url":"http://mini.eastday.com/mobile/190723175202206.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190723/2019072317_95384223bc8c4778a539dc39af8e28a6_7977_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190723/2019072317_1a0fdffe746545ba8bb119f3dd0248a6_1840_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190723/2019072317_880fc01493f94844abcbcbe1179613f4_4027_cover_mwpm_03200403.jpg"},{"uniquekey":"8dbd22c818438f94cf5b13a1e27fa6a8","title":"杨幂旗下4朵金花，热巴黄梦莹祝绪丹熬出头，唯独她还不火","date":"2019-07-23 17:51","category":"头条","author_name":"光明网","url":"http://mini.eastday.com/mobile/190723175147182.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20190723/20190723175147_14a6b9a7bdcb4370de2a05a06af1dd1f_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20190723/20190723175147_14a6b9a7bdcb4370de2a05a06af1dd1f_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20190723/20190723175147_14a6b9a7bdcb4370de2a05a06af1dd1f_4_mwpm_03200403.jpg"},{"uniquekey":"6973b319836ca9b59ca78670c5f234c4","title":"朋友装修的新房，色彩搭配非常漂亮，一个客厅尽显恬静优美！","date":"2019-07-23 17:51","category":"头条","author_name":"装修案例设计","url":"http://mini.eastday.com/mobile/190723175144924.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190723/20190723175144_30a0d08abdc1a3567511030388ff7f31_12_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190723/20190723175144_30a0d08abdc1a3567511030388ff7f31_11_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20190723/20190723175144_30a0d08abdc1a3567511030388ff7f31_9_mwpm_03200403.jpg"},{"uniquekey":"91f185415e6fd112289caf995f444af6","title":"印度\u201c月船2号\u201d探测器终于奔向月球 从去年4月推迟至今","date":"2019-07-23 17:50","category":"头条","author_name":"中国网","url":"http://mini.eastday.com/mobile/190723175036719.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20190723/20190723175036_503a93cd1b2e104f97ee6ec7c22fa912_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20190723/20190723175036_503a93cd1b2e104f97ee6ec7c22fa912_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20190723/20190723175036_503a93cd1b2e104f97ee6ec7c22fa912_1_mwpm_03200403.jpg"},{"uniquekey":"f80c854683058cb9247a262d7318d6f0","title":"减肥人士推荐的4种刮油水果，苹果效果最佳，瘦到九十斤不是梦","date":"2019-07-23 17:49","category":"头条","author_name":"北巷不夏","url":"http://mini.eastday.com/mobile/190723174920311.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190723/2019072317_a6b55f3d301842ffabf1e195c0cbbddc_8725_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190723/2019072317_12145a3b99bf4ff1a5527d6ead10d45a_4323_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20190723/2019072317_7be3397ba42f49069ba0269eedc428e5_3945_mwpm_03200403.jpg"},{"uniquekey":"a82c7657346ceb88435b4a8c3bc82a4f","title":"印度成功发射\u201c月船2号\u201d月球探测器 预计9月实施月球着陆","date":"2019-07-23 17:49","category":"头条","author_name":"北青网","url":"http://mini.eastday.com/mobile/190723174903539.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190723/20190723174903_83e6fa0820ddad6d068adc00d2a3b2a4_1_mwpm_03200403.jpg"},{"uniquekey":"0be87c32ff75700559d31ba89b39a237","title":"药茶养生怎么喝\u2014\u2014春养肝、夏通心、秋润肺、冬健肾","date":"2019-07-23 17:47","category":"头条","author_name":"洛施花舍玫瑰花茶清清","url":"http://mini.eastday.com/mobile/190723174716439.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190723/20190723174716_2c41d9883a9346848fab3f8c66854803_7_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190723/20190723174716_2c41d9883a9346848fab3f8c66854803_8_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190723/20190723174716_2c41d9883a9346848fab3f8c66854803_9_mwpm_03200403.jpg"},{"uniquekey":"16b06d4922e449365966de9a287d220a","title":"变速箱油多久更换一次？别超过这个时间，免得变速箱大修","date":"2019-07-23 17:47","category":"头条","author_name":"SUV大师","url":"http://mini.eastday.com/mobile/190723174714392.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20190723/2019072317_4f84f28840454d66adfddbe13e8948a7_2286_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20190723/2019072317_bd493f8f4129468d9fd5456bcb9e58eb_3930_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20190723/2019072317_1b5b3c5db21b40628469c0646aedbf31_9004_mwpm_03200403.jpg"},{"uniquekey":"0ea524675267598f9f63c7cf8817da8d","title":"段浩雨：黄金投资难赚钱？这几个盈利技巧你肯定不知道！","date":"2019-07-23 17:46","category":"头条","author_name":"段浩雨讲市","url":"http://mini.eastday.com/mobile/190723174648130.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190723/2019072317_ba781b7e4a9549fab3196670793f0e1a_6387_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190723/2019072317_609819664fda4bd48c34072fd7de044f_2789_mwpm_03200403.jpg"},{"uniquekey":"ac83c31ac98b9c3dba659b1b98f4a037","title":"石榴皮的六大功效！石榴皮煮水喝有什么作用？你绝对想不到！","date":"2019-07-23 17:46","category":"头条","author_name":"掌心的回忆","url":"http://mini.eastday.com/mobile/190723174617388.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190723/2019072317_3a9299fc5c7c4b6eb39dd1bab61984c8_5809_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190723/2019072317_6eb0589056594666a8a9122d932efbf7_6949_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20190723/2019072317_ff56845c4f764970bf459ca88e3bc8ee_2240_mwpm_03200403.jpg"},{"uniquekey":"7f5eba4f9116cd7a33468e53f2dda748","title":"女子往小黄瓜里挂个可乐瓶，结果两个月后，神奇的事情发生了！","date":"2019-07-23 17:46","category":"头条","author_name":"每天搞笑笑话","url":"http://mini.eastday.com/mobile/190723174607573.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20190723/2019072317_560b628d8f54460a96fe05584093546d_8926_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20190723/2019072317_b49dc77d62874ad78ecb6ed74949db23_8766_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20190723/2019072317_e009bdf71e614e8695308673efa440e4_4151_mwpm_03200403.jpg"},{"uniquekey":"be1ab397d4ae90a648c650e02e7c37bb","title":"全系麒麟810+超强夜拍 荣耀9X正式发布 售价1399元起","date":"2019-07-23 17:45","category":"头条","author_name":"TechWeb.com.cn","url":"http://mini.eastday.com/mobile/190723174509698.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20190723/20190723174509_09c3cc02b6b75796f1d8dffaddda5bd3_1_mwpm_03200403.jpg"}]}
     * error_code : 0
     */

    @Id(autoincrement = true)
    private Long idS;
    private String reason;
    @Convert(converter = NewsConvert.class , columnType = String.class)

    private ResultBean result;
    private int error_code;

    @Generated(hash = 932673036)
    public NewsDetailModle(Long idS, String reason, ResultBean result, int error_code) {
        this.idS = idS;
        this.reason = reason;
        this.result = result;
        this.error_code = error_code;
    }

    @Generated(hash = 1218074204)
    public NewsDetailModle() {
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public Long getIdS() {
        return this.idS;
    }

    public void setIdS(Long idS) {
        this.idS = idS;
    }

    public static class ResultBean {
        /**
         * stat : 1
         * data : [{"uniquekey":"ff9dc82ef29d5e8b464fd8d7bcf469c1","title":"全球最大集装箱巨轮首航深圳盐田港区","date":"2019-07-23 18:19","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/190723181915882.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20190723/20190723181915_cf003b9d0afe66b85c10fa131331bfd6_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20190723/20190723181915_cf003b9d0afe66b85c10fa131331bfd6_2_mwpm_03200403.jpg"},{"uniquekey":"aa6b82cb9c15c263af53af984f24e362","title":"在清朝为什么没人愿意娶宫女为妻呢？连乞丐都不愿意，全因一种病","date":"2019-07-23 18:16","category":"头条","author_name":"上夏不得所","url":"http://mini.eastday.com/mobile/190723181636171.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20190723/20190723181636_dc8567a3c4451c502b4b5db1ff5e258e_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20190723/20190723181636_dc8567a3c4451c502b4b5db1ff5e258e_8_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20190723/20190723181636_dc8567a3c4451c502b4b5db1ff5e258e_7_mwpm_03200403.jpg"},{"uniquekey":"b2cfbefb41f8cf035e7c8b7e1de0447b","title":"她是女排传奇，曾肩上埋七颗钉，跟死神擦肩而过，退役去青海执教","date":"2019-07-23 18:14","category":"头条","author_name":"蜗牛侃排球","url":"http://mini.eastday.com/mobile/190723181417249.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190723/2019072318_c5922a38c0d147ce9c5817530f216607_9076_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190723/2019072318_40251346a3db4d719345b534ebbb3561_2750_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20190723/2019072318_0c65bbd39f03450d860ec2be0d797c69_4662_mwpm_03200403.jpg"},{"uniquekey":"5245117bbb1f1a0baab128a57da31bc1","title":"苏拉特困局：被洪灾扼住咽喉的\u201c钻石之城\u201d","date":"2019-07-23 18:14","category":"头条","author_name":"纵相新闻","url":"http://mini.eastday.com/mobile/190723181407140.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20190723/2019072318_7f8ce6e1d6d74dd9a456ce535f391c63_8792_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20190723/2019072318_b6144c6fb1f6419888bb32062cb618d1_4943_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20190723/2019072318_baf758a42664476a907f81e2d2d08690_8448_mwpm_03200403.jpg"},{"uniquekey":"97f2a8aa71ee823c24127b1c1735f35b","title":"难怪味道不对，看了大厨炒的酸辣土豆丝第一步，就知道自己错了","date":"2019-07-23 18:13","category":"头条","author_name":"小小星座说说","url":"http://mini.eastday.com/mobile/190723181331358.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20190723/2019072318_cc8bb055cbb44aefa888cb80a39d458c_1299_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20190723/2019072318_00c4e230b32c48cba505bdb3b5d0e0d5_2593_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20190723/2019072318_438564208aa743769d2328656c83cf30_6466_mwpm_03200403.jpg"},{"uniquekey":"8fe161a33f1546fe3248468af2eb1e9e","title":"深受孩子喜欢的胡萝卜贝果，凉了都软和酥香，好吃，吃不腻","date":"2019-07-23 18:13","category":"头条","author_name":"城市食报","url":"http://mini.eastday.com/mobile/190723181312040.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190723/2019072318_163363d1585640d499e98a954b4d6189_4198_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190723/2019072318_49bbe467f4ca4729a142f2b9841f9289_1692_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190723/2019072318_1a7baa084b554ed0aa82921153207877_9596_cover_mwpm_03200403.jpg"},{"uniquekey":"cf7ad2fa157364da0d84b9618b70f517","title":"都知道女人吃红枣补血养颜，却不适合这4类人，不然越吃越伤身体","date":"2019-07-23 18:06","category":"头条","author_name":"美味大满贯","url":"http://mini.eastday.com/mobile/190723180647803.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190723/2019072318_aa58a7f1b9a94169af29447987b489b7_4875_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190723/2019072318_7d174456c2f24d0e87f95789b5d409f6_1390_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190723/2019072318_c2fb29110a9d456587757983c655e99e_9143_mwpm_03200403.jpg"},{"uniquekey":"6c040abdf17fdc8bb4cc532a6d4d61b2","title":"河北保定市长：奋力开创京津保地区率先联动发展新局面","date":"2019-07-23 18:01","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/190723180115891.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20190723/20190723180115_2a28134b21ca413ab83125a923239eaa_1_mwpm_03200403.jpg"},{"uniquekey":"68da4bbb1ee9d5af19857180c8aa204c","title":"时隔13年，皇马再战阿森纳：日本天才PK新亨利 厄齐尔反戈旧","date":"2019-07-23 18:00","category":"头条","author_name":"体坛扒客","url":"http://mini.eastday.com/mobile/190723180037930.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190723/2019072317_48fc45cd856c488c9b4a6516ab5c6d97_4225_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190723/2019072317_19902890bebc43e68c404df3a6917a92_8243_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190723/2019072317_6359ebfc52764fb3a4c0bf184d01edbb_3715_mwpm_03200403.jpg"},{"uniquekey":"81c1140d4c5d939b32dec89b53ec7c6a","title":"是枝裕和新片《真相》发新剧照 德纳芙比诺什相拥","date":"2019-07-23 17:59","category":"头条","author_name":"1905电影网","url":"http://mini.eastday.com/mobile/190723175943272.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20190723/20190723175943_3d55299b6a3d4b4457832899ee5b1c02_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20190723/20190723175943_3d55299b6a3d4b4457832899ee5b1c02_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20190723/20190723175943_3d55299b6a3d4b4457832899ee5b1c02_3_mwpm_03200403.jpg"},{"uniquekey":"be331341845a653af4f4abb1d2f80685","title":"国际欧亚科学院粤港澳大湾区首届院士论坛在东莞举行","date":"2019-07-23 17:59","category":"头条","author_name":"科技日报","url":"http://mini.eastday.com/mobile/190723175902685.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190723/20190723180003_c7c0117bc51a4e8aca6822b454de71de_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20190723/20190723180003_c7c0117bc51a4e8aca6822b454de71de_1_mwpm_03200403.jpg"},{"uniquekey":"b6914d1aad582849de6fe5d3434f9bbd","title":"寻梦之路遭质疑 王晓麟直面挑战有何底气？","date":"2019-07-23 17:58","category":"头条","author_name":"河源新闻网","url":"http://mini.eastday.com/mobile/190723175809086.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20190723/20190723175809_1ae2fe7efc93f35ae1a1cf97fea1eaeb_7_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20190723/20190723175809_1ae2fe7efc93f35ae1a1cf97fea1eaeb_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20190723/20190723175809_1ae2fe7efc93f35ae1a1cf97fea1eaeb_2_mwpm_03200403.jpg"},{"uniquekey":"df376f6cb8ef9c9e4ccc36307ca0a4d7","title":"游戏除了娱乐还能干啥？这群人有不一样的看法","date":"2019-07-23 17:57","category":"头条","author_name":"刺猬公社","url":"http://mini.eastday.com/mobile/190723175742131.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20190723/20190723175742_bb4bd058429160dacd4fed2ffd77a7fe_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20190723/20190723175742_bb4bd058429160dacd4fed2ffd77a7fe_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20190723/20190723175742_bb4bd058429160dacd4fed2ffd77a7fe_3_mwpm_03200403.jpg"},{"uniquekey":"98d7556583e4688a826e5b16de783445","title":"践行公益慈善精神 福信集团组织志愿者家访慰问贫困大学生","date":"2019-07-23 17:56","category":"头条","author_name":"中国经济导报网","url":"http://mini.eastday.com/mobile/190723175610818.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20190723/20190723175610_d4a89bcc9c287b7c15fcfed4e4f2f202_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20190723/20190723175610_d4a89bcc9c287b7c15fcfed4e4f2f202_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20190723/20190723175610_d4a89bcc9c287b7c15fcfed4e4f2f202_2_mwpm_03200403.jpg"},{"uniquekey":"e88aa896cb4150901848a37077b4116f","title":"广州小将为何能踢出\u201c世界波\u201d？他们的球技是这样练出来的","date":"2019-07-23 17:54","category":"头条","author_name":"北青网","url":"http://mini.eastday.com/mobile/190723175434528.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190723/20190723175434_d16d1aff40996e8489302fc16b430917_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20190723/20190723175434_d16d1aff40996e8489302fc16b430917_1_mwpm_03200403.jpg"},{"uniquekey":"240342830e525ed5fb5b994fb4ada4a8","title":"中国男足迎劲敌！菲律宾再归化5名旅欧球员，1人曾效力拜仁梯队","date":"2019-07-23 17:52","category":"头条","author_name":"英超那些事","url":"http://mini.eastday.com/mobile/190723175244666.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20190723/20190723175244_0dc26a207f1c4f3d7364f6e338033406_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20190723/20190723175244_0dc26a207f1c4f3d7364f6e338033406_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20190723/20190723175244_0dc26a207f1c4f3d7364f6e338033406_4_mwpm_03200403.jpg"},{"uniquekey":"1cd39e6000e4fc7c0e315b68dda4e7bc","title":"国产水泥霸主，首次入围世界五百强，2018年营收284亿元","date":"2019-07-23 17:52","category":"头条","author_name":"携景网","url":"http://mini.eastday.com/mobile/190723175221500.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20190723/20190723175221_deeabccce84b0dcdd73037f41b4a6519_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20190723/20190723175221_deeabccce84b0dcdd73037f41b4a6519_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20190723/20190723175221_deeabccce84b0dcdd73037f41b4a6519_1_mwpm_03200403.jpg"},{"uniquekey":"0e7687980baf0bb17a06cca10d9c35ee","title":"张子枫想养的三种宠物，袋鼠和猴子能接受，最后一种吓坏彭昱畅","date":"2019-07-23 17:52","category":"头条","author_name":"光明网","url":"http://mini.eastday.com/mobile/190723175213192.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20190723/20190723175213_d2847f32f0d795ef24946c9425a79e97_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20190723/20190723175213_d2847f32f0d795ef24946c9425a79e97_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20190723/20190723175213_d2847f32f0d795ef24946c9425a79e97_2_mwpm_03200403.jpg"},{"uniquekey":"912d418457c777e343ce0f59747c87ff","title":"麒麟810加持：荣耀9X来了，1399起横扫友商！","date":"2019-07-23 17:52","category":"头条","author_name":"机智玩机机","url":"http://mini.eastday.com/mobile/190723175202206.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190723/2019072317_95384223bc8c4778a539dc39af8e28a6_7977_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190723/2019072317_1a0fdffe746545ba8bb119f3dd0248a6_1840_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190723/2019072317_880fc01493f94844abcbcbe1179613f4_4027_cover_mwpm_03200403.jpg"},{"uniquekey":"8dbd22c818438f94cf5b13a1e27fa6a8","title":"杨幂旗下4朵金花，热巴黄梦莹祝绪丹熬出头，唯独她还不火","date":"2019-07-23 17:51","category":"头条","author_name":"光明网","url":"http://mini.eastday.com/mobile/190723175147182.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20190723/20190723175147_14a6b9a7bdcb4370de2a05a06af1dd1f_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20190723/20190723175147_14a6b9a7bdcb4370de2a05a06af1dd1f_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20190723/20190723175147_14a6b9a7bdcb4370de2a05a06af1dd1f_4_mwpm_03200403.jpg"},{"uniquekey":"6973b319836ca9b59ca78670c5f234c4","title":"朋友装修的新房，色彩搭配非常漂亮，一个客厅尽显恬静优美！","date":"2019-07-23 17:51","category":"头条","author_name":"装修案例设计","url":"http://mini.eastday.com/mobile/190723175144924.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190723/20190723175144_30a0d08abdc1a3567511030388ff7f31_12_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190723/20190723175144_30a0d08abdc1a3567511030388ff7f31_11_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20190723/20190723175144_30a0d08abdc1a3567511030388ff7f31_9_mwpm_03200403.jpg"},{"uniquekey":"91f185415e6fd112289caf995f444af6","title":"印度\u201c月船2号\u201d探测器终于奔向月球 从去年4月推迟至今","date":"2019-07-23 17:50","category":"头条","author_name":"中国网","url":"http://mini.eastday.com/mobile/190723175036719.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20190723/20190723175036_503a93cd1b2e104f97ee6ec7c22fa912_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20190723/20190723175036_503a93cd1b2e104f97ee6ec7c22fa912_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20190723/20190723175036_503a93cd1b2e104f97ee6ec7c22fa912_1_mwpm_03200403.jpg"},{"uniquekey":"f80c854683058cb9247a262d7318d6f0","title":"减肥人士推荐的4种刮油水果，苹果效果最佳，瘦到九十斤不是梦","date":"2019-07-23 17:49","category":"头条","author_name":"北巷不夏","url":"http://mini.eastday.com/mobile/190723174920311.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190723/2019072317_a6b55f3d301842ffabf1e195c0cbbddc_8725_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190723/2019072317_12145a3b99bf4ff1a5527d6ead10d45a_4323_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20190723/2019072317_7be3397ba42f49069ba0269eedc428e5_3945_mwpm_03200403.jpg"},{"uniquekey":"a82c7657346ceb88435b4a8c3bc82a4f","title":"印度成功发射\u201c月船2号\u201d月球探测器 预计9月实施月球着陆","date":"2019-07-23 17:49","category":"头条","author_name":"北青网","url":"http://mini.eastday.com/mobile/190723174903539.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190723/20190723174903_83e6fa0820ddad6d068adc00d2a3b2a4_1_mwpm_03200403.jpg"},{"uniquekey":"0be87c32ff75700559d31ba89b39a237","title":"药茶养生怎么喝\u2014\u2014春养肝、夏通心、秋润肺、冬健肾","date":"2019-07-23 17:47","category":"头条","author_name":"洛施花舍玫瑰花茶清清","url":"http://mini.eastday.com/mobile/190723174716439.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190723/20190723174716_2c41d9883a9346848fab3f8c66854803_7_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190723/20190723174716_2c41d9883a9346848fab3f8c66854803_8_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190723/20190723174716_2c41d9883a9346848fab3f8c66854803_9_mwpm_03200403.jpg"},{"uniquekey":"16b06d4922e449365966de9a287d220a","title":"变速箱油多久更换一次？别超过这个时间，免得变速箱大修","date":"2019-07-23 17:47","category":"头条","author_name":"SUV大师","url":"http://mini.eastday.com/mobile/190723174714392.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20190723/2019072317_4f84f28840454d66adfddbe13e8948a7_2286_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20190723/2019072317_bd493f8f4129468d9fd5456bcb9e58eb_3930_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20190723/2019072317_1b5b3c5db21b40628469c0646aedbf31_9004_mwpm_03200403.jpg"},{"uniquekey":"0ea524675267598f9f63c7cf8817da8d","title":"段浩雨：黄金投资难赚钱？这几个盈利技巧你肯定不知道！","date":"2019-07-23 17:46","category":"头条","author_name":"段浩雨讲市","url":"http://mini.eastday.com/mobile/190723174648130.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190723/2019072317_ba781b7e4a9549fab3196670793f0e1a_6387_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190723/2019072317_609819664fda4bd48c34072fd7de044f_2789_mwpm_03200403.jpg"},{"uniquekey":"ac83c31ac98b9c3dba659b1b98f4a037","title":"石榴皮的六大功效！石榴皮煮水喝有什么作用？你绝对想不到！","date":"2019-07-23 17:46","category":"头条","author_name":"掌心的回忆","url":"http://mini.eastday.com/mobile/190723174617388.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190723/2019072317_3a9299fc5c7c4b6eb39dd1bab61984c8_5809_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190723/2019072317_6eb0589056594666a8a9122d932efbf7_6949_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20190723/2019072317_ff56845c4f764970bf459ca88e3bc8ee_2240_mwpm_03200403.jpg"},{"uniquekey":"7f5eba4f9116cd7a33468e53f2dda748","title":"女子往小黄瓜里挂个可乐瓶，结果两个月后，神奇的事情发生了！","date":"2019-07-23 17:46","category":"头条","author_name":"每天搞笑笑话","url":"http://mini.eastday.com/mobile/190723174607573.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20190723/2019072317_560b628d8f54460a96fe05584093546d_8926_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20190723/2019072317_b49dc77d62874ad78ecb6ed74949db23_8766_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20190723/2019072317_e009bdf71e614e8695308673efa440e4_4151_mwpm_03200403.jpg"},{"uniquekey":"be1ab397d4ae90a648c650e02e7c37bb","title":"全系麒麟810+超强夜拍 荣耀9X正式发布 售价1399元起","date":"2019-07-23 17:45","category":"头条","author_name":"TechWeb.com.cn","url":"http://mini.eastday.com/mobile/190723174509698.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20190723/20190723174509_09c3cc02b6b75796f1d8dffaddda5bd3_1_mwpm_03200403.jpg"}]
         */
        @Id(autoincrement = true)
        private Long id;
        private String stat;
        @Convert(converter = NewsConvert.class , columnType = String.class)
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean implements Serializable, MultiItemEntity {
            /**
             * uniquekey : ff9dc82ef29d5e8b464fd8d7bcf469c1
             * title : 全球最大集装箱巨轮首航深圳盐田港区
             * date : 2019-07-23 18:19
             * category : 头条
             * author_name : 中国新闻网
             * url : http://mini.eastday.com/mobile/190723181915882.html
             * thumbnail_pic_s : http://02imgmini.eastday.com/mobile/20190723/20190723181915_cf003b9d0afe66b85c10fa131331bfd6_1_mwpm_03200403.jpg
             * thumbnail_pic_s02 : http://02imgmini.eastday.com/mobile/20190723/20190723181915_cf003b9d0afe66b85c10fa131331bfd6_2_mwpm_03200403.jpg
             * thumbnail_pic_s03 : http://09imgmini.eastday.com/mobile/20190723/20190723181636_dc8567a3c4451c502b4b5db1ff5e258e_7_mwpm_03200403.jpg
             */
            //显示形式多图
            public static final int TYPE_DOC_SLIDEIMG = 1;
            public static final int TYPE_DOC_SLIDEIMG1 = 2;
            private static final long serialVersionUID = -8045384665677175225L;

            public DataBean(int itemType) {
                this.itemType = itemType;
            }

            @Override
            public int getItemType() {
                return itemType;
            }
            public int itemType;
            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }


        }
    }
}
