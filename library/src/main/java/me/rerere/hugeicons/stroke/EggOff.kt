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

val HugeIcons.EggOff: ImageVector
    get() {
        if (_eggOff != null) {
            return _eggOff!!
        }
        _eggOff = ImageVector.Builder(
            name = "EggOff",
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
            moveTo(8.49383f, 3.49383f)
            curveTo(9.55257f, 2.56712f, 10.7424f, 2f, 12f, 2f)
            curveTo(16.4183f, 2f, 20f, 9f, 20f, 14f)
            curveTo(20f, 14.3269f, 19.9847f, 14.6453f, 19.9548f, 14.9548f)
            moveTo(6.26116f, 6.26116f)
            curveTo(4.8617f, 8.61391f, 4f, 11.5475f, 4f, 14f)
            curveTo(4f, 19f, 7.58172f, 22f, 12f, 22f)
            curveTo(14.7861f, 22f, 17.2395f, 20.8071f, 18.672f, 18.672f)
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

        return _eggOff!!
    }

private var _eggOff: ImageVector? = null
