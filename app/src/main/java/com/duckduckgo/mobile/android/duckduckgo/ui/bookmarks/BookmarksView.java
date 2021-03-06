package com.duckduckgo.mobile.android.duckduckgo.ui.bookmarks;

import android.support.annotation.NonNull;

import java.util.List;

/**
 * Created by fgei on 6/12/17.
 */

public interface BookmarksView {
    void loadBookmarks(@NonNull List<BookmarkEntity> bookmarks);

    void showEmpty(boolean empty);

    void showEditButton(boolean visible);

    void showEditMode();

    void dismissEditMode();

    void close();

    void showEditBookmark(@NonNull BookmarkEntity bookmarkEntity);

    void resultOpenBookmark(@NonNull BookmarkEntity bookmarkEntity);
}
