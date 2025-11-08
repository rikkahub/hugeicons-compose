package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BitcoinSmartphone02: ImageVector
    get() {
        if (_bitcoinSmartphone02 != null) {
            return _bitcoinSmartphone02!!
        }
        _bitcoinSmartphone02 = ImageVector.Builder(
            name = "BitcoinSmartphone02",
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
        moveTo(5f, 9f)
        curveTo(5f, 5.70017f, 5f, 4.05025f, 6.02513f, 3.02513f)
        curveTo(7.05025f, 2f, 8.70017f, 2f, 12f, 2f)
        curveTo(15.2998f, 2f, 16.9497f, 2f, 17.9749f, 3.02513f)
        curveTo(19f, 4.05025f, 19f, 5.70017f, 19f, 9f)
        verticalLineTo(15f)
        curveTo(19f, 18.2998f, 19f, 19.9497f, 17.9749f, 20.9749f)
        curveTo(16.9497f, 22f, 15.2998f, 22f, 12f, 22f)
        curveTo(8.70017f, 22f, 7.05025f, 22f, 6.02513f, 20.9749f)
        curveTo(5f, 19.9497f, 5f, 18.2998f, 5f, 15f)
        verticalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.4375f, 12.6667f)
        lineTo(10.4375f, 7.33333f)
        moveTo(12f, 7.33333f)
        verticalLineTo(6f)
        moveTo(12f, 14f)
        verticalLineTo(12.6667f)
        moveTo(10.4375f, 10f)
        horizontalLineTo(13.5625f)
        moveTo(13.5625f, 10f)
        curveTo(14.0803f, 10f, 14.5f, 10.4477f, 14.5f, 11f)
        verticalLineTo(11.6667f)
        curveTo(14.5f, 12.219f, 14.0803f, 12.6667f, 13.5625f, 12.6667f)
        horizontalLineTo(9.5f)
        moveTo(13.5625f, 10f)
        curveTo(14.0803f, 10f, 14.5f, 9.55228f, 14.5f, 9f)
        verticalLineTo(8.33333f)
        curveTo(14.5f, 7.78105f, 14.0803f, 7.33333f, 13.5625f, 7.33333f)
        horizontalLineTo(9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 19f)
        horizontalLineTo(12.009f)
        }
        }.build()

        return _bitcoinSmartphone02!!
    }

private var _bitcoinSmartphone02: ImageVector? = null
