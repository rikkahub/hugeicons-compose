package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.NotificationBlock01: ImageVector
    get() {
        if (_notificationBlock01 != null) {
            return _notificationBlock01!!
        }
        _notificationBlock01 = ImageVector.Builder(
            name = "NotificationBlock01",
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
        moveTo(15.5f, 18.5f)
        curveTo(15.5f, 20.433f, 13.933f, 22f, 12f, 22f)
        curveTo(10.067f, 22f, 8.5f, 20.433f, 8.5f, 18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 11.5f)
        verticalLineTo(12.7558f)
        curveTo(19f, 13.5514f, 19.3161f, 14.3145f, 19.8787f, 14.8771f)
        lineTo(20.4819f, 15.4803f)
        curveTo(20.8136f, 15.8121f, 21f, 16.262f, 21f, 16.7311f)
        curveTo(21f, 17.708f, 20.208f, 18.5f, 19.2311f, 18.5f)
        horizontalLineTo(4.76887f)
        curveTo(3.79195f, 18.5f, 3f, 17.708f, 3f, 16.7311f)
        curveTo(3f, 16.262f, 3.18636f, 15.8121f, 3.51809f, 15.4803f)
        lineTo(4.12132f, 14.8771f)
        curveTo(4.68393f, 14.3145f, 5f, 13.5514f, 5f, 12.7558f)
        verticalLineTo(10f)
        curveTo(5f, 6.13401f, 8.13401f, 3f, 12f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 3.5f)
        lineTo(19.5f, 7.5f)
        moveTo(21f, 5.5f)
        curveTo(21f, 3.567f, 19.433f, 2f, 17.5f, 2f)
        curveTo(15.567f, 2f, 14f, 3.567f, 14f, 5.5f)
        curveTo(14f, 7.433f, 15.567f, 9f, 17.5f, 9f)
        curveTo(19.433f, 9f, 21f, 7.433f, 21f, 5.5f)
        }
        }.build()

        return _notificationBlock01!!
    }

private var _notificationBlock01: ImageVector? = null
