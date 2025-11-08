package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LayerBringForward: ImageVector
    get() {
        if (_layerBringForward != null) {
            return _layerBringForward!!
        }
        _layerBringForward = ImageVector.Builder(
            name = "LayerBringForward",
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
        moveTo(15.8899f, 11.5f)
        lineTo(19.2873f, 13.0606f)
        curveTo(21.0958f, 13.8914f, 22f, 14.3067f, 22f, 15f)
        curveTo(22f, 15.6933f, 21.0958f, 16.1086f, 19.2873f, 16.9394f)
        lineTo(14.3943f, 19.187f)
        curveTo(13.2144f, 19.729f, 12.6245f, 20f, 12f, 20f)
        curveTo(11.3755f, 20f, 10.7856f, 19.729f, 9.60573f, 19.187f)
        lineTo(4.7127f, 16.9394f)
        curveTo(2.90423f, 16.1086f, 2f, 15.6933f, 2f, 15f)
        curveTo(2f, 14.3067f, 2.90423f, 13.8914f, 4.7127f, 13.0606f)
        lineTo(8.11012f, 11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 4.5f)
        verticalLineTo(15f)
        moveTo(15f, 7f)
        curveTo(14.4102f, 6.39316f, 12.8403f, 4f, 12f, 4f)
        curveTo(11.1597f, 4f, 9.58984f, 6.39316f, 9f, 7f)
        }
        }.build()

        return _layerBringForward!!
    }

private var _layerBringForward: ImageVector? = null
