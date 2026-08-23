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

val HugeIcons.PlayListRemove: ImageVector
    get() {
        if (_playListRemove != null) {
            return _playListRemove!!
        }
        _playListRemove = ImageVector.Builder(
            name = "PlayListRemove",
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
            moveTo(2f, 7f)
            horizontalLineTo(21f)
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
            moveTo(16.5f, 2f)
            lineTo(13.5f, 7f)
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
            moveTo(9.5f, 2f)
            lineTo(6.5f, 7f)
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
            moveTo(11.5f, 21f)
            curveTo(7.02166f, 21f, 4.78249f, 21f, 3.39124f, 19.6088f)
            curveTo(2f, 18.2175f, 2f, 15.9783f, 2f, 11.5f)
            curveTo(2f, 7.02166f, 2f, 4.78249f, 3.39124f, 3.39124f)
            curveTo(4.78249f, 2f, 7.02166f, 2f, 11.5f, 2f)
            curveTo(15.9783f, 2f, 18.2175f, 2f, 19.6088f, 3.39124f)
            curveTo(21f, 4.78249f, 21f, 7.02166f, 21f, 11.5f)
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
            moveTo(15f, 15f)
            lineTo(18.5f, 18.5f)
            moveTo(18.5f, 18.5f)
            lineTo(22f, 22f)
            moveTo(18.5f, 18.5f)
            lineTo(15f, 22f)
            moveTo(18.5f, 18.5f)
            lineTo(22f, 15f)
        }
        }.build()

        return _playListRemove!!
    }

private var _playListRemove: ImageVector? = null
