package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Bot: ImageVector
    get() {
        if (_bot != null) {
            return _bot!!
        }
        _bot = ImageVector.Builder(
            name = "Bot",
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
        moveTo(4f, 15.5f)
        curveTo(2.89543f, 15.5f, 2f, 14.6046f, 2f, 13.5f)
        curveTo(2f, 12.3954f, 2.89543f, 11.5f, 4f, 11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 15.5f)
        curveTo(21.1046f, 15.5f, 22f, 14.6046f, 22f, 13.5f)
        curveTo(22f, 12.3954f, 21.1046f, 11.5f, 20f, 11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 7f)
        lineTo(7f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 7f)
        lineTo(17f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 7f)
        horizontalLineTo(10.5f)
        curveTo(7.67157f, 7f, 6.25736f, 7f, 5.37868f, 7.90898f)
        curveTo(4.5f, 8.81796f, 4.5f, 10.2809f, 4.5f, 13.2069f)
        curveTo(4.5f, 16.1329f, 4.5f, 17.5958f, 5.37868f, 18.5048f)
        curveTo(6.25736f, 19.4138f, 7.67157f, 19.4138f, 10.5f, 19.4138f)
        horizontalLineTo(11.5253f)
        curveTo(12.3169f, 19.4138f, 12.5962f, 19.5773f, 13.1417f, 20.1713f)
        curveTo(13.745f, 20.8283f, 14.6791f, 21.705f, 15.5242f, 21.9091f)
        curveTo(16.7254f, 22.1994f, 16.8599f, 21.7979f, 16.5919f, 20.6531f)
        curveTo(16.5156f, 20.327f, 16.3252f, 19.8056f, 16.526f, 19.5018f)
        curveTo(16.6385f, 19.3316f, 16.8259f, 19.2898f, 17.2008f, 19.2061f)
        curveTo(17.7922f, 19.074f, 18.2798f, 18.8581f, 18.6213f, 18.5048f)
        curveTo(19.5f, 17.5958f, 19.5f, 16.1329f, 19.5f, 13.2069f)
        curveTo(19.5f, 10.2809f, 19.5f, 8.81796f, 18.6213f, 7.90898f)
        curveTo(17.7426f, 7f, 16.3284f, 7f, 13.5f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 15f)
        curveTo(10.0701f, 15.6072f, 10.9777f, 16f, 12f, 16f)
        curveTo(13.0223f, 16f, 13.9299f, 15.6072f, 14.5f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.00896f, 11f)
        horizontalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.009f, 11f)
        horizontalLineTo(15f)
        }
        }.build()

        return _bot!!
    }

private var _bot: ImageVector? = null
