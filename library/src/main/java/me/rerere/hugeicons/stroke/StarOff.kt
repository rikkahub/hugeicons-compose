package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.StarOff: ImageVector
    get() {
        if (_starOff != null) {
            return _starOff!!
        }
        _starOff = ImageVector.Builder(
            name = "StarOff",
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
        moveTo(18.5038f, 14.5f)
        lineTo(21.1477f, 11.8925f)
        curveTo(22.616f, 10.4206f, 22.1366f, 8.92853f, 20.099f, 8.58575f)
        lineTo(16.9128f, 8.05143f)
        curveTo(16.3734f, 7.9607f, 15.7342f, 7.48687f, 15.4945f, 6.99288f)
        lineTo(13.7366f, 3.44418f)
        curveTo(12.7877f, 1.51861f, 11.2296f, 1.51861f, 10.2707f, 3.44418f)
        lineTo(9.5f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.29561f, 7.99998f)
        curveTo(7.22668f, 8.02267f, 7.15848f, 8.04006f, 7.09201f, 8.05144f)
        lineTo(3.90008f, 8.58576f)
        curveTo(1.85885f, 8.92853f, 1.38856f, 10.4206f, 2.84945f, 11.8925f)
        lineTo(5.33095f, 14.3927f)
        curveTo(5.7512f, 14.8161f, 5.98134f, 15.6327f, 5.85126f, 16.2175f)
        lineTo(5.14083f, 19.3125f)
        curveTo(4.58049f, 21.7522f, 5.88128f, 22.7099f, 8.02257f, 21.4296f)
        lineTo(11.0144f, 19.6452f)
        curveTo(11.5647f, 19.3226f, 12.4553f, 19.3226f, 12.9956f, 19.6452f)
        lineTo(15.9874f, 21.4296f)
        curveTo(18.1387f, 22.7099f, 19.4295f, 21.7623f, 18.8691f, 19.3125f)
        lineTo(18.7974f, 19f)
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
        }.build()

        return _starOff!!
    }

private var _starOff: ImageVector? = null
