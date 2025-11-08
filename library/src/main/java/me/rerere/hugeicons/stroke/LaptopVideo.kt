package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LaptopVideo: ImageVector
    get() {
        if (_laptopVideo != null) {
            return _laptopVideo!!
        }
        _laptopVideo = ImageVector.Builder(
            name = "LaptopVideo",
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
        moveTo(14.1607f, 9.3625f)
        lineTo(11.4511f, 7.59844f)
        curveTo(11.3523f, 7.53411f, 11.2381f, 7.5f, 11.1216f, 7.5f)
        curveTo(10.7782f, 7.5f, 10.4999f, 7.78994f, 10.4999f, 8.1476f)
        verticalLineTo(11.8524f)
        curveTo(10.4999f, 12.2101f, 10.7782f, 12.5f, 11.1216f, 12.5f)
        curveTo(11.2381f, 12.5f, 11.3523f, 12.4659f, 11.4511f, 12.4016f)
        lineTo(14.1607f, 10.6375f)
        curveTo(14.3717f, 10.5001f, 14.4999f, 10.2592f, 14.4999f, 10f)
        curveTo(14.4999f, 9.7408f, 14.3717f, 9.49988f, 14.1607f, 9.3625f)
        }

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
        }.build()

        return _laptopVideo!!
    }

private var _laptopVideo: ImageVector? = null
