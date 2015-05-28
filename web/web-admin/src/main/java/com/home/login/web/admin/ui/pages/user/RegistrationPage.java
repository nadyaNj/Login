package com.home.login.web.admin.ui.pages.user;

import com.home.login.web.admin.ui.pages.user.helper.UserPageHelper;
import com.home.login.web.admin.ui.pages.user.model.UserPageModel;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.datetime.StyleDateConverter;
import org.apache.wicket.datetime.markup.html.form.DateTextField;
import org.apache.wicket.extensions.yui.calendar.DatePicker;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.RadioChoice;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.spring.injection.annot.SpringBean;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created: Nadya Dainelyan
 * DATE:    5/27/15
 * TIME:    12:09 AM
 */
public class RegistrationPage extends WebPage{

    private static final long serialVersionUID = -5411197724781673428L;

    private static final List<String> TYPES = Arrays.asList(new String[]{"male", "female"});

    /*dependencies*/
    @SpringBean
    private UserPageHelper userPageHelper;


    /*Properties*/
    private final UserPageModel pageModel;


    /*Constructor*/
    public RegistrationPage() {
        pageModel = new UserPageModel();

        add(new RegistrationForm("registrationForm"));
    }


    /**
     * Registration form
     */
    private class RegistrationForm extends Form<Void> {

        /*Constructor*/
        public RegistrationForm(final String id) {
            super(id);

            initRegistrationForm();
        }


        /**
         * Initializing registration form
         */
        private void initRegistrationForm() {
            final RequiredTextField<String> username = new RequiredTextField<>("name", new PropertyModel<>(pageModel, "name"));
            add(username);

            final PasswordTextField password = new PasswordTextField("password", new PropertyModel<>(pageModel, "password"));
            add(password);

            final RequiredTextField<String> firstName = new RequiredTextField<>("firstName", new PropertyModel<>(pageModel, "firstName"));
            add(firstName);


            final RequiredTextField<String> secondName = new RequiredTextField<>("secondName", new PropertyModel<>(pageModel, "secondName"));
            add(secondName);

            RadioChoice<String> gender = new RadioChoice<String>("gender", new PropertyModel<String>(this, "selected"), TYPES);
            add(gender);

            //Date field
            DateTextField birthday = new DateTextField("birthDay",
                    new PropertyModel<Date>(this, "date"), new StyleDateConverter("S-", true));
            DatePicker datePicker = new DatePicker();
            datePicker.setShowOnFieldClick(true);
            datePicker.setAutoHide(true);
            birthday.add(datePicker);
            add(birthday);

            add(new Save("save", this));
        }


        /**
         * Save button
         */
        private class Save extends AjaxButton {

            /*Constructor*/
            public Save(final String id, final Form<?> form) {
                super(id, form);
            }


            @Override
            protected void onSubmit(final AjaxRequestTarget target, final Form<?> form) {
                userPageHelper.createUser(pageModel);
            }

            @Override
            protected void onAfterSubmit(final AjaxRequestTarget target, final Form<?> form) {

            }

            @Override
            protected void onError(final AjaxRequestTarget target, final Form<?> form) {
                target.add(form);
            }
        }
    }
}
