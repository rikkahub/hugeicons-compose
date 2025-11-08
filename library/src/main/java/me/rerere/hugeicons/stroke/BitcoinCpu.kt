package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BitcoinCpu: ImageVector
    get() {
        if (_bitcoinCpu != null) {
            return _bitcoinCpu!!
        }
        _bitcoinCpu = ImageVector.Builder(
            name = "BitcoinCpu",
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
        moveTo(4f, 12f)
        curveTo(4f, 8.22876f, 4f, 6.34315f, 5.17157f, 5.17157f)
        curveTo(6.34315f, 4f, 8.22876f, 4f, 12f, 4f)
        curveTo(15.7712f, 4f, 17.6569f, 4f, 18.8284f, 5.17157f)
        curveTo(20f, 6.34315f, 20f, 8.22876f, 20f, 12f)
        curveTo(20f, 15.7712f, 20f, 17.6569f, 18.8284f, 18.8284f)
        curveTo(17.6569f, 20f, 15.7712f, 20f, 12f, 20f)
        curveTo(8.22876f, 20f, 6.34315f, 20f, 5.17157f, 18.8284f)
        curveTo(4f, 17.6569f, 4f, 15.7712f, 4f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.125f, 15f)
        lineTo(10.125f, 9f)
        moveTo(12f, 9f)
        verticalLineTo(7.5f)
        moveTo(12f, 16.5f)
        verticalLineTo(15f)
        moveTo(10.125f, 12f)
        horizontalLineTo(13.875f)
        moveTo(13.875f, 12f)
        curveTo(14.4963f, 12f, 15f, 12.5037f, 15f, 13.125f)
        verticalLineTo(13.875f)
        curveTo(15f, 14.4963f, 14.4963f, 15f, 13.875f, 15f)
        horizontalLineTo(9f)
        moveTo(13.875f, 12f)
        curveTo(14.4963f, 12f, 15f, 11.4963f, 15f, 10.875f)
        verticalLineTo(10.125f)
        curveTo(15f, 9.50368f, 14.4963f, 9f, 13.875f, 9f)
        horizontalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 2f)
        verticalLineTo(4f)
        moveTo(16f, 2f)
        verticalLineTo(4f)
        moveTo(12f, 2f)
        verticalLineTo(4f)
        moveTo(8f, 20f)
        verticalLineTo(22f)
        moveTo(12f, 20f)
        verticalLineTo(22f)
        moveTo(16f, 20f)
        verticalLineTo(22f)
        moveTo(22f, 16f)
        horizontalLineTo(20f)
        moveTo(4f, 8f)
        horizontalLineTo(2f)
        moveTo(4f, 16f)
        horizontalLineTo(2f)
        moveTo(4f, 12f)
        horizontalLineTo(2f)
        moveTo(22f, 8f)
        horizontalLineTo(20f)
        moveTo(22f, 12f)
        horizontalLineTo(20f)
        }
        }.build()

        return _bitcoinCpu!!
    }

private var _bitcoinCpu: ImageVector? = null
