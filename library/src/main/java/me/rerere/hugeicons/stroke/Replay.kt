package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Replay: ImageVector
    get() {
        if (_replay != null) {
            return _replay!!
        }
        _replay = ImageVector.Builder(
            name = "Replay",
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
        moveTo(22f, 12f)
        curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(15.0413f, 2f, 17.7655f, 3.35767f, 19.5996f, 5.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 2.5f)
        verticalLineTo(6f)
        horizontalLineTo(16.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.9453f, 12.3577f)
        curveTo(15.7686f, 12.9844f, 14.9333f, 13.4273f, 13.2629f, 14.3131f)
        curveTo(11.648f, 15.1693f, 10.8406f, 15.5975f, 10.1899f, 15.4254f)
        curveTo(9.9209f, 15.3542f, 9.6758f, 15.2191f, 9.47812f, 15.0329f)
        curveTo(9f, 14.5827f, 9f, 13.7094f, 9f, 11.9629f)
        curveTo(9f, 10.2163f, 9f, 9.34307f, 9.47812f, 8.89284f)
        curveTo(9.6758f, 8.7067f, 9.9209f, 8.57157f, 10.1899f, 8.50042f)
        curveTo(10.8406f, 8.32833f, 11.648f, 8.75646f, 13.2629f, 9.61272f)
        curveTo(14.9333f, 10.4985f, 15.7686f, 10.9414f, 15.9453f, 11.5681f)
        curveTo(16.0182f, 11.8268f, 16.0182f, 12.099f, 15.9453f, 12.3577f)
        }
        }.build()

        return _replay!!
    }

private var _replay: ImageVector? = null
