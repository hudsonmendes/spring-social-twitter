package org.springframework.social.twitter.api.impl;

public enum TwitterApiUriResourceForStandard {
	BLOCKS("blocks/list.json"),
	BLOCKS_IDS("blocks/ids.json"),
	BLOCKS_CREATE("blocks/create.json"),
	BLOCKS_DESTROY("blocks/destroy.json"),
	
	DIRECTMESSAGES("direct_messages.json"),
	DIRECTMESSAGES_SENT("direct_messages/sent.json"),
	DIRECTMESSAGES_SHOW("direct_messages/show.json"),
	DIRECTMESSAGES_NEW("direct_messages/new.json"),
	DIRECTMESSAGES_DESTROY("direct_messages/destroy.json"),
	
	FRIENDS("friends/list.json"),
	FRIENDS_IDS("friends/ids.json"),
	
	FOLLOWERS("followers/list.json"),
	FOLLOWERS_IDS("followers/ids.json"),
	
	FRIENDSHIPS_CREATE("friendships/create.json"),
	FRIENDSHIPS_DESTROY("friendships/destroy.json"),
	FRIENDSHIPS_UPDATE("friendships/update.json"),
	FRIENDSHIPS_INCOMING("friendships/incoming.json"),
	FRIENDSHIPS_OUTGOING("friendships/outgoing.json"),
	
	LISTS("lists/list.json"),
	LISTS_SHOW("lists/show.json"),
	LISTS_CREATE("lists/create.json"),
	LISTS_UPDATE("lists/update.json"),
	LISTS_DESTROY("lists/destroy.json"),
	LISTS_STATUSES("lists/statuses.json"),
	
	LISTS_SUBSCRIBERS("lists/subscribers.json"),
	LISTS_SUBSCRIBERS_SHOW("lists/subscribers/show.json"),
	LISTS_SUBSCRIBERS_CREATE("lists/subscribers/create.json"),
	LISTS_SUBSCRIBERS_DESTROY("lists/subscribers/destroy.json"),
	
	LISTS_MEMBERS("lists/members.json"),
	LISTS_MEMBERS_SHOW("lists/members/show.json"),
	LISTS_MEMBERS_CREATE_ALL("lists/members/create_all.json"),
	LISTS_MEMBERS_DESTROY("lists/members/destroy.json"),
	
	LISTS_MEMBERSHIPS("lists/memberships.json"),
	LISTS_SUBSCRIPTIONS("lists/subscriptions.json"),
	
	GEO_ID("geo/id/:place_id.json"),
	GEO_PLACE("geo/place.json"),
	GEO_SEARCH("geo/search.json"),
	GEO_SIMILAR_PLACES("geo/similar_places.json"),
	GEO_REVERSE_GEOCODE("geo/reverse_geocode.json"),
	
	SAVED_SEARCHES_LIST("saved_searches/list.json"),
	SAVED_SEARCHES_SHOW("saved_searches/show/:search_id.json"),
	SAVED_SEARCHES_CREATE("saved_searches/create.json"),
	SAVED_SEARCHES_DESTROY("saved_searches/destroy/:search_id.json"),
	
	SEARCH_TWEETS("search/tweets.json"),
	
	TRENDS_PLACE("trends/place.json");
	
	private final String name;
	
	TwitterApiUriResourceForStandard(String path) {
		this.name = path;
	}
	
	public String getPath() {
		return this.name;
	}
}
