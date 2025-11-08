package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BitcoinCloud: ImageVector
    get() {
        if (_bitcoinCloud != null) {
            return _bitcoinCloud!!
        }
        _bitcoinCloud = ImageVector.Builder(
            name = "BitcoinCloud",
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
        moveTo(17.5f, 17.5f)
        curveTo(19.9853f, 17.5f, 22f, 15.4853f, 22f, 13f)
        curveTo(22f, 10.5147f, 19.9853f, 8.5f, 17.5f, 8.5f)
        curveTo(17.4925f, 8.5f, 17.485f, 8.50002f, 17.4776f, 8.50005f)
        moveTo(17.4776f, 8.50005f)
        curveTo(17.4924f, 8.33536f, 17.5f, 8.16856f, 17.5f, 8f)
        curveTo(17.5f, 4.96243f, 15.0376f, 2.5f, 12f, 2.5f)
        curveTo(9.12324f, 2.5f, 6.76233f, 4.70862f, 6.52042f, 7.5227f)
        moveTo(17.4776f, 8.50005f)
        curveTo(17.3753f, 9.6345f, 16.9286f, 10.6696f, 16.2428f, 11.5f)
        moveTo(6.52042f, 7.5227f)
        curveTo(3.98398f, 7.76407f, 2f, 9.90034f, 2f, 12.5f)
        curveTo(2f, 15.0997f, 3.98398f, 17.2359f, 6.52042f, 17.4773f)
        moveTo(6.52042f, 7.5227f)
        curveTo(6.67826f, 7.50768f, 6.83823f, 7.5f, 7f, 7.5f)
        curveTo(8.12582f, 7.5f, 9.16474f, 7.87209f, 10.0005f, 8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.125f, 20f)
        lineTo(10.125f, 14f)
        moveTo(12f, 14f)
        verticalLineTo(12.5f)
        moveTo(12f, 21.5f)
        verticalLineTo(20f)
        moveTo(10.125f, 17f)
        horizontalLineTo(13.875f)
        moveTo(13.875f, 17f)
        curveTo(14.4963f, 17f, 15f, 17.5037f, 15f, 18.125f)
        verticalLineTo(18.875f)
        curveTo(15f, 19.4963f, 14.4963f, 20f, 13.875f, 20f)
        horizontalLineTo(9f)
        moveTo(13.875f, 17f)
        curveTo(14.4963f, 17f, 15f, 16.4963f, 15f, 15.875f)
        verticalLineTo(15.125f)
        curveTo(15f, 14.5037f, 14.4963f, 14f, 13.875f, 14f)
        horizontalLineTo(9f)
        }
        }.build()

        return _bitcoinCloud!!
    }

private var _bitcoinCloud: ImageVector? = null
