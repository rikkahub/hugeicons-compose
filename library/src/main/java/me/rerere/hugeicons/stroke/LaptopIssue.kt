package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LaptopIssue: ImageVector
    get() {
        if (_laptopIssue != null) {
            return _laptopIssue!!
        }
        _laptopIssue = ImageVector.Builder(
            name = "LaptopIssue",
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
        moveTo(11.9998f, 13f)
        horizontalLineTo(12.0087f)
        moveTo(11.9998f, 10.5f)
        lineTo(11.9998f, 7f)
        }
        }.build()

        return _laptopIssue!!
    }

private var _laptopIssue: ImageVector? = null
