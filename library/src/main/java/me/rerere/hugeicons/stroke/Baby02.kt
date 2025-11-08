package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Baby02: ImageVector
    get() {
        if (_baby02 != null) {
            return _baby02!!
        }
        _baby02 = ImageVector.Builder(
            name = "Baby02",
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
        moveTo(16.874f, 12f)
        curveTo(17.5826f, 13.037f, 18f, 14.3093f, 18f, 15.6842f)
        curveTo(18f, 16.5017f, 17.8524f, 17.2829f, 17.5838f, 18f)
        moveTo(7.12605f, 12f)
        curveTo(6.41738f, 13.037f, 6f, 14.3093f, 6f, 15.6842f)
        curveTo(6f, 19.1723f, 8.68629f, 22f, 12f, 22f)
        curveTo(14.5371f, 22f, 16.7064f, 20.3424f, 17.5838f, 18f)
        moveTo(17.5838f, 18f)
        curveTo(14.8509f, 16.8f, 12.0559f, 14.8333f, 11f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2f)
        curveTo(11.0059f, 2f, 10.2f, 2.7835f, 10.2f, 3.75f)
        curveTo(10.2f, 4.7165f, 11.0059f, 5.5f, 12f, 5.5f)
        curveTo(12.461f, 5.5f, 12.8815f, 5.3315f, 13.2f, 5.0544f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 8f)
        horizontalLineTo(10.0081f)
        moveTo(14f, 8f)
        horizontalLineTo(14.0081f)
        }
        }.build()

        return _baby02!!
    }

private var _baby02: ImageVector? = null
