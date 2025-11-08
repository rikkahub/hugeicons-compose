package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LaptopCloud: ImageVector
    get() {
        if (_laptopCloud != null) {
            return _laptopCloud!!
        }
        _laptopCloud = ImageVector.Builder(
            name = "LaptopCloud",
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
        moveTo(20.4999f, 16.5f)
        verticalLineTo(8.5f)
        curveTo(20.4999f, 6.14298f, 20.4999f, 4.96447f, 19.7676f, 4.23223f)
        curveTo(19.0354f, 3.5f, 17.8569f, 3.5f, 15.4999f, 3.5f)
        horizontalLineTo(8.49988f)
        curveTo(6.14286f, 3.5f, 4.96434f, 3.5f, 4.23211f, 4.23223f)
        curveTo(3.49988f, 4.96447f, 3.49988f, 6.14298f, 3.49988f, 8.5f)
        verticalLineTo(16.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.9841f, 20.5f)
        horizontalLineTo(2.01567f)
        curveTo(1.63273f, 20.5f, 1.38367f, 20.1088f, 1.55493f, 19.7764f)
        lineTo(3.49988f, 16.5f)
        horizontalLineTo(20.4999f)
        lineTo(22.4448f, 19.7764f)
        curveTo(22.6161f, 20.1088f, 22.367f, 20.5f, 21.9841f, 20.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.49988f, 12.5f)
        curveTo(8.67145f, 12.5f, 7.99988f, 11.8284f, 7.99988f, 11f)
        curveTo(7.99988f, 10.1716f, 8.67145f, 9.5f, 9.49988f, 9.5f)
        horizontalLineTo(9.99988f)
        curveTo(9.99988f, 8.39543f, 10.8953f, 7.5f, 11.9999f, 7.5f)
        curveTo(13.1044f, 7.5f, 13.9999f, 8.39543f, 13.9999f, 9.5f)
        horizontalLineTo(14.4999f)
        curveTo(15.3283f, 9.5f, 15.9999f, 10.1716f, 15.9999f, 11f)
        curveTo(15.9999f, 11.8284f, 15.3283f, 12.5f, 14.4999f, 12.5f)
        horizontalLineTo(9.49988f)
        }
        }.build()

        return _laptopCloud!!
    }

private var _laptopCloud: ImageVector? = null
