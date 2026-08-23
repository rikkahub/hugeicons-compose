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

val HugeIcons.MapPinCheckInside: ImageVector
    get() {
        if (_mapPinCheckInside != null) {
            return _mapPinCheckInside!!
        }
        _mapPinCheckInside = ImageVector.Builder(
            name = "MapPinCheckInside",
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
            moveTo(13.6129f, 21.3672f)
            curveTo(13.1792f, 21.7733f, 12.5996f, 22.0002f, 11.9963f, 22.0002f)
            curveTo(11.393f, 22.0002f, 10.8134f, 21.7733f, 10.3797f, 21.3672f)
            curveTo(6.4082f, 17.6262f, 1.08594f, 13.4472f, 3.68145f, 7.37991f)
            curveTo(5.08481f, 4.0994f, 8.45352f, 2.00024f, 11.9963f, 2.00024f)
            curveTo(15.5391f, 2.00024f, 18.9078f, 4.0994f, 20.3111f, 7.37991f)
            curveTo(22.9034f, 13.4395f, 17.5942f, 17.6391f, 13.6129f, 21.3672f)
            close()
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
            moveTo(8.99518f, 11.8336f)
            curveTo(8.99518f, 11.8336f, 9.87018f, 11.8336f, 10.7452f, 13.5002f)
            curveTo(10.7452f, 13.5002f, 13.5246f, 9.33358f, 15.9952f, 8.50024f)
        }
        }.build()

        return _mapPinCheckInside!!
    }

private var _mapPinCheckInside: ImageVector? = null
