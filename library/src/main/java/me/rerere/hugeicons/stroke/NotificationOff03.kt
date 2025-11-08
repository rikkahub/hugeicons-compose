package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.NotificationOff03: ImageVector
    get() {
        if (_notificationOff03 != null) {
            return _notificationOff03!!
        }
        _notificationOff03 = ImageVector.Builder(
            name = "NotificationOff03",
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
        moveTo(19.5229f, 19.5229f)
        curveTo(18.4076f, 20.6761f, 15.4604f, 21.5f, 12f, 21.5f)
        curveTo(7.58172f, 21.5f, 4f, 20.1569f, 4f, 18.5f)
        curveTo(4f, 16.8431f, 7.58172f, 15.5f, 12f, 15.5f)
        curveTo(13.4057f, 15.5f, 14.7268f, 15.636f, 15.8747f, 15.8747f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 18.5f)
        horizontalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 2f)
        lineTo(22f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 18.5011f)
        lineTo(5.65098f, 7.93407f)
        curveTo(5.74763f, 7.3155f, 5.93052f, 6.72907f, 6.18626f, 6.18626f)
        moveTo(7.94277f, 3.94277f)
        curveTo(9.05576f, 3.03642f, 10.473f, 2.5f, 12f, 2.5f)
        curveTo(15.166f, 2.5f, 17.8603f, 4.80601f, 18.349f, 7.93407f)
        lineTo(19.5369f, 15.5369f)
        }
        }.build()

        return _notificationOff03!!
    }

private var _notificationOff03: ImageVector? = null
