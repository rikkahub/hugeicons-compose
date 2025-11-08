package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.KeyframeAlignCenter: ImageVector
    get() {
        if (_keyframeAlignCenter != null) {
            return _keyframeAlignCenter!!
        }
        _keyframeAlignCenter = ImageVector.Builder(
            name = "KeyframeAlignCenter",
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
        moveTo(10.8546f, 8.89114f)
        curveTo(11.3832f, 8.29705f, 11.6475f, 8f, 12f, 8f)
        curveTo(12.3525f, 8f, 12.6168f, 8.29705f, 13.1454f, 8.89114f)
        lineTo(14.4455f, 10.3522f)
        curveTo(15.1485f, 11.1423f, 15.5f, 11.5374f, 15.5f, 12f)
        curveTo(15.5f, 12.4626f, 15.1485f, 12.8577f, 14.4455f, 13.6478f)
        lineTo(13.1454f, 15.1089f)
        curveTo(12.6168f, 15.703f, 12.3525f, 16f, 12f, 16f)
        curveTo(11.6475f, 16f, 11.3832f, 15.703f, 10.8546f, 15.1089f)
        lineTo(9.55451f, 13.6478f)
        curveTo(8.8515f, 12.8577f, 8.5f, 12.4626f, 8.5f, 12f)
        curveTo(8.5f, 11.5374f, 8.8515f, 11.1423f, 9.55451f, 10.3522f)
        lineTo(10.8546f, 8.89114f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 12f)
        lineTo(2f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 12f)
        lineTo(19f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 19f)
        lineTo(12f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2f)
        lineTo(12f, 5f)
        }
        }.build()

        return _keyframeAlignCenter!!
    }

private var _keyframeAlignCenter: ImageVector? = null
