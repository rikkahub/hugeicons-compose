package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Chart: ImageVector
    get() {
        if (_chart != null) {
            return _chart!!
        }
        _chart = ImageVector.Builder(
            name = "Chart",
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
        moveTo(2f, 21.5f)
        lineTo(22f, 21.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 15.5f)
        horizontalLineTo(18.009f)
        moveTo(18f, 18.5f)
        horizontalLineTo(18.009f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 18.5f)
        horizontalLineTo(6.00898f)
        moveTo(6f, 15.5f)
        horizontalLineTo(6.00898f)
        moveTo(6f, 12.5f)
        horizontalLineTo(6.00898f)
        moveTo(6f, 9.5f)
        horizontalLineTo(6.00898f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.79063f, 5.39186f)
        lineTo(16.2183f, 9.5904f)
        moveTo(8f, 4.5f)
        curveTo(8f, 5.60457f, 7.10457f, 6.5f, 6f, 6.5f)
        curveTo(4.89543f, 6.5f, 4f, 5.60457f, 4f, 4.5f)
        curveTo(4f, 3.39543f, 4.89543f, 2.5f, 6f, 2.5f)
        curveTo(7.10457f, 2.5f, 8f, 3.39543f, 8f, 4.5f)
        moveTo(20f, 10.5f)
        curveTo(20f, 11.6046f, 19.1046f, 12.5f, 18f, 12.5f)
        curveTo(16.8954f, 12.5f, 16f, 11.6046f, 16f, 10.5f)
        curveTo(16f, 9.39543f, 16.8954f, 8.5f, 18f, 8.5f)
        curveTo(19.1046f, 8.5f, 20f, 9.39543f, 20f, 10.5f)
        }
        }.build()

        return _chart!!
    }

private var _chart: ImageVector? = null
