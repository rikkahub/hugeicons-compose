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

val HugeIcons.MapPinPlusInside: ImageVector
    get() {
        if (_mapPinPlusInside != null) {
            return _mapPinPlusInside!!
        }
        _mapPinPlusInside = ImageVector.Builder(
            name = "MapPinPlusInside",
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
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(13.6129f, 21.367f)
            curveTo(13.1792f, 21.773f, 12.5996f, 22f, 11.9963f, 22f)
            curveTo(11.393f, 22f, 10.8134f, 21.773f, 10.3797f, 21.367f)
            curveTo(6.4082f, 17.626f, 1.08594f, 13.4469f, 3.68145f, 7.37966f)
            curveTo(5.08481f, 4.09916f, 8.45352f, 2f, 11.9963f, 2f)
            curveTo(15.5391f, 2f, 18.9078f, 4.09916f, 20.3111f, 7.37966f)
            curveTo(22.9034f, 13.4393f, 17.5942f, 17.6389f, 13.6129f, 21.367f)
            close()
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
            moveTo(15.4952f, 11f)
            horizontalLineTo(11.9952f)
            moveTo(11.9952f, 11f)
            horizontalLineTo(8.49518f)
            moveTo(11.9952f, 11f)
            verticalLineTo(14.5f)
            moveTo(11.9952f, 11f)
            lineTo(11.9952f, 7.5f)
        }
        }.build()

        return _mapPinPlusInside!!
    }

private var _mapPinPlusInside: ImageVector? = null
