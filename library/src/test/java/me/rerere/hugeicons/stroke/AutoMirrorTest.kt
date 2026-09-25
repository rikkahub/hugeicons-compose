package me.rerere.hugeicons.stroke

import me.rerere.hugeicons.HugeIcons
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class AutoMirrorTest {
    @Test
    fun directionalIcons_areAutoMirrored() {
        listOf(
            HugeIcons.ArrowLeft01,
            HugeIcons.ArrowRight01,
            HugeIcons.ChevronLeft,
            HugeIcons.Undo,
            HugeIcons.Redo,
            HugeIcons.Reply,
            HugeIcons.Send,
            HugeIcons.Logout01,
            HugeIcons.TextIndentMore,
        ).forEach { icon ->
            assertTrue(icon.name, icon.autoMirror)
        }
    }

    @Test
    fun nonDirectionalIcons_areNotAutoMirrored() {
        listOf(
            HugeIcons.Internet,
            HugeIcons.ArrowUp01,
            HugeIcons.ArrowUpRight01,
            HugeIcons.FastForward,
            HugeIcons.MouseLeftClick01,
            HugeIcons.LeftToRightListBullet,
            HugeIcons.RightToLeftListBullet,
        ).forEach { icon ->
            assertFalse(icon.name, icon.autoMirror)
        }
    }
}
