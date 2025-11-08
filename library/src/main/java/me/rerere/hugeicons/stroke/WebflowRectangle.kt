package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WebflowRectangle: ImageVector
    get() {
        if (_webflowRectangle != null) {
            return _webflowRectangle!!
        }
        _webflowRectangle = ImageVector.Builder(
            name = "WebflowRectangle",
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
        moveTo(2.5f, 12.0001f)
        curveTo(2.5f, 7.52178f, 2.5f, 5.28261f, 3.89124f, 3.89136f)
        curveTo(5.28249f, 2.50012f, 7.52166f, 2.50012f, 12f, 2.50012f)
        curveTo(16.4783f, 2.50012f, 18.7175f, 2.50012f, 20.1088f, 3.89136f)
        curveTo(21.5f, 5.28261f, 21.5f, 7.52178f, 21.5f, 12.0001f)
        curveTo(21.5f, 16.4785f, 21.5f, 18.7176f, 20.1088f, 20.1089f)
        curveTo(18.7175f, 21.5001f, 16.4783f, 21.5001f, 12f, 21.5001f)
        curveTo(7.52166f, 21.5001f, 5.28249f, 21.5001f, 3.89124f, 20.1089f)
        curveTo(2.5f, 18.7176f, 2.5f, 16.4785f, 2.5f, 12.0001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 9.00012f)
        lineTo(8.5f, 16.0001f)
        curveTo(10.5f, 14.8001f, 12f, 10.8335f, 12.5f, 9.00012f)
        lineTo(14f, 16.0001f)
        curveTo(16f, 14.4001f, 17.1667f, 10.6668f, 17.5f, 9.00012f)
        }
        }.build()

        return _webflowRectangle!!
    }

private var _webflowRectangle: ImageVector? = null
