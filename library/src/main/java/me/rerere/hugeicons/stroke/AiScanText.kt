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

val HugeIcons.AiScanText: ImageVector
    get() {
        if (_aiScanText != null) {
            return _aiScanText!!
        }
        _aiScanText = ImageVector.Builder(
            name = "AiScanText",
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
            moveTo(7f, 14.5f)
            horizontalLineTo(17f)
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
            moveTo(7f, 9.5f)
            horizontalLineTo(13f)
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
            moveTo(16.5f, 21.5f)
            curveTo(17.4293f, 21.5f, 17.894f, 21.5f, 18.2804f, 21.4231f)
            curveTo(19.8671f, 21.1075f, 21.1075f, 19.8671f, 21.4231f, 18.2804f)
            curveTo(21.5f, 17.894f, 21.5f, 17.4293f, 21.5f, 16.5f)
            moveTo(7.5f, 21.5f)
            curveTo(6.57069f, 21.5f, 6.10603f, 21.5f, 5.71964f, 21.4231f)
            curveTo(4.13288f, 21.1075f, 2.89249f, 19.8671f, 2.57686f, 18.2804f)
            curveTo(2.5f, 17.894f, 2.5f, 17.4293f, 2.5f, 16.5f)
            moveTo(7.5f, 2.5f)
            curveTo(6.57069f, 2.5f, 6.10603f, 2.5f, 5.71964f, 2.57686f)
            curveTo(4.13288f, 2.89249f, 2.89249f, 4.13288f, 2.57686f, 5.71964f)
            curveTo(2.5f, 6.10603f, 2.5f, 6.57069f, 2.5f, 7.5f)
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
            moveTo(19f, 3.4375f)
            verticalLineTo(5f)
            moveTo(19f, 5f)
            verticalLineTo(6.5625f)
            moveTo(19f, 5f)
            horizontalLineTo(17.75f)
            moveTo(19f, 5f)
            horizontalLineTo(20.25f)
            moveTo(21.5f, 5f)
            lineTo(20.4156f, 4.63852f)
            curveTo(19.9179f, 4.47263f, 19.5274f, 4.08211f, 19.3615f, 3.58443f)
            lineTo(19f, 2.5f)
            lineTo(18.6385f, 3.58443f)
            curveTo(18.4726f, 4.08211f, 18.0821f, 4.47263f, 17.5844f, 4.63852f)
            lineTo(16.5f, 5f)
            lineTo(17.5844f, 5.36148f)
            curveTo(18.0821f, 5.52737f, 18.4726f, 5.91789f, 18.6385f, 6.41557f)
            lineTo(19f, 7.5f)
            lineTo(19.3615f, 6.41557f)
            curveTo(19.5274f, 5.91789f, 19.9179f, 5.52737f, 20.4156f, 5.36148f)
            lineTo(21.5f, 5f)
            close()
        }
        }.build()

        return _aiScanText!!
    }

private var _aiScanText: ImageVector? = null
