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

val HugeIcons.MicOff01: ImageVector
    get() {
        if (_micOff01 != null) {
            return _micOff01!!
        }
        _micOff01 = ImageVector.Builder(
            name = "MicOff01",
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
            moveTo(8.1572f, 4.1572f)
            curveTo(8.94761f, 2.86349f, 10.373f, 2f, 12f, 2f)
            curveTo(14.4853f, 2f, 16.5f, 4.01472f, 16.5f, 6.5f)
            verticalLineTo(11.5f)
            curveTo(16.5f, 11.8111f, 16.4684f, 12.1149f, 16.4083f, 12.4083f)
            moveTo(7.5f, 7.5f)
            verticalLineTo(11.5f)
            curveTo(7.5f, 13.9853f, 9.51472f, 16f, 12f, 16f)
            curveTo(13.1154f, 16f, 14.136f, 15.5942f, 14.9222f, 14.9222f)
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
            moveTo(12f, 19f)
            horizontalLineTo(11.5828f)
            curveTo(8.07267f, 19f, 5.07706f, 16.4623f, 4.5f, 13f)
            moveTo(12f, 19f)
            horizontalLineTo(12.4172f)
            curveTo(14.2325f, 19f, 15.9102f, 18.3213f, 17.1869f, 17.1869f)
            moveTo(12f, 19f)
            verticalLineTo(22f)
            moveTo(19.5f, 13f)
            curveTo(19.3878f, 13.6733f, 19.1841f, 14.3116f, 18.903f, 14.903f)
        }
        }.build()

        return _micOff01!!
    }

private var _micOff01: ImageVector? = null
