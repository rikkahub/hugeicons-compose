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

val HugeIcons.PropertyAdd: ImageVector
    get() {
        if (_propertyAdd != null) {
            return _propertyAdd!!
        }
        _propertyAdd = ImageVector.Builder(
            name = "PropertyAdd",
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
            moveTo(11.5f, 20.5f)
            curveTo(7.25736f, 20.5f, 5.13604f, 20.5f, 3.81802f, 19.182f)
            curveTo(2.5f, 17.864f, 2.5f, 15.7426f, 2.5f, 11.5f)
            curveTo(2.5f, 7.25736f, 2.5f, 5.13604f, 3.81802f, 3.81802f)
            curveTo(5.13604f, 2.5f, 7.25736f, 2.5f, 11.5f, 2.5f)
            curveTo(15.7426f, 2.5f, 17.864f, 2.5f, 19.182f, 3.81802f)
            curveTo(20.5f, 5.13604f, 20.5f, 7.25736f, 20.5f, 11.5f)
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
            moveTo(3f, 7.5f)
            horizontalLineTo(20f)
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
            moveTo(11.5f, 16f)
            horizontalLineTo(12.5f)
            moveTo(6.5f, 16f)
            horizontalLineTo(7.5f)
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
            moveTo(11.5f, 12f)
            horizontalLineTo(16.5f)
            moveTo(6.5f, 12f)
            horizontalLineTo(7.5f)
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
            moveTo(18.4943f, 15.5f)
            verticalLineTo(21.5f)
            moveTo(21.5f, 18.4935f)
            lineTo(15.5f, 18.4935f)
        }
        }.build()

        return _propertyAdd!!
    }

private var _propertyAdd: ImageVector? = null
