package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LaptopSettings: ImageVector
    get() {
        if (_laptopSettings != null) {
            return _laptopSettings!!
        }
        _laptopSettings = ImageVector.Builder(
            name = "LaptopSettings",
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
        moveTo(11.9999f, 12f)
        lineTo(11.9999f, 13.5f)
        moveTo(11.9999f, 12f)
        curveTo(12.7369f, 12f, 13.3808f, 11.6013f, 13.7277f, 11.0079f)
        moveTo(11.9999f, 12f)
        curveTo(11.2629f, 12f, 10.619f, 11.6013f, 10.272f, 11.0079f)
        moveTo(11.9999f, 8f)
        lineTo(11.9999f, 6.5f)
        moveTo(11.9999f, 8f)
        curveTo(12.7369f, 8f, 13.3808f, 8.39866f, 13.7277f, 8.99209f)
        moveTo(11.9999f, 8f)
        curveTo(11.2629f, 8f, 10.619f, 8.39865f, 10.272f, 8.99209f)
        moveTo(14.9999f, 8.25f)
        lineTo(13.7277f, 8.99209f)
        moveTo(8.99988f, 11.75f)
        lineTo(10.272f, 11.0079f)
        moveTo(14.9999f, 11.75f)
        lineTo(13.7277f, 11.0079f)
        moveTo(8.99988f, 8.25f)
        lineTo(10.272f, 8.99209f)
        moveTo(13.7277f, 11.0079f)
        curveTo(13.9007f, 10.7119f, 13.9999f, 10.3676f, 13.9999f, 10f)
        curveTo(13.9999f, 9.63244f, 13.9007f, 9.28805f, 13.7277f, 8.99209f)
        moveTo(10.272f, 8.99209f)
        curveTo(10.099f, 9.28804f, 9.99988f, 9.63244f, 9.99988f, 10f)
        curveTo(9.99988f, 10.3676f, 10.099f, 10.712f, 10.272f, 11.0079f)
        }
        }.build()

        return _laptopSettings!!
    }

private var _laptopSettings: ImageVector? = null
