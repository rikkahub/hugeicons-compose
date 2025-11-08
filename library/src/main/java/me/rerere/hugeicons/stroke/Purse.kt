package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Purse: ImageVector
    get() {
        if (_purse != null) {
            return _purse!!
        }
        _purse = ImageVector.Builder(
            name = "Purse",
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
        moveTo(16f, 14f)
        curveTo(16f, 14.8284f, 16.6716f, 15.5f, 17.5f, 15.5f)
        curveTo(18.3284f, 15.5f, 19f, 14.8284f, 19f, 14f)
        curveTo(19f, 13.1716f, 18.3284f, 12.5f, 17.5f, 12.5f)
        curveTo(16.6716f, 12.5f, 16f, 13.1716f, 16f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 20f)
        curveTo(2.89543f, 20f, 2f, 19.1046f, 2f, 18f)
        curveTo(2f, 16.8954f, 2.89543f, 16f, 4f, 16f)
        curveTo(5.10457f, 16f, 6f, 17.3333f, 6f, 18f)
        curveTo(6f, 18.6667f, 5.10457f, 20f, 4f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 20f)
        curveTo(6.89543f, 20f, 6f, 18.5f, 6f, 18f)
        curveTo(6f, 17.5f, 6.89543f, 16f, 8f, 16f)
        curveTo(9.10457f, 16f, 10f, 16.8954f, 10f, 18f)
        curveTo(10f, 19.1046f, 9.10457f, 20f, 8f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 20f)
        horizontalLineTo(16f)
        curveTo(18.8284f, 20f, 20.2426f, 20f, 21.1213f, 19.1213f)
        curveTo(22f, 18.2426f, 22f, 16.8284f, 22f, 14f)
        verticalLineTo(13f)
        curveTo(22f, 10.1716f, 22f, 8.75736f, 21.1213f, 7.87868f)
        curveTo(20.48f, 7.23738f, 19.5534f, 7.06413f, 18f, 7.01732f)
        moveTo(10f, 7f)
        horizontalLineTo(16f)
        curveTo(16.7641f, 7f, 17.425f, 7f, 18f, 7.01732f)
        moveTo(18f, 7.01732f)
        curveTo(18f, 6.06917f, 18f, 5.5951f, 17.8425f, 5.22208f)
        curveTo(17.6399f, 4.7421f, 17.2579f, 4.36014f, 16.7779f, 4.15749f)
        curveTo(16.4049f, 4f, 15.9308f, 4f, 14.9827f, 4f)
        horizontalLineTo(10f)
        curveTo(6.22876f, 4f, 4.34315f, 4f, 3.17157f, 5.17157f)
        curveTo(2f, 6.34315f, 2f, 7.22876f, 2f, 11f)
        verticalLineTo(13f)
        }
        }.build()

        return _purse!!
    }

private var _purse: ImageVector? = null
