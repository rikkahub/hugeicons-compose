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

val HugeIcons.PlayListAdd: ImageVector
    get() {
        if (_playListAdd != null) {
            return _playListAdd!!
        }
        _playListAdd = ImageVector.Builder(
            name = "PlayListAdd",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(1.99988f, 7f)
            horizontalLineTo(20.9999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(16.4999f, 2f)
            lineTo(13.4999f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(9.49988f, 2f)
            lineTo(6.49988f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(11.5001f, 21f)
            curveTo(7.02172f, 21f, 4.78255f, 21f, 3.3913f, 19.6088f)
            curveTo(2.00006f, 18.2175f, 2.00006f, 15.9783f, 2.00006f, 11.5f)
            curveTo(2.00006f, 7.02166f, 2.00006f, 4.78249f, 3.3913f, 3.39124f)
            curveTo(4.78255f, 2f, 7.02172f, 2f, 11.5001f, 2f)
            curveTo(15.9784f, 2f, 18.2176f, 2f, 19.6088f, 3.39124f)
            curveTo(21.0001f, 4.78249f, 21.0001f, 7.02166f, 21.0001f, 11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(14f, 18f)
            horizontalLineTo(22f)
            moveTo(18f, 22f)
            lineTo(18f, 14f)
        }
        }.build()

        return _playListAdd!!
    }

private var _playListAdd: ImageVector? = null
