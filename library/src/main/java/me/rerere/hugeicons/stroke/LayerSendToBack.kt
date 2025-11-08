package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LayerSendToBack: ImageVector
    get() {
        if (_layerSendToBack != null) {
            return _layerSendToBack!!
        }
        _layerSendToBack = ImageVector.Builder(
            name = "LayerSendToBack",
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
        moveTo(12f, 21.5f)
        verticalLineTo(7f)
        moveTo(15f, 19f)
        curveTo(14.4102f, 19.6068f, 12.8403f, 22f, 12f, 22f)
        curveTo(11.1597f, 22f, 9.58984f, 19.6068f, 9f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.2327f, 11.5f)
        curveTo(21.4109f, 12.062f, 22f, 12.4405f, 22f, 13.0001f)
        curveTo(22f, 13.6934f, 21.0958f, 14.1087f, 19.2873f, 14.9395f)
        lineTo(15.8901f, 16.5f)
        moveTo(3.76727f, 11.5f)
        curveTo(2.58909f, 12.062f, 2f, 12.4405f, 2f, 13.0001f)
        curveTo(2f, 13.6934f, 2.90423f, 14.1087f, 4.7127f, 14.9395f)
        lineTo(8.1099f, 16.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.11012f, 10.5f)
        lineTo(4.7127f, 8.93936f)
        curveTo(2.90423f, 8.10863f, 2f, 7.69326f, 2f, 7f)
        curveTo(2f, 6.30674f, 2.90423f, 5.89137f, 4.7127f, 5.06064f)
        lineTo(9.60573f, 2.81298f)
        curveTo(10.7856f, 2.27099f, 11.3755f, 2f, 12f, 2f)
        curveTo(12.6245f, 2f, 13.2144f, 2.27099f, 14.3943f, 2.81298f)
        lineTo(19.2873f, 5.06064f)
        curveTo(21.0958f, 5.89137f, 22f, 6.30674f, 22f, 7f)
        curveTo(22f, 7.69326f, 21.0958f, 8.10863f, 19.2873f, 8.93937f)
        lineTo(15.8899f, 10.5f)
        }
        }.build()

        return _layerSendToBack!!
    }

private var _layerSendToBack: ImageVector? = null
