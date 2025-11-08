package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Jupiter: ImageVector
    get() {
        if (_jupiter != null) {
            return _jupiter!!
        }
        _jupiter = ImageVector.Builder(
            name = "Jupiter",
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
        moveTo(8f, 16.5f)
        curveTo(9.10457f, 16.5f, 10f, 15.8284f, 10f, 15f)
        curveTo(10f, 14.1716f, 9.10457f, 13.5f, 8f, 13.5f)
        curveTo(6.89543f, 13.5f, 6f, 14.1716f, 6f, 15f)
        curveTo(6f, 15.8284f, 6.89543f, 16.5f, 8f, 16.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.2722f, 15.7522f)
        curveTo(17.6645f, 15.7468f, 14.7094f, 16.3604f, 11.5f, 18.5f)
        curveTo(9.91701f, 19.5553f, 8.40491f, 20.2626f, 7.10825f, 20.7239f)
        moveTo(21.2722f, 15.7522f)
        curveTo(21.7415f, 14.5935f, 22f, 13.3269f, 22f, 12f)
        curveTo(22f, 11.7639f, 21.9918f, 11.5298f, 21.9757f, 11.2978f)
        moveTo(21.2722f, 15.7522f)
        curveTo(19.7882f, 19.4158f, 16.1959f, 22f, 12f, 22f)
        curveTo(10.2231f, 22f, 8.55439f, 21.5365f, 7.10825f, 20.7239f)
        moveTo(21.9757f, 11.2978f)
        curveTo(16.9028f, 14.2476f, 14.3349f, 13.112f, 9f, 10f)
        curveTo(6.5627f, 8.57824f, 4.2801f, 8.55737f, 2.42713f, 9.09949f)
        moveTo(21.9757f, 11.2978f)
        curveTo(21.9128f, 10.39f, 21.7286f, 9.51555f, 21.4394f, 8.69054f)
        moveTo(21.4394f, 8.69054f)
        curveTo(20.0734f, 4.7941f, 16.363f, 2f, 12f, 2f)
        curveTo(9.46517f, 2f, 7.15062f, 2.94313f, 5.38812f, 4.49763f)
        moveTo(21.4394f, 8.69054f)
        curveTo(17.3788f, 8.69054f, 17.5f, 4.77488f, 12f, 6f)
        curveTo(8.4f, 6.8019f, 6.25875f, 5.16588f, 5.38812f, 4.49763f)
        moveTo(5.38812f, 4.49763f)
        curveTo(4.01187f, 5.71147f, 2.97222f, 7.29807f, 2.42713f, 9.09949f)
        moveTo(2.42713f, 9.09949f)
        curveTo(2.14934f, 10.0175f, 2f, 10.9913f, 2f, 12f)
        curveTo(2f, 15.7459f, 4.05965f, 19.0108f, 7.10825f, 20.7239f)
        }
        }.build()

        return _jupiter!!
    }

private var _jupiter: ImageVector? = null
