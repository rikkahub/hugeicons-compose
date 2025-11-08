package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Dome: ImageVector
    get() {
        if (_dome != null) {
            return _dome!!
        }
        _dome = ImageVector.Builder(
            name = "Dome",
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
        moveTo(6.85635f, 22f)
        curveTo(6.31271f, 20.0139f, 6f, 17.6873f, 6f, 15.2f)
        curveTo(6f, 7.90984f, 8.68629f, 2f, 12f, 2f)
        curveTo(15.3137f, 2f, 18f, 7.90984f, 18f, 15.2f)
        curveTo(18f, 17.6873f, 17.6873f, 20.0139f, 17.1436f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 22f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5516f, 5f)
        curveTo(14.6016f, 9.20545f, 9.11987f, 7.73398f, 6.74686f, 11.1962f)
        curveTo(6.41711f, 11.6774f, 6.41568f, 12.3243f, 6.75482f, 12.7985f)
        curveTo(9.23576f, 16.2675f, 15.599f, 14.7924f, 17.5f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.44841f, 5f)
        curveTo(9.39844f, 9.20545f, 14.8801f, 7.73398f, 17.2531f, 11.1962f)
        curveTo(17.5829f, 11.6774f, 17.5843f, 12.3243f, 17.2452f, 12.7985f)
        curveTo(14.7642f, 16.2675f, 8.40101f, 14.7924f, 6.5f, 19f)
        }
        }.build()

        return _dome!!
    }

private var _dome: ImageVector? = null
