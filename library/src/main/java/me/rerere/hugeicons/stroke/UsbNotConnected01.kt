package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UsbNotConnected01: ImageVector
    get() {
        if (_usbNotConnected01 != null) {
            return _usbNotConnected01!!
        }
        _usbNotConnected01 = ImageVector.Builder(
            name = "UsbNotConnected01",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 6f)
        verticalLineTo(5.5f)
        curveTo(14f, 4.09554f, 14f, 3.39331f, 13.6629f, 2.88886f)
        curveTo(13.517f, 2.67048f, 13.3295f, 2.48298f, 13.1111f, 2.33706f)
        curveTo(12.6067f, 2f, 11.9045f, 2f, 10.5f, 2f)
        curveTo(9.09554f, 2f, 8.39331f, 2f, 7.88886f, 2.33706f)
        curveTo(7.67048f, 2.48298f, 7.48298f, 2.67048f, 7.33706f, 2.88886f)
        curveTo(7f, 3.39331f, 7f, 4.09554f, 7f, 5.5f)
        verticalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 16.5f)
        horizontalLineTo(9.51625f)
        curveTo(8.49228f, 16.5f, 7.53617f, 15.9979f, 6.96881f, 15.1622f)
        lineTo(6.36803f, 14.2773f)
        curveTo(5.39885f, 12.8498f, 4.82041f, 11.2019f, 4.68827f, 9.49197f)
        lineTo(4.50446f, 7.11331f)
        curveTo(4.43719f, 6.24273f, 5.13957f, 5.5f, 6.03014f, 5.5f)
        horizontalLineTo(14.9699f)
        curveTo(15.8604f, 5.5f, 16.5628f, 6.24273f, 16.4955f, 7.11331f)
        lineTo(16.3884f, 8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 17f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 8.5f)
        horizontalLineTo(11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.5f, 11f)
        lineTo(13.5f, 17f)
        moveTo(19.5f, 17f)
        lineTo(13.5f, 11f)
        }
        }.build()

        return _usbNotConnected01!!
    }

private var _usbNotConnected01: ImageVector? = null
