package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Boat: ImageVector
    get() {
        if (_boat != null) {
            return _boat!!
        }
        _boat = ImageVector.Builder(
            name = "Boat",
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
        moveTo(2f, 21.1932f)
        curveTo(2.68524f, 22.2443f, 3.57104f, 22.2443f, 4.27299f, 21.1932f)
        curveTo(6.52985f, 17.7408f, 8.67954f, 23.6764f, 10.273f, 21.2321f)
        curveTo(12.703f, 17.5694f, 14.4508f, 23.9218f, 16.273f, 21.1932f)
        curveTo(18.6492f, 17.5582f, 20.1295f, 23.5776f, 22f, 21.5842f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.57228f, 17f)
        lineTo(2.07481f, 12.6457f)
        curveTo(1.80373f, 11.8574f, 2.30283f, 11f, 3.03273f, 11f)
        horizontalLineTo(20.8582f)
        curveTo(23.9522f, 11f, 19.9943f, 17f, 17.9966f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 11f)
        lineTo(15.201f, 7.50122f)
        curveTo(14.4419f, 6.55236f, 13.2926f, 6f, 12.0775f, 6f)
        horizontalLineTo(8f)
        curveTo(6.89543f, 6f, 6f, 6.89543f, 6f, 8f)
        verticalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 6f)
        verticalLineTo(3f)
        curveTo(10f, 2.44772f, 9.55228f, 2f, 9f, 2f)
        horizontalLineTo(8f)
        }
        }.build()

        return _boat!!
    }

private var _boat: ImageVector? = null
