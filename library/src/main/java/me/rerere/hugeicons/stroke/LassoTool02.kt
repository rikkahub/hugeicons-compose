package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LassoTool02: ImageVector
    get() {
        if (_lassoTool02 != null) {
            return _lassoTool02!!
        }
        _lassoTool02 = ImageVector.Builder(
            name = "LassoTool02",
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
        moveTo(5.5f, 15.5f)
        lineTo(2.61096f, 5.5905f)
        curveTo(2.04631f, 3.6603f, 1.76399f, 2.6952f, 2.24574f, 2.21566f)
        curveTo(2.72749f, 1.73612f, 3.60877f, 2.105f, 5.37133f, 2.84278f)
        lineTo(11.692f, 5.48851f)
        curveTo(13.1841f, 6.11304f, 13.8363f, 6.06315f, 15.2313f, 5.24565f)
        lineTo(18.7973f, 3.15593f)
        curveTo(20.3091f, 2.26998f, 21.065f, 1.827f, 21.5902f, 2.19348f)
        curveTo(22.1155f, 2.55996f, 22.0396f, 3.47742f, 21.8877f, 5.31232f)
        lineTo(21.3335f, 12.0109f)
        curveTo(21.1225f, 14.5617f, 20.6625f, 15.2995f, 18.1681f, 15.9572f)
        lineTo(10f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.98703f, 17f)
        curveTo(9.98703f, 18.1046f, 8.87064f, 19f, 7.49351f, 19f)
        curveTo(6.11638f, 19f, 5f, 18.1046f, 5f, 17f)
        curveTo(5f, 15.8954f, 6.11638f, 15f, 7.49351f, 15f)
        curveTo(8.87064f, 15f, 9.98703f, 15.8954f, 9.98703f, 17f)
        moveTo(9.98703f, 17f)
        curveTo(10.0493f, 17.7724f, 10.0064f, 20.5f, 7.00254f, 22f)
        }
        }.build()

        return _lassoTool02!!
    }

private var _lassoTool02: ImageVector? = null
