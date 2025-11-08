package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LayerBringToFront: ImageVector
    get() {
        if (_layerBringToFront != null) {
            return _layerBringToFront!!
        }
        _layerBringToFront = ImageVector.Builder(
            name = "LayerBringToFront",
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
        moveTo(16.9784f, 8f)
        lineTo(19.2873f, 9.06064f)
        curveTo(21.0958f, 9.89137f, 22f, 10.3067f, 22f, 11f)
        curveTo(22f, 11.6933f, 21.0958f, 12.1086f, 19.2873f, 12.9394f)
        lineTo(14.3943f, 15.187f)
        curveTo(13.2144f, 15.729f, 12.6245f, 16f, 12f, 16f)
        curveTo(11.3755f, 16f, 10.7856f, 15.729f, 9.60573f, 15.187f)
        lineTo(4.7127f, 12.9394f)
        curveTo(2.90423f, 12.1086f, 2f, 11.6933f, 2f, 11f)
        curveTo(2f, 10.3067f, 2.90423f, 9.89137f, 4.7127f, 9.06064f)
        lineTo(7.02165f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2.5f)
        verticalLineTo(10f)
        moveTo(15f, 5f)
        curveTo(14.4102f, 4.39316f, 12.8403f, 2f, 12f, 2f)
        curveTo(11.1597f, 2f, 9.58984f, 4.39316f, 9f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.2327f, 15.5f)
        curveTo(21.4109f, 16.062f, 22f, 16.4405f, 22f, 17.0001f)
        curveTo(22f, 17.6934f, 21.0958f, 18.1087f, 19.2873f, 18.9395f)
        lineTo(14.3943f, 21.1871f)
        curveTo(13.2144f, 21.7291f, 12.6245f, 22.0001f, 12f, 22.0001f)
        curveTo(11.3755f, 22.0001f, 10.7856f, 21.7291f, 9.60573f, 21.1871f)
        lineTo(4.7127f, 18.9395f)
        curveTo(2.90423f, 18.1087f, 2f, 17.6934f, 2f, 17.0001f)
        curveTo(2f, 16.4405f, 2.58909f, 16.062f, 3.76727f, 15.5f)
        }
        }.build()

        return _layerBringToFront!!
    }

private var _layerBringToFront: ImageVector? = null
