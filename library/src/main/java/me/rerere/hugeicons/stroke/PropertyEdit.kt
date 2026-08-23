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

val HugeIcons.PropertyEdit: ImageVector
    get() {
        if (_propertyEdit != null) {
            return _propertyEdit!!
        }
        _propertyEdit = ImageVector.Builder(
            name = "PropertyEdit",
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
            moveTo(15.2844f, 18.5846f)
            lineTo(19.0505f, 14.8295f)
            curveTo(19.4916f, 14.3902f, 20.2068f, 14.3902f, 20.6478f, 14.8295f)
            lineTo(21.1692f, 15.3488f)
            curveTo(21.6103f, 15.7881f, 21.6103f, 16.5004f, 21.1692f, 16.9397f)
            lineTo(17.4378f, 20.7114f)
            curveTo(17.223f, 20.9254f, 16.9481f, 21.0696f, 16.6494f, 21.1252f)
            lineTo(14.9566f, 21.4912f)
            curveTo(14.6893f, 21.549f, 14.4513f, 21.3126f, 14.5086f, 21.0463f)
            lineTo(14.8689f, 19.3698f)
            curveTo(14.9247f, 19.0723f, 15.0695f, 18.7986f, 15.2844f, 18.5846f)
            close()
        }
        }.build()

        return _propertyEdit!!
    }

private var _propertyEdit: ImageVector? = null
