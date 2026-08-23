package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MicOff02: ImageVector
    get() {
        if (_micOff02 != null) {
            return _micOff02!!
        }
        _micOff02 = ImageVector.Builder(
            name = "MicOff02",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12f, 18f)
            verticalLineTo(22f)
            moveTo(12f, 18f)
            horizontalLineTo(11.5208f)
            curveTo(8.11765f, 18f, 5.28262f, 15.3914f, 5f, 12f)
            moveTo(12f, 18f)
            horizontalLineTo(12.4792f)
            curveTo(14.0193f, 18f, 15.443f, 17.4658f, 16.5665f, 16.5665f)
            moveTo(12f, 22f)
            horizontalLineTo(15f)
            moveTo(12f, 22f)
            horizontalLineTo(9f)
            moveTo(19f, 12f)
            curveTo(18.93f, 12.8406f, 18.7031f, 13.6331f, 18.3497f, 14.3497f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(8.3535f, 4.3535f)
            curveTo(8.98114f, 2.96566f, 10.3778f, 2f, 12f, 2f)
            curveTo(14.2091f, 2f, 16f, 3.79086f, 16f, 6f)
            verticalLineTo(11f)
            curveTo(16f, 11.309f, 15.965f, 11.6098f, 15.8987f, 11.8987f)
            moveTo(8f, 8f)
            verticalLineTo(11f)
            curveTo(8f, 13.2091f, 9.79086f, 15f, 12f, 15f)
            curveTo(12.8492f, 15f, 13.6365f, 14.7354f, 14.2841f, 14.2841f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2f, 2f)
            lineTo(22f, 22f)
        }
        }.build()

        return _micOff02!!
    }

private var _micOff02: ImageVector? = null
