package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.InboxUnread: ImageVector
    get() {
        if (_inboxUnread != null) {
            return _inboxUnread!!
        }
        _inboxUnread = ImageVector.Builder(
            name = "InboxUnread",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 12f)
        verticalLineTo(12.5f)
        curveTo(21f, 16.9783f, 21f, 19.2175f, 19.6088f, 20.6088f)
        curveTo(18.2175f, 22f, 15.9783f, 22f, 11.5f, 22f)
        curveTo(7.02166f, 22f, 4.78249f, 22f, 3.39124f, 20.6088f)
        curveTo(2f, 19.2175f, 2f, 16.9783f, 2f, 12.5f)
        curveTo(2f, 8.02166f, 2f, 5.78249f, 3.39124f, 4.39124f)
        curveTo(4.78249f, 3f, 7.02166f, 3f, 11.5f, 3f)
        horizontalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 5.5f)
        curveTo(22f, 7.433f, 20.433f, 9f, 18.5f, 9f)
        curveTo(16.567f, 9f, 15f, 7.433f, 15f, 5.5f)
        curveTo(15f, 3.567f, 16.567f, 2f, 18.5f, 2f)
        curveTo(20.433f, 2f, 22f, 3.567f, 22f, 5.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 14f)
        horizontalLineTo(16.0743f)
        curveTo(15.2322f, 14f, 14.5706f, 14.7036f, 14.1995f, 15.4472f)
        curveTo(13.7963f, 16.2551f, 12.9889f, 17f, 11.5f, 17f)
        curveTo(10.0111f, 17f, 9.20373f, 16.2551f, 8.80054f, 15.4472f)
        curveTo(8.42942f, 14.7036f, 7.76777f, 14f, 6.92566f, 14f)
        horizontalLineTo(2f)
        }
        }.build()

        return _inboxUnread!!
    }

private var _inboxUnread: ImageVector? = null
