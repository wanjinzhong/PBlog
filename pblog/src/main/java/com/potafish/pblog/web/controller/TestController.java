package com.potafish.pblog.web.controller;

import com.potafish.pblog.dao.entity.ArticleHeader;
import com.potafish.pblog.dao.entity.ArticleRevision;
import com.potafish.pblog.dao.entity.Category;
import com.potafish.pblog.dao.entity.Comment;
import com.potafish.pblog.dao.entity.Feedback;
import com.potafish.pblog.dao.entity.LoginLog;
import com.potafish.pblog.dao.entity.Notify;
import com.potafish.pblog.dao.entity.NotifyReceiver;
import com.potafish.pblog.dao.entity.Subscription;
import com.potafish.pblog.dao.entity.SystemProfile;
import com.potafish.pblog.dao.entity.SystemVersion;
import com.potafish.pblog.dao.entity.Tag;
import com.potafish.pblog.dao.entity.User;
import com.potafish.pblog.dao.entity.UserProfile;
import com.potafish.pblog.service.ArticleService;
import com.potafish.pblog.service.CategoryService;
import com.potafish.pblog.service.CommentService;
import com.potafish.pblog.service.FeedbackService;
import com.potafish.pblog.service.LoginLogService;
import com.potafish.pblog.service.NotifyReceiverService;
import com.potafish.pblog.service.NotifyService;
import com.potafish.pblog.service.SubscriptionService;
import com.potafish.pblog.service.SystemProfileService;
import com.potafish.pblog.service.SystemVersionService;
import com.potafish.pblog.service.TagService;
import com.potafish.pblog.service.UserProfileService;
import com.potafish.pblog.service.UserService;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api
public class TestController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserProfileService userProfileService;

    @Autowired
    private ArticleService articleService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private TagService tagService;

    @Autowired
    private CommentService commentService;

    @Autowired
    private SubscriptionService subscriptionService;

    @Autowired
    private NotifyService notifyService;

    @Autowired
    private NotifyReceiverService notifyReceiverService;

    @Autowired
    private LoginLogService loginLogService;

    @Autowired
    private SystemVersionService systemVersionService;

    @Autowired
    private SystemProfileService systemProfileService;

    @Autowired
    private FeedbackService feedbackService;

    private static Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value = "user/{id}", method = RequestMethod.GET)
    public String findUserById(@PathVariable(value = "id") Long id) {
        User user = userService.findById(id);
        return user.getId() + ": " + user.getLoginName();
//        logger.debug("id: " + id);
//        return id + "";
    }

    @RequestMapping(value = "userProfile/{id}", method = RequestMethod.GET)
    public String findUserProfileById(@PathVariable(value = "id") Long id) {
        UserProfile userProfile = userProfileService.findById(id);
        return userProfile.toString();
    }

    @RequestMapping(value = "articleHeader/id/{id}", method = RequestMethod.GET)
    public String findArticleHeaderById(@PathVariable(value = "id") Long id) {
        ArticleHeader articleHeader = articleService.getArticleHeaderById(id);
        return articleHeader.toString();
    }

    @RequestMapping(value = "articleRevision/articleId/{articleId}/revision/{revision}", method = RequestMethod.GET)
    public String findArticleRevisionById(@PathVariable(value = "articleId") Long articleId,
                                          @PathVariable(value = "revision") Integer revision) {
        ArticleRevision articleRevision = articleService.getArticleRevisionById(articleId, revision);
        return articleRevision.toString();
    }

    @RequestMapping(value = "category/{id}", method = RequestMethod.GET)
    public String findCategoryById(@PathVariable(value = "id") Long id) {
        Category category = categoryService.findById(id);
        return category.toString();
    }

    @RequestMapping(value = "tag/{id}", method = RequestMethod.GET)
    public String findTagById(@PathVariable(value = "id") Long id) {
        Tag tag = tagService.findById(id);
        return tag.toString();
    }

    @RequestMapping(value = "comment/{id}", method = RequestMethod.GET)
    public String findCommentById(@PathVariable(value = "id") Long id) {
        Comment comment = commentService.findById(id);
        return comment.toString();
    }

    @RequestMapping(value = "subscription/{id}", method = RequestMethod.GET)
    public String findSubscriptionId(@PathVariable(value = "id") Long id) {
        Subscription subscription = subscriptionService.findById(id);
        return subscription.toString();
    }

    @RequestMapping(value = "notify/{id}", method = RequestMethod.GET)
    public String findNotifyId(@PathVariable(value = "id") Long id) {
        Notify notify = notifyService.findById(id);
        return notify.toString();
    }

    @RequestMapping(value = "notifyReceiver/{id}", method = RequestMethod.GET)
    public String findNotifyReceiverId(@PathVariable(value = "id") Long id) {
        NotifyReceiver notifyReceiver = notifyReceiverService.findById(id);
        return notifyReceiver.toString();
    }

    @RequestMapping(value = "loginLog/{id}", method = RequestMethod.GET)
    public String findLoginLogId(@PathVariable(value = "id") Long id) {
        LoginLog loginLog = loginLogService.findById(id);
        return loginLog.toString();
    }

    @RequestMapping(value = "systemVersion/{id}", method = RequestMethod.GET)
    public String findSystemVersionId(@PathVariable(value = "id") Long id) {
        SystemVersion systemVersion = systemVersionService.findById(id);
        return systemVersion.toString();
    }

    @RequestMapping(value = "systemProfile/{id}", method = RequestMethod.GET)
    public String findSystemProfileId(@PathVariable(value = "id") Long id) {
        SystemProfile systemProfile = systemProfileService.findById(id);
        return systemProfile.toString();
    }

}
