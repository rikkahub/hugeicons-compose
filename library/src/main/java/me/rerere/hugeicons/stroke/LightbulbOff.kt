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

val HugeIcons.LightbulbOff: ImageVector
    get() {
        if (_lightbulbOff != null) {
            return _lightbulbOff!!
        }
        _lightbulbOff = ImageVector.Builder(
            name = "LightbulbOff",
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
            moveTo(5.14286f, 14f)
            curveTo(4.41735f, 12.8082f, 4f, 11.4118f, 4f, 9.91886f)
            curveTo(4f, 8.24668f, 4.52361f, 6.69556f, 5.41738f, 5.41738f)
            moveTo(8.03786f, 3.03786f)
            curveTo(9.20596f, 2.37741f, 10.5585f, 2f, 12f, 2f)
            curveTo(16.4183f, 2f, 20f, 5.5454f, 20f, 9.91886f)
            curveTo(20f, 11.3746f, 19.6032f, 12.7386f, 18.9107f, 13.9107f)
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
            moveTo(16f, 16f)
            horizontalLineTo(7f)
            lineTo(7.54415f, 17.6325f)
            curveTo(7.81638f, 18.4491f, 8.58066f, 19f, 9.44152f, 19f)
            lineTo(14.5585f, 19f)
            curveTo(15.4193f, 19f, 16.1836f, 18.4491f, 16.4558f, 17.6325f)
            lineTo(16.75f, 16.75f)
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
            moveTo(15f, 19f)
            lineTo(14.4558f, 20.6325f)
            curveTo(14.1836f, 21.4491f, 13.4193f, 22f, 12.5585f, 22f)
            horizontalLineTo(11.4415f)
            curveTo(10.5807f, 22f, 9.81638f, 21.4491f, 9.54415f, 20.6325f)
            lineTo(9f, 19f)
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
            moveTo(12f, 15.5f)
            verticalLineTo(12f)
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

        return _lightbulbOff!!
    }

private var _lightbulbOff: ImageVector? = null
