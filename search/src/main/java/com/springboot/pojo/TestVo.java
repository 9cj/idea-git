package com.springboot.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class TestVo implements Serializable {

    /**
     * original_qt : shoe
     * paid_suggestions : [{"id":1,"term":"nike.com -Shop Nike Factory Online","click_url":"https://bridge.sfo1.admarketplace.net/ct?version=16.0.0&key=1586063193401400015.1&ci=1586063193974.12195&aespFlag=altinst","image_url":"//cdn.45tu1c0.com/account/74521/200/1580329437.jpg","impression_url":"//imp.mt48.net/imp?id=7R7wxEzkiFdwxr3NJGbzfQbYftkW4tkW4BbWfC%2FW4Q%2FZfZ%2FW1Cxk7RcdIG7%2BGmwqgCld1pHW4QfX1CfkfplkfpbWfCDnxnEZGmzYI%3DEYgCbnHF3QJre%2BGmwqgC8Z1CHZ1ClZ7ncQHmzdJR3KiF2z4Z2dfQlnimE%2BjmzYIczvIpkZfZqZ1Cfa4Clnxr7kgCbnxGEwxRwKj%3DEYJCdZi%3DzwxYINj9fzfZlX4Qb%2B1pfa7n7NxmEKHreQgCbnHF4kjFcTGm4WHZkW5QbkftInIFEqGr4wxRIwxQdNI%3DEUImwUIBIdxr7KImEVGmwqgGTOHmAO1Q8T8nfO1Qfm4OWOxY8PfCDX5t7q8Q%2FdfplT8R%2FO1QlWfC8aKBIWjF7KiF2zfC8X1CDnHnwqI%3DEYGmwqgCby","label_required":false},{"id":2,"term":"kohls.com - Great Deals on Shoes","click_url":"https://bridge.sfo1.admarketplace.net/ct?version=16.0.0&key=1586063193401400015.2&ci=1586063193974.12195&aespFlag=altinst","image_url":"//cdn.45tu1c0.com/account/74004/200/1521228087224.jpg","impression_url":"//imp.mt48.net/imp?id=7R7wxEzkiFdwxr3NJGbzfQbYftkW4tkW4BbWfC%2FW4Q%2FZfZ%2FW1Cxk7RcdIG7%2BGmwqgCld1pHW4QfX1CfkfplkfpbWfCDnxnEZGmzYI%3DEYgCbnHF3QJre%2BGmwqgC8Z1CHY4QLd7ncQHmzdJR3KiF2z4Z2Wfp2nimE%2BjmzYIczvIpkZfC8a1plZfZqnxr7kgCbnxGEwxRwKj%3DEYJCdZi%3DzwxYINj9fzfZlX4Qb%2B1pfa7n7NxmEKHreQgCbnHF4kjFcTGm4WHZkW5QbX1BInIFEqGr4wxRIwxQdNI%3DEUImwUIBIdxr7KImEVGmwqgGTOHmAO1Q8T8nfO1Qfm4OWOxY8PfCDX5t7q8Q%2FdfplT8R%2FO1QlWfC8aKBIWjF7KiF2zfC8X1CDnHnwqI%3DEYGmwqgCby","label_required":false},{"id":3,"term":"rakuten.com - Get Shoe Carnival Promo Codes","click_url":"https://bridge.sfo1.ap01.net/ct?version=16.0.0&key=1586063193401400015.3&ci=1586063193974.12195&aespFlag=altinst","image_url":"//cdn.45tu1c0.com/account/74373/200/1521228087365.jpg","impression_url":"//imp.mt48.net/imp?id=7R7wxEzkiFdwxr3NJGbzfQbYftkW4tkW4BbWfC%2FW4Q%2FZfZ%2FW1Cxk7RcdIG7%2BGmwqgCld1pHW4QfX1CfkfplkfpbWfCDnxnEZGmzYI%3DEYgCbnHF3QJre%2BGmwqgC8Z4C8m4ZHd7ncQHmzdJR3KiF2z4Z2Z4ZfnimE%2BjmzYIczvIpkZfZxafZLWfplnxr7kgCbnxGEwxRwKj%3DEYJCdZi%3Dzw8%3D4Nxn%2BvjncT7nckxZkZfClmfpqafZLnHncZIEzQx%3DfzftINHr3dHFXKHreQgCbUfCl%2B7nIwIF3KxmEYjnEYgFcqIF%2BRiF%2Bw7REZxwzRIFzKiF2zsY7QJY8PfOWOHY8PfZHm5t7Z8Q%2FX4ClT8n2O1QDWfBWOsO8PfCbXfQNz7RedHwzvIpkXfQl%2B4BIOiF3qIG7KiF2zfbyy","label_required":false}]
     * organic_suggestions : [{"term":"shoedazzle"},{"term":"shoes","paid_suggestion_ids":[1,2]},{"term":"shoe carnival","paid_suggestion_ids":[3]},{"term":"shoes for crews"},{"term":"shoebuy"},{"term":"shoe stores"},{"term":"shoemall"},{"term":"shoebox"}]
     */

    private String original_qt;
    private List<PaidSuggestionsBean> paid_suggestions;
    private List<OrganicSuggestionsBean> organic_suggestions;

    public String getOriginal_qt() {
        return original_qt;
    }

    public void setOriginal_qt(String original_qt) {
        this.original_qt = original_qt;
    }

    public List<PaidSuggestionsBean> getPaid_suggestions() {
        return paid_suggestions;
    }

    public void setPaid_suggestions(List<PaidSuggestionsBean> paid_suggestions) {
        this.paid_suggestions = paid_suggestions;
    }

    public List<OrganicSuggestionsBean> getOrganic_suggestions() {
        return organic_suggestions;
    }

    public void setOrganic_suggestions(List<OrganicSuggestionsBean> organic_suggestions) {
        this.organic_suggestions = organic_suggestions;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PaidSuggestionsBean {
        /**
         * id : 1
         * term : nike.com -Shop Nike Factory Online
         * click_url : https://bridge.sfo1.admarketplace.net/ct?version=16.0.0&key=1586063193401400015.1&ci=1586063193974.12195&aespFlag=altinst
         * image_url : //cdn.45tu1c0.com/account/74521/200/1580329437.jpg
         * impression_url : //imp.mt48.net/imp?id=7R7wxEzkiFdwxr3NJGbzfQbYftkW4tkW4BbWfC%2FW4Q%2FZfZ%2FW1Cxk7RcdIG7%2BGmwqgCld1pHW4QfX1CfkfplkfpbWfCDnxnEZGmzYI%3DEYgCbnHF3QJre%2BGmwqgC8Z1CHZ1ClZ7ncQHmzdJR3KiF2z4Z2dfQlnimE%2BjmzYIczvIpkZfZqZ1Cfa4Clnxr7kgCbnxGEwxRwKj%3DEYJCdZi%3DzwxYINj9fzfZlX4Qb%2B1pfa7n7NxmEKHreQgCbnHF4kjFcTGm4WHZkW5QbkftInIFEqGr4wxRIwxQdNI%3DEUImwUIBIdxr7KImEVGmwqgGTOHmAO1Q8T8nfO1Qfm4OWOxY8PfCDX5t7q8Q%2FdfplT8R%2FO1QlWfC8aKBIWjF7KiF2zfC8X1CDnHnwqI%3DEYGmwqgCby
         * label_required : false
         */

        private int id;
        private String term;
        private String click_url;
        private String image_url;
        private String impression_url;
        private boolean label_required;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTerm() {
            return term;
        }

        public void setTerm(String term) {
            this.term = term;
        }

        public String getClick_url() {
            return click_url;
        }

        public void setClick_url(String click_url) {
            this.click_url = click_url;
        }

        public String getImage_url() {
            return image_url;
        }

        public void setImage_url(String image_url) {
            this.image_url = image_url;
        }

        public String getImpression_url() {
            return impression_url;
        }

        public void setImpression_url(String impression_url) {
            this.impression_url = impression_url;
        }

        public boolean isLabel_required() {
            return label_required;
        }

        public void setLabel_required(boolean label_required) {
            this.label_required = label_required;
        }
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class OrganicSuggestionsBean {
        /**
         * term : shoedazzle
         * paid_suggestion_ids : [1,2]
         */

        private String term;
        private List<Integer> paid_suggestion_ids;

        public String getTerm() {
            return term;
        }

        public void setTerm(String term) {
            this.term = term;
        }

        public List<Integer> getPaid_suggestion_ids() {
            return paid_suggestion_ids;
        }

        public void setPaid_suggestion_ids(List<Integer> paid_suggestion_ids) {
            this.paid_suggestion_ids = paid_suggestion_ids;
        }
    }
}
