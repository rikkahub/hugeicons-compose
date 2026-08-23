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

val HugeIcons.RefreshCwOff: ImageVector
    get() {
        if (_refreshCwOff != null) {
            return _refreshCwOff!!
        }
        _refreshCwOff = ImageVector.Builder(
            name = "RefreshCwOff",
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
            moveTo(3f, 3.00012f)
            lineTo(21f, 21.0001f)
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
            moveTo(19.5f, 6.50012f)
            curveTo(17.5f, 4.00012f, 15f, 3.00012f, 12f, 3.00012f)
            curveTo(10.8144f, 3.00012f, 9.68239f, 3.22936f, 8.64581f, 3.64593f)
            moveTo(4.5f, 17.5001f)
            curveTo(6.5f, 20.0001f, 9f, 21.0001f, 12f, 21.0001f)
            curveTo(14.4853f, 21.0001f, 16.7353f, 19.9928f, 18.364f, 18.3641f)
            moveTo(20.9451f, 11.0001f)
            curveTo(20.9814f, 11.3285f, 21f, 11.6621f, 21f, 12.0001f)
            curveTo(21f, 13.1857f, 20.7708f, 14.3177f, 20.3542f, 15.3543f)
            moveTo(3.05493f, 13.0001f)
            curveTo(3.01863f, 12.6718f, 3f, 12.3381f, 3f, 12.0001f)
            curveTo(3f, 9.51484f, 4.00736f, 7.26484f, 5.63604f, 5.63616f)
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
            moveTo(16f, 6.77886f)
            curveTo(16f, 6.77886f, 19.2808f, 7.27671f, 19.7787f, 6.77883f)
            curveTo(20.2766f, 6.28096f, 19.7787f, 3.00012f, 19.7787f, 3.00012f)
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
            moveTo(8f, 17.2211f)
            curveTo(8f, 17.2211f, 4.71917f, 16.7233f, 4.22128f, 17.2212f)
            curveTo(3.72339f, 17.719f, 4.22129f, 20.9999f, 4.22129f, 20.9999f)
        }
        }.build()

        return _refreshCwOff!!
    }

private var _refreshCwOff: ImageVector? = null
