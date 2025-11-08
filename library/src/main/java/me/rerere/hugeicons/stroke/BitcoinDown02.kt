package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BitcoinDown02: ImageVector
    get() {
        if (_bitcoinDown02 != null) {
            return _bitcoinDown02!!
        }
        _bitcoinDown02 = ImageVector.Builder(
            name = "BitcoinDown02",
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
        moveTo(10.9999f, 8.99985f)
        curveTo(7.41009f, 8.99985f, 4.49994f, 11.91f, 4.49994f, 15.4998f)
        curveTo(4.49994f, 19.0897f, 7.41009f, 21.9998f, 10.9999f, 21.9998f)
        curveTo(14.5898f, 21.9998f, 17.4999f, 19.0897f, 17.4999f, 15.4998f)
        curveTo(17.4999f, 11.91f, 14.5898f, 8.99985f, 10.9999f, 8.99985f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 8.5f)
        lineTo(15.4116f, 4.29397f)
        curveTo(14.7437f, 3.68176f, 14.4098f, 3.37565f, 14.0084f, 3.38437f)
        curveTo(13.6069f, 3.3931f, 13.2866f, 3.71342f, 12.6459f, 4.35406f)
        lineTo(11.6803f, 5.31973f)
        curveTo(11.116f, 5.88402f, 10.8338f, 6.16617f, 10.4728f, 6.19872f)
        curveTo(10.1118f, 6.23127f, 9.78377f, 6.00415f, 9.12764f, 5.5499f)
        lineTo(4f, 2f)
        moveTo(20f, 8.5f)
        horizontalLineTo(16.5f)
        moveTo(20f, 8.5f)
        verticalLineTo(5.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.43744f, 18.1665f)
        lineTo(9.43744f, 12.8332f)
        moveTo(10.9999f, 12.8332f)
        verticalLineTo(11.4998f)
        moveTo(10.9999f, 19.4998f)
        verticalLineTo(18.1665f)
        moveTo(9.43744f, 15.4998f)
        horizontalLineTo(12.5624f)
        moveTo(12.5624f, 15.4998f)
        curveTo(13.0802f, 15.4998f, 13.4999f, 15.9476f, 13.4999f, 16.4998f)
        verticalLineTo(17.1665f)
        curveTo(13.4999f, 17.7188f, 13.0802f, 18.1665f, 12.5624f, 18.1665f)
        horizontalLineTo(8.49994f)
        moveTo(12.5624f, 15.4998f)
        curveTo(13.0802f, 15.4998f, 13.4999f, 15.0521f, 13.4999f, 14.4998f)
        verticalLineTo(13.8332f)
        curveTo(13.4999f, 13.2809f, 13.0802f, 12.8332f, 12.5624f, 12.8332f)
        horizontalLineTo(8.49994f)
        }
        }.build()

        return _bitcoinDown02!!
    }

private var _bitcoinDown02: ImageVector? = null
