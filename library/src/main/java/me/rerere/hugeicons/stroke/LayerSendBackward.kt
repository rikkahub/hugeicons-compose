package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LayerSendBackward: ImageVector
    get() {
        if (_layerSendBackward != null) {
            return _layerSendBackward!!
        }
        _layerSendBackward = ImageVector.Builder(
            name = "LayerSendBackward",
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
        moveTo(15.8899f, 12.5f)
        lineTo(19.2873f, 10.9394f)
        curveTo(21.0958f, 10.1086f, 22f, 9.69326f, 22f, 9f)
        curveTo(22f, 8.30674f, 21.0958f, 7.89137f, 19.2873f, 7.06064f)
        lineTo(14.3943f, 4.81298f)
        curveTo(13.2144f, 4.27099f, 12.6245f, 4f, 12f, 4f)
        curveTo(11.3755f, 4f, 10.7856f, 4.27099f, 9.60573f, 4.81298f)
        lineTo(4.7127f, 7.06064f)
        curveTo(2.90423f, 7.89137f, 2f, 8.30674f, 2f, 9f)
        curveTo(2f, 9.69326f, 2.90423f, 10.1086f, 4.7127f, 10.9394f)
        lineTo(8.11012f, 12.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 19.5f)
        verticalLineTo(9f)
        moveTo(15f, 17f)
        curveTo(14.4102f, 17.6068f, 12.8403f, 20f, 12f, 20f)
        curveTo(11.1597f, 20f, 9.58984f, 17.6068f, 9f, 17f)
        }
        }.build()

        return _layerSendBackward!!
    }

private var _layerSendBackward: ImageVector? = null
