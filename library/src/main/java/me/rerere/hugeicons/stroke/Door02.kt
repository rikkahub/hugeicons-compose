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

val HugeIcons.Door02: ImageVector
    get() {
        if (_door02 != null) {
            return _door02!!
        }
        _door02 = ImageVector.Builder(
            name = "Door02",
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
            moveTo(5f, 22f)
            verticalLineTo(8f)
            curveTo(5f, 5.17157f, 5f, 3.75736f, 5.87868f, 2.87868f)
            curveTo(6.75736f, 2f, 8.17157f, 2f, 11f, 2f)
            horizontalLineTo(13f)
            curveTo(15.8284f, 2f, 17.2426f, 2f, 18.1213f, 2.87868f)
            curveTo(19f, 3.75736f, 19f, 5.17157f, 19f, 8f)
            verticalLineTo(22f)
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
            moveTo(3f, 22f)
            horizontalLineTo(21f)
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
            moveTo(15.125f, 12f)
            horizontalLineTo(15f)
            moveTo(15.25f, 12f)
            curveTo(15.25f, 12.1381f, 15.1381f, 12.25f, 15f, 12.25f)
            curveTo(14.8619f, 12.25f, 14.75f, 12.1381f, 14.75f, 12f)
            curveTo(14.75f, 11.8619f, 14.8619f, 11.75f, 15f, 11.75f)
            curveTo(15.1381f, 11.75f, 15.25f, 11.8619f, 15.25f, 12f)
            close()
        }
        }.build()

        return _door02!!
    }

private var _door02: ImageVector? = null
