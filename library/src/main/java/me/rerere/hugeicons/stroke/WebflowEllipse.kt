package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WebflowEllipse: ImageVector
    get() {
        if (_webflowEllipse != null) {
            return _webflowEllipse!!
        }
        _webflowEllipse = ImageVector.Builder(
            name = "WebflowEllipse",
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
        moveTo(7.5f, 9f)
        lineTo(8.5f, 16f)
        curveTo(10.5f, 14.8f, 12f, 10.8333f, 12.5f, 9f)
        lineTo(14f, 16f)
        curveTo(16f, 14.4f, 17.1667f, 10.6667f, 17.5f, 9f)
        }
        }.build()

        return _webflowEllipse!!
    }

private var _webflowEllipse: ImageVector? = null
