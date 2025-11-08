package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Bootstrap: ImageVector
    get() {
        if (_bootstrap != null) {
            return _bootstrap!!
        }
        _bootstrap = ImageVector.Builder(
            name = "Bootstrap",
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
        moveTo(12.8824f, 12f)
        curveTo(14.0519f, 12f, 15f, 12.8954f, 15f, 14f)
        curveTo(15f, 15.1046f, 14.0519f, 16f, 12.8824f, 16f)
        horizontalLineTo(10.6f)
        curveTo(9.84575f, 16f, 9.46863f, 16f, 9.23431f, 15.7657f)
        curveTo(9f, 15.5314f, 9f, 15.1542f, 9f, 14.4f)
        verticalLineTo(12f)
        moveTo(12.8824f, 12f)
        curveTo(14.0519f, 12f, 15f, 11.1046f, 15f, 10f)
        curveTo(15f, 8.89543f, 14.0519f, 8f, 12.8824f, 8f)
        horizontalLineTo(10.6f)
        curveTo(9.84575f, 8f, 9.46863f, 8f, 9.23431f, 8.23431f)
        curveTo(9f, 8.46863f, 9f, 8.84575f, 9f, 9.6f)
        verticalLineTo(12f)
        moveTo(12.8824f, 12f)
        horizontalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 12f)
        curveTo(20.8954f, 12f, 20f, 11.1046f, 20f, 10f)
        verticalLineTo(8f)
        curveTo(20f, 4.69067f, 19.3093f, 4f, 16f, 4f)
        horizontalLineTo(8f)
        curveTo(4.69067f, 4f, 4f, 4.69067f, 4f, 8f)
        verticalLineTo(10f)
        curveTo(4f, 11.1046f, 3.10457f, 12f, 2f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 12f)
        curveTo(3.10457f, 12f, 4f, 12.8954f, 4f, 14f)
        lineTo(4f, 16f)
        curveTo(4f, 19.3093f, 4.69067f, 20f, 8f, 20f)
        horizontalLineTo(16f)
        curveTo(19.3093f, 20f, 20f, 19.3093f, 20f, 16f)
        verticalLineTo(14f)
        curveTo(20f, 12.8954f, 20.8954f, 12f, 22f, 12f)
        }
        }.build()

        return _bootstrap!!
    }

private var _bootstrap: ImageVector? = null
