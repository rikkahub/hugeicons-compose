package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BitcoinLocation: ImageVector
    get() {
        if (_bitcoinLocation != null) {
            return _bitcoinLocation!!
        }
        _bitcoinLocation = ImageVector.Builder(
            name = "BitcoinLocation",
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
        moveTo(18f, 18.2678f)
        curveTo(19.2447f, 18.6638f, 20f, 19.184f, 20f, 19.7537f)
        curveTo(20f, 20.9943f, 16.4183f, 22f, 12f, 22f)
        curveTo(7.58172f, 22f, 4f, 20.9943f, 4f, 19.7537f)
        curveTo(4f, 19.184f, 4.75527f, 18.6638f, 6f, 18.2678f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.4375f, 11.6667f)
        lineTo(10.4375f, 6.33333f)
        moveTo(12f, 6.33333f)
        verticalLineTo(5f)
        moveTo(12f, 13f)
        verticalLineTo(11.6667f)
        moveTo(10.4375f, 9f)
        horizontalLineTo(13.5625f)
        moveTo(13.5625f, 9f)
        curveTo(14.0803f, 9f, 14.5f, 9.44772f, 14.5f, 10f)
        verticalLineTo(10.6667f)
        curveTo(14.5f, 11.219f, 14.0803f, 11.6667f, 13.5625f, 11.6667f)
        horizontalLineTo(9.5f)
        moveTo(13.5625f, 9f)
        curveTo(14.0803f, 9f, 14.5f, 8.55228f, 14.5f, 8f)
        verticalLineTo(7.33333f)
        curveTo(14.5f, 6.78105f, 14.0803f, 6.33333f, 13.5625f, 6.33333f)
        horizontalLineTo(9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.3471f, 18.4619f)
        curveTo(12.9858f, 18.8071f, 12.5028f, 19f, 12.0001f, 19f)
        curveTo(11.4974f, 19f, 11.0144f, 18.8071f, 10.653f, 18.4619f)
        curveTo(7.34382f, 15.2821f, 2.90906f, 11.7299f, 5.07176f, 6.57272f)
        curveTo(6.24111f, 3.78428f, 9.04808f, 2f, 12.0001f, 2f)
        curveTo(14.9521f, 2f, 17.7591f, 3.78428f, 18.9284f, 6.57272f)
        curveTo(21.0884f, 11.7234f, 16.6645f, 15.293f, 13.3471f, 18.4619f)
        }
        }.build()

        return _bitcoinLocation!!
    }

private var _bitcoinLocation: ImageVector? = null
